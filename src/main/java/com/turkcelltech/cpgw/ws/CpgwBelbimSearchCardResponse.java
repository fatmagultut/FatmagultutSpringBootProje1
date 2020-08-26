/**
 * CpgwBelbimSearchCardResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class CpgwBelbimSearchCardResponse  extends com.turkcelltech.cpgw.ws.ResponseType  implements java.io.Serializable {
    private com.turkcelltech.cpgw.ws.BelbimSearchCardResponse searchCardResult;

    public CpgwBelbimSearchCardResponse() {
    }

    public CpgwBelbimSearchCardResponse(
           com.turkcelltech.cpgw.ws.ResponseHeader responseHeader,
           com.turkcelltech.cpgw.ws.BelbimSearchCardResponse searchCardResult) {
        super(
            responseHeader);
        this.searchCardResult = searchCardResult;
    }


    /**
     * Gets the searchCardResult value for this CpgwBelbimSearchCardResponse.
     * 
     * @return searchCardResult
     */
    public com.turkcelltech.cpgw.ws.BelbimSearchCardResponse getSearchCardResult() {
        return searchCardResult;
    }


    /**
     * Sets the searchCardResult value for this CpgwBelbimSearchCardResponse.
     * 
     * @param searchCardResult
     */
    public void setSearchCardResult(com.turkcelltech.cpgw.ws.BelbimSearchCardResponse searchCardResult) {
        this.searchCardResult = searchCardResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CpgwBelbimSearchCardResponse)) return false;
        CpgwBelbimSearchCardResponse other = (CpgwBelbimSearchCardResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.searchCardResult==null && other.getSearchCardResult()==null) || 
             (this.searchCardResult!=null &&
              this.searchCardResult.equals(other.getSearchCardResult())));
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
        if (getSearchCardResult() != null) {
            _hashCode += getSearchCardResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CpgwBelbimSearchCardResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwBelbimSearchCardResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchCardResult");
        elemField.setXmlName(new javax.xml.namespace.QName("", "searchCardResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimSearchCardResponse"));
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
