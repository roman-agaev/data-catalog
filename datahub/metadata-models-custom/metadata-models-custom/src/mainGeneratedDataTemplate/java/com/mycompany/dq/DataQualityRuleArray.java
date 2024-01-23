
package com.mycompany.dq;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import com.linkedin.data.DataList;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.ArrayDataSchema;
import com.linkedin.data.schema.MaskMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.TemplateOutputCastException;
import com.linkedin.data.template.WrappingArrayTemplate;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models-custom/src/main/pegasus/com/mycompany/dq/DataQualityRules.pdl.")
public class DataQualityRuleArray
    extends WrappingArrayTemplate<DataQualityRule>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.mycompany.dq,record DataQualityRule{field:optional string,isFieldLevel:boolean,type:string,checkDefinition:optional string,url:optional string}}]", SchemaFormatType.PDL));

    public DataQualityRuleArray() {
        this(new DataList());
    }

    public DataQualityRuleArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public DataQualityRuleArray(Collection<DataQualityRule> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public DataQualityRuleArray(DataList data) {
        super(data, SCHEMA, DataQualityRule.class);
    }

    public DataQualityRuleArray(DataQualityRule first, DataQualityRule... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static DataQualityRuleArray.ProjectionMask createMask() {
        return new DataQualityRuleArray.ProjectionMask();
    }

    @Override
    public DataQualityRuleArray clone()
        throws CloneNotSupportedException
    {
        DataQualityRuleArray __clone = ((DataQualityRuleArray) super.clone());
        return __clone;
    }

    @Override
    public DataQualityRuleArray copy()
        throws CloneNotSupportedException
    {
        DataQualityRuleArray __copy = ((DataQualityRuleArray) super.copy());
        return __copy;
    }

    @Override
    protected DataQualityRule coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new DataQualityRule(DataTemplateUtil.castOrThrow(object, DataMap.class)));
    }

    public static class Fields
        extends PathSpec
    {


        public Fields(List<String> path, String name) {
            super(path, name);
        }

        public Fields() {
            super();
        }

        public com.mycompany.dq.DataQualityRule.Fields items() {
            return new com.mycompany.dq.DataQualityRule.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.mycompany.dq.DataQualityRule.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public DataQualityRuleArray.ProjectionMask withItems(Function<com.mycompany.dq.DataQualityRule.ProjectionMask, com.mycompany.dq.DataQualityRule.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?DataQualityRule.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
