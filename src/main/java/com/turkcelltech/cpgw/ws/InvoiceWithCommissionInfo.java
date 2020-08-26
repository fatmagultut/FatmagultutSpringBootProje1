/**
 * InvoiceWithCommissionInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class InvoiceWithCommissionInfo  extends com.turkcelltech.cpgw.ws.InvoiceInfo  implements java.io.Serializable {
    private com.turkcelltech.cpgw.ws.InvoiceCommissionInfo[] commissionList;

    public InvoiceWithCommissionInfo() {
    }

    public InvoiceWithCommissionInfo(
           java.lang.String bankReconDate,
           java.lang.String bankRefNo,
           java.lang.String channel,
           java.math.BigDecimal channelCommission,
           java.math.BigDecimal commissionAmount,
           com.turkcelltech.cpgw.ws.CustomerPaymentMethodEnum custPaymentMethod,
           java.math.BigDecimal invoiceAmount,
           java.util.Calendar invoiceDueDate,
           java.lang.String invoiceInfo1,
           java.lang.String invoiceInfo2,
           java.lang.String invoiceInfo3,
           java.lang.String invoiceNo,
           java.util.Calendar invoicePaymentDate,
           java.lang.Long invoiceRefNo,
           java.lang.String invoiceSeqNo,
           com.turkcelltech.cpgw.ws.InvoiceStatusEnum invoiceStatus,
           java.math.BigDecimal newInstallmentAmount,
           java.math.BigDecimal paymentAmount,
           com.turkcelltech.cpgw.ws.PaymentOperationEnum paymentOperation,
           java.math.BigDecimal totalAmount,
           java.util.Calendar transactionDate,
           java.lang.String transactionId,
           com.turkcelltech.cpgw.ws.InvoiceCommissionInfo[] commissionList) {
        super(
            bankReconDate,
            bankRefNo,
            channel,
            channelCommission,
            commissionAmount,
            custPaymentMethod,
            invoiceAmount,
            invoiceDueDate,
            invoiceInfo1,
            invoiceInfo2,
            invoiceInfo3,
            invoiceNo,
            invoicePaymentDate,
            invoiceRefNo,
            invoiceSeqNo,
            invoiceStatus,
            newInstallmentAmount,
            paymentAmount,
            paymentOperation,
            totalAmount,
            transactionDate,
            transactionId);
        this.commissionList = commissionList;
    }


    /**
     * Gets the commissionList value for this InvoiceWithCommissionInfo.
     * 
     * @return commissionList
     */
    public com.turkcelltech.cpgw.ws.InvoiceCommissionInfo[] getCommissionList() {
        return commissionList;
    }


    /**
     * Sets the commissionList value for this InvoiceWithCommissionInfo.
     * 
     * @param commissionList
     */
    public void setCommissionList(com.turkcelltech.cpgw.ws.InvoiceCommissionInfo[] commissionList) {
        this.commissionList = commissionList;
    }

    public com.turkcelltech.cpgw.ws.InvoiceCommissionInfo getCommissionList(int i) {
        return this.commissionList[i];
    }

    public void setCommissionList(int i, com.turkcelltech.cpgw.ws.InvoiceCommissionInfo _value) {
        this.commissionList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvoiceWithCommissionInfo)) return false;
        InvoiceWithCommissionInfo other = (InvoiceWithCommissionInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.commissionList==null && other.getCommissionList()==null) || 
             (this.commissionList!=null &&
              java.util.Arrays.equals(this.commissionList, other.getCommissionList())));
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
        if (getCommissionList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCommissionList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCommissionList(), i);
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
        new org.apache.axis.description.TypeDesc(InvoiceWithCommissionInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "invoiceWithCommissionInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commissionList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "commissionList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "invoiceCommissionInfo"));
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
