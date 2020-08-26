/**
 * CpgwBelbimAuthP1Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class CpgwBelbimAuthP1Response  extends com.turkcelltech.cpgw.ws.ResponseType  implements java.io.Serializable {
    private com.turkcelltech.cpgw.ws.BelbimAuthP1Response belbimAuthP1Response;

    public CpgwBelbimAuthP1Response() {
    }

    public CpgwBelbimAuthP1Response(
           com.turkcelltech.cpgw.ws.ResponseHeader responseHeader,
           com.turkcelltech.cpgw.ws.BelbimAuthP1Response belbimAuthP1Response) {
        super(
            responseHeader);
        this.belbimAuthP1Response = belbimAuthP1Response;
    }


    /**
     * Gets the belbimAuthP1Response value for this CpgwBelbimAuthP1Response.
     * 
     * @return belbimAuthP1Response
     */
    public com.turkcelltech.cpgw.ws.BelbimAuthP1Response getBelbimAuthP1Response() {
        return belbimAuthP1Response;
    }


    /**
     * Sets the belbimAuthP1Response value for this CpgwBelbimAuthP1Response.
     * 
     * @param belbimAuthP1Response
     */
    public void setBelbimAuthP1Response(com.turkcelltech.cpgw.ws.BelbimAuthP1Response belbimAuthP1Response) {
        this.belbimAuthP1Response = belbimAuthP1Response;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CpgwBelbimAuthP1Response)) return false;
        CpgwBelbimAuthP1Response other = (CpgwBelbimAuthP1Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.belbimAuthP1Response==null && other.getBelbimAuthP1Response()==null) || 
             (this.belbimAuthP1Response!=null &&
              this.belbimAuthP1Response.equals(other.getBelbimAuthP1Response())));
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
        if (getBelbimAuthP1Response() != null) {
            _hashCode += getBelbimAuthP1Response().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CpgwBelbimAuthP1Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwBelbimAuthP1Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("belbimAuthP1Response");
        elemField.setXmlName(new javax.xml.namespace.QName("", "belbimAuthP1Response"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimAuthP1Response"));
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
