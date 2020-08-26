/**
 * BelbimSearchCardRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class BelbimSearchCardRequest  implements java.io.Serializable {
    private java.lang.String cardUid;

    private com.turkcelltech.cpgw.ws.BelbimClientData clientData;

    public BelbimSearchCardRequest() {
    }

    public BelbimSearchCardRequest(
           java.lang.String cardUid,
           com.turkcelltech.cpgw.ws.BelbimClientData clientData) {
           this.cardUid = cardUid;
           this.clientData = clientData;
    }


    /**
     * Gets the cardUid value for this BelbimSearchCardRequest.
     * 
     * @return cardUid
     */
    public java.lang.String getCardUid() {
        return cardUid;
    }


    /**
     * Sets the cardUid value for this BelbimSearchCardRequest.
     * 
     * @param cardUid
     */
    public void setCardUid(java.lang.String cardUid) {
        this.cardUid = cardUid;
    }


    /**
     * Gets the clientData value for this BelbimSearchCardRequest.
     * 
     * @return clientData
     */
    public com.turkcelltech.cpgw.ws.BelbimClientData getClientData() {
        return clientData;
    }


    /**
     * Sets the clientData value for this BelbimSearchCardRequest.
     * 
     * @param clientData
     */
    public void setClientData(com.turkcelltech.cpgw.ws.BelbimClientData clientData) {
        this.clientData = clientData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BelbimSearchCardRequest)) return false;
        BelbimSearchCardRequest other = (BelbimSearchCardRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cardUid==null && other.getCardUid()==null) || 
             (this.cardUid!=null &&
              this.cardUid.equals(other.getCardUid()))) &&
            ((this.clientData==null && other.getClientData()==null) || 
             (this.clientData!=null &&
              this.clientData.equals(other.getClientData())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCardUid() != null) {
            _hashCode += getCardUid().hashCode();
        }
        if (getClientData() != null) {
            _hashCode += getClientData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BelbimSearchCardRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimSearchCardRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardUid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardUid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimClientData"));
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
