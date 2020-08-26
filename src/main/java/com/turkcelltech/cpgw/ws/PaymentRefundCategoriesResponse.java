/**
 * PaymentRefundCategoriesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class PaymentRefundCategoriesResponse  extends com.turkcelltech.cpgw.ws.ResponseType  implements java.io.Serializable {
    private com.turkcelltech.cpgw.ws.PaymentRefundCategoryInfo[] paymentRefundCategoryInfoList;

    public PaymentRefundCategoriesResponse() {
    }

    public PaymentRefundCategoriesResponse(
           com.turkcelltech.cpgw.ws.ResponseHeader responseHeader,
           com.turkcelltech.cpgw.ws.PaymentRefundCategoryInfo[] paymentRefundCategoryInfoList) {
        super(
            responseHeader);
        this.paymentRefundCategoryInfoList = paymentRefundCategoryInfoList;
    }


    /**
     * Gets the paymentRefundCategoryInfoList value for this PaymentRefundCategoriesResponse.
     * 
     * @return paymentRefundCategoryInfoList
     */
    public com.turkcelltech.cpgw.ws.PaymentRefundCategoryInfo[] getPaymentRefundCategoryInfoList() {
        return paymentRefundCategoryInfoList;
    }


    /**
     * Sets the paymentRefundCategoryInfoList value for this PaymentRefundCategoriesResponse.
     * 
     * @param paymentRefundCategoryInfoList
     */
    public void setPaymentRefundCategoryInfoList(com.turkcelltech.cpgw.ws.PaymentRefundCategoryInfo[] paymentRefundCategoryInfoList) {
        this.paymentRefundCategoryInfoList = paymentRefundCategoryInfoList;
    }

    public com.turkcelltech.cpgw.ws.PaymentRefundCategoryInfo getPaymentRefundCategoryInfoList(int i) {
        return this.paymentRefundCategoryInfoList[i];
    }

    public void setPaymentRefundCategoryInfoList(int i, com.turkcelltech.cpgw.ws.PaymentRefundCategoryInfo _value) {
        this.paymentRefundCategoryInfoList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentRefundCategoriesResponse)) return false;
        PaymentRefundCategoriesResponse other = (PaymentRefundCategoriesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.paymentRefundCategoryInfoList==null && other.getPaymentRefundCategoryInfoList()==null) || 
             (this.paymentRefundCategoryInfoList!=null &&
              java.util.Arrays.equals(this.paymentRefundCategoryInfoList, other.getPaymentRefundCategoryInfoList())));
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
        if (getPaymentRefundCategoryInfoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentRefundCategoryInfoList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentRefundCategoryInfoList(), i);
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
        new org.apache.axis.description.TypeDesc(PaymentRefundCategoriesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "paymentRefundCategoriesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentRefundCategoryInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentRefundCategoryInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "paymentRefundCategoryInfo"));
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