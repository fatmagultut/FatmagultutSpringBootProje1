/**
 * InquireInvoiceRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class InquireInvoiceRequest  extends com.turkcelltech.cpgw.ws.RequestTypeWithChannelRefNo  implements java.io.Serializable {
    private java.math.BigDecimal collectionAmount;

    private com.turkcelltech.cpgw.ws.CorpAndSubscriberInfo corpAndSubscriberInfo;

    private com.turkcelltech.cpgw.ws.CustomerInfo customerInfo;

    public InquireInvoiceRequest() {
    }

    public InquireInvoiceRequest(
           com.turkcelltech.cpgw.ws.RequestHeader requestHeader,
           java.lang.String channelRefNo,
           java.math.BigDecimal collectionAmount,
           com.turkcelltech.cpgw.ws.CorpAndSubscriberInfo corpAndSubscriberInfo,
           com.turkcelltech.cpgw.ws.CustomerInfo customerInfo) {
        super(
            requestHeader,
            channelRefNo);
        this.collectionAmount = collectionAmount;
        this.corpAndSubscriberInfo = corpAndSubscriberInfo;
        this.customerInfo = customerInfo;
    }


    /**
     * Gets the collectionAmount value for this InquireInvoiceRequest.
     * 
     * @return collectionAmount
     */
    public java.math.BigDecimal getCollectionAmount() {
        return collectionAmount;
    }


    /**
     * Sets the collectionAmount value for this InquireInvoiceRequest.
     * 
     * @param collectionAmount
     */
    public void setCollectionAmount(java.math.BigDecimal collectionAmount) {
        this.collectionAmount = collectionAmount;
    }


    /**
     * Gets the corpAndSubscriberInfo value for this InquireInvoiceRequest.
     * 
     * @return corpAndSubscriberInfo
     */
    public com.turkcelltech.cpgw.ws.CorpAndSubscriberInfo getCorpAndSubscriberInfo() {
        return corpAndSubscriberInfo;
    }


    /**
     * Sets the corpAndSubscriberInfo value for this InquireInvoiceRequest.
     * 
     * @param corpAndSubscriberInfo
     */
    public void setCorpAndSubscriberInfo(com.turkcelltech.cpgw.ws.CorpAndSubscriberInfo corpAndSubscriberInfo) {
        this.corpAndSubscriberInfo = corpAndSubscriberInfo;
    }


    /**
     * Gets the customerInfo value for this InquireInvoiceRequest.
     * 
     * @return customerInfo
     */
    public com.turkcelltech.cpgw.ws.CustomerInfo getCustomerInfo() {
        return customerInfo;
    }


    /**
     * Sets the customerInfo value for this InquireInvoiceRequest.
     * 
     * @param customerInfo
     */
    public void setCustomerInfo(com.turkcelltech.cpgw.ws.CustomerInfo customerInfo) {
        this.customerInfo = customerInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InquireInvoiceRequest)) return false;
        InquireInvoiceRequest other = (InquireInvoiceRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.collectionAmount==null && other.getCollectionAmount()==null) || 
             (this.collectionAmount!=null &&
              this.collectionAmount.equals(other.getCollectionAmount()))) &&
            ((this.corpAndSubscriberInfo==null && other.getCorpAndSubscriberInfo()==null) || 
             (this.corpAndSubscriberInfo!=null &&
              this.corpAndSubscriberInfo.equals(other.getCorpAndSubscriberInfo()))) &&
            ((this.customerInfo==null && other.getCustomerInfo()==null) || 
             (this.customerInfo!=null &&
              this.customerInfo.equals(other.getCustomerInfo())));
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
        if (getCollectionAmount() != null) {
            _hashCode += getCollectionAmount().hashCode();
        }
        if (getCorpAndSubscriberInfo() != null) {
            _hashCode += getCorpAndSubscriberInfo().hashCode();
        }
        if (getCustomerInfo() != null) {
            _hashCode += getCustomerInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InquireInvoiceRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "inquireInvoiceRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collectionAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "collectionAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corpAndSubscriberInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "corpAndSubscriberInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "corpAndSubscriberInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "customerInfo"));
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
