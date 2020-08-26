/**
 * RequiredFieldInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class RequiredFieldInfo  extends com.turkcelltech.cpgw.ws.CpgwModel  implements java.io.Serializable {
    private java.lang.Long corpId;

    private java.lang.String defaultValue;

    private java.lang.String description;

    private java.lang.String descriptionEng;

    private java.lang.String label;

    private java.lang.String labelEng;

    private java.lang.Integer maxLength;

    private java.lang.Integer minLength;

    private java.lang.Integer orderNo;

    private java.lang.Boolean required;

    private java.lang.String valueType;

    private java.lang.Long vendorId;

    public RequiredFieldInfo() {
    }

    public RequiredFieldInfo(
           java.lang.Long corpId,
           java.lang.String defaultValue,
           java.lang.String description,
           java.lang.String descriptionEng,
           java.lang.String label,
           java.lang.String labelEng,
           java.lang.Integer maxLength,
           java.lang.Integer minLength,
           java.lang.Integer orderNo,
           java.lang.Boolean required,
           java.lang.String valueType,
           java.lang.Long vendorId) {
        this.corpId = corpId;
        this.defaultValue = defaultValue;
        this.description = description;
        this.descriptionEng = descriptionEng;
        this.label = label;
        this.labelEng = labelEng;
        this.maxLength = maxLength;
        this.minLength = minLength;
        this.orderNo = orderNo;
        this.required = required;
        this.valueType = valueType;
        this.vendorId = vendorId;
    }


    /**
     * Gets the corpId value for this RequiredFieldInfo.
     * 
     * @return corpId
     */
    public java.lang.Long getCorpId() {
        return corpId;
    }


    /**
     * Sets the corpId value for this RequiredFieldInfo.
     * 
     * @param corpId
     */
    public void setCorpId(java.lang.Long corpId) {
        this.corpId = corpId;
    }


    /**
     * Gets the defaultValue value for this RequiredFieldInfo.
     * 
     * @return defaultValue
     */
    public java.lang.String getDefaultValue() {
        return defaultValue;
    }


    /**
     * Sets the defaultValue value for this RequiredFieldInfo.
     * 
     * @param defaultValue
     */
    public void setDefaultValue(java.lang.String defaultValue) {
        this.defaultValue = defaultValue;
    }


    /**
     * Gets the description value for this RequiredFieldInfo.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this RequiredFieldInfo.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the descriptionEng value for this RequiredFieldInfo.
     * 
     * @return descriptionEng
     */
    public java.lang.String getDescriptionEng() {
        return descriptionEng;
    }


    /**
     * Sets the descriptionEng value for this RequiredFieldInfo.
     * 
     * @param descriptionEng
     */
    public void setDescriptionEng(java.lang.String descriptionEng) {
        this.descriptionEng = descriptionEng;
    }


    /**
     * Gets the label value for this RequiredFieldInfo.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this RequiredFieldInfo.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the labelEng value for this RequiredFieldInfo.
     * 
     * @return labelEng
     */
    public java.lang.String getLabelEng() {
        return labelEng;
    }


    /**
     * Sets the labelEng value for this RequiredFieldInfo.
     * 
     * @param labelEng
     */
    public void setLabelEng(java.lang.String labelEng) {
        this.labelEng = labelEng;
    }


    /**
     * Gets the maxLength value for this RequiredFieldInfo.
     * 
     * @return maxLength
     */
    public java.lang.Integer getMaxLength() {
        return maxLength;
    }


    /**
     * Sets the maxLength value for this RequiredFieldInfo.
     * 
     * @param maxLength
     */
    public void setMaxLength(java.lang.Integer maxLength) {
        this.maxLength = maxLength;
    }


    /**
     * Gets the minLength value for this RequiredFieldInfo.
     * 
     * @return minLength
     */
    public java.lang.Integer getMinLength() {
        return minLength;
    }


    /**
     * Sets the minLength value for this RequiredFieldInfo.
     * 
     * @param minLength
     */
    public void setMinLength(java.lang.Integer minLength) {
        this.minLength = minLength;
    }


    /**
     * Gets the orderNo value for this RequiredFieldInfo.
     * 
     * @return orderNo
     */
    public java.lang.Integer getOrderNo() {
        return orderNo;
    }


    /**
     * Sets the orderNo value for this RequiredFieldInfo.
     * 
     * @param orderNo
     */
    public void setOrderNo(java.lang.Integer orderNo) {
        this.orderNo = orderNo;
    }


    /**
     * Gets the required value for this RequiredFieldInfo.
     * 
     * @return required
     */
    public java.lang.Boolean getRequired() {
        return required;
    }


    /**
     * Sets the required value for this RequiredFieldInfo.
     * 
     * @param required
     */
    public void setRequired(java.lang.Boolean required) {
        this.required = required;
    }


    /**
     * Gets the valueType value for this RequiredFieldInfo.
     * 
     * @return valueType
     */
    public java.lang.String getValueType() {
        return valueType;
    }


    /**
     * Sets the valueType value for this RequiredFieldInfo.
     * 
     * @param valueType
     */
    public void setValueType(java.lang.String valueType) {
        this.valueType = valueType;
    }


    /**
     * Gets the vendorId value for this RequiredFieldInfo.
     * 
     * @return vendorId
     */
    public java.lang.Long getVendorId() {
        return vendorId;
    }


    /**
     * Sets the vendorId value for this RequiredFieldInfo.
     * 
     * @param vendorId
     */
    public void setVendorId(java.lang.Long vendorId) {
        this.vendorId = vendorId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequiredFieldInfo)) return false;
        RequiredFieldInfo other = (RequiredFieldInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.corpId==null && other.getCorpId()==null) || 
             (this.corpId!=null &&
              this.corpId.equals(other.getCorpId()))) &&
            ((this.defaultValue==null && other.getDefaultValue()==null) || 
             (this.defaultValue!=null &&
              this.defaultValue.equals(other.getDefaultValue()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.descriptionEng==null && other.getDescriptionEng()==null) || 
             (this.descriptionEng!=null &&
              this.descriptionEng.equals(other.getDescriptionEng()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.labelEng==null && other.getLabelEng()==null) || 
             (this.labelEng!=null &&
              this.labelEng.equals(other.getLabelEng()))) &&
            ((this.maxLength==null && other.getMaxLength()==null) || 
             (this.maxLength!=null &&
              this.maxLength.equals(other.getMaxLength()))) &&
            ((this.minLength==null && other.getMinLength()==null) || 
             (this.minLength!=null &&
              this.minLength.equals(other.getMinLength()))) &&
            ((this.orderNo==null && other.getOrderNo()==null) || 
             (this.orderNo!=null &&
              this.orderNo.equals(other.getOrderNo()))) &&
            ((this.required==null && other.getRequired()==null) || 
             (this.required!=null &&
              this.required.equals(other.getRequired()))) &&
            ((this.valueType==null && other.getValueType()==null) || 
             (this.valueType!=null &&
              this.valueType.equals(other.getValueType()))) &&
            ((this.vendorId==null && other.getVendorId()==null) || 
             (this.vendorId!=null &&
              this.vendorId.equals(other.getVendorId())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getCorpId() != null) {
            _hashCode += getCorpId().hashCode();
        }
        if (getDefaultValue() != null) {
            _hashCode += getDefaultValue().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDescriptionEng() != null) {
            _hashCode += getDescriptionEng().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getLabelEng() != null) {
            _hashCode += getLabelEng().hashCode();
        }
        if (getMaxLength() != null) {
            _hashCode += getMaxLength().hashCode();
        }
        if (getMinLength() != null) {
            _hashCode += getMinLength().hashCode();
        }
        if (getOrderNo() != null) {
            _hashCode += getOrderNo().hashCode();
        }
        if (getRequired() != null) {
            _hashCode += getRequired().hashCode();
        }
        if (getValueType() != null) {
            _hashCode += getValueType().hashCode();
        }
        if (getVendorId() != null) {
            _hashCode += getVendorId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequiredFieldInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "requiredFieldInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corpId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "corpId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descriptionEng");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descriptionEng"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelEng");
        elemField.setXmlName(new javax.xml.namespace.QName("", "labelEng"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxLength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minLength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("required");
        elemField.setXmlName(new javax.xml.namespace.QName("", "required"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valueType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vendorId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
