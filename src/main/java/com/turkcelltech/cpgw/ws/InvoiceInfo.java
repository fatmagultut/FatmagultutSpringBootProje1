/**
 * InvoiceInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class InvoiceInfo  extends com.turkcelltech.cpgw.ws.CpgwModel  implements java.io.Serializable {
    private java.lang.String bankReconDate;

    private java.lang.String bankRefNo;

    private java.lang.String channel;

    private java.math.BigDecimal channelCommission;

    private java.math.BigDecimal commissionAmount;

    private com.turkcelltech.cpgw.ws.CustomerPaymentMethodEnum custPaymentMethod;

    private java.math.BigDecimal invoiceAmount;

    private java.util.Calendar invoiceDueDate;

    private java.lang.String invoiceInfo1;

    private java.lang.String invoiceInfo2;

    private java.lang.String invoiceInfo3;

    private java.lang.String invoiceNo;

    private java.util.Calendar invoicePaymentDate;

    private java.lang.Long invoiceRefNo;

    private java.lang.String invoiceSeqNo;

    private com.turkcelltech.cpgw.ws.InvoiceStatusEnum invoiceStatus;

    private java.math.BigDecimal newInstallmentAmount;

    private java.math.BigDecimal paymentAmount;

    private com.turkcelltech.cpgw.ws.PaymentOperationEnum paymentOperation;

    private java.math.BigDecimal totalAmount;

    private java.util.Calendar transactionDate;

    private java.lang.String transactionId;

    public InvoiceInfo() {
    }

    public InvoiceInfo(
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
           java.lang.String transactionId) {
        this.bankReconDate = bankReconDate;
        this.bankRefNo = bankRefNo;
        this.channel = channel;
        this.channelCommission = channelCommission;
        this.commissionAmount = commissionAmount;
        this.custPaymentMethod = custPaymentMethod;
        this.invoiceAmount = invoiceAmount;
        this.invoiceDueDate = invoiceDueDate;
        this.invoiceInfo1 = invoiceInfo1;
        this.invoiceInfo2 = invoiceInfo2;
        this.invoiceInfo3 = invoiceInfo3;
        this.invoiceNo = invoiceNo;
        this.invoicePaymentDate = invoicePaymentDate;
        this.invoiceRefNo = invoiceRefNo;
        this.invoiceSeqNo = invoiceSeqNo;
        this.invoiceStatus = invoiceStatus;
        this.newInstallmentAmount = newInstallmentAmount;
        this.paymentAmount = paymentAmount;
        this.paymentOperation = paymentOperation;
        this.totalAmount = totalAmount;
        this.transactionDate = transactionDate;
        this.transactionId = transactionId;
    }


    /**
     * Gets the bankReconDate value for this InvoiceInfo.
     * 
     * @return bankReconDate
     */
    public java.lang.String getBankReconDate() {
        return bankReconDate;
    }


    /**
     * Sets the bankReconDate value for this InvoiceInfo.
     * 
     * @param bankReconDate
     */
    public void setBankReconDate(java.lang.String bankReconDate) {
        this.bankReconDate = bankReconDate;
    }


    /**
     * Gets the bankRefNo value for this InvoiceInfo.
     * 
     * @return bankRefNo
     */
    public java.lang.String getBankRefNo() {
        return bankRefNo;
    }


    /**
     * Sets the bankRefNo value for this InvoiceInfo.
     * 
     * @param bankRefNo
     */
    public void setBankRefNo(java.lang.String bankRefNo) {
        this.bankRefNo = bankRefNo;
    }


    /**
     * Gets the channel value for this InvoiceInfo.
     * 
     * @return channel
     */
    public java.lang.String getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this InvoiceInfo.
     * 
     * @param channel
     */
    public void setChannel(java.lang.String channel) {
        this.channel = channel;
    }


    /**
     * Gets the channelCommission value for this InvoiceInfo.
     * 
     * @return channelCommission
     */
    public java.math.BigDecimal getChannelCommission() {
        return channelCommission;
    }


    /**
     * Sets the channelCommission value for this InvoiceInfo.
     * 
     * @param channelCommission
     */
    public void setChannelCommission(java.math.BigDecimal channelCommission) {
        this.channelCommission = channelCommission;
    }


    /**
     * Gets the commissionAmount value for this InvoiceInfo.
     * 
     * @return commissionAmount
     */
    public java.math.BigDecimal getCommissionAmount() {
        return commissionAmount;
    }


    /**
     * Sets the commissionAmount value for this InvoiceInfo.
     * 
     * @param commissionAmount
     */
    public void setCommissionAmount(java.math.BigDecimal commissionAmount) {
        this.commissionAmount = commissionAmount;
    }


    /**
     * Gets the custPaymentMethod value for this InvoiceInfo.
     * 
     * @return custPaymentMethod
     */
    public com.turkcelltech.cpgw.ws.CustomerPaymentMethodEnum getCustPaymentMethod() {
        return custPaymentMethod;
    }


    /**
     * Sets the custPaymentMethod value for this InvoiceInfo.
     * 
     * @param custPaymentMethod
     */
    public void setCustPaymentMethod(com.turkcelltech.cpgw.ws.CustomerPaymentMethodEnum custPaymentMethod) {
        this.custPaymentMethod = custPaymentMethod;
    }


    /**
     * Gets the invoiceAmount value for this InvoiceInfo.
     * 
     * @return invoiceAmount
     */
    public java.math.BigDecimal getInvoiceAmount() {
        return invoiceAmount;
    }


    /**
     * Sets the invoiceAmount value for this InvoiceInfo.
     * 
     * @param invoiceAmount
     */
    public void setInvoiceAmount(java.math.BigDecimal invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }


    /**
     * Gets the invoiceDueDate value for this InvoiceInfo.
     * 
     * @return invoiceDueDate
     */
    public java.util.Calendar getInvoiceDueDate() {
        return invoiceDueDate;
    }


    /**
     * Sets the invoiceDueDate value for this InvoiceInfo.
     * 
     * @param invoiceDueDate
     */
    public void setInvoiceDueDate(java.util.Calendar invoiceDueDate) {
        this.invoiceDueDate = invoiceDueDate;
    }


    /**
     * Gets the invoiceInfo1 value for this InvoiceInfo.
     * 
     * @return invoiceInfo1
     */
    public java.lang.String getInvoiceInfo1() {
        return invoiceInfo1;
    }


    /**
     * Sets the invoiceInfo1 value for this InvoiceInfo.
     * 
     * @param invoiceInfo1
     */
    public void setInvoiceInfo1(java.lang.String invoiceInfo1) {
        this.invoiceInfo1 = invoiceInfo1;
    }


    /**
     * Gets the invoiceInfo2 value for this InvoiceInfo.
     * 
     * @return invoiceInfo2
     */
    public java.lang.String getInvoiceInfo2() {
        return invoiceInfo2;
    }


    /**
     * Sets the invoiceInfo2 value for this InvoiceInfo.
     * 
     * @param invoiceInfo2
     */
    public void setInvoiceInfo2(java.lang.String invoiceInfo2) {
        this.invoiceInfo2 = invoiceInfo2;
    }


    /**
     * Gets the invoiceInfo3 value for this InvoiceInfo.
     * 
     * @return invoiceInfo3
     */
    public java.lang.String getInvoiceInfo3() {
        return invoiceInfo3;
    }


    /**
     * Sets the invoiceInfo3 value for this InvoiceInfo.
     * 
     * @param invoiceInfo3
     */
    public void setInvoiceInfo3(java.lang.String invoiceInfo3) {
        this.invoiceInfo3 = invoiceInfo3;
    }


    /**
     * Gets the invoiceNo value for this InvoiceInfo.
     * 
     * @return invoiceNo
     */
    public java.lang.String getInvoiceNo() {
        return invoiceNo;
    }


    /**
     * Sets the invoiceNo value for this InvoiceInfo.
     * 
     * @param invoiceNo
     */
    public void setInvoiceNo(java.lang.String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }


    /**
     * Gets the invoicePaymentDate value for this InvoiceInfo.
     * 
     * @return invoicePaymentDate
     */
    public java.util.Calendar getInvoicePaymentDate() {
        return invoicePaymentDate;
    }


    /**
     * Sets the invoicePaymentDate value for this InvoiceInfo.
     * 
     * @param invoicePaymentDate
     */
    public void setInvoicePaymentDate(java.util.Calendar invoicePaymentDate) {
        this.invoicePaymentDate = invoicePaymentDate;
    }


    /**
     * Gets the invoiceRefNo value for this InvoiceInfo.
     * 
     * @return invoiceRefNo
     */
    public java.lang.Long getInvoiceRefNo() {
        return invoiceRefNo;
    }


    /**
     * Sets the invoiceRefNo value for this InvoiceInfo.
     * 
     * @param invoiceRefNo
     */
    public void setInvoiceRefNo(java.lang.Long invoiceRefNo) {
        this.invoiceRefNo = invoiceRefNo;
    }


    /**
     * Gets the invoiceSeqNo value for this InvoiceInfo.
     * 
     * @return invoiceSeqNo
     */
    public java.lang.String getInvoiceSeqNo() {
        return invoiceSeqNo;
    }


    /**
     * Sets the invoiceSeqNo value for this InvoiceInfo.
     * 
     * @param invoiceSeqNo
     */
    public void setInvoiceSeqNo(java.lang.String invoiceSeqNo) {
        this.invoiceSeqNo = invoiceSeqNo;
    }


    /**
     * Gets the invoiceStatus value for this InvoiceInfo.
     * 
     * @return invoiceStatus
     */
    public com.turkcelltech.cpgw.ws.InvoiceStatusEnum getInvoiceStatus() {
        return invoiceStatus;
    }


    /**
     * Sets the invoiceStatus value for this InvoiceInfo.
     * 
     * @param invoiceStatus
     */
    public void setInvoiceStatus(com.turkcelltech.cpgw.ws.InvoiceStatusEnum invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }


    /**
     * Gets the newInstallmentAmount value for this InvoiceInfo.
     * 
     * @return newInstallmentAmount
     */
    public java.math.BigDecimal getNewInstallmentAmount() {
        return newInstallmentAmount;
    }


    /**
     * Sets the newInstallmentAmount value for this InvoiceInfo.
     * 
     * @param newInstallmentAmount
     */
    public void setNewInstallmentAmount(java.math.BigDecimal newInstallmentAmount) {
        this.newInstallmentAmount = newInstallmentAmount;
    }


    /**
     * Gets the paymentAmount value for this InvoiceInfo.
     * 
     * @return paymentAmount
     */
    public java.math.BigDecimal getPaymentAmount() {
        return paymentAmount;
    }


    /**
     * Sets the paymentAmount value for this InvoiceInfo.
     * 
     * @param paymentAmount
     */
    public void setPaymentAmount(java.math.BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }


    /**
     * Gets the paymentOperation value for this InvoiceInfo.
     * 
     * @return paymentOperation
     */
    public com.turkcelltech.cpgw.ws.PaymentOperationEnum getPaymentOperation() {
        return paymentOperation;
    }


    /**
     * Sets the paymentOperation value for this InvoiceInfo.
     * 
     * @param paymentOperation
     */
    public void setPaymentOperation(com.turkcelltech.cpgw.ws.PaymentOperationEnum paymentOperation) {
        this.paymentOperation = paymentOperation;
    }


    /**
     * Gets the totalAmount value for this InvoiceInfo.
     * 
     * @return totalAmount
     */
    public java.math.BigDecimal getTotalAmount() {
        return totalAmount;
    }


    /**
     * Sets the totalAmount value for this InvoiceInfo.
     * 
     * @param totalAmount
     */
    public void setTotalAmount(java.math.BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }


    /**
     * Gets the transactionDate value for this InvoiceInfo.
     * 
     * @return transactionDate
     */
    public java.util.Calendar getTransactionDate() {
        return transactionDate;
    }


    /**
     * Sets the transactionDate value for this InvoiceInfo.
     * 
     * @param transactionDate
     */
    public void setTransactionDate(java.util.Calendar transactionDate) {
        this.transactionDate = transactionDate;
    }


    /**
     * Gets the transactionId value for this InvoiceInfo.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this InvoiceInfo.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvoiceInfo)) return false;
        InvoiceInfo other = (InvoiceInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.bankReconDate==null && other.getBankReconDate()==null) || 
             (this.bankReconDate!=null &&
              this.bankReconDate.equals(other.getBankReconDate()))) &&
            ((this.bankRefNo==null && other.getBankRefNo()==null) || 
             (this.bankRefNo!=null &&
              this.bankRefNo.equals(other.getBankRefNo()))) &&
            ((this.channel==null && other.getChannel()==null) || 
             (this.channel!=null &&
              this.channel.equals(other.getChannel()))) &&
            ((this.channelCommission==null && other.getChannelCommission()==null) || 
             (this.channelCommission!=null &&
              this.channelCommission.equals(other.getChannelCommission()))) &&
            ((this.commissionAmount==null && other.getCommissionAmount()==null) || 
             (this.commissionAmount!=null &&
              this.commissionAmount.equals(other.getCommissionAmount()))) &&
            ((this.custPaymentMethod==null && other.getCustPaymentMethod()==null) || 
             (this.custPaymentMethod!=null &&
              this.custPaymentMethod.equals(other.getCustPaymentMethod()))) &&
            ((this.invoiceAmount==null && other.getInvoiceAmount()==null) || 
             (this.invoiceAmount!=null &&
              this.invoiceAmount.equals(other.getInvoiceAmount()))) &&
            ((this.invoiceDueDate==null && other.getInvoiceDueDate()==null) || 
             (this.invoiceDueDate!=null &&
              this.invoiceDueDate.equals(other.getInvoiceDueDate()))) &&
            ((this.invoiceInfo1==null && other.getInvoiceInfo1()==null) || 
             (this.invoiceInfo1!=null &&
              this.invoiceInfo1.equals(other.getInvoiceInfo1()))) &&
            ((this.invoiceInfo2==null && other.getInvoiceInfo2()==null) || 
             (this.invoiceInfo2!=null &&
              this.invoiceInfo2.equals(other.getInvoiceInfo2()))) &&
            ((this.invoiceInfo3==null && other.getInvoiceInfo3()==null) || 
             (this.invoiceInfo3!=null &&
              this.invoiceInfo3.equals(other.getInvoiceInfo3()))) &&
            ((this.invoiceNo==null && other.getInvoiceNo()==null) || 
             (this.invoiceNo!=null &&
              this.invoiceNo.equals(other.getInvoiceNo()))) &&
            ((this.invoicePaymentDate==null && other.getInvoicePaymentDate()==null) || 
             (this.invoicePaymentDate!=null &&
              this.invoicePaymentDate.equals(other.getInvoicePaymentDate()))) &&
            ((this.invoiceRefNo==null && other.getInvoiceRefNo()==null) || 
             (this.invoiceRefNo!=null &&
              this.invoiceRefNo.equals(other.getInvoiceRefNo()))) &&
            ((this.invoiceSeqNo==null && other.getInvoiceSeqNo()==null) || 
             (this.invoiceSeqNo!=null &&
              this.invoiceSeqNo.equals(other.getInvoiceSeqNo()))) &&
            ((this.invoiceStatus==null && other.getInvoiceStatus()==null) || 
             (this.invoiceStatus!=null &&
              this.invoiceStatus.equals(other.getInvoiceStatus()))) &&
            ((this.newInstallmentAmount==null && other.getNewInstallmentAmount()==null) || 
             (this.newInstallmentAmount!=null &&
              this.newInstallmentAmount.equals(other.getNewInstallmentAmount()))) &&
            ((this.paymentAmount==null && other.getPaymentAmount()==null) || 
             (this.paymentAmount!=null &&
              this.paymentAmount.equals(other.getPaymentAmount()))) &&
            ((this.paymentOperation==null && other.getPaymentOperation()==null) || 
             (this.paymentOperation!=null &&
              this.paymentOperation.equals(other.getPaymentOperation()))) &&
            ((this.totalAmount==null && other.getTotalAmount()==null) || 
             (this.totalAmount!=null &&
              this.totalAmount.equals(other.getTotalAmount()))) &&
            ((this.transactionDate==null && other.getTransactionDate()==null) || 
             (this.transactionDate!=null &&
              this.transactionDate.equals(other.getTransactionDate()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId())));
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
        if (getBankReconDate() != null) {
            _hashCode += getBankReconDate().hashCode();
        }
        if (getBankRefNo() != null) {
            _hashCode += getBankRefNo().hashCode();
        }
        if (getChannel() != null) {
            _hashCode += getChannel().hashCode();
        }
        if (getChannelCommission() != null) {
            _hashCode += getChannelCommission().hashCode();
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
        if (getInvoiceDueDate() != null) {
            _hashCode += getInvoiceDueDate().hashCode();
        }
        if (getInvoiceInfo1() != null) {
            _hashCode += getInvoiceInfo1().hashCode();
        }
        if (getInvoiceInfo2() != null) {
            _hashCode += getInvoiceInfo2().hashCode();
        }
        if (getInvoiceInfo3() != null) {
            _hashCode += getInvoiceInfo3().hashCode();
        }
        if (getInvoiceNo() != null) {
            _hashCode += getInvoiceNo().hashCode();
        }
        if (getInvoicePaymentDate() != null) {
            _hashCode += getInvoicePaymentDate().hashCode();
        }
        if (getInvoiceRefNo() != null) {
            _hashCode += getInvoiceRefNo().hashCode();
        }
        if (getInvoiceSeqNo() != null) {
            _hashCode += getInvoiceSeqNo().hashCode();
        }
        if (getInvoiceStatus() != null) {
            _hashCode += getInvoiceStatus().hashCode();
        }
        if (getNewInstallmentAmount() != null) {
            _hashCode += getNewInstallmentAmount().hashCode();
        }
        if (getPaymentAmount() != null) {
            _hashCode += getPaymentAmount().hashCode();
        }
        if (getPaymentOperation() != null) {
            _hashCode += getPaymentOperation().hashCode();
        }
        if (getTotalAmount() != null) {
            _hashCode += getTotalAmount().hashCode();
        }
        if (getTransactionDate() != null) {
            _hashCode += getTransactionDate().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InvoiceInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "invoiceInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankReconDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bankReconDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankRefNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bankRefNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "channel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelCommission");
        elemField.setXmlName(new javax.xml.namespace.QName("", "channelCommission"));
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
        elemField.setFieldName("invoiceDueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceDueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceInfo1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceInfo1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceInfo2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceInfo2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceInfo3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceInfo3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoicePaymentDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoicePaymentDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceRefNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceRefNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceSeqNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceSeqNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "invoiceStatusEnum"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newInstallmentAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "newInstallmentAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentOperation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentOperation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "paymentOperationEnum"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionId"));
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
