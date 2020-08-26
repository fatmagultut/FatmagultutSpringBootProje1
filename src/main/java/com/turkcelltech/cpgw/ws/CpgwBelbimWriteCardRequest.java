/**
 * CpgwBelbimWriteCardRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class CpgwBelbimWriteCardRequest  extends com.turkcelltech.cpgw.ws.RequestTypeWithChannelRefNo  implements java.io.Serializable {
    private java.lang.String amount;

    private com.turkcelltech.cpgw.ws.BelbimWriteCardRequest belbimWriteCardRequest;

    private java.lang.Long corpCode;

    private com.turkcelltech.cpgw.ws.PaymentInfo paymentInfo;

    private java.lang.Long vendorId;

    public CpgwBelbimWriteCardRequest() {
    }

    public CpgwBelbimWriteCardRequest(
           com.turkcelltech.cpgw.ws.RequestHeader requestHeader,
           java.lang.String channelRefNo,
           java.lang.String amount,
           com.turkcelltech.cpgw.ws.BelbimWriteCardRequest belbimWriteCardRequest,
           java.lang.Long corpCode,
           com.turkcelltech.cpgw.ws.PaymentInfo paymentInfo,
           java.lang.Long vendorId) {
        super(
            requestHeader,
            channelRefNo);
        this.amount = amount;
        this.belbimWriteCardRequest = belbimWriteCardRequest;
        this.corpCode = corpCode;
        this.paymentInfo = paymentInfo;
        this.vendorId = vendorId;
    }


    /**
     * Gets the amount value for this CpgwBelbimWriteCardRequest.
     * 
     * @return amount
     */
    public java.lang.String getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this CpgwBelbimWriteCardRequest.
     * 
     * @param amount
     */
    public void setAmount(java.lang.String amount) {
        this.amount = amount;
    }


    /**
     * Gets the belbimWriteCardRequest value for this CpgwBelbimWriteCardRequest.
     * 
     * @return belbimWriteCardRequest
     */
    public com.turkcelltech.cpgw.ws.BelbimWriteCardRequest getBelbimWriteCardRequest() {
        return belbimWriteCardRequest;
    }


    /**
     * Sets the belbimWriteCardRequest value for this CpgwBelbimWriteCardRequest.
     * 
     * @param belbimWriteCardRequest
     */
    public void setBelbimWriteCardRequest(com.turkcelltech.cpgw.ws.BelbimWriteCardRequest belbimWriteCardRequest) {
        this.belbimWriteCardRequest = belbimWriteCardRequest;
    }


    /**
     * Gets the corpCode value for this CpgwBelbimWriteCardRequest.
     * 
     * @return corpCode
     */
    public java.lang.Long getCorpCode() {
        return corpCode;
    }


    /**
     * Sets the corpCode value for this CpgwBelbimWriteCardRequest.
     * 
     * @param corpCode
     */
    public void setCorpCode(java.lang.Long corpCode) {
        this.corpCode = corpCode;
    }


    /**
     * Gets the paymentInfo value for this CpgwBelbimWriteCardRequest.
     * 
     * @return paymentInfo
     */
    public com.turkcelltech.cpgw.ws.PaymentInfo getPaymentInfo() {
        return paymentInfo;
    }


    /**
     * Sets the paymentInfo value for this CpgwBelbimWriteCardRequest.
     * 
     * @param paymentInfo
     */
    public void setPaymentInfo(com.turkcelltech.cpgw.ws.PaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
    }


    /**
     * Gets the vendorId value for this CpgwBelbimWriteCardRequest.
     * 
     * @return vendorId
     */
    public java.lang.Long getVendorId() {
        return vendorId;
    }


    /**
     * Sets the vendorId value for this CpgwBelbimWriteCardRequest.
     * 
     * @param vendorId
     */
    public void setVendorId(java.lang.Long vendorId) {
        this.vendorId = vendorId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CpgwBelbimWriteCardRequest)) return false;
        CpgwBelbimWriteCardRequest other = (CpgwBelbimWriteCardRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.belbimWriteCardRequest==null && other.getBelbimWriteCardRequest()==null) || 
             (this.belbimWriteCardRequest!=null &&
              this.belbimWriteCardRequest.equals(other.getBelbimWriteCardRequest()))) &&
            ((this.corpCode==null && other.getCorpCode()==null) || 
             (this.corpCode!=null &&
              this.corpCode.equals(other.getCorpCode()))) &&
            ((this.paymentInfo==null && other.getPaymentInfo()==null) || 
             (this.paymentInfo!=null &&
              this.paymentInfo.equals(other.getPaymentInfo()))) &&
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
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getBelbimWriteCardRequest() != null) {
            _hashCode += getBelbimWriteCardRequest().hashCode();
        }
        if (getCorpCode() != null) {
            _hashCode += getCorpCode().hashCode();
        }
        if (getPaymentInfo() != null) {
            _hashCode += getPaymentInfo().hashCode();
        }
        if (getVendorId() != null) {
            _hashCode += getVendorId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CpgwBelbimWriteCardRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwBelbimWriteCardRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("belbimWriteCardRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("", "belbimWriteCardRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimWriteCardRequest"));
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
        elemField.setFieldName("paymentInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "paymentInfo"));
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
