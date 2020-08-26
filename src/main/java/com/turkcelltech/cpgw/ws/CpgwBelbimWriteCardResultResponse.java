/**
 * CpgwBelbimWriteCardResultResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class CpgwBelbimWriteCardResultResponse  extends com.turkcelltech.cpgw.ws.ResponseType  implements java.io.Serializable {
    private com.turkcelltech.cpgw.ws.BelbimWriteCardResultResponse belbimWriteCardResultResponse;

    public CpgwBelbimWriteCardResultResponse() {
    }

    public CpgwBelbimWriteCardResultResponse(
           com.turkcelltech.cpgw.ws.ResponseHeader responseHeader,
           com.turkcelltech.cpgw.ws.BelbimWriteCardResultResponse belbimWriteCardResultResponse) {
        super(
            responseHeader);
        this.belbimWriteCardResultResponse = belbimWriteCardResultResponse;
    }


    /**
     * Gets the belbimWriteCardResultResponse value for this CpgwBelbimWriteCardResultResponse.
     * 
     * @return belbimWriteCardResultResponse
     */
    public com.turkcelltech.cpgw.ws.BelbimWriteCardResultResponse getBelbimWriteCardResultResponse() {
        return belbimWriteCardResultResponse;
    }


    /**
     * Sets the belbimWriteCardResultResponse value for this CpgwBelbimWriteCardResultResponse.
     * 
     * @param belbimWriteCardResultResponse
     */
    public void setBelbimWriteCardResultResponse(com.turkcelltech.cpgw.ws.BelbimWriteCardResultResponse belbimWriteCardResultResponse) {
        this.belbimWriteCardResultResponse = belbimWriteCardResultResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CpgwBelbimWriteCardResultResponse)) return false;
        CpgwBelbimWriteCardResultResponse other = (CpgwBelbimWriteCardResultResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.belbimWriteCardResultResponse==null && other.getBelbimWriteCardResultResponse()==null) || 
             (this.belbimWriteCardResultResponse!=null &&
              this.belbimWriteCardResultResponse.equals(other.getBelbimWriteCardResultResponse())));
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
        if (getBelbimWriteCardResultResponse() != null) {
            _hashCode += getBelbimWriteCardResultResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CpgwBelbimWriteCardResultResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwBelbimWriteCardResultResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("belbimWriteCardResultResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "belbimWriteCardResultResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimWriteCardResultResponse"));
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
