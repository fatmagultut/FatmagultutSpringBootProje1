/**
 * CorporationInfoWithChannel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class CorporationInfoWithChannel  extends com.turkcelltech.cpgw.ws.CorporationInfo  implements java.io.Serializable {
    private java.lang.String channelName;

    public CorporationInfoWithChannel() {
    }

    public CorporationInfoWithChannel(
           java.lang.Boolean active,
           java.lang.Integer appPriority,
           java.lang.String appTag,
           com.turkcelltech.cpgw.ws.CityInfo[] cities,
           com.turkcelltech.cpgw.ws.CollectionMethodEnum collectionMethod,
           java.lang.Long corpCode,
           java.lang.String corpName,
           java.lang.String currency,
           com.turkcelltech.cpgw.ws.InvoiceTypeEnum[] invoiceTypes,
           java.lang.Integer omccChannelId,
           com.turkcelltech.cpgw.ws.RequiredFieldInfo[] requiredFields,
           java.lang.String sector,
           java.lang.Long sectorId,
           java.lang.String subMerchantCode,
           java.lang.Long vendorId,
           java.lang.String channelName) {
        super(
            active,
            appPriority,
            appTag,
            cities,
            collectionMethod,
            corpCode,
            corpName,
            currency,
            invoiceTypes,
            omccChannelId,
            requiredFields,
            sector,
            sectorId,
            subMerchantCode,
            vendorId);
        this.channelName = channelName;
    }


    /**
     * Gets the channelName value for this CorporationInfoWithChannel.
     * 
     * @return channelName
     */
    public java.lang.String getChannelName() {
        return channelName;
    }


    /**
     * Sets the channelName value for this CorporationInfoWithChannel.
     * 
     * @param channelName
     */
    public void setChannelName(java.lang.String channelName) {
        this.channelName = channelName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CorporationInfoWithChannel)) return false;
        CorporationInfoWithChannel other = (CorporationInfoWithChannel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.channelName==null && other.getChannelName()==null) || 
             (this.channelName!=null &&
              this.channelName.equals(other.getChannelName())));
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
        if (getChannelName() != null) {
            _hashCode += getChannelName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CorporationInfoWithChannel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "corporationInfoWithChannel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "channelName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
