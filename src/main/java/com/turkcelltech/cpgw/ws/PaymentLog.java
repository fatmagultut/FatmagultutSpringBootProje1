/**
 * PaymentLog.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class PaymentLog  implements java.io.Serializable {
    private java.util.Calendar bankCancelDate;

    private java.lang.String bankCancelResult;

    private java.util.Calendar bankPaymentDate;

    private java.lang.String bankPaymentResult;

    private java.util.Calendar vendorCancelDate;

    private java.lang.String vendorCancelResult;

    private java.util.Calendar vendorPaymentDate;

    private java.lang.String vendorPaymentResult;

    public PaymentLog() {
    }

    public PaymentLog(
           java.util.Calendar bankCancelDate,
           java.lang.String bankCancelResult,
           java.util.Calendar bankPaymentDate,
           java.lang.String bankPaymentResult,
           java.util.Calendar vendorCancelDate,
           java.lang.String vendorCancelResult,
           java.util.Calendar vendorPaymentDate,
           java.lang.String vendorPaymentResult) {
           this.bankCancelDate = bankCancelDate;
           this.bankCancelResult = bankCancelResult;
           this.bankPaymentDate = bankPaymentDate;
           this.bankPaymentResult = bankPaymentResult;
           this.vendorCancelDate = vendorCancelDate;
           this.vendorCancelResult = vendorCancelResult;
           this.vendorPaymentDate = vendorPaymentDate;
           this.vendorPaymentResult = vendorPaymentResult;
    }


    /**
     * Gets the bankCancelDate value for this PaymentLog.
     * 
     * @return bankCancelDate
     */
    public java.util.Calendar getBankCancelDate() {
        return bankCancelDate;
    }


    /**
     * Sets the bankCancelDate value for this PaymentLog.
     * 
     * @param bankCancelDate
     */
    public void setBankCancelDate(java.util.Calendar bankCancelDate) {
        this.bankCancelDate = bankCancelDate;
    }


    /**
     * Gets the bankCancelResult value for this PaymentLog.
     * 
     * @return bankCancelResult
     */
    public java.lang.String getBankCancelResult() {
        return bankCancelResult;
    }


    /**
     * Sets the bankCancelResult value for this PaymentLog.
     * 
     * @param bankCancelResult
     */
    public void setBankCancelResult(java.lang.String bankCancelResult) {
        this.bankCancelResult = bankCancelResult;
    }


    /**
     * Gets the bankPaymentDate value for this PaymentLog.
     * 
     * @return bankPaymentDate
     */
    public java.util.Calendar getBankPaymentDate() {
        return bankPaymentDate;
    }


    /**
     * Sets the bankPaymentDate value for this PaymentLog.
     * 
     * @param bankPaymentDate
     */
    public void setBankPaymentDate(java.util.Calendar bankPaymentDate) {
        this.bankPaymentDate = bankPaymentDate;
    }


    /**
     * Gets the bankPaymentResult value for this PaymentLog.
     * 
     * @return bankPaymentResult
     */
    public java.lang.String getBankPaymentResult() {
        return bankPaymentResult;
    }


    /**
     * Sets the bankPaymentResult value for this PaymentLog.
     * 
     * @param bankPaymentResult
     */
    public void setBankPaymentResult(java.lang.String bankPaymentResult) {
        this.bankPaymentResult = bankPaymentResult;
    }


    /**
     * Gets the vendorCancelDate value for this PaymentLog.
     * 
     * @return vendorCancelDate
     */
    public java.util.Calendar getVendorCancelDate() {
        return vendorCancelDate;
    }


    /**
     * Sets the vendorCancelDate value for this PaymentLog.
     * 
     * @param vendorCancelDate
     */
    public void setVendorCancelDate(java.util.Calendar vendorCancelDate) {
        this.vendorCancelDate = vendorCancelDate;
    }


    /**
     * Gets the vendorCancelResult value for this PaymentLog.
     * 
     * @return vendorCancelResult
     */
    public java.lang.String getVendorCancelResult() {
        return vendorCancelResult;
    }


    /**
     * Sets the vendorCancelResult value for this PaymentLog.
     * 
     * @param vendorCancelResult
     */
    public void setVendorCancelResult(java.lang.String vendorCancelResult) {
        this.vendorCancelResult = vendorCancelResult;
    }


    /**
     * Gets the vendorPaymentDate value for this PaymentLog.
     * 
     * @return vendorPaymentDate
     */
    public java.util.Calendar getVendorPaymentDate() {
        return vendorPaymentDate;
    }


    /**
     * Sets the vendorPaymentDate value for this PaymentLog.
     * 
     * @param vendorPaymentDate
     */
    public void setVendorPaymentDate(java.util.Calendar vendorPaymentDate) {
        this.vendorPaymentDate = vendorPaymentDate;
    }


    /**
     * Gets the vendorPaymentResult value for this PaymentLog.
     * 
     * @return vendorPaymentResult
     */
    public java.lang.String getVendorPaymentResult() {
        return vendorPaymentResult;
    }


    /**
     * Sets the vendorPaymentResult value for this PaymentLog.
     * 
     * @param vendorPaymentResult
     */
    public void setVendorPaymentResult(java.lang.String vendorPaymentResult) {
        this.vendorPaymentResult = vendorPaymentResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentLog)) return false;
        PaymentLog other = (PaymentLog) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bankCancelDate==null && other.getBankCancelDate()==null) || 
             (this.bankCancelDate!=null &&
              this.bankCancelDate.equals(other.getBankCancelDate()))) &&
            ((this.bankCancelResult==null && other.getBankCancelResult()==null) || 
             (this.bankCancelResult!=null &&
              this.bankCancelResult.equals(other.getBankCancelResult()))) &&
            ((this.bankPaymentDate==null && other.getBankPaymentDate()==null) || 
             (this.bankPaymentDate!=null &&
              this.bankPaymentDate.equals(other.getBankPaymentDate()))) &&
            ((this.bankPaymentResult==null && other.getBankPaymentResult()==null) || 
             (this.bankPaymentResult!=null &&
              this.bankPaymentResult.equals(other.getBankPaymentResult()))) &&
            ((this.vendorCancelDate==null && other.getVendorCancelDate()==null) || 
             (this.vendorCancelDate!=null &&
              this.vendorCancelDate.equals(other.getVendorCancelDate()))) &&
            ((this.vendorCancelResult==null && other.getVendorCancelResult()==null) || 
             (this.vendorCancelResult!=null &&
              this.vendorCancelResult.equals(other.getVendorCancelResult()))) &&
            ((this.vendorPaymentDate==null && other.getVendorPaymentDate()==null) || 
             (this.vendorPaymentDate!=null &&
              this.vendorPaymentDate.equals(other.getVendorPaymentDate()))) &&
            ((this.vendorPaymentResult==null && other.getVendorPaymentResult()==null) || 
             (this.vendorPaymentResult!=null &&
              this.vendorPaymentResult.equals(other.getVendorPaymentResult())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getBankCancelDate() != null) {
            _hashCode += getBankCancelDate().hashCode();
        }
        if (getBankCancelResult() != null) {
            _hashCode += getBankCancelResult().hashCode();
        }
        if (getBankPaymentDate() != null) {
            _hashCode += getBankPaymentDate().hashCode();
        }
        if (getBankPaymentResult() != null) {
            _hashCode += getBankPaymentResult().hashCode();
        }
        if (getVendorCancelDate() != null) {
            _hashCode += getVendorCancelDate().hashCode();
        }
        if (getVendorCancelResult() != null) {
            _hashCode += getVendorCancelResult().hashCode();
        }
        if (getVendorPaymentDate() != null) {
            _hashCode += getVendorPaymentDate().hashCode();
        }
        if (getVendorPaymentResult() != null) {
            _hashCode += getVendorPaymentResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentLog.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "paymentLog"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankCancelDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bankCancelDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankCancelResult");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bankCancelResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankPaymentDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bankPaymentDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankPaymentResult");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bankPaymentResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorCancelDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vendorCancelDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorCancelResult");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vendorCancelResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorPaymentDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vendorPaymentDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorPaymentResult");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vendorPaymentResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
