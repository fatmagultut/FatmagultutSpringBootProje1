/**
 * InvoiceCommissionInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class InvoiceCommissionInfo  extends com.turkcelltech.cpgw.ws.CpgwModel  implements java.io.Serializable {
    private java.math.BigDecimal channelCommission;

    private java.math.BigDecimal channelCommissionAmount;

    private java.math.BigDecimal commissionAmount;

    private com.turkcelltech.cpgw.ws.CustomerPaymentMethodEnum custPaymentMethod;

    private java.math.BigDecimal invoiceAmount;

    private java.math.BigDecimal totalAmount;

    public InvoiceCommissionInfo() {
    }

    public InvoiceCommissionInfo(
           java.math.BigDecimal channelCommission,
           java.math.BigDecimal channelCommissionAmount,
           java.math.BigDecimal commissionAmount,
           com.turkcelltech.cpgw.ws.CustomerPaymentMethodEnum custPaymentMethod,
           java.math.BigDecimal invoiceAmount,
           java.math.BigDecimal totalAmount) {
        this.channelCommission = channelCommission;
        this.channelCommissionAmount = channelCommissionAmount;
        this.commissionAmount = commissionAmount;
        this.custPaymentMethod = custPaymentMethod;
        this.invoiceAmount = invoiceAmount;
        this.totalAmount = totalAmount;
    }


    /**
     * Gets the channelCommission value for this InvoiceCommissionInfo.
     * 
     * @return channelCommission
     */
    public java.math.BigDecimal getChannelCommission() {
        return channelCommission;
    }


    /**
     * Sets the channelCommission value for this InvoiceCommissionInfo.
     * 
     * @param channelCommission
     */
    public void setChannelCommission(java.math.BigDecimal channelCommission) {
        this.channelCommission = channelCommission;
    }


    /**
     * Gets the channelCommissionAmount value for this InvoiceCommissionInfo.
     * 
     * @return channelCommissionAmount
     */
    public java.math.BigDecimal getChannelCommissionAmount() {
        return channelCommissionAmount;
    }


    /**
     * Sets the channelCommissionAmount value for this InvoiceCommissionInfo.
     * 
     * @param channelCommissionAmount
     */
    public void setChannelCommissionAmount(java.math.BigDecimal channelCommissionAmount) {
        this.channelCommissionAmount = channelCommissionAmount;
    }


    /**
     * Gets the commissionAmount value for this InvoiceCommissionInfo.
     * 
     * @return commissionAmount
     */
    public java.math.BigDecimal getCommissionAmount() {
        return commissionAmount;
    }


    /**
     * Sets the commissionAmount value for this InvoiceCommissionInfo.
     * 
     * @param commissionAmount
     */
    public void setCommissionAmount(java.math.BigDecimal commissionAmount) {
        this.commissionAmount = commissionAmount;
    }


    /**
     * Gets the custPaymentMethod value for this InvoiceCommissionInfo.
     * 
     * @return custPaymentMethod
     */
    public com.turkcelltech.cpgw.ws.CustomerPaymentMethodEnum getCustPaymentMethod() {
        return custPaymentMethod;
    }


    /**
     * Sets the custPaymentMethod value for this InvoiceCommissionInfo.
     * 
     * @param custPaymentMethod
     */
    public void setCustPaymentMethod(com.turkcelltech.cpgw.ws.CustomerPaymentMethodEnum custPaymentMethod) {
        this.custPaymentMethod = custPaymentMethod;
    }


    /**
     * Gets the invoiceAmount value for this InvoiceCommissionInfo.
     * 
     * @return invoiceAmount
     */
    public java.math.BigDecimal getInvoiceAmount() {
        return invoiceAmount;
    }


    /**
     * Sets the invoiceAmount value for this InvoiceCommissionInfo.
     * 
     * @param invoiceAmount
     */
    public void setInvoiceAmount(java.math.BigDecimal invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }


    /**
     * Gets the totalAmount value for this InvoiceCommissionInfo.
     * 
     * @return totalAmount
     */
    public java.math.BigDecimal getTotalAmount() {
        return totalAmount;
    }


    /**
     * Sets the totalAmount value for this InvoiceCommissionInfo.
     * 
     * @param totalAmount
     */
    public void setTotalAmount(java.math.BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvoiceCommissionInfo)) return false;
        InvoiceCommissionInfo other = (InvoiceCommissionInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.channelCommission==null && other.getChannelCommission()==null) || 
             (this.channelCommission!=null &&
              this.channelCommission.equals(other.getChannelCommission()))) &&
            ((this.channelCommissionAmount==null && other.getChannelCommissionAmount()==null) || 
             (this.channelCommissionAmount!=null &&
              this.channelCommissionAmount.equals(other.getChannelCommissionAmount()))) &&
            ((this.commissionAmount==null && other.getCommissionAmount()==null) || 
             (this.commissionAmount!=null &&
              this.commissionAmount.equals(other.getCommissionAmount()))) &&
            ((this.custPaymentMethod==null && other.getCustPaymentMethod()==null) || 
             (this.custPaymentMethod!=null &&
              this.custPaymentMethod.equals(other.getCustPaymentMethod()))) &&
            ((this.invoiceAmount==null && other.getInvoiceAmount()==null) || 
             (this.invoiceAmount!=null &&
              this.invoiceAmount.equals(other.getInvoiceAmount()))) &&
            ((this.totalAmount==null && other.getTotalAmount()==null) || 
             (this.totalAmount!=null &&
              this.totalAmount.equals(other.getTotalAmount())));
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
        if (getChannelCommission() != null) {
            _hashCode += getChannelCommission().hashCode();
        }
        if (getChannelCommissionAmount() != null) {
            _hashCode += getChannelCommissionAmount().hashCode();
        }
        if (getCommissionAmount() != null) {
            _hashCode += getCommissionAmount().hashCode();
        }
        if (getCustPaymentMethod() != null) {
            _hashCode += getCustPaymentMethod().hashCode();
        }
        if (getInvoiceAmount() != null) {
            _hashCode += getInvoiceAmount().hashCode();
        }
        if (getTotalAmount() != null) {
            _hashCode += getTotalAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InvoiceCommissionInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "invoiceCommissionInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelCommission");
        elemField.setXmlName(new javax.xml.namespace.QName("", "channelCommission"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelCommissionAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "channelCommissionAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commissionAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "commissionAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custPaymentMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "custPaymentMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "customerPaymentMethodEnum"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
