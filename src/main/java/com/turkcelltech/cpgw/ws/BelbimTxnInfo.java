/**
 * BelbimTxnInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class BelbimTxnInfo  implements java.io.Serializable {
    private int infoId;

    private java.lang.String infoName;

    private java.lang.String infoValue;

    public BelbimTxnInfo() {
    }

    public BelbimTxnInfo(
           int infoId,
           java.lang.String infoName,
           java.lang.String infoValue) {
           this.infoId = infoId;
           this.infoName = infoName;
           this.infoValue = infoValue;
    }


    /**
     * Gets the infoId value for this BelbimTxnInfo.
     * 
     * @return infoId
     */
    public int getInfoId() {
        return infoId;
    }


    /**
     * Sets the infoId value for this BelbimTxnInfo.
     * 
     * @param infoId
     */
    public void setInfoId(int infoId) {
        this.infoId = infoId;
    }


    /**
     * Gets the infoName value for this BelbimTxnInfo.
     * 
     * @return infoName
     */
    public java.lang.String getInfoName() {
        return infoName;
    }


    /**
     * Sets the infoName value for this BelbimTxnInfo.
     * 
     * @param infoName
     */
    public void setInfoName(java.lang.String infoName) {
        this.infoName = infoName;
    }


    /**
     * Gets the infoValue value for this BelbimTxnInfo.
     * 
     * @return infoValue
     */
    public java.lang.String getInfoValue() {
        return infoValue;
    }


    /**
     * Sets the infoValue value for this BelbimTxnInfo.
     * 
     * @param infoValue
     */
    public void setInfoValue(java.lang.String infoValue) {
        this.infoValue = infoValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BelbimTxnInfo)) return false;
        BelbimTxnInfo other = (BelbimTxnInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.infoId == other.getInfoId() &&
            ((this.infoName==null && other.getInfoName()==null) || 
             (this.infoName!=null &&
              this.infoName.equals(other.getInfoName()))) &&
            ((this.infoValue==null && other.getInfoValue()==null) || 
             (this.infoValue!=null &&
              this.infoValue.equals(other.getInfoValue())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getInfoId();
        if (getInfoName() != null) {
            _hashCode += getInfoName().hashCode();
        }
        if (getInfoValue() != null) {
            _hashCode += getInfoValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BelbimTxnInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimTxnInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infoId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "infoId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infoName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "infoName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infoValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "infoValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
