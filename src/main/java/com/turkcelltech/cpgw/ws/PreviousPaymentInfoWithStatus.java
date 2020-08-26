/**
 * PreviousPaymentInfoWithStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class PreviousPaymentInfoWithStatus  extends com.turkcelltech.cpgw.ws.CpgwModel  implements java.io.Serializable {
    private com.turkcelltech.cpgw.ws.CorpAndSubscriberInfo corpAndSubscriberInfo;

    private java.lang.Integer cpgwStatus;

    private java.lang.String cpgwStatusDesc;

    private com.turkcelltech.cpgw.ws.CustomerInfo customerInfo;

    private com.turkcelltech.cpgw.ws.InfoLog[] infoLog;

    private com.turkcelltech.cpgw.ws.InvoiceInfo invoiceInfo;

    private java.lang.Integer omccPaymentStatus;

    private java.lang.String omccPaymentStatusDesc;

    private com.turkcelltech.cpgw.ws.PaymentInfo paymentInfo;

    private com.turkcelltech.cpgw.ws.PaymentLog paymentLog;

    private java.lang.Integer vendorStatus;

    private java.lang.String vendorStatusDesc;

    public PreviousPaymentInfoWithStatus() {
    }

    public PreviousPaymentInfoWithStatus(
           com.turkcelltech.cpgw.ws.CorpAndSubscriberInfo corpAndSubscriberInfo,
           java.lang.Integer cpgwStatus,
           java.lang.String cpgwStatusDesc,
           com.turkcelltech.cpgw.ws.CustomerInfo customerInfo,
           com.turkcelltech.cpgw.ws.InfoLog[] infoLog,
           com.turkcelltech.cpgw.ws.InvoiceInfo invoiceInfo,
           java.lang.Integer omccPaymentStatus,
           java.lang.String omccPaymentStatusDesc,
           com.turkcelltech.cpgw.ws.PaymentInfo paymentInfo,
           com.turkcelltech.cpgw.ws.PaymentLog paymentLog,
           java.lang.Integer vendorStatus,
           java.lang.String vendorStatusDesc) {
        this.corpAndSubscriberInfo = corpAndSubscriberInfo;
        this.cpgwStatus = cpgwStatus;
        this.cpgwStatusDesc = cpgwStatusDesc;
        this.customerInfo = customerInfo;
        this.infoLog = infoLog;
        this.invoiceInfo = invoiceInfo;
        this.omccPaymentStatus = omccPaymentStatus;
        this.omccPaymentStatusDesc = omccPaymentStatusDesc;
        this.paymentInfo = paymentInfo;
        this.paymentLog = paymentLog;
        this.vendorStatus = vendorStatus;
        this.vendorStatusDesc = vendorStatusDesc;
    }


    /**
     * Gets the corpAndSubscriberInfo value for this PreviousPaymentInfoWithStatus.
     * 
     * @return corpAndSubscriberInfo
     */
    public com.turkcelltech.cpgw.ws.CorpAndSubscriberInfo getCorpAndSubscriberInfo() {
        return corpAndSubscriberInfo;
    }


    /**
     * Sets the corpAndSubscriberInfo value for this PreviousPaymentInfoWithStatus.
     * 
     * @param corpAndSubscriberInfo
     */
    public void setCorpAndSubscriberInfo(com.turkcelltech.cpgw.ws.CorpAndSubscriberInfo corpAndSubscriberInfo) {
        this.corpAndSubscriberInfo = corpAndSubscriberInfo;
    }


    /**
     * Gets the cpgwStatus value for this PreviousPaymentInfoWithStatus.
     * 
     * @return cpgwStatus
     */
    public java.lang.Integer getCpgwStatus() {
        return cpgwStatus;
    }


    /**
     * Sets the cpgwStatus value for this PreviousPaymentInfoWithStatus.
     * 
     * @param cpgwStatus
     */
    public void setCpgwStatus(java.lang.Integer cpgwStatus) {
        this.cpgwStatus = cpgwStatus;
    }


    /**
     * Gets the cpgwStatusDesc value for this PreviousPaymentInfoWithStatus.
     * 
     * @return cpgwStatusDesc
     */
    public java.lang.String getCpgwStatusDesc() {
        return cpgwStatusDesc;
    }


    /**
     * Sets the cpgwStatusDesc value for this PreviousPaymentInfoWithStatus.
     * 
     * @param cpgwStatusDesc
     */
    public void setCpgwStatusDesc(java.lang.String cpgwStatusDesc) {
        this.cpgwStatusDesc = cpgwStatusDesc;
    }


    /**
     * Gets the customerInfo value for this PreviousPaymentInfoWithStatus.
     * 
     * @return customerInfo
     */
    public com.turkcelltech.cpgw.ws.CustomerInfo getCustomerInfo() {
        return customerInfo;
    }


    /**
     * Sets the customerInfo value for this PreviousPaymentInfoWithStatus.
     * 
     * @param customerInfo
     */
    public void setCustomerInfo(com.turkcelltech.cpgw.ws.CustomerInfo customerInfo) {
        this.customerInfo = customerInfo;
    }


    /**
     * Gets the infoLog value for this PreviousPaymentInfoWithStatus.
     * 
     * @return infoLog
     */
    public com.turkcelltech.cpgw.ws.InfoLog[] getInfoLog() {
        return infoLog;
    }


    /**
     * Sets the infoLog value for this PreviousPaymentInfoWithStatus.
     * 
     * @param infoLog
     */
    public void setInfoLog(com.turkcelltech.cpgw.ws.InfoLog[] infoLog) {
        this.infoLog = infoLog;
    }

    public com.turkcelltech.cpgw.ws.InfoLog getInfoLog(int i) {
        return this.infoLog[i];
    }

    public void setInfoLog(int i, com.turkcelltech.cpgw.ws.InfoLog _value) {
        this.infoLog[i] = _value;
    }


    /**
     * Gets the invoiceInfo value for this PreviousPaymentInfoWithStatus.
     * 
     * @return invoiceInfo
     */
    public com.turkcelltech.cpgw.ws.InvoiceInfo getInvoiceInfo() {
        return invoiceInfo;
    }


    /**
     * Sets the invoiceInfo value for this PreviousPaymentInfoWithStatus.
     * 
     * @param invoiceInfo
     */
    public void setInvoiceInfo(com.turkcelltech.cpgw.ws.InvoiceInfo invoiceInfo) {
        this.invoiceInfo = invoiceInfo;
    }


    /**
     * Gets the omccPaymentStatus value for this PreviousPaymentInfoWithStatus.
     * 
     * @return omccPaymentStatus
     */
    public java.lang.Integer getOmccPaymentStatus() {
        return omccPaymentStatus;
    }


    /**
     * Sets the omccPaymentStatus value for this PreviousPaymentInfoWithStatus.
     * 
     * @param omccPaymentStatus
     */
    public void setOmccPaymentStatus(java.lang.Integer omccPaymentStatus) {
        this.omccPaymentStatus = omccPaymentStatus;
    }


    /**
     * Gets the omccPaymentStatusDesc value for this PreviousPaymentInfoWithStatus.
     * 
     * @return omccPaymentStatusDesc
     */
    public java.lang.String getOmccPaymentStatusDesc() {
        return omccPaymentStatusDesc;
    }


    /**
     * Sets the omccPaymentStatusDesc value for this PreviousPaymentInfoWithStatus.
     * 
     * @param omccPaymentStatusDesc
     */
    public void setOmccPaymentStatusDesc(java.lang.String omccPaymentStatusDesc) {
        this.omccPaymentStatusDesc = omccPaymentStatusDesc;
    }


    /**
     * Gets the paymentInfo value for this PreviousPaymentInfoWithStatus.
     * 
     * @return paymentInfo
     */
    public com.turkcelltech.cpgw.ws.PaymentInfo getPaymentInfo() {
        return paymentInfo;
    }


    /**
     * Sets the paymentInfo value for this PreviousPaymentInfoWithStatus.
     * 
     * @param paymentInfo
     */
    public void setPaymentInfo(com.turkcelltech.cpgw.ws.PaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
    }


    /**
     * Gets the paymentLog value for this PreviousPaymentInfoWithStatus.
     * 
     * @return paymentLog
     */
    public com.turkcelltech.cpgw.ws.PaymentLog getPaymentLog() {
        return paymentLog;
    }


    /**
     * Sets the paymentLog value for this PreviousPaymentInfoWithStatus.
     * 
     * @param paymentLog
     */
    public void setPaymentLog(com.turkcelltech.cpgw.ws.PaymentLog paymentLog) {
        this.paymentLog = paymentLog;
    }


    /**
     * Gets the vendorStatus value for this PreviousPaymentInfoWithStatus.
     * 
     * @return vendorStatus
     */
    public java.lang.Integer getVendorStatus() {
        return vendorStatus;
    }


    /**
     * Sets the vendorStatus value for this PreviousPaymentInfoWithStatus.
     * 
     * @param vendorStatus
     */
    public void setVendorStatus(java.lang.Integer vendorStatus) {
        this.vendorStatus = vendorStatus;
    }


    /**
     * Gets the vendorStatusDesc value for this PreviousPaymentInfoWithStatus.
     * 
     * @return vendorStatusDesc
     */
    public java.lang.String getVendorStatusDesc() {
        return vendorStatusDesc;
    }


    /**
     * Sets the vendorStatusDesc value for this PreviousPaymentInfoWithStatus.
     * 
     * @param vendorStatusDesc
     */
    public void setVendorStatusDesc(java.lang.String vendorStatusDesc) {
        this.vendorStatusDesc = vendorStatusDesc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PreviousPaymentInfoWithStatus)) return false;
        PreviousPaymentInfoWithStatus other = (PreviousPaymentInfoWithStatus) obj;
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
            ((this.cpgwStatus==null && other.getCpgwStatus()==null) || 
             (this.cpgwStatus!=null &&
              this.cpgwStatus.equals(other.getCpgwStatus()))) &&
            ((this.cpgwStatusDesc==null && other.getCpgwStatusDesc()==null) || 
             (this.cpgwStatusDesc!=null &&
              this.cpgwStatusDesc.equals(other.getCpgwStatusDesc()))) &&
            ((this.customerInfo==null && other.getCustomerInfo()==null) || 
             (this.customerInfo!=null &&
              this.customerInfo.equals(other.getCustomerInfo()))) &&
            ((this.infoLog==null && other.getInfoLog()==null) || 
             (this.infoLog!=null &&
              java.util.Arrays.equals(this.infoLog, other.getInfoLog()))) &&
            ((this.invoiceInfo==null && other.getInvoiceInfo()==null) || 
             (this.invoiceInfo!=null &&
              this.invoiceInfo.equals(other.getInvoiceInfo()))) &&
            ((this.omccPaymentStatus==null && other.getOmccPaymentStatus()==null) || 
             (this.omccPaymentStatus!=null &&
              this.omccPaymentStatus.equals(other.getOmccPaymentStatus()))) &&
            ((this.omccPaymentStatusDesc==null && other.getOmccPaymentStatusDesc()==null) || 
             (this.omccPaymentStatusDesc!=null &&
              this.omccPaymentStatusDesc.equals(other.getOmccPaymentStatusDesc()))) &&
            ((this.paymentInfo==null && other.getPaymentInfo()==null) || 
             (this.paymentInfo!=null &&
              this.paymentInfo.equals(other.getPaymentInfo()))) &&
            ((this.paymentLog==null && other.getPaymentLog()==null) || 
             (this.paymentLog!=null &&
              this.paymentLog.equals(other.getPaymentLog()))) &&
            ((this.vendorStatus==null && other.getVendorStatus()==null) || 
             (this.vendorStatus!=null &&
              this.vendorStatus.equals(other.getVendorStatus()))) &&
            ((this.vendorStatusDesc==null && other.getVendorStatusDesc()==null) || 
             (this.vendorStatusDesc!=null &&
              this.vendorStatusDesc.equals(other.getVendorStatusDesc())));
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
        if (getCpgwStatus() != null) {
            _hashCode += getCpgwStatus().hashCode();
        }
        if (getCpgwStatusDesc() != null) {
            _hashCode += getCpgwStatusDesc().hashCode();
        }
        if (getCustomerInfo() != null) {
            _hashCode += getCustomerInfo().hashCode();
        }
        if (getInfoLog() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInfoLog());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInfoLog(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInvoiceInfo() != null) {
            _hashCode += getInvoiceInfo().hashCode();
        }
        if (getOmccPaymentStatus() != null) {
            _hashCode += getOmccPaymentStatus().hashCode();
        }
        if (getOmccPaymentStatusDesc() != null) {
            _hashCode += getOmccPaymentStatusDesc().hashCode();
        }
        if (getPaymentInfo() != null) {
            _hashCode += getPaymentInfo().hashCode();
        }
        if (getPaymentLog() != null) {
            _hashCode += getPaymentLog().hashCode();
        }
        if (getVendorStatus() != null) {
            _hashCode += getVendorStatus().hashCode();
        }
        if (getVendorStatusDesc() != null) {
            _hashCode += getVendorStatusDesc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PreviousPaymentInfoWithStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "previousPaymentInfoWithStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corpAndSubscriberInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "corpAndSubscriberInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "corpAndSubscriberInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpgwStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpgwStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpgwStatusDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpgwStatusDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("infoLog");
        elemField.setXmlName(new javax.xml.namespace.QName("", "infoLog"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "infoLog"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "invoiceInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("omccPaymentStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "omccPaymentStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("omccPaymentStatusDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "omccPaymentStatusDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("paymentLog");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentLog"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "paymentLog"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vendorStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorStatusDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vendorStatusDesc"));
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
