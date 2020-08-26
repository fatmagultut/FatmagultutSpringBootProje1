/**
 * CpgwBelbimAuthP2Request.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class CpgwBelbimAuthP2Request  extends com.turkcelltech.cpgw.ws.RequestTypeWithChannelRefNo  implements java.io.Serializable {
    private com.turkcelltech.cpgw.ws.BelbimAuthP2Request belbimAuthP2Request;

    private java.lang.Long corpCode;

    private java.lang.Long vendorId;

    public CpgwBelbimAuthP2Request() {
    }

    public CpgwBelbimAuthP2Request(
           com.turkcelltech.cpgw.ws.RequestHeader requestHeader,
           java.lang.String channelRefNo,
           com.turkcelltech.cpgw.ws.BelbimAuthP2Request belbimAuthP2Request,
           java.lang.Long corpCode,
           java.lang.Long vendorId) {
        super(
            requestHeader,
            channelRefNo);
        this.belbimAuthP2Request = belbimAuthP2Request;
        this.corpCode = corpCode;
        this.vendorId = vendorId;
    }


    /**
     * Gets the belbimAuthP2Request value for this CpgwBelbimAuthP2Request.
     * 
     * @return belbimAuthP2Request
     */
    public com.turkcelltech.cpgw.ws.BelbimAuthP2Request getBelbimAuthP2Request() {
        return belbimAuthP2Request;
    }


    /**
     * Sets the belbimAuthP2Request value for this CpgwBelbimAuthP2Request.
     * 
     * @param belbimAuthP2Request
     */
    public void setBelbimAuthP2Request(com.turkcelltech.cpgw.ws.BelbimAuthP2Request belbimAuthP2Request) {
        this.belbimAuthP2Request = belbimAuthP2Request;
    }


    /**
     * Gets the corpCode value for this CpgwBelbimAuthP2Request.
     * 
     * @return corpCode
     */
    public java.lang.Long getCorpCode() {
        return corpCode;
    }


    /**
     * Sets the corpCode value for this CpgwBelbimAuthP2Request.
     * 
     * @param corpCode
     */
    public void setCorpCode(java.lang.Long corpCode) {
        this.corpCode = corpCode;
    }


    /**
     * Gets the vendorId value for this CpgwBelbimAuthP2Request.
     * 
     * @return vendorId
     */
    public java.lang.Long getVendorId() {
        return vendorId;
    }


    /**
     * Sets the vendorId value for this CpgwBelbimAuthP2Request.
     * 
     * @param vendorId
     */
    public void setVendorId(java.lang.Long vendorId) {
        this.vendorId = vendorId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CpgwBelbimAuthP2Request)) return false;
        CpgwBelbimAuthP2Request other = (CpgwBelbimAuthP2Request) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.belbimAuthP2Request==null && other.getBelbimAuthP2Request()==null) || 
             (this.belbimAuthP2Request!=null &&
              this.belbimAuthP2Request.equals(other.getBelbimAuthP2Request()))) &&
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
        if (getBelbimAuthP2Request() != null) {
            _hashCode += getBelbimAuthP2Request().hashCode();
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
        new org.apache.axis.description.TypeDesc(CpgwBelbimAuthP2Request.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwBelbimAuthP2Request"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("belbimAuthP2Request");
        elemField.setXmlName(new javax.xml.namespace.QName("", "belbimAuthP2Request"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimAuthP2Request"));
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
