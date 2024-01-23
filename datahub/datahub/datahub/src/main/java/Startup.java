import com.linkedin.common.GlobalTags;
import com.linkedin.common.TagAssociation;
import com.linkedin.common.TagAssociationArray;
import com.linkedin.common.urn.TagUrn;
import com.linkedin.common.urn.UrnUtils;
import com.linkedin.data.template.StringMap;
import com.linkedin.dataset.DatasetProperties;
import datahub.client.Callback;
import datahub.client.MetadataWriteResponse;
import datahub.client.rest.RestEmitter;
import datahub.event.MetadataChangeProposalWrapper;
import org.apache.http.HttpResponse;

import java.util.concurrent.Future;

public class Startup {

    public static void main(String[] args) {
        try {

            String token = "eyJhbGciOiJIUzI1NiJ9.eyJhY3RvclR5cGUiOiJVU0VSIiwiYWN0b3JJZCI6InBhb2xvLnJlbmRhbm9Abm9raWEuY29tIiwidHlwZSI6IlBFUlNPTkFMIiwidmVyc2lvbiI6IjIiLCJqdGkiOiJmMzI2MmZjMC05OWU4LTRmOTQtYjU4Ny1iM2FhODA4ZjRiOTAiLCJzdWIiOiJwYW9sby5yZW5kYW5vQG5va2lhLmNvbSIsImlzcyI6ImRhdGFodWItbWV0YWRhdGEtc2VydmljZSJ9.z0boge_AGXpY6jGCgbgc5hWMGFwSv8KKDPWwIABhmb0";
            String server = "http://35.233.45.52:8080";

            RestEmitter emitter = RestEmitter.create(b -> b.server(server).token(token));

            // ADD CUSTOM PROPERTY TO EXISTING DATASET (THIS CODE CREATES DATASET IF DOES NOT EXIST)
            StringMap map = new StringMap();
            map.put("test", "1");
            map.put("test2", "2");

            MetadataChangeProposalWrapper mcpw = MetadataChangeProposalWrapper.builder()
                    .entityType("dataset")
                    .entityUrn(UrnUtils.toDatasetUrn("postgres", "crypto.public.wallet_instance", "PROD"))
                    .upsert()
                    .aspect(new DatasetProperties()
                            .setDescription("this is wallet instance table containing data about crypto wallets")
                            .setName("wallet_instance")
                            .setCustomProperties(map)
                    )
                    .build();


            // ADD TAG PAOLO (FIXME: CURRENTLY THIS OVERRIDE EXISTING TAGS)
            TagAssociation tagAssociation = new TagAssociation()
                    .setTag(TagUrn.createFromUrn(UrnUtils.getUrn("urn:li:tag:3c4d1235-041f-4fe3-a625-67725c0f12a6")));
            TagAssociationArray tagAssociations = new TagAssociationArray();
            tagAssociations.add(tagAssociation);
            MetadataChangeProposalWrapper mcpw2 = MetadataChangeProposalWrapper.builder()
                    .entityType("dataset")
                    .entityUrn(UrnUtils.toDatasetUrn("postgres", "crypto.public.wallet_instance", "PROD"))
                    .upsert()
                    .aspect(new GlobalTags().setTags(tagAssociations))
                    .build();

            Future<MetadataWriteResponse> response = emitter.emit(mcpw, new Callback() {
                @Override
                public void onCompletion(MetadataWriteResponse response) {
                    if (response.isSuccess()) {
                        System.out.println(String.format("Successfully emitted metadata event for %s", mcpw.getEntityUrn()));
                    } else {
                        // Get the underlying http response
                        HttpResponse httpResponse = (HttpResponse) response.getUnderlyingResponse();
                        System.out.println(String.format("Failed to emit metadata event for %s, aspect: %s with status code: %d",
                                mcpw.getEntityUrn(), mcpw.getAspectName(), httpResponse.getStatusLine().getStatusCode()));
                    }
                }
                @Override
                public void onFailure(Throwable exception) {
                    System.out.println(
                            String.format("Failed to emit metadata event for %s, aspect: %s due to %s", mcpw.getEntityUrn(),
                                    mcpw.getAspectName(), exception.getMessage()));
                }
            });


            // ADD LINEAGE SEE https://github.com/datahub-project/datahub/blob/master/metadata-integration/java/examples/src/main/java/io/datahubproject/examples/DataJobLineageAdd.java

            System.out.println("CUSTOM PROPS: " + response.get().getResponseContent());

            Future<MetadataWriteResponse> response2 = emitter.emit(mcpw2);
            System.out.println("TAGS: " + response2.get().getResponseContent());

            emitter.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
