/**
 * AddFavoriteCorporationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class AddFavoriteCorporationRequest  extends com.turkcelltech.cpgw.ws.RequestTypeWithChannelRefNo  implements java.io.Serializable {
    private java.lang.Long corpId;

    private java.lang.Long firmaId;

    public AddFavoriteCorporationRequest() {
    }

    public AddFavoriteCorporationRequest(
           com.turkcelltech.cpgw.ws.RequestHeader requestHeader,
           java.lang.String channelRefNo,
           java.lang.Long corpId,
           java.lang.Long firmaId) {
        super(
            requestHeader,
            channelRefNo);
        this.corpId = corpId;
        this.firmaId = firmaId;
    }


    /**
     * Gets the corpId value for this AddFavoriteCorporationRequest.
     * 
     * @return corpId
     */
    public java.lang.Long getCorpId() {
        return corpId;
    }


    /**
     * Sets the corpId value for this AddFavoriteCorporationRequest.
     * 
     * @param corpId
     */
    public void setCorpId(java.lang.Long corpId) {
        this.corpId = corpId;
    }


    /**
     * Gets the firmaId value for this AddFavoriteCorporationRequest.
     * 
     * @return firmaId
     */
    public java.lang.Long getFirmaId() {
        return firmaId;
    }


    /**
     * Sets the firmaId value for this AddFavoriteCorporationRequest.
     * 
     * @param firmaId
     */
    public void setFirmaId(java.lang.Long firmaId) {
        this.firmaId = firmaId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddFavoriteCorporationRequest)) return false;
        AddFavoriteCorporationRequest other = (AddFavoriteCorporationRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.corpId==null && other.getCorpId()==null) || 
             (this.corpId!=null &&
              this.corpId.equals(other.getCorpId()))) &&
            ((this.firmaId==null && other.getFirmaId()==null) || 
             (this.firmaId!=null &&
              this.firmaId.equals(other.getFirmaId())));
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
        if (getCorpId() != null) {
            _hashCode += getCorpId().hashCode();
        }
        if (getFirmaId() != null) {
            _hashCode += getFirmaId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddFavoriteCorporationRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "addFavoriteCorporationRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corpId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "corpId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firmaId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firmaId"));
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
