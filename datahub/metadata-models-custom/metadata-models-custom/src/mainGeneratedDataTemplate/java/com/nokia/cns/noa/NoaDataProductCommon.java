
package com.nokia.cns.noa;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.data.DataMap;
import com.linkedin.data.collections.CheckedUtil;
import com.linkedin.data.schema.MaskMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models-custom/src/main/pegasus/com/nokia/cns/noa/NoaDataProductCommon.pdl.")
public class NoaDataProductCommon
    extends RecordTemplate
{

    private final static NoaDataProductCommon.Fields _fields = new NoaDataProductCommon.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.nokia.cns.noa@Aspect.name=\"noaDataProductCommon\"record NoaDataProductCommon{dpType:optional string}", SchemaFormatType.PDL));
    private String _dpTypeField = null;
    private NoaDataProductCommon.ChangeListener __changeListener = new NoaDataProductCommon.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_DpType = SCHEMA.getField("dpType");

    public NoaDataProductCommon() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public NoaDataProductCommon(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static NoaDataProductCommon.Fields fields() {
        return _fields;
    }

    public static NoaDataProductCommon.ProjectionMask createMask() {
        return new NoaDataProductCommon.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for dpType
     * 
     * @see NoaDataProductCommon.Fields#dpType
     */
    public boolean hasDpType() {
        if (_dpTypeField!= null) {
            return true;
        }
        return super._map.containsKey("dpType");
    }

    /**
     * Remover for dpType
     * 
     * @see NoaDataProductCommon.Fields#dpType
     */
    public void removeDpType() {
        super._map.remove("dpType");
    }

    /**
     * Getter for dpType
     * 
     * @see NoaDataProductCommon.Fields#dpType
     */
    public String getDpType(GetMode mode) {
        return getDpType();
    }

    /**
     * Getter for dpType
     * 
     * @return
     *     Optional field. Always check for null.
     * @see NoaDataProductCommon.Fields#dpType
     */
    @Nullable
    public String getDpType() {
        if (_dpTypeField!= null) {
            return _dpTypeField;
        } else {
            Object __rawValue = super._map.get("dpType");
            _dpTypeField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _dpTypeField;
        }
    }

    /**
     * Setter for dpType
     * 
     * @see NoaDataProductCommon.Fields#dpType
     */
    public NoaDataProductCommon setDpType(String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDpType(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDpType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "dpType", value);
                    _dpTypeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "dpType", value);
                    _dpTypeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for dpType
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see NoaDataProductCommon.Fields#dpType
     */
    public NoaDataProductCommon setDpType(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field dpType of com.nokia.cns.noa.NoaDataProductCommon to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "dpType", value);
            _dpTypeField = value;
        }
        return this;
    }

    @Override
    public NoaDataProductCommon clone()
        throws CloneNotSupportedException
    {
        NoaDataProductCommon __clone = ((NoaDataProductCommon) super.clone());
        __clone.__changeListener = new NoaDataProductCommon.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public NoaDataProductCommon copy()
        throws CloneNotSupportedException
    {
        NoaDataProductCommon __copy = ((NoaDataProductCommon) super.copy());
        __copy._dpTypeField = null;
        __copy.__changeListener = new NoaDataProductCommon.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final NoaDataProductCommon __objectRef;

        private ChangeListener(NoaDataProductCommon reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "dpType":
                    __objectRef._dpTypeField = null;
                    break;
            }
        }

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

        public PathSpec dpType() {
            return new PathSpec(getPathComponents(), "dpType");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(2);
        }

        public NoaDataProductCommon.ProjectionMask withDpType() {
            getDataMap().put("dpType", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
