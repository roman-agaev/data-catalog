
package com.mycompany.dq;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import com.linkedin.data.DataList;
import com.linkedin.data.DataMap;
import com.linkedin.data.collections.CheckedUtil;
import com.linkedin.data.schema.MaskMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models-custom/src/main/pegasus/com/mycompany/dq/DataQualityRules.pdl.")
public class DataQualityRules
    extends RecordTemplate
{

    private final static DataQualityRules.Fields _fields = new DataQualityRules.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.mycompany.dq@Aspect={\"autoRender\":true,\"name\":\"customDataQualityRules\",\"renderSpec\":{\"displayName\":\"DQ Rules\",\"displayType\":\"tabular\",\"key\":\"rules\"}}record DataQualityRules{rules:array[record DataQualityRule{field:optional string,isFieldLevel:boolean,type:string,checkDefinition:optional string,url:optional string}]}", SchemaFormatType.PDL));
    private DataQualityRuleArray _rulesField = null;
    private DataQualityRules.ChangeListener __changeListener = new DataQualityRules.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Rules = SCHEMA.getField("rules");

    public DataQualityRules() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public DataQualityRules(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DataQualityRules.Fields fields() {
        return _fields;
    }

    public static DataQualityRules.ProjectionMask createMask() {
        return new DataQualityRules.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for rules
     * 
     * @see DataQualityRules.Fields#rules
     */
    public boolean hasRules() {
        if (_rulesField!= null) {
            return true;
        }
        return super._map.containsKey("rules");
    }

    /**
     * Remover for rules
     * 
     * @see DataQualityRules.Fields#rules
     */
    public void removeRules() {
        super._map.remove("rules");
    }

    /**
     * Getter for rules
     * 
     * @see DataQualityRules.Fields#rules
     */
    public DataQualityRuleArray getRules(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getRules();
            case DEFAULT:
            case NULL:
                if (_rulesField!= null) {
                    return _rulesField;
                } else {
                    Object __rawValue = super._map.get("rules");
                    _rulesField = ((__rawValue == null)?null:new DataQualityRuleArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _rulesField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for rules
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataQualityRules.Fields#rules
     */
    @Nonnull
    public DataQualityRuleArray getRules() {
        if (_rulesField!= null) {
            return _rulesField;
        } else {
            Object __rawValue = super._map.get("rules");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("rules");
            }
            _rulesField = ((__rawValue == null)?null:new DataQualityRuleArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _rulesField;
        }
    }

    /**
     * Setter for rules
     * 
     * @see DataQualityRules.Fields#rules
     */
    public DataQualityRules setRules(DataQualityRuleArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setRules(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field rules of com.mycompany.dq.DataQualityRules");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "rules", value.data());
                    _rulesField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeRules();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "rules", value.data());
                    _rulesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "rules", value.data());
                    _rulesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for rules
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataQualityRules.Fields#rules
     */
    public DataQualityRules setRules(
        @Nonnull
        DataQualityRuleArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field rules of com.mycompany.dq.DataQualityRules to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "rules", value.data());
            _rulesField = value;
        }
        return this;
    }

    @Override
    public DataQualityRules clone()
        throws CloneNotSupportedException
    {
        DataQualityRules __clone = ((DataQualityRules) super.clone());
        __clone.__changeListener = new DataQualityRules.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataQualityRules copy()
        throws CloneNotSupportedException
    {
        DataQualityRules __copy = ((DataQualityRules) super.copy());
        __copy._rulesField = null;
        __copy.__changeListener = new DataQualityRules.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataQualityRules __objectRef;

        private ChangeListener(DataQualityRules reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "rules":
                    __objectRef._rulesField = null;
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

        public com.mycompany.dq.DataQualityRuleArray.Fields rules() {
            return new com.mycompany.dq.DataQualityRuleArray.Fields(getPathComponents(), "rules");
        }

        public PathSpec rules(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "rules");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.mycompany.dq.DataQualityRuleArray.ProjectionMask _rulesMask;

        ProjectionMask() {
            super(2);
        }

        public DataQualityRules.ProjectionMask withRules(Function<com.mycompany.dq.DataQualityRuleArray.ProjectionMask, com.mycompany.dq.DataQualityRuleArray.ProjectionMask> nestedMask) {
            _rulesMask = nestedMask.apply(((_rulesMask == null)?DataQualityRuleArray.createMask():_rulesMask));
            getDataMap().put("rules", _rulesMask.getDataMap());
            return this;
        }

        public DataQualityRules.ProjectionMask withRules() {
            _rulesMask = null;
            getDataMap().put("rules", MaskMap.POSITIVE_MASK);
            return this;
        }

        public DataQualityRules.ProjectionMask withRules(Function<com.mycompany.dq.DataQualityRuleArray.ProjectionMask, com.mycompany.dq.DataQualityRuleArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _rulesMask = nestedMask.apply(((_rulesMask == null)?DataQualityRuleArray.createMask():_rulesMask));
            getDataMap().put("rules", _rulesMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("rules").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("rules").put("$count", count);
            }
            return this;
        }

        public DataQualityRules.ProjectionMask withRules(Integer start, Integer count) {
            _rulesMask = null;
            getDataMap().put("rules", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("rules").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("rules").put("$count", count);
            }
            return this;
        }

    }

}
