/**
 * PayInvoiceResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class PayInvoiceResponse  extends com.turkcelltech.cpgw.ws.ResponseType  implements java.io.Serializable {
    private com.turkcelltech.cpgw.ws.InvoiceInfo invoiceInfo;

    private com.turkcelltech.cpgw.ws.Warning warning;

    public PayInvoiceResponse() {
    }

    public PayInvoiceResponse(
           com.turkcelltech.cpgw.ws.ResponseHeader responseHeader,
           com.turkcelltech.cpgw.ws.InvoiceInfo invoiceInfo,
           com.turkcelltech.cpgw.ws.Warning warning) {
        super(
            responseHeader);
        this.invoiceInfo = invoiceInfo;
        this.warning = warning;
    }


    /**
     * Gets the invoiceInfo value for this PayInvoiceResponse.
     * 
     * @return invoiceInfo
     */
    public com.turkcelltech.cpgw.ws.InvoiceInfo getInvoiceInfo() {
        return invoiceInfo;
    }


    /**
     * Sets the invoiceInfo value for this PayInvoiceResponse.
     * 
     * @param invoiceInfo
     */
    public void setInvoiceInfo(com.turkcelltech.cpgw.ws.InvoiceInfo invoiceInfo) {
        this.invoiceInfo = invoiceInfo;
    }


    /**
     * Gets the warning value for this PayInvoiceResponse.
     * 
     * @return warning
     */
    public com.turkcelltech.cpgw.ws.Warning getWarning() {
        return warning;
    }


    /**
     * Sets the warning value for this PayInvoiceResponse.
     * 
     * @param warning
     */
    public void setWarning(com.turkcelltech.cpgw.ws.Warning warning) {
        this.warning = warning;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PayInvoiceResponse)) return false;
        PayInvoiceResponse other = (PayInvoiceResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.invoiceInfo==null && other.getInvoiceInfo()==null) || 
             (this.invoiceInfo!=null &&
              this.invoiceInfo.equals(other.getInvoiceInfo()))) &&
            ((this.warning==null && other.getWarning()==null) || 
             (this.warning!=null &&
              this.warning.equals(other.getWarning())));
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
        if (getInvoiceInfo() != null) {
            _hashCode += getInvoiceInfo().hashCode();
        }
        if (getWarning() != null) {
            _hashCode += getWarning().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PayInvoiceResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "payInvoiceResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "invoiceInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("warning");
        elemField.setXmlName(new javax.xml.namespace.QName("", "warning"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "warning"));
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
