/**
 * ResponseHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class ResponseHeader  extends com.turkcelltech.cpgw.ws.CpgwModel  implements java.io.Serializable {
    private java.lang.String extraDescription;

    private java.lang.Integer resultCode;

    private java.lang.String resultDescription;

    public ResponseHeader() {
    }

    public ResponseHeader(
           java.lang.String extraDescription,
           java.lang.Integer resultCode,
           java.lang.String resultDescription) {
        this.extraDescription = extraDescription;
        this.resultCode = resultCode;
        this.resultDescription = resultDescription;
    }


    /**
     * Gets the extraDescription value for this ResponseHeader.
     * 
     * @return extraDescription
     */
    public java.lang.String getExtraDescription() {
        return extraDescription;
    }


    /**
     * Sets the extraDescription value for this ResponseHeader.
     * 
     * @param extraDescription
     */
    public void setExtraDescription(java.lang.String extraDescription) {
        this.extraDescription = extraDescription;
    }


    /**
     * Gets the resultCode value for this ResponseHeader.
     * 
     * @return resultCode
     */
    public java.lang.Integer getResultCode() {
        return resultCode;
    }


    /**
     * Sets the resultCode value for this ResponseHeader.
     * 
     * @param resultCode
     */
    public void setResultCode(java.lang.Integer resultCode) {
        this.resultCode = resultCode;
    }


    /**
     * Gets the resultDescription value for this ResponseHeader.
     * 
     * @return resultDescription
     */
    public java.lang.String getResultDescription() {
        return resultDescription;
    }


    /**
     * Sets the resultDescription value for this ResponseHeader.
     * 
     * @param resultDescription
     */
    public void setResultDescription(java.lang.String resultDescription) {
        this.resultDescription = resultDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponseHeader)) return false;
        ResponseHeader other = (ResponseHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.extraDescription==null && other.getExtraDescription()==null) || 
             (this.extraDescription!=null &&
              this.extraDescription.equals(other.getExtraDescription()))) &&
            ((this.resultCode==null && other.getResultCode()==null) || 
             (this.resultCode!=null &&
              this.resultCode.equals(other.getResultCode()))) &&
            ((this.resultDescription==null && other.getResultDescription()==null) || 
             (this.resultDescription!=null &&
              this.resultDescription.equals(other.getResultDescription())));
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
        if (getExtraDescription() != null) {
            _hashCode += getExtraDescription().hashCode();
        }
        if (getResultCode() != null) {
            _hashCode += getResultCode().hashCode();
        }
        if (getResultDescription() != null) {
            _hashCode += getResultDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResponseHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "responseHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extraDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "extraDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultDescription"));
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
