/**
 * GetFavoriteCorporationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class GetFavoriteCorporationResponse  extends com.turkcelltech.cpgw.ws.ResponseType  implements java.io.Serializable {
    private com.turkcelltech.cpgw.ws.FavoriteCorporationInfo[] favoriteCorporationInfo;

    private java.lang.Long firmaCityCode;

    public GetFavoriteCorporationResponse() {
    }

    public GetFavoriteCorporationResponse(
           com.turkcelltech.cpgw.ws.ResponseHeader responseHeader,
           com.turkcelltech.cpgw.ws.FavoriteCorporationInfo[] favoriteCorporationInfo,
           java.lang.Long firmaCityCode) {
        super(
            responseHeader);
        this.favoriteCorporationInfo = favoriteCorporationInfo;
        this.firmaCityCode = firmaCityCode;
    }


    /**
     * Gets the favoriteCorporationInfo value for this GetFavoriteCorporationResponse.
     * 
     * @return favoriteCorporationInfo
     */
    public com.turkcelltech.cpgw.ws.FavoriteCorporationInfo[] getFavoriteCorporationInfo() {
        return favoriteCorporationInfo;
    }


    /**
     * Sets the favoriteCorporationInfo value for this GetFavoriteCorporationResponse.
     * 
     * @param favoriteCorporationInfo
     */
    public void setFavoriteCorporationInfo(com.turkcelltech.cpgw.ws.FavoriteCorporationInfo[] favoriteCorporationInfo) {
        this.favoriteCorporationInfo = favoriteCorporationInfo;
    }

    public com.turkcelltech.cpgw.ws.FavoriteCorporationInfo getFavoriteCorporationInfo(int i) {
        return this.favoriteCorporationInfo[i];
    }

    public void setFavoriteCorporationInfo(int i, com.turkcelltech.cpgw.ws.FavoriteCorporationInfo _value) {
        this.favoriteCorporationInfo[i] = _value;
    }


    /**
     * Gets the firmaCityCode value for this GetFavoriteCorporationResponse.
     * 
     * @return firmaCityCode
     */
    public java.lang.Long getFirmaCityCode() {
        return firmaCityCode;
    }


    /**
     * Sets the firmaCityCode value for this GetFavoriteCorporationResponse.
     * 
     * @param firmaCityCode
     */
    public void setFirmaCityCode(java.lang.Long firmaCityCode) {
        this.firmaCityCode = firmaCityCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetFavoriteCorporationResponse)) return false;
        GetFavoriteCorporationResponse other = (GetFavoriteCorporationResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.favoriteCorporationInfo==null && other.getFavoriteCorporationInfo()==null) || 
             (this.favoriteCorporationInfo!=null &&
              java.util.Arrays.equals(this.favoriteCorporationInfo, other.getFavoriteCorporationInfo()))) &&
            ((this.firmaCityCode==null && other.getFirmaCityCode()==null) || 
             (this.firmaCityCode!=null &&
              this.firmaCityCode.equals(other.getFirmaCityCode())));
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
        if (getFavoriteCorporationInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFavoriteCorporationInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFavoriteCorporationInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFirmaCityCode() != null) {
            _hashCode += getFirmaCityCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetFavoriteCorporationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getFavoriteCorporationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("favoriteCorporationInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "favoriteCorporationInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "favoriteCorporationInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firmaCityCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firmaCityCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
