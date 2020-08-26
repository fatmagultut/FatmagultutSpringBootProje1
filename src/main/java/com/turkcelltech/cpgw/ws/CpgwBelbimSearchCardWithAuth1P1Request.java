/**
 * CpgwBelbimSearchCardWithAuth1P1Request.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class CpgwBelbimSearchCardWithAuth1P1Request  extends com.turkcelltech.cpgw.ws.RequestTypeWithChannelRefNo  implements java.io.Serializable {
    private com.turkcelltech.cpgw.ws.BelbimSearchCardWithAuthP1Request belbimSearchCardWithAuthP1Request;

    private java.lang.Long corpCode;

    private java.lang.Long vendorId;

    public CpgwBelbimSearchCardWithAuth1P1Request() {
    }

    public CpgwBelbimSearchCardWithAuth1P1Request(
           com.turkcelltech.cpgw.ws.RequestHeader requestHeader,
           java.lang.String channelRefNo,
           com.turkcelltech.cpgw.ws.BelbimSearchCardWithAuthP1Request belbimSearchCardWithAuthP1Request,
           java.lang.Long corpCode,
           java.lang.Long vendorId) {
        super(
            requestHeader,
            channelRefNo);
        this.belbimSearchCardWithAuthP1Request = belbimSearchCardWithAuthP1Request;
        this.corpCode = corpCode;
        this.vendorId = vendorId;
    }


    /**
     * Gets the belbimSearchCardWithAuthP1Request value for this CpgwBelbimSearchCardWithAuth1P1Request.
     * 
     * @return belbimSearchCardWithAuthP1Request
     */
    public com.turkcelltech.cpgw.ws.BelbimSearchCardWithAuthP1Request getBelbimSearchCardWithAuthP1Request() {
        return belbimSearchCardWithAuthP1Request;
    }


    /**
     * Sets the belbimSearchCardWithAuthP1Request value for this CpgwBelbimSearchCardWithAuth1P1Request.
     * 
     * @param belbimSearchCardWithAuthP1Request
     */
    public void setBelbimSearchCardWithAuthP1Request(com.turkcelltech.cpgw.ws.BelbimSearchCardWithAuthP1Request belbimSearchCardWithAuthP1Request) {
        this.belbimSearchCardWithAuthP1Request = belbimSearchCardWithAuthP1Request;
    }


    /**
     * Gets the corpCode value for this CpgwBelbimSearchCardWithAuth1P1Request.
     * 
     * @return corpCode
     */
    public java.lang.Long getCorpCode() {
        return corpCode;
    }


    /**
     * Sets the corpCode value for this CpgwBelbimSearchCardWithAuth1P1Request.
     * 
     * @param corpCode
     */
    public void setCorpCode(java.lang.Long corpCode) {
        this.corpCode = corpCode;
    }


    /**
     * Gets the vendorId value for this CpgwBelbimSearchCardWithAuth1P1Request.
     * 
     * @return vendorId
     */
    public java.lang.Long getVendorId() {
        return vendorId;
    }


    /**
     * Sets the vendorId value for this CpgwBelbimSearchCardWithAuth1P1Request.
     * 
     * @param vendorId
     */
    public void setVendorId(java.lang.Long vendorId) {
        this.vendorId = vendorId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CpgwBelbimSearchCardWithAuth1P1Request)) return false;
        CpgwBelbimSearchCardWithAuth1P1Request other = (CpgwBelbimSearchCardWithAuth1P1Request) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.belbimSearchCardWithAuthP1Request==null && other.getBelbimSearchCardWithAuthP1Request()==null) || 
             (this.belbimSearchCardWithAuthP1Request!=null &&
              this.belbimSearchCardWithAuthP1Request.equals(other.getBelbimSearchCardWithAuthP1Request()))) &&
            ((this.corpCode==null && other.getCorpCode()==null) || 
             (this.corpCode!=null &&
              this.corpCode.equals(other.getCorpCode()))) &&
            ((this.vendorId==null && other.getVendorId()==null) || 
             (this.vendorId!=null &&
              this.vendorId.equals(other.getVendorId())));
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
        if (getBelbimSearchCardWithAuthP1Request() != null) {
            _hashCode += getBelbimSearchCardWithAuthP1Request().hashCode();
        }
        if (getCorpCode() != null) {
            _hashCode += getCorpCode().hashCode();
        }
        if (getVendorId() != null) {
            _hashCode += getVendorId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CpgwBelbimSearchCardWithAuth1P1Request.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwBelbimSearchCardWithAuth1P1Request"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("belbimSearchCardWithAuthP1Request");
        elemField.setXmlName(new javax.xml.namespace.QName("", "belbimSearchCardWithAuthP1Request"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimSearchCardWithAuthP1Request"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corpCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "corpCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vendorId"));
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
