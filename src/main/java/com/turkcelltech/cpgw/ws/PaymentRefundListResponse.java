/**
 * PaymentRefundListResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class PaymentRefundListResponse  extends com.turkcelltech.cpgw.ws.ResponseType  implements java.io.Serializable {
    private com.turkcelltech.cpgw.ws.PaymentRefund[] paymentRefund;

    public PaymentRefundListResponse() {
    }

    public PaymentRefundListResponse(
           com.turkcelltech.cpgw.ws.ResponseHeader responseHeader,
           com.turkcelltech.cpgw.ws.PaymentRefund[] paymentRefund) {
        super(
            responseHeader);
        this.paymentRefund = paymentRefund;
    }


    /**
     * Gets the paymentRefund value for this PaymentRefundListResponse.
     * 
     * @return paymentRefund
     */
    public com.turkcelltech.cpgw.ws.PaymentRefund[] getPaymentRefund() {
        return paymentRefund;
    }


    /**
     * Sets the paymentRefund value for this PaymentRefundListResponse.
     * 
     * @param paymentRefund
     */
    public void setPaymentRefund(com.turkcelltech.cpgw.ws.PaymentRefund[] paymentRefund) {
        this.paymentRefund = paymentRefund;
    }

    public com.turkcelltech.cpgw.ws.PaymentRefund getPaymentRefund(int i) {
        return this.paymentRefund[i];
    }

    public void setPaymentRefund(int i, com.turkcelltech.cpgw.ws.PaymentRefund _value) {
        this.paymentRefund[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentRefundListResponse)) return false;
        PaymentRefundListResponse other = (PaymentRefundListResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.paymentRefund==null && other.getPaymentRefund()==null) || 
             (this.paymentRefund!=null &&
              java.util.Arrays.equals(this.paymentRefund, other.getPaymentRefund())));
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
        if (getPaymentRefund() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentRefund());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentRefund(), i);
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
        new org.apache.axis.description.TypeDesc(PaymentRefundListResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "paymentRefundListResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentRefund");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentRefund"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "paymentRefund"));
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
