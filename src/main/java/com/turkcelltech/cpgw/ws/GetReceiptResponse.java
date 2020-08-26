/**
 * GetReceiptResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class GetReceiptResponse  extends com.turkcelltech.cpgw.ws.ResponseType  implements java.io.Serializable {
    private java.math.BigDecimal bankCommission;

    private java.math.BigDecimal baseCommission;

    private java.lang.String bddkTemsilciKodu;

    private java.lang.String billAddress;

    private java.lang.String bsmv;

    private java.lang.String bsmvMat;

    private java.math.BigDecimal commissionAmount;

    private java.lang.Long corpCode;

    private java.lang.String corpName;

    private java.util.Calendar generationDate;

    private java.util.Calendar invoiceDueDate;

    private java.lang.String invoiceNo;

    private java.math.BigDecimal paymentAmount;

    private java.lang.String paymentType;

    private java.lang.String subscriberName;

    private java.lang.String subscriberNo;

    private java.lang.String taxInfo;

    private java.lang.String tcsnMersisNo;

    private java.math.BigDecimal totalPaymentAmount;

    private java.util.Calendar transactionDate;

    private java.lang.String transactionId;

    private java.lang.String transactionSource;

    private java.lang.String transactionType;

    public GetReceiptResponse() {
    }

    public GetReceiptResponse(
           com.turkcelltech.cpgw.ws.ResponseHeader responseHeader,
           java.math.BigDecimal bankCommission,
           java.math.BigDecimal baseCommission,
           java.lang.String bddkTemsilciKodu,
           java.lang.String billAddress,
           java.lang.String bsmv,
           java.lang.String bsmvMat,
           java.math.BigDecimal commissionAmount,
           java.lang.Long corpCode,
           java.lang.String corpName,
           java.util.Calendar generationDate,
           java.util.Calendar invoiceDueDate,
           java.lang.String invoiceNo,
           java.math.BigDecimal paymentAmount,
           java.lang.String paymentType,
           java.lang.String subscriberName,
           java.lang.String subscriberNo,
           java.lang.String taxInfo,
           java.lang.String tcsnMersisNo,
           java.math.BigDecimal totalPaymentAmount,
           java.util.Calendar transactionDate,
           java.lang.String transactionId,
           java.lang.String transactionSource,
           java.lang.String transactionType) {
        super(
            responseHeader);
        this.bankCommission = bankCommission;
        this.baseCommission = baseCommission;
        this.bddkTemsilciKodu = bddkTemsilciKodu;
        this.billAddress = billAddress;
        this.bsmv = bsmv;
        this.bsmvMat = bsmvMat;
        this.commissionAmount = commissionAmount;
        this.corpCode = corpCode;
        this.corpName = corpName;
        this.generationDate = generationDate;
        this.invoiceDueDate = invoiceDueDate;
        this.invoiceNo = invoiceNo;
        this.paymentAmount = paymentAmount;
        this.paymentType = paymentType;
        this.subscriberName = subscriberName;
        this.subscriberNo = subscriberNo;
        this.taxInfo = taxInfo;
        this.tcsnMersisNo = tcsnMersisNo;
        this.totalPaymentAmount = totalPaymentAmount;
        this.transactionDate = transactionDate;
        this.transactionId = transactionId;
        this.transactionSource = transactionSource;
        this.transactionType = transactionType;
    }


    /**
     * Gets the bankCommission value for this GetReceiptResponse.
     * 
     * @return bankCommission
     */
    public java.math.BigDecimal getBankCommission() {
        return bankCommission;
    }


    /**
     * Sets the bankCommission value for this GetReceiptResponse.
     * 
     * @param bankCommission
     */
    public void setBankCommission(java.math.BigDecimal bankCommission) {
        this.bankCommission = bankCommission;
    }


    /**
     * Gets the baseCommission value for this GetReceiptResponse.
     * 
     * @return baseCommission
     */
    public java.math.BigDecimal getBaseCommission() {
        return baseCommission;
    }


    /**
     * Sets the baseCommission value for this GetReceiptResponse.
     * 
     * @param baseCommission
     */
    public void setBaseCommission(java.math.BigDecimal baseCommission) {
        this.baseCommission = baseCommission;
    }


    /**
     * Gets the bddkTemsilciKodu value for this GetReceiptResponse.
     * 
     * @return bddkTemsilciKodu
     */
    public java.lang.String getBddkTemsilciKodu() {
        return bddkTemsilciKodu;
    }


    /**
     * Sets the bddkTemsilciKodu value for this GetReceiptResponse.
     * 
     * @param bddkTemsilciKodu
     */
    public void setBddkTemsilciKodu(java.lang.String bddkTemsilciKodu) {
        this.bddkTemsilciKodu = bddkTemsilciKodu;
    }


    /**
     * Gets the billAddress value for this GetReceiptResponse.
     * 
     * @return billAddress
     */
    public java.lang.String getBillAddress() {
        return billAddress;
    }


    /**
     * Sets the billAddress value for this GetReceiptResponse.
     * 
     * @param billAddress
     */
    public void setBillAddress(java.lang.String billAddress) {
        this.billAddress = billAddress;
    }


    /**
     * Gets the bsmv value for this GetReceiptResponse.
     * 
     * @return bsmv
     */
    public java.lang.String getBsmv() {
        return bsmv;
    }


    /**
     * Sets the bsmv value for this GetReceiptResponse.
     * 
     * @param bsmv
     */
    public void setBsmv(java.lang.String bsmv) {
        this.bsmv = bsmv;
    }


    /**
     * Gets the bsmvMat value for this GetReceiptResponse.
     * 
     * @return bsmvMat
     */
    public java.lang.String getBsmvMat() {
        return bsmvMat;
    }


    /**
     * Sets the bsmvMat value for this GetReceiptResponse.
     * 
     * @param bsmvMat
     */
    public void setBsmvMat(java.lang.String bsmvMat) {
        this.bsmvMat = bsmvMat;
    }


    /**
     * Gets the commissionAmount value for this GetReceiptResponse.
     * 
     * @return commissionAmount
     */
    public java.math.BigDecimal getCommissionAmount() {
        return commissionAmount;
    }


    /**
     * Sets the commissionAmount value for this GetReceiptResponse.
     * 
     * @param commissionAmount
     */
    public void setCommissionAmount(java.math.BigDecimal commissionAmount) {
        this.commissionAmount = commissionAmount;
    }


    /**
     * Gets the corpCode value for this GetReceiptResponse.
     * 
     * @return corpCode
     */
    public java.lang.Long getCorpCode() {
        return corpCode;
    }


    /**
     * Sets the corpCode value for this GetReceiptResponse.
     * 
     * @param corpCode
     */
    public void setCorpCode(java.lang.Long corpCode) {
        this.corpCode = corpCode;
    }


    /**
     * Gets the corpName value for this GetReceiptResponse.
     * 
     * @return corpName
     */
    public java.lang.String getCorpName() {
        return corpName;
    }


    /**
     * Sets the corpName value for this GetReceiptResponse.
     * 
     * @param corpName
     */
    public void setCorpName(java.lang.String corpName) {
        this.corpName = corpName;
    }


    /**
     * Gets the generationDate value for this GetReceiptResponse.
     * 
     * @return generationDate
     */
    public java.util.Calendar getGenerationDate() {
        return generationDate;
    }


    /**
     * Sets the generationDate value for this GetReceiptResponse.
     * 
     * @param generationDate
     */
    public void setGenerationDate(java.util.Calendar generationDate) {
        this.generationDate = generationDate;
    }


    /**
     * Gets the invoiceDueDate value for this GetReceiptResponse.
     * 
     * @return invoiceDueDate
     */
    public java.util.Calendar getInvoiceDueDate() {
        return invoiceDueDate;
    }


    /**
     * Sets the invoiceDueDate value for this GetReceiptResponse.
     * 
     * @param invoiceDueDate
     */
    public void setInvoiceDueDate(java.util.Calendar invoiceDueDate) {
        this.invoiceDueDate = invoiceDueDate;
    }


    /**
     * Gets the invoiceNo value for this GetReceiptResponse.
     * 
     * @return invoiceNo
     */
    public java.lang.String getInvoiceNo() {
        return invoiceNo;
    }


    /**
     * Sets the invoiceNo value for this GetReceiptResponse.
     * 
     * @param invoiceNo
     */
    public void setInvoiceNo(java.lang.String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }


    /**
     * Gets the paymentAmount value for this GetReceiptResponse.
     * 
     * @return paymentAmount
     */
    public java.math.BigDecimal getPaymentAmount() {
        return paymentAmount;
    }


    /**
     * Sets the paymentAmount value for this GetReceiptResponse.
     * 
     * @param paymentAmount
     */
    public void setPaymentAmount(java.math.BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }


    /**
     * Gets the paymentType value for this GetReceiptResponse.
     * 
     * @return paymentType
     */
    public java.lang.String getPaymentType() {
        return paymentType;
    }


    /**
     * Sets the paymentType value for this GetReceiptResponse.
     * 
     * @param paymentType
     */
    public void setPaymentType(java.lang.String paymentType) {
        this.paymentType = paymentType;
    }


    /**
     * Gets the subscriberName value for this GetReceiptResponse.
     * 
     * @return subscriberName
     */
    public java.lang.String getSubscriberName() {
        return subscriberName;
    }


    /**
     * Sets the subscriberName value for this GetReceiptResponse.
     * 
     * @param subscriberName
     */
    public void setSubscriberName(java.lang.String subscriberName) {
        this.subscriberName = subscriberName;
    }


    /**
     * Gets the subscriberNo value for this GetReceiptResponse.
     * 
     * @return subscriberNo
     */
    public java.lang.String getSubscriberNo() {
        return subscriberNo;
    }


    /**
     * Sets the subscriberNo value for this GetReceiptResponse.
     * 
     * @param subscriberNo
     */
    public void setSubscriberNo(java.lang.String subscriberNo) {
        this.subscriberNo = subscriberNo;
    }


    /**
     * Gets the taxInfo value for this GetReceiptResponse.
     * 
     * @return taxInfo
     */
    public java.lang.String getTaxInfo() {
        return taxInfo;
    }


    /**
     * Sets the taxInfo value for this GetReceiptResponse.
     * 
     * @param taxInfo
     */
    public void setTaxInfo(java.lang.String taxInfo) {
        this.taxInfo = taxInfo;
    }


    /**
     * Gets the tcsnMersisNo value for this GetReceiptResponse.
     * 
     * @return tcsnMersisNo
     */
    public java.lang.String getTcsnMersisNo() {
        return tcsnMersisNo;
    }


    /**
     * Sets the tcsnMersisNo value for this GetReceiptResponse.
     * 
     * @param tcsnMersisNo
     */
    public void setTcsnMersisNo(java.lang.String tcsnMersisNo) {
        this.tcsnMersisNo = tcsnMersisNo;
    }


    /**
     * Gets the totalPaymentAmount value for this GetReceiptResponse.
     * 
     * @return totalPaymentAmount
     */
    public java.math.BigDecimal getTotalPaymentAmount() {
        return totalPaymentAmount;
    }


    /**
     * Sets the totalPaymentAmount value for this GetReceiptResponse.
     * 
     * @param totalPaymentAmount
     */
    public void setTotalPaymentAmount(java.math.BigDecimal totalPaymentAmount) {
        this.totalPaymentAmount = totalPaymentAmount;
    }


    /**
     * Gets the transactionDate value for this GetReceiptResponse.
     * 
     * @return transactionDate
     */
    public java.util.Calendar getTransactionDate() {
        return transactionDate;
    }


    /**
     * Sets the transactionDate value for this GetReceiptResponse.
     * 
     * @param transactionDate
     */
    public void setTransactionDate(java.util.Calendar transactionDate) {
        this.transactionDate = transactionDate;
    }


    /**
     * Gets the transactionId value for this GetReceiptResponse.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this GetReceiptResponse.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the transactionSource value for this GetReceiptResponse.
     * 
     * @return transactionSource
     */
    public java.lang.String getTransactionSource() {
        return transactionSource;
    }


    /**
     * Sets the transactionSource value for this GetReceiptResponse.
     * 
     * @param transactionSource
     */
    public void setTransactionSource(java.lang.String transactionSource) {
        this.transactionSource = transactionSource;
    }


    /**
     * Gets the transactionType value for this GetReceiptResponse.
     * 
     * @return transactionType
     */
    public java.lang.String getTransactionType() {
        return transactionType;
    }


    /**
     * Sets the transactionType value for this GetReceiptResponse.
     * 
     * @param transactionType
     */
    public void setTransactionType(java.lang.String transactionType) {
        this.transactionType = transactionType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetReceiptResponse)) return false;
        GetReceiptResponse other = (GetReceiptResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.bankCommission==null && other.getBankCommission()==null) || 
             (this.bankCommission!=null &&
              this.bankCommission.equals(other.getBankCommission()))) &&
            ((this.baseCommission==null && other.getBaseCommission()==null) || 
             (this.baseCommission!=null &&
              this.baseCommission.equals(other.getBaseCommission()))) &&
            ((this.bddkTemsilciKodu==null && other.getBddkTemsilciKodu()==null) || 
             (this.bddkTemsilciKodu!=null &&
              this.bddkTemsilciKodu.equals(other.getBddkTemsilciKodu()))) &&
            ((this.billAddress==null && other.getBillAddress()==null) || 
             (this.billAddress!=null &&
              this.billAddress.equals(other.getBillAddress()))) &&
            ((this.bsmv==null && other.getBsmv()==null) || 
             (this.bsmv!=null &&
              this.bsmv.equals(other.getBsmv()))) &&
            ((this.bsmvMat==null && other.getBsmvMat()==null) || 
             (this.bsmvMat!=null &&
              this.bsmvMat.equals(other.getBsmvMat()))) &&
            ((this.commissionAmount==null && other.getCommissionAmount()==null) || 
             (this.commissionAmount!=null &&
              this.commissionAmount.equals(other.getCommissionAmount()))) &&
            ((this.corpCode==null && other.getCorpCode()==null) || 
             (this.corpCode!=null &&
              this.corpCode.equals(other.getCorpCode()))) &&
            ((this.corpName==null && other.getCorpName()==null) || 
             (this.corpName!=null &&
              this.corpName.equals(other.getCorpName()))) &&
            ((this.generationDate==null && other.getGenerationDate()==null) || 
             (this.generationDate!=null &&
              this.generationDate.equals(other.getGenerationDate()))) &&
            ((this.invoiceDueDate==null && other.getInvoiceDueDate()==null) || 
             (this.invoiceDueDate!=null &&
              this.invoiceDueDate.equals(other.getInvoiceDueDate()))) &&
            ((this.invoiceNo==null && other.getInvoiceNo()==null) || 
             (this.invoiceNo!=null &&
              this.invoiceNo.equals(other.getInvoiceNo()))) &&
            ((this.paymentAmount==null && other.getPaymentAmount()==null) || 
             (this.paymentAmount!=null &&
              this.paymentAmount.equals(other.getPaymentAmount()))) &&
            ((this.paymentType==null && other.getPaymentType()==null) || 
             (this.paymentType!=null &&
              this.paymentType.equals(other.getPaymentType()))) &&
            ((this.subscriberName==null && other.getSubscriberName()==null) || 
             (this.subscriberName!=null &&
              this.subscriberName.equals(other.getSubscriberName()))) &&
            ((this.subscriberNo==null && other.getSubscriberNo()==null) || 
             (this.subscriberNo!=null &&
              this.subscriberNo.equals(other.getSubscriberNo()))) &&
            ((this.taxInfo==null && other.getTaxInfo()==null) || 
             (this.taxInfo!=null &&
              this.taxInfo.equals(other.getTaxInfo()))) &&
            ((this.tcsnMersisNo==null && other.getTcsnMersisNo()==null) || 
             (this.tcsnMersisNo!=null &&
              this.tcsnMersisNo.equals(other.getTcsnMersisNo()))) &&
            ((this.totalPaymentAmount==null && other.getTotalPaymentAmount()==null) || 
             (this.totalPaymentAmount!=null &&
              this.totalPaymentAmount.equals(other.getTotalPaymentAmount()))) &&
            ((this.transactionDate==null && other.getTransactionDate()==null) || 
             (this.transactionDate!=null &&
              this.transactionDate.equals(other.getTransactionDate()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.transactionSource==null && other.getTransactionSource()==null) || 
             (this.transactionSource!=null &&
              this.transactionSource.equals(other.getTransactionSource()))) &&
            ((this.transactionType==null && other.getTransactionType()==null) || 
             (this.transactionType!=null &&
              this.transactionType.equals(other.getTransactionType())));
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
        if (getBankCommission() != null) {
            _hashCode += getBankCommission().hashCode();
        }
        if (getBaseCommission() != null) {
            _hashCode += getBaseCommission().hashCode();
        }
        if (getBddkTemsilciKodu() != null) {
            _hashCode += getBddkTemsilciKodu().hashCode();
        }
        if (getBillAddress() != null) {
            _hashCode += getBillAddress().hashCode();
        }
        if (getBsmv() != null) {
            _hashCode += getBsmv().hashCode();
        }
        if (getBsmvMat() != null) {
            _hashCode += getBsmvMat().hashCode();
        }
        if (getCommissionAmount() != null) {
            _hashCode += getCommissionAmount().hashCode();
        }
        if (getCorpCode() != null) {
            _hashCode += getCorpCode().hashCode();
        }
        if (getCorpName() != null) {
            _hashCode += getCorpName().hashCode();
        }
        if (getGenerationDate() != null) {
            _hashCode += getGenerationDate().hashCode();
        }
        if (getInvoiceDueDate() != null) {
            _hashCode += getInvoiceDueDate().hashCode();
        }
        if (getInvoiceNo() != null) {
            _hashCode += getInvoiceNo().hashCode();
        }
        if (getPaymentAmount() != null) {
            _hashCode += getPaymentAmount().hashCode();
        }
        if (getPaymentType() != null) {
            _hashCode += getPaymentType().hashCode();
        }
        if (getSubscriberName() != null) {
            _hashCode += getSubscriberName().hashCode();
        }
        if (getSubscriberNo() != null) {
            _hashCode += getSubscriberNo().hashCode();
        }
        if (getTaxInfo() != null) {
            _hashCode += getTaxInfo().hashCode();
        }
        if (getTcsnMersisNo() != null) {
            _hashCode += getTcsnMersisNo().hashCode();
        }
        if (getTotalPaymentAmount() != null) {
            _hashCode += getTotalPaymentAmount().hashCode();
        }
        if (getTransactionDate() != null) {
            _hashCode += getTransactionDate().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getTransactionSource() != null) {
            _hashCode += getTransactionSource().hashCode();
        }
        if (getTransactionType() != null) {
            _hashCode += getTransactionType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetReceiptResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getReceiptResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankCommission");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bankCommission"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseCommission");
        elemField.setXmlName(new javax.xml.namespace.QName("", "baseCommission"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bddkTemsilciKodu");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bddkTemsilciKodu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bsmv");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bsmv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bsmvMat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bsmvMat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("corpCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "corpCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corpName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "corpName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("generationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "generationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("invoiceNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("paymentType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subscriberName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subscriberNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tcsnMersisNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tcsnMersisNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalPaymentAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalPaymentAmount"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionSource");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionType"));
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
