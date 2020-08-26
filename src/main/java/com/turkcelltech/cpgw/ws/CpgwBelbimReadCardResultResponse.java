/**
 * CpgwBelbimReadCardResultResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class CpgwBelbimReadCardResultResponse  extends com.turkcelltech.cpgw.ws.ResponseType  implements java.io.Serializable {
    private com.turkcelltech.cpgw.ws.BelbimReadCardResultResponse belbimReadCardResultResponse;

    public CpgwBelbimReadCardResultResponse() {
    }

    public CpgwBelbimReadCardResultResponse(
           com.turkcelltech.cpgw.ws.ResponseHeader responseHeader,
           com.turkcelltech.cpgw.ws.BelbimReadCardResultResponse belbimReadCardResultResponse) {
        super(
            responseHeader);
        this.belbimReadCardResultResponse = belbimReadCardResultResponse;
    }


    /**
     * Gets the belbimReadCardResultResponse value for this CpgwBelbimReadCardResultResponse.
     * 
     * @return belbimReadCardResultResponse
     */
    public com.turkcelltech.cpgw.ws.BelbimReadCardResultResponse getBelbimReadCardResultResponse() {
        return belbimReadCardResultResponse;
    }


    /**
     * Sets the belbimReadCardResultResponse value for this CpgwBelbimReadCardResultResponse.
     * 
     * @param belbimReadCardResultResponse
     */
    public void setBelbimReadCardResultResponse(com.turkcelltech.cpgw.ws.BelbimReadCardResultResponse belbimReadCardResultResponse) {
        this.belbimReadCardResultResponse = belbimReadCardResultResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CpgwBelbimReadCardResultResponse)) return false;
        CpgwBelbimReadCardResultResponse other = (CpgwBelbimReadCardResultResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.belbimReadCardResultResponse==null && other.getBelbimReadCardResultResponse()==null) || 
             (this.belbimReadCardResultResponse!=null &&
              this.belbimReadCardResultResponse.equals(other.getBelbimReadCardResultResponse())));
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
        if (getBelbimReadCardResultResponse() != null) {
            _hashCode += getBelbimReadCardResultResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CpgwBelbimReadCardResultResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwBelbimReadCardResultResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("belbimReadCardResultResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "belbimReadCardResultResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimReadCardResultResponse"));
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
