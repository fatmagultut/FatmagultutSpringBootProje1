/**
 * PaymentRefundHisResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class PaymentRefundHisResponse  extends com.turkcelltech.cpgw.ws.ResponseType  implements java.io.Serializable {
    private com.turkcelltech.cpgw.ws.PaymentRefundHis[] paymentRefundHis;

    public PaymentRefundHisResponse() {
    }

    public PaymentRefundHisResponse(
           com.turkcelltech.cpgw.ws.ResponseHeader responseHeader,
           com.turkcelltech.cpgw.ws.PaymentRefundHis[] paymentRefundHis) {
        super(
            responseHeader);
        this.paymentRefundHis = paymentRefundHis;
    }


    /**
     * Gets the paymentRefundHis value for this PaymentRefundHisResponse.
     * 
     * @return paymentRefundHis
     */
    public com.turkcelltech.cpgw.ws.PaymentRefundHis[] getPaymentRefundHis() {
        return paymentRefundHis;
    }


    /**
     * Sets the paymentRefundHis value for this PaymentRefundHisResponse.
     * 
     * @param paymentRefundHis
     */
    public void setPaymentRefundHis(com.turkcelltech.cpgw.ws.PaymentRefundHis[] paymentRefundHis) {
        this.paymentRefundHis = paymentRefundHis;
    }

    public com.turkcelltech.cpgw.ws.PaymentRefundHis getPaymentRefundHis(int i) {
        return this.paymentRefundHis[i];
    }

    public void setPaymentRefundHis(int i, com.turkcelltech.cpgw.ws.PaymentRefundHis _value) {
        this.paymentRefundHis[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentRefundHisResponse)) return false;
        PaymentRefundHisResponse other = (PaymentRefundHisResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.paymentRefundHis==null && other.getPaymentRefundHis()==null) || 
             (this.paymentRefundHis!=null &&
              java.util.Arrays.equals(this.paymentRefundHis, other.getPaymentRefundHis())));
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
        if (getPaymentRefundHis() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentRefundHis());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentRefundHis(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentRefundHisResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "paymentRefundHisResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentRefundHis");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentRefundHis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "paymentRefundHis"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
