/**
 * ResultCodeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class ResultCodeInfo  extends com.turkcelltech.cpgw.ws.CpgwModel  implements java.io.Serializable {
    private java.lang.Integer resultCode;

    private java.lang.String resultDesc;

    public ResultCodeInfo() {
    }

    public ResultCodeInfo(
           java.lang.Integer resultCode,
           java.lang.String resultDesc) {
        this.resultCode = resultCode;
        this.resultDesc = resultDesc;
    }


    /**
     * Gets the resultCode value for this ResultCodeInfo.
     * 
     * @return resultCode
     */
    public java.lang.Integer getResultCode() {
        return resultCode;
    }


    /**
     * Sets the resultCode value for this ResultCodeInfo.
     * 
     * @param resultCode
     */
    public void setResultCode(java.lang.Integer resultCode) {
        this.resultCode = resultCode;
    }


    /**
     * Gets the resultDesc value for this ResultCodeInfo.
     * 
     * @return resultDesc
     */
    public java.lang.String getResultDesc() {
        return resultDesc;
    }


    /**
     * Sets the resultDesc value for this ResultCodeInfo.
     * 
     * @param resultDesc
     */
    public void setResultDesc(java.lang.String resultDesc) {
        this.resultDesc = resultDesc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResultCodeInfo)) return false;
        ResultCodeInfo other = (ResultCodeInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.resultCode==null && other.getResultCode()==null) || 
             (this.resultCode!=null &&
              this.resultCode.equals(other.getResultCode()))) &&
            ((this.resultDesc==null && other.getResultDesc()==null) || 
             (this.resultDesc!=null &&
              this.resultDesc.equals(other.getResultDesc())));
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
        if (getResultCode() != null) {
            _hashCode += getResultCode().hashCode();
        }
        if (getResultDesc() != null) {
            _hashCode += getResultDesc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResultCodeInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "resultCodeInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultDesc"));
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
