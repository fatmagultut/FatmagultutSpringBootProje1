/**
 * CpgwBelbimAuthP2Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class CpgwBelbimAuthP2Response  extends com.turkcelltech.cpgw.ws.ResponseType  implements java.io.Serializable {
    private com.turkcelltech.cpgw.ws.BelbimAuthP2Response belbimAuthP2Response;

    public CpgwBelbimAuthP2Response() {
    }

    public CpgwBelbimAuthP2Response(
           com.turkcelltech.cpgw.ws.ResponseHeader responseHeader,
           com.turkcelltech.cpgw.ws.BelbimAuthP2Response belbimAuthP2Response) {
        super(
            responseHeader);
        this.belbimAuthP2Response = belbimAuthP2Response;
    }


    /**
     * Gets the belbimAuthP2Response value for this CpgwBelbimAuthP2Response.
     * 
     * @return belbimAuthP2Response
     */
    public com.turkcelltech.cpgw.ws.BelbimAuthP2Response getBelbimAuthP2Response() {
        return belbimAuthP2Response;
    }


    /**
     * Sets the belbimAuthP2Response value for this CpgwBelbimAuthP2Response.
     * 
     * @param belbimAuthP2Response
     */
    public void setBelbimAuthP2Response(com.turkcelltech.cpgw.ws.BelbimAuthP2Response belbimAuthP2Response) {
        this.belbimAuthP2Response = belbimAuthP2Response;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CpgwBelbimAuthP2Response)) return false;
        CpgwBelbimAuthP2Response other = (CpgwBelbimAuthP2Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.belbimAuthP2Response==null && other.getBelbimAuthP2Response()==null) || 
             (this.belbimAuthP2Response!=null &&
              this.belbimAuthP2Response.equals(other.getBelbimAuthP2Response())));
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
        if (getBelbimAuthP2Response() != null) {
            _hashCode += getBelbimAuthP2Response().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CpgwBelbimAuthP2Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwBelbimAuthP2Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("belbimAuthP2Response");
        elemField.setXmlName(new javax.xml.namespace.QName("", "belbimAuthP2Response"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimAuthP2Response"));
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
