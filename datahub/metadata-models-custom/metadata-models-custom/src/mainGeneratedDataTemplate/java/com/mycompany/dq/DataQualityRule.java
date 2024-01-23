
package com.mycompany.dq;

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
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models-custom/src/main/pegasus/com/mycompany/dq/DataQualityRule.pdl.")
public class DataQualityRule
    extends RecordTemplate
{

    private final static DataQualityRule.Fields _fields = new DataQualityRule.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.mycompany.dq,record DataQualityRule{field:optional string,isFieldLevel:boolean,type:string,checkDefinition:optional string,url:optional string}", SchemaFormatType.PDL));
    private String _fieldField = null;
    private Boolean _isFieldLevelField = null;
    private String _typeField = null;
    private String _checkDefinitionField = null;
    private String _urlField = null;
    private DataQualityRule.ChangeListener __changeListener = new DataQualityRule.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Field = SCHEMA.getField("field");
    private final static RecordDataSchema.Field FIELD_IsFieldLevel = SCHEMA.getField("isFieldLevel");
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_CheckDefinition = SCHEMA.getField("checkDefinition");
    private final static RecordDataSchema.Field FIELD_Url = SCHEMA.getField("url");

    public DataQualityRule() {
        super(new DataMap(7, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public DataQualityRule(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DataQualityRule.Fields fields() {
        return _fields;
    }

    public static DataQualityRule.ProjectionMask createMask() {
        return new DataQualityRule.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for field
     * 
     * @see DataQualityRule.Fields#field
     */
    public boolean hasField() {
        if (_fieldField!= null) {
            return true;
        }
        return super._map.containsKey("field");
    }

    /**
     * Remover for field
     * 
     * @see DataQualityRule.Fields#field
     */
    public void removeField() {
        super._map.remove("field");
    }

    /**
     * Getter for field
     * 
     * @see DataQualityRule.Fields#field
     */
    public String getField(GetMode mode) {
        return getField();
    }

    /**
     * Getter for field
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataQualityRule.Fields#field
     */
    @Nullable
    public String getField() {
        if (_fieldField!= null) {
            return _fieldField;
        } else {
            Object __rawValue = super._map.get("field");
            _fieldField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _fieldField;
        }
    }

    /**
     * Setter for field
     * 
     * @see DataQualityRule.Fields#field
     */
    public DataQualityRule setField(String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setField(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeField();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "field", value);
                    _fieldField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "field", value);
                    _fieldField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for field
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataQualityRule.Fields#field
     */
    public DataQualityRule setField(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field field of com.mycompany.dq.DataQualityRule to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "field", value);
            _fieldField = value;
        }
        return this;
    }

    /**
     * Existence checker for isFieldLevel
     * 
     * @see DataQualityRule.Fields#isFieldLevel
     */
    public boolean hasIsFieldLevel() {
        if (_isFieldLevelField!= null) {
            return true;
        }
        return super._map.containsKey("isFieldLevel");
    }

    /**
     * Remover for isFieldLevel
     * 
     * @see DataQualityRule.Fields#isFieldLevel
     */
    public void removeIsFieldLevel() {
        super._map.remove("isFieldLevel");
    }

    /**
     * Getter for isFieldLevel
     * 
     * @see DataQualityRule.Fields#isFieldLevel
     */
    public Boolean isIsFieldLevel(GetMode mode) {
        switch (mode) {
            case STRICT:
                return isIsFieldLevel();
            case DEFAULT:
            case NULL:
                if (_isFieldLevelField!= null) {
                    return _isFieldLevelField;
                } else {
                    Object __rawValue = super._map.get("isFieldLevel");
                    _isFieldLevelField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _isFieldLevelField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for isFieldLevel
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataQualityRule.Fields#isFieldLevel
     */
    @Nonnull
    public Boolean isIsFieldLevel() {
        if (_isFieldLevelField!= null) {
            return _isFieldLevelField;
        } else {
            Object __rawValue = super._map.get("isFieldLevel");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("isFieldLevel");
            }
            _isFieldLevelField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _isFieldLevelField;
        }
    }

    /**
     * Setter for isFieldLevel
     * 
     * @see DataQualityRule.Fields#isFieldLevel
     */
    public DataQualityRule setIsFieldLevel(Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setIsFieldLevel(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field isFieldLevel of com.mycompany.dq.DataQualityRule");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "isFieldLevel", value);
                    _isFieldLevelField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeIsFieldLevel();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "isFieldLevel", value);
                    _isFieldLevelField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "isFieldLevel", value);
                    _isFieldLevelField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for isFieldLevel
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataQualityRule.Fields#isFieldLevel
     */
    public DataQualityRule setIsFieldLevel(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field isFieldLevel of com.mycompany.dq.DataQualityRule to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "isFieldLevel", value);
            _isFieldLevelField = value;
        }
        return this;
    }

    /**
     * Setter for isFieldLevel
     * 
     * @see DataQualityRule.Fields#isFieldLevel
     */
    public DataQualityRule setIsFieldLevel(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "isFieldLevel", value);
        _isFieldLevelField = value;
        return this;
    }

    /**
     * Existence checker for type
     * 
     * @see DataQualityRule.Fields#type
     */
    public boolean hasType() {
        if (_typeField!= null) {
            return true;
        }
        return super._map.containsKey("type");
    }

    /**
     * Remover for type
     * 
     * @see DataQualityRule.Fields#type
     */
    public void removeType() {
        super._map.remove("type");
    }

    /**
     * Getter for type
     * 
     * @see DataQualityRule.Fields#type
     */
    public String getType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getType();
            case DEFAULT:
            case NULL:
                if (_typeField!= null) {
                    return _typeField;
                } else {
                    Object __rawValue = super._map.get("type");
                    _typeField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _typeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for type
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataQualityRule.Fields#type
     */
    @Nonnull
    public String getType() {
        if (_typeField!= null) {
            return _typeField;
        } else {
            Object __rawValue = super._map.get("type");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("type");
            }
            _typeField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _typeField;
        }
    }

    /**
     * Setter for type
     * 
     * @see DataQualityRule.Fields#type
     */
    public DataQualityRule setType(String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field type of com.mycompany.dq.DataQualityRule");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "type", value);
                    _typeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "type", value);
                    _typeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "type", value);
                    _typeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for type
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataQualityRule.Fields#type
     */
    public DataQualityRule setType(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field type of com.mycompany.dq.DataQualityRule to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "type", value);
            _typeField = value;
        }
        return this;
    }

    /**
     * Existence checker for checkDefinition
     * 
     * @see DataQualityRule.Fields#checkDefinition
     */
    public boolean hasCheckDefinition() {
        if (_checkDefinitionField!= null) {
            return true;
        }
        return super._map.containsKey("checkDefinition");
    }

    /**
     * Remover for checkDefinition
     * 
     * @see DataQualityRule.Fields#checkDefinition
     */
    public void removeCheckDefinition() {
        super._map.remove("checkDefinition");
    }

    /**
     * Getter for checkDefinition
     * 
     * @see DataQualityRule.Fields#checkDefinition
     */
    public String getCheckDefinition(GetMode mode) {
        return getCheckDefinition();
    }

    /**
     * Getter for checkDefinition
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataQualityRule.Fields#checkDefinition
     */
    @Nullable
    public String getCheckDefinition() {
        if (_checkDefinitionField!= null) {
            return _checkDefinitionField;
        } else {
            Object __rawValue = super._map.get("checkDefinition");
            _checkDefinitionField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _checkDefinitionField;
        }
    }

    /**
     * Setter for checkDefinition
     * 
     * @see DataQualityRule.Fields#checkDefinition
     */
    public DataQualityRule setCheckDefinition(String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCheckDefinition(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCheckDefinition();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "checkDefinition", value);
                    _checkDefinitionField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "checkDefinition", value);
                    _checkDefinitionField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for checkDefinition
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataQualityRule.Fields#checkDefinition
     */
    public DataQualityRule setCheckDefinition(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field checkDefinition of com.mycompany.dq.DataQualityRule to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "checkDefinition", value);
            _checkDefinitionField = value;
        }
        return this;
    }

    /**
     * Existence checker for url
     * 
     * @see DataQualityRule.Fields#url
     */
    public boolean hasUrl() {
        if (_urlField!= null) {
            return true;
        }
        return super._map.containsKey("url");
    }

    /**
     * Remover for url
     * 
     * @see DataQualityRule.Fields#url
     */
    public void removeUrl() {
        super._map.remove("url");
    }

    /**
     * Getter for url
     * 
     * @see DataQualityRule.Fields#url
     */
    public String getUrl(GetMode mode) {
        return getUrl();
    }

    /**
     * Getter for url
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataQualityRule.Fields#url
     */
    @Nullable
    public String getUrl() {
        if (_urlField!= null) {
            return _urlField;
        } else {
            Object __rawValue = super._map.get("url");
            _urlField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _urlField;
        }
    }

    /**
     * Setter for url
     * 
     * @see DataQualityRule.Fields#url
     */
    public DataQualityRule setUrl(String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setUrl(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeUrl();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "url", value);
                    _urlField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "url", value);
                    _urlField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for url
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataQualityRule.Fields#url
     */
    public DataQualityRule setUrl(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field url of com.mycompany.dq.DataQualityRule to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "url", value);
            _urlField = value;
        }
        return this;
    }

    @Override
    public DataQualityRule clone()
        throws CloneNotSupportedException
    {
        DataQualityRule __clone = ((DataQualityRule) super.clone());
        __clone.__changeListener = new DataQualityRule.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataQualityRule copy()
        throws CloneNotSupportedException
    {
        DataQualityRule __copy = ((DataQualityRule) super.copy());
        __copy._checkDefinitionField = null;
        __copy._fieldField = null;
        __copy._typeField = null;
        __copy._isFieldLevelField = null;
        __copy._urlField = null;
        __copy.__changeListener = new DataQualityRule.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataQualityRule __objectRef;

        private ChangeListener(DataQualityRule reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "checkDefinition":
                    __objectRef._checkDefinitionField = null;
                    break;
                case "field":
                    __objectRef._fieldField = null;
                    break;
                case "type":
                    __objectRef._typeField = null;
                    break;
                case "isFieldLevel":
                    __objectRef._isFieldLevelField = null;
                    break;
                case "url":
                    __objectRef._urlField = null;
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

        public PathSpec field() {
            return new PathSpec(getPathComponents(), "field");
        }

        public PathSpec isFieldLevel() {
            return new PathSpec(getPathComponents(), "isFieldLevel");
        }

        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

        public PathSpec checkDefinition() {
            return new PathSpec(getPathComponents(), "checkDefinition");
        }

        public PathSpec url() {
            return new PathSpec(getPathComponents(), "url");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(7);
        }

        public DataQualityRule.ProjectionMask withField() {
            getDataMap().put("field", MaskMap.POSITIVE_MASK);
            return this;
        }

        public DataQualityRule.ProjectionMask withIsFieldLevel() {
            getDataMap().put("isFieldLevel", MaskMap.POSITIVE_MASK);
            return this;
        }

        public DataQualityRule.ProjectionMask withType() {
            getDataMap().put("type", MaskMap.POSITIVE_MASK);
            return this;
        }

        public DataQualityRule.ProjectionMask withCheckDefinition() {
            getDataMap().put("checkDefinition", MaskMap.POSITIVE_MASK);
            return this;
        }

        public DataQualityRule.ProjectionMask withUrl() {
            getDataMap().put("url", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
