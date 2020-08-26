/**
 * CpgwBelbimWriteCardResultRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class CpgwBelbimWriteCardResultRequest  extends com.turkcelltech.cpgw.ws.RequestTypeWithChannelRefNo  implements java.io.Serializable {
    private com.turkcelltech.cpgw.ws.BelbimWriteCardResultRequest belbimWriteCardResultRequest;

    private java.lang.Long corpCode;

    private java.lang.Long vendorId;

    public CpgwBelbimWriteCardResultRequest() {
    }

    public CpgwBelbimWriteCardResultRequest(
           com.turkcelltech.cpgw.ws.RequestHeader requestHeader,
           java.lang.String channelRefNo,
           com.turkcelltech.cpgw.ws.BelbimWriteCardResultRequest belbimWriteCardResultRequest,
           java.lang.Long corpCode,
           java.lang.Long vendorId) {
        super(
            requestHeader,
            channelRefNo);
        this.belbimWriteCardResultRequest = belbimWriteCardResultRequest;
        this.corpCode = corpCode;
        this.vendorId = vendorId;
    }


    /**
     * Gets the belbimWriteCardResultRequest value for this CpgwBelbimWriteCardResultRequest.
     * 
     * @return belbimWriteCardResultRequest
     */
    public com.turkcelltech.cpgw.ws.BelbimWriteCardResultRequest getBelbimWriteCardResultRequest() {
        return belbimWriteCardResultRequest;
    }


    /**
     * Sets the belbimWriteCardResultRequest value for this CpgwBelbimWriteCardResultRequest.
     * 
     * @param belbimWriteCardResultRequest
     */
    public void setBelbimWriteCardResultRequest(com.turkcelltech.cpgw.ws.BelbimWriteCardResultRequest belbimWriteCardResultRequest) {
        this.belbimWriteCardResultRequest = belbimWriteCardResultRequest;
    }


    /**
     * Gets the corpCode value for this CpgwBelbimWriteCardResultRequest.
     * 
     * @return corpCode
     */
    public java.lang.Long getCorpCode() {
        return corpCode;
    }


    /**
     * Sets the corpCode value for this CpgwBelbimWriteCardResultRequest.
     * 
     * @param corpCode
     */
    public void setCorpCode(java.lang.Long corpCode) {
        this.corpCode = corpCode;
    }


    /**
     * Gets the vendorId value for this CpgwBelbimWriteCardResultRequest.
     * 
     * @return vendorId
     */
    public java.lang.Long getVendorId() {
        return vendorId;
    }


    /**
     * Sets the vendorId value for this CpgwBelbimWriteCardResultRequest.
     * 
     * @param vendorId
     */
    public void setVendorId(java.lang.Long vendorId) {
        this.vendorId = vendorId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CpgwBelbimWriteCardResultRequest)) return false;
        CpgwBelbimWriteCardResultRequest other = (CpgwBelbimWriteCardResultRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.belbimWriteCardResultRequest==null && other.getBelbimWriteCardResultRequest()==null) || 
             (this.belbimWriteCardResultRequest!=null &&
              this.belbimWriteCardResultRequest.equals(other.getBelbimWriteCardResultRequest()))) &&
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
        if (getBelbimWriteCardResultRequest() != null) {
            _hashCode += getBelbimWriteCardResultRequest().hashCode();
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
        new org.apache.axis.description.TypeDesc(CpgwBelbimWriteCardResultRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwBelbimWriteCardResultRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("belbimWriteCardResultRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("", "belbimWriteCardResultRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimWriteCardResultRequest"));
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
