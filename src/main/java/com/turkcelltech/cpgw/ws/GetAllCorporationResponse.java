/**
 * GetAllCorporationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class GetAllCorporationResponse  extends com.turkcelltech.cpgw.ws.ResponseType  implements java.io.Serializable {
    private com.turkcelltech.cpgw.ws.CorporationInfoWithChannel[] corporations;

    private java.lang.Integer okcVersion;

    public GetAllCorporationResponse() {
    }

    public GetAllCorporationResponse(
           com.turkcelltech.cpgw.ws.ResponseHeader responseHeader,
           com.turkcelltech.cpgw.ws.CorporationInfoWithChannel[] corporations,
           java.lang.Integer okcVersion) {
        super(
            responseHeader);
        this.corporations = corporations;
        this.okcVersion = okcVersion;
    }


    /**
     * Gets the corporations value for this GetAllCorporationResponse.
     * 
     * @return corporations
     */
    public com.turkcelltech.cpgw.ws.CorporationInfoWithChannel[] getCorporations() {
        return corporations;
    }


    /**
     * Sets the corporations value for this GetAllCorporationResponse.
     * 
     * @param corporations
     */
    public void setCorporations(com.turkcelltech.cpgw.ws.CorporationInfoWithChannel[] corporations) {
        this.corporations = corporations;
    }

    public com.turkcelltech.cpgw.ws.CorporationInfoWithChannel getCorporations(int i) {
        return this.corporations[i];
    }

    public void setCorporations(int i, com.turkcelltech.cpgw.ws.CorporationInfoWithChannel _value) {
        this.corporations[i] = _value;
    }


    /**
     * Gets the okcVersion value for this GetAllCorporationResponse.
     * 
     * @return okcVersion
     */
    public java.lang.Integer getOkcVersion() {
        return okcVersion;
    }


    /**
     * Sets the okcVersion value for this GetAllCorporationResponse.
     * 
     * @param okcVersion
     */
    public void setOkcVersion(java.lang.Integer okcVersion) {
        this.okcVersion = okcVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAllCorporationResponse)) return false;
        GetAllCorporationResponse other = (GetAllCorporationResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.corporations==null && other.getCorporations()==null) || 
             (this.corporations!=null &&
              java.util.Arrays.equals(this.corporations, other.getCorporations()))) &&
            ((this.okcVersion==null && other.getOkcVersion()==null) || 
             (this.okcVersion!=null &&
              this.okcVersion.equals(other.getOkcVersion())));
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
        if (getCorporations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCorporations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCorporations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOkcVersion() != null) {
            _hashCode += getOkcVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAllCorporationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getAllCorporationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corporations");
        elemField.setXmlName(new javax.xml.namespace.QName("", "corporations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "corporationInfoWithChannel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("okcVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "okcVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
