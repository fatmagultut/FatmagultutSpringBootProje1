/**
 * CpgwBelbimSearchCardWithAuthP1Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class CpgwBelbimSearchCardWithAuthP1Response  extends com.turkcelltech.cpgw.ws.ResponseType  implements java.io.Serializable {
    private com.turkcelltech.cpgw.ws.BelbimSearchCardWithAuthP1Response belbimSearchCardWithAuthP1Response;

    public CpgwBelbimSearchCardWithAuthP1Response() {
    }

    public CpgwBelbimSearchCardWithAuthP1Response(
           com.turkcelltech.cpgw.ws.ResponseHeader responseHeader,
           com.turkcelltech.cpgw.ws.BelbimSearchCardWithAuthP1Response belbimSearchCardWithAuthP1Response) {
        super(
            responseHeader);
        this.belbimSearchCardWithAuthP1Response = belbimSearchCardWithAuthP1Response;
    }


    /**
     * Gets the belbimSearchCardWithAuthP1Response value for this CpgwBelbimSearchCardWithAuthP1Response.
     * 
     * @return belbimSearchCardWithAuthP1Response
     */
    public com.turkcelltech.cpgw.ws.BelbimSearchCardWithAuthP1Response getBelbimSearchCardWithAuthP1Response() {
        return belbimSearchCardWithAuthP1Response;
    }


    /**
     * Sets the belbimSearchCardWithAuthP1Response value for this CpgwBelbimSearchCardWithAuthP1Response.
     * 
     * @param belbimSearchCardWithAuthP1Response
     */
    public void setBelbimSearchCardWithAuthP1Response(com.turkcelltech.cpgw.ws.BelbimSearchCardWithAuthP1Response belbimSearchCardWithAuthP1Response) {
        this.belbimSearchCardWithAuthP1Response = belbimSearchCardWithAuthP1Response;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CpgwBelbimSearchCardWithAuthP1Response)) return false;
        CpgwBelbimSearchCardWithAuthP1Response other = (CpgwBelbimSearchCardWithAuthP1Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.belbimSearchCardWithAuthP1Response==null && other.getBelbimSearchCardWithAuthP1Response()==null) || 
             (this.belbimSearchCardWithAuthP1Response!=null &&
              this.belbimSearchCardWithAuthP1Response.equals(other.getBelbimSearchCardWithAuthP1Response())));
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
        if (getBelbimSearchCardWithAuthP1Response() != null) {
            _hashCode += getBelbimSearchCardWithAuthP1Response().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CpgwBelbimSearchCardWithAuthP1Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwBelbimSearchCardWithAuthP1Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("belbimSearchCardWithAuthP1Response");
        elemField.setXmlName(new javax.xml.namespace.QName("", "belbimSearchCardWithAuthP1Response"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimSearchCardWithAuthP1Response"));
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
