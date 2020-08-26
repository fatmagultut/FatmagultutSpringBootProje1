/**
 * PayInvoiceRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class PayInvoiceRequest  extends com.turkcelltech.cpgw.ws.RequestType  implements java.io.Serializable {
    private com.turkcelltech.cpgw.ws.CorpAndSubscriberInfo corpAndSubscriberInfo;

    private com.turkcelltech.cpgw.ws.CustomerInfo customerInfo;

    private com.turkcelltech.cpgw.ws.InvoiceInfo invoiceInfo;

    private com.turkcelltech.cpgw.ws.PaymentInfo paymentInfo;

    public PayInvoiceRequest() {
    }

    public PayInvoiceRequest(
           com.turkcelltech.cpgw.ws.RequestHeader requestHeader,
           com.turkcelltech.cpgw.ws.CorpAndSubscriberInfo corpAndSubscriberInfo,
           com.turkcelltech.cpgw.ws.CustomerInfo customerInfo,
           com.turkcelltech.cpgw.ws.InvoiceInfo invoiceInfo,
           com.turkcelltech.cpgw.ws.PaymentInfo paymentInfo) {
        super(
            requestHeader);
        this.corpAndSubscriberInfo = corpAndSubscriberInfo;
        this.customerInfo = customerInfo;
        this.invoiceInfo = invoiceInfo;
        this.paymentInfo = paymentInfo;
    }


    /**
     * Gets the corpAndSubscriberInfo value for this PayInvoiceRequest.
     * 
     * @return corpAndSubscriberInfo
     */
    public com.turkcelltech.cpgw.ws.CorpAndSubscriberInfo getCorpAndSubscriberInfo() {
        return corpAndSubscriberInfo;
    }


    /**
     * Sets the corpAndSubscriberInfo value for this PayInvoiceRequest.
     * 
     * @param corpAndSubscriberInfo
     */
    public void setCorpAndSubscriberInfo(com.turkcelltech.cpgw.ws.CorpAndSubscriberInfo corpAndSubscriberInfo) {
        this.corpAndSubscriberInfo = corpAndSubscriberInfo;
    }


    /**
     * Gets the customerInfo value for this PayInvoiceRequest.
     * 
     * @return customerInfo
     */
    public com.turkcelltech.cpgw.ws.CustomerInfo getCustomerInfo() {
        return customerInfo;
    }


    /**
     * Sets the customerInfo value for this PayInvoiceRequest.
     * 
     * @param customerInfo
     */
    public void setCustomerInfo(com.turkcelltech.cpgw.ws.CustomerInfo customerInfo) {
        this.customerInfo = customerInfo;
    }


    /**
     * Gets the invoiceInfo value for this PayInvoiceRequest.
     * 
     * @return invoiceInfo
     */
    public com.turkcelltech.cpgw.ws.InvoiceInfo getInvoiceInfo() {
        return invoiceInfo;
    }


    /**
     * Sets the invoiceInfo value for this PayInvoiceRequest.
     * 
     * @param invoiceInfo
     */
    public void setInvoiceInfo(com.turkcelltech.cpgw.ws.InvoiceInfo invoiceInfo) {
        this.invoiceInfo = invoiceInfo;
    }


    /**
     * Gets the paymentInfo value for this PayInvoiceRequest.
     * 
     * @return paymentInfo
     */
    public com.turkcelltech.cpgw.ws.PaymentInfo getPaymentInfo() {
        return paymentInfo;
    }


    /**
     * Sets the paymentInfo value for this PayInvoiceRequest.
     * 
     * @param paymentInfo
     */
    public void setPaymentInfo(com.turkcelltech.cpgw.ws.PaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PayInvoiceRequest)) return false;
        PayInvoiceRequest other = (PayInvoiceRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.corpAndSubscriberInfo==null && other.getCorpAndSubscriberInfo()==null) || 
             (this.corpAndSubscriberInfo!=null &&
              this.corpAndSubscriberInfo.equals(other.getCorpAndSubscriberInfo()))) &&
            ((this.customerInfo==null && other.getCustomerInfo()==null) || 
             (this.customerInfo!=null &&
              this.customerInfo.equals(other.getCustomerInfo()))) &&
            ((this.invoiceInfo==null && other.getInvoiceInfo()==null) || 
             (this.invoiceInfo!=null &&
              this.invoiceInfo.equals(other.getInvoiceInfo()))) &&
            ((this.paymentInfo==null && other.getPaymentInfo()==null) || 
             (this.paymentInfo!=null &&
              this.paymentInfo.equals(other.getPaymentInfo())));
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
        if (getCorpAndSubscriberInfo() != null) {
            _hashCode += getCorpAndSubscriberInfo().hashCode();
        }
        if (getCustomerInfo() != null) {
            _hashCode += getCustomerInfo().hashCode();
        }
        if (getInvoiceInfo() != null) {
            _hashCode += getInvoiceInfo().hashCode();
        }
        if (getPaymentInfo() != null) {
            _hashCode += getPaymentInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PayInvoiceRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "payInvoiceRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "invoiceInfo"));
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
