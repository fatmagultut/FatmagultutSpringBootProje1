/**
 * PaymentRefundHis.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class PaymentRefundHis  extends com.turkcelltech.cpgw.ws.CpgwModel  implements java.io.Serializable {
    private java.lang.String ad;

    private java.lang.String channelName;

    private java.lang.String confirmationDesc;

    private java.lang.String corpName;

    private java.util.Calendar createDate;

    private java.lang.String createUser;

    private java.util.Calendar dmlDate;

    private java.lang.String dmlType;

    private java.lang.String dmlUser;

    private java.lang.Long hisId;

    private java.lang.String iban;

    private java.lang.Long id;

    private java.math.BigDecimal invoiceAmount;

    private java.lang.Long invoiceId;

    private java.lang.String invoiceNo;

    private java.lang.String islemAciklama;

    private java.lang.String msisdn;

    private java.util.Calendar orderDate;

    private java.util.Calendar orderPlannedDate;

    private java.lang.Integer retryCount;

    private java.util.Calendar retryDate;

    private java.lang.String soyad;

    private java.lang.Integer status;

    private java.lang.String subscriberName;

    private java.lang.String subscriberNo;

    private java.lang.String TCKN;

    private java.lang.String token;

    private java.math.BigDecimal totalAmount;

    private java.lang.String transactionId;

    private java.lang.String transferStatus;

    private java.util.Calendar updateDate;

    private java.lang.String updateUser;

    private java.lang.String vendorName;

    public PaymentRefundHis() {
    }

    public PaymentRefundHis(
           java.lang.String ad,
           java.lang.String channelName,
           java.lang.String confirmationDesc,
           java.lang.String corpName,
           java.util.Calendar createDate,
           java.lang.String createUser,
           java.util.Calendar dmlDate,
           java.lang.String dmlType,
           java.lang.String dmlUser,
           java.lang.Long hisId,
           java.lang.String iban,
           java.lang.Long id,
           java.math.BigDecimal invoiceAmount,
           java.lang.Long invoiceId,
           java.lang.String invoiceNo,
           java.lang.String islemAciklama,
           java.lang.String msisdn,
           java.util.Calendar orderDate,
           java.util.Calendar orderPlannedDate,
           java.lang.Integer retryCount,
           java.util.Calendar retryDate,
           java.lang.String soyad,
           java.lang.Integer status,
           java.lang.String subscriberName,
           java.lang.String subscriberNo,
           java.lang.String TCKN,
           java.lang.String token,
           java.math.BigDecimal totalAmount,
           java.lang.String transactionId,
           java.lang.String transferStatus,
           java.util.Calendar updateDate,
           java.lang.String updateUser,
           java.lang.String vendorName) {
        this.ad = ad;
        this.channelName = channelName;
        this.confirmationDesc = confirmationDesc;
        this.corpName = corpName;
        this.createDate = createDate;
        this.createUser = createUser;
        this.dmlDate = dmlDate;
        this.dmlType = dmlType;
        this.dmlUser = dmlUser;
        this.hisId = hisId;
        this.iban = iban;
        this.id = id;
        this.invoiceAmount = invoiceAmount;
        this.invoiceId = invoiceId;
        this.invoiceNo = invoiceNo;
        this.islemAciklama = islemAciklama;
        this.msisdn = msisdn;
        this.orderDate = orderDate;
        this.orderPlannedDate = orderPlannedDate;
        this.retryCount = retryCount;
        this.retryDate = retryDate;
        this.soyad = soyad;
        this.status = status;
        this.subscriberName = subscriberName;
        this.subscriberNo = subscriberNo;
        this.TCKN = TCKN;
        this.token = token;
        this.totalAmount = totalAmount;
        this.transactionId = transactionId;
        this.transferStatus = transferStatus;
        this.updateDate = updateDate;
        this.updateUser = updateUser;
        this.vendorName = vendorName;
    }


    /**
     * Gets the ad value for this PaymentRefundHis.
     * 
     * @return ad
     */
    public java.lang.String getAd() {
        return ad;
    }


    /**
     * Sets the ad value for this PaymentRefundHis.
     * 
     * @param ad
     */
    public void setAd(java.lang.String ad) {
        this.ad = ad;
    }


    /**
     * Gets the channelName value for this PaymentRefundHis.
     * 
     * @return channelName
     */
    public java.lang.String getChannelName() {
        return channelName;
    }


    /**
     * Sets the channelName value for this PaymentRefundHis.
     * 
     * @param channelName
     */
    public void setChannelName(java.lang.String channelName) {
        this.channelName = channelName;
    }


    /**
     * Gets the confirmationDesc value for this PaymentRefundHis.
     * 
     * @return confirmationDesc
     */
    public java.lang.String getConfirmationDesc() {
        return confirmationDesc;
    }


    /**
     * Sets the confirmationDesc value for this PaymentRefundHis.
     * 
     * @param confirmationDesc
     */
    public void setConfirmationDesc(java.lang.String confirmationDesc) {
        this.confirmationDesc = confirmationDesc;
    }


    /**
     * Gets the corpName value for this PaymentRefundHis.
     * 
     * @return corpName
     */
    public java.lang.String getCorpName() {
        return corpName;
    }


    /**
     * Sets the corpName value for this PaymentRefundHis.
     * 
     * @param corpName
     */
    public void setCorpName(java.lang.String corpName) {
        this.corpName = corpName;
    }


    /**
     * Gets the createDate value for this PaymentRefundHis.
     * 
     * @return createDate
     */
    public java.util.Calendar getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this PaymentRefundHis.
     * 
     * @param createDate
     */
    public void setCreateDate(java.util.Calendar createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the createUser value for this PaymentRefundHis.
     * 
     * @return createUser
     */
    public java.lang.String getCreateUser() {
        return createUser;
    }


    /**
     * Sets the createUser value for this PaymentRefundHis.
     * 
     * @param createUser
     */
    public void setCreateUser(java.lang.String createUser) {
        this.createUser = createUser;
    }


    /**
     * Gets the dmlDate value for this PaymentRefundHis.
     * 
     * @return dmlDate
     */
    public java.util.Calendar getDmlDate() {
        return dmlDate;
    }


    /**
     * Sets the dmlDate value for this PaymentRefundHis.
     * 
     * @param dmlDate
     */
    public void setDmlDate(java.util.Calendar dmlDate) {
        this.dmlDate = dmlDate;
    }


    /**
     * Gets the dmlType value for this PaymentRefundHis.
     * 
     * @return dmlType
     */
    public java.lang.String getDmlType() {
        return dmlType;
    }


    /**
     * Sets the dmlType value for this PaymentRefundHis.
     * 
     * @param dmlType
     */
    public void setDmlType(java.lang.String dmlType) {
        this.dmlType = dmlType;
    }


    /**
     * Gets the dmlUser value for this PaymentRefundHis.
     * 
     * @return dmlUser
     */
    public java.lang.String getDmlUser() {
        return dmlUser;
    }


    /**
     * Sets the dmlUser value for this PaymentRefundHis.
     * 
     * @param dmlUser
     */
    public void setDmlUser(java.lang.String dmlUser) {
        this.dmlUser = dmlUser;
    }


    /**
     * Gets the hisId value for this PaymentRefundHis.
     * 
     * @return hisId
     */
    public java.lang.Long getHisId() {
        return hisId;
    }


    /**
     * Sets the hisId value for this PaymentRefundHis.
     * 
     * @param hisId
     */
    public void setHisId(java.lang.Long hisId) {
        this.hisId = hisId;
    }


    /**
     * Gets the iban value for this PaymentRefundHis.
     * 
     * @return iban
     */
    public java.lang.String getIban() {
        return iban;
    }


    /**
     * Sets the iban value for this PaymentRefundHis.
     * 
     * @param iban
     */
    public void setIban(java.lang.String iban) {
        this.iban = iban;
    }


    /**
     * Gets the id value for this PaymentRefundHis.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this PaymentRefundHis.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the invoiceAmount value for this PaymentRefundHis.
     * 
     * @return invoiceAmount
     */
    public java.math.BigDecimal getInvoiceAmount() {
        return invoiceAmount;
    }


    /**
     * Sets the invoiceAmount value for this PaymentRefundHis.
     * 
     * @param invoiceAmount
     */
    public void setInvoiceAmount(java.math.BigDecimal invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }


    /**
     * Gets the invoiceId value for this PaymentRefundHis.
     * 
     * @return invoiceId
     */
    public java.lang.Long getInvoiceId() {
        return invoiceId;
    }


    /**
     * Sets the invoiceId value for this PaymentRefundHis.
     * 
     * @param invoiceId
     */
    public void setInvoiceId(java.lang.Long invoiceId) {
        this.invoiceId = invoiceId;
    }


    /**
     * Gets the invoiceNo value for this PaymentRefundHis.
     * 
     * @return invoiceNo
     */
    public java.lang.String getInvoiceNo() {
        return invoiceNo;
    }


    /**
     * Sets the invoiceNo value for this PaymentRefundHis.
     * 
     * @param invoiceNo
     */
    public void setInvoiceNo(java.lang.String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }


    /**
     * Gets the islemAciklama value for this PaymentRefundHis.
     * 
     * @return islemAciklama
     */
    public java.lang.String getIslemAciklama() {
        return islemAciklama;
    }


    /**
     * Sets the islemAciklama value for this PaymentRefundHis.
     * 
     * @param islemAciklama
     */
    public void setIslemAciklama(java.lang.String islemAciklama) {
        this.islemAciklama = islemAciklama;
    }


    /**
     * Gets the msisdn value for this PaymentRefundHis.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this PaymentRefundHis.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the orderDate value for this PaymentRefundHis.
     * 
     * @return orderDate
     */
    public java.util.Calendar getOrderDate() {
        return orderDate;
    }


    /**
     * Sets the orderDate value for this PaymentRefundHis.
     * 
     * @param orderDate
     */
    public void setOrderDate(java.util.Calendar orderDate) {
        this.orderDate = orderDate;
    }


    /**
     * Gets the orderPlannedDate value for this PaymentRefundHis.
     * 
     * @return orderPlannedDate
     */
    public java.util.Calendar getOrderPlannedDate() {
        return orderPlannedDate;
    }


    /**
     * Sets the orderPlannedDate value for this PaymentRefundHis.
     * 
     * @param orderPlannedDate
     */
    public void setOrderPlannedDate(java.util.Calendar orderPlannedDate) {
        this.orderPlannedDate = orderPlannedDate;
    }


    /**
     * Gets the retryCount value for this PaymentRefundHis.
     * 
     * @return retryCount
     */
    public java.lang.Integer getRetryCount() {
        return retryCount;
    }


    /**
     * Sets the retryCount value for this PaymentRefundHis.
     * 
     * @param retryCount
     */
    public void setRetryCount(java.lang.Integer retryCount) {
        this.retryCount = retryCount;
    }


    /**
     * Gets the retryDate value for this PaymentRefundHis.
     * 
     * @return retryDate
     */
    public java.util.Calendar getRetryDate() {
        return retryDate;
    }


    /**
     * Sets the retryDate value for this PaymentRefundHis.
     * 
     * @param retryDate
     */
    public void setRetryDate(java.util.Calendar retryDate) {
        this.retryDate = retryDate;
    }


    /**
     * Gets the soyad value for this PaymentRefundHis.
     * 
     * @return soyad
     */
    public java.lang.String getSoyad() {
        return soyad;
    }


    /**
     * Sets the soyad value for this PaymentRefundHis.
     * 
     * @param soyad
     */
    public void setSoyad(java.lang.String soyad) {
        this.soyad = soyad;
    }


    /**
     * Gets the status value for this PaymentRefundHis.
     * 
     * @return status
     */
    public java.lang.Integer getStatus() {
        return status;
    }


    /**
     * Sets the status value for this PaymentRefundHis.
     * 
     * @param status
     */
    public void setStatus(java.lang.Integer status) {
        this.status = status;
    }


    /**
     * Gets the subscriberName value for this PaymentRefundHis.
     * 
     * @return subscriberName
     */
    public java.lang.String getSubscriberName() {
        return subscriberName;
    }


    /**
     * Sets the subscriberName value for this PaymentRefundHis.
     * 
     * @param subscriberName
     */
    public void setSubscriberName(java.lang.String subscriberName) {
        this.subscriberName = subscriberName;
    }


    /**
     * Gets the subscriberNo value for this PaymentRefundHis.
     * 
     * @return subscriberNo
     */
    public java.lang.String getSubscriberNo() {
        return subscriberNo;
    }


    /**
     * Sets the subscriberNo value for this PaymentRefundHis.
     * 
     * @param subscriberNo
     */
    public void setSubscriberNo(java.lang.String subscriberNo) {
        this.subscriberNo = subscriberNo;
    }


    /**
     * Gets the TCKN value for this PaymentRefundHis.
     * 
     * @return TCKN
     */
    public java.lang.String getTCKN() {
        return TCKN;
    }


    /**
     * Sets the TCKN value for this PaymentRefundHis.
     * 
     * @param TCKN
     */
    public void setTCKN(java.lang.String TCKN) {
        this.TCKN = TCKN;
    }


    /**
     * Gets the token value for this PaymentRefundHis.
     * 
     * @return token
     */
    public java.lang.String getToken() {
        return token;
    }


    /**
     * Sets the token value for this PaymentRefundHis.
     * 
     * @param token
     */
    public void setToken(java.lang.String token) {
        this.token = token;
    }


    /**
     * Gets the totalAmount value for this PaymentRefundHis.
     * 
     * @return totalAmount
     */
    public java.math.BigDecimal getTotalAmount() {
        return totalAmount;
    }


    /**
     * Sets the totalAmount value for this PaymentRefundHis.
     * 
     * @param totalAmount
     */
    public void setTotalAmount(java.math.BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }


    /**
     * Gets the transactionId value for this PaymentRefundHis.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this PaymentRefundHis.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the transferStatus value for this PaymentRefundHis.
     * 
     * @return transferStatus
     */
    public java.lang.String getTransferStatus() {
        return transferStatus;
    }


    /**
     * Sets the transferStatus value for this PaymentRefundHis.
     * 
     * @param transferStatus
     */
    public void setTransferStatus(java.lang.String transferStatus) {
        this.transferStatus = transferStatus;
    }


    /**
     * Gets the updateDate value for this PaymentRefundHis.
     * 
     * @return updateDate
     */
    public java.util.Calendar getUpdateDate() {
        return updateDate;
    }


    /**
     * Sets the updateDate value for this PaymentRefundHis.
     * 
     * @param updateDate
     */
    public void setUpdateDate(java.util.Calendar updateDate) {
        this.updateDate = updateDate;
    }


    /**
     * Gets the updateUser value for this PaymentRefundHis.
     * 
     * @return updateUser
     */
    public java.lang.String getUpdateUser() {
        return updateUser;
    }


    /**
     * Sets the updateUser value for this PaymentRefundHis.
     * 
     * @param updateUser
     */
    public void setUpdateUser(java.lang.String updateUser) {
        this.updateUser = updateUser;
    }


    /**
     * Gets the vendorName value for this PaymentRefundHis.
     * 
     * @return vendorName
     */
    public java.lang.String getVendorName() {
        return vendorName;
    }


    /**
     * Sets the vendorName value for this PaymentRefundHis.
     * 
     * @param vendorName
     */
    public void setVendorName(java.lang.String vendorName) {
        this.vendorName = vendorName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentRefundHis)) return false;
        PaymentRefundHis other = (PaymentRefundHis) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ad==null && other.getAd()==null) || 
             (this.ad!=null &&
              this.ad.equals(other.getAd()))) &&
            ((this.channelName==null && other.getChannelName()==null) || 
             (this.channelName!=null &&
              this.channelName.equals(other.getChannelName()))) &&
            ((this.confirmationDesc==null && other.getConfirmationDesc()==null) || 
             (this.confirmationDesc!=null &&
              this.confirmationDesc.equals(other.getConfirmationDesc()))) &&
            ((this.corpName==null && other.getCorpName()==null) || 
             (this.corpName!=null &&
              this.corpName.equals(other.getCorpName()))) &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.createUser==null && other.getCreateUser()==null) || 
             (this.createUser!=null &&
              this.createUser.equals(other.getCreateUser()))) &&
            ((this.dmlDate==null && other.getDmlDate()==null) || 
             (this.dmlDate!=null &&
              this.dmlDate.equals(other.getDmlDate()))) &&
            ((this.dmlType==null && other.getDmlType()==null) || 
             (this.dmlType!=null &&
              this.dmlType.equals(other.getDmlType()))) &&
            ((this.dmlUser==null && other.getDmlUser()==null) || 
             (this.dmlUser!=null &&
              this.dmlUser.equals(other.getDmlUser()))) &&
            ((this.hisId==null && other.getHisId()==null) || 
             (this.hisId!=null &&
              this.hisId.equals(other.getHisId()))) &&
            ((this.iban==null && other.getIban()==null) || 
             (this.iban!=null &&
              this.iban.equals(other.getIban()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.invoiceAmount==null && other.getInvoiceAmount()==null) || 
             (this.invoiceAmount!=null &&
              this.invoiceAmount.equals(other.getInvoiceAmount()))) &&
            ((this.invoiceId==null && other.getInvoiceId()==null) || 
             (this.invoiceId!=null &&
              this.invoiceId.equals(other.getInvoiceId()))) &&
            ((this.invoiceNo==null && other.getInvoiceNo()==null) || 
             (this.invoiceNo!=null &&
              this.invoiceNo.equals(other.getInvoiceNo()))) &&
            ((this.islemAciklama==null && other.getIslemAciklama()==null) || 
             (this.islemAciklama!=null &&
              this.islemAciklama.equals(other.getIslemAciklama()))) &&
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.orderDate==null && other.getOrderDate()==null) || 
             (this.orderDate!=null &&
              this.orderDate.equals(other.getOrderDate()))) &&
            ((this.orderPlannedDate==null && other.getOrderPlannedDate()==null) || 
             (this.orderPlannedDate!=null &&
              this.orderPlannedDate.equals(other.getOrderPlannedDate()))) &&
            ((this.retryCount==null && other.getRetryCount()==null) || 
             (this.retryCount!=null &&
              this.retryCount.equals(other.getRetryCount()))) &&
            ((this.retryDate==null && other.getRetryDate()==null) || 
             (this.retryDate!=null &&
              this.retryDate.equals(other.getRetryDate()))) &&
            ((this.soyad==null && other.getSoyad()==null) || 
             (this.soyad!=null &&
              this.soyad.equals(other.getSoyad()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.subscriberName==null && other.getSubscriberName()==null) || 
             (this.subscriberName!=null &&
              this.subscriberName.equals(other.getSubscriberName()))) &&
            ((this.subscriberNo==null && other.getSubscriberNo()==null) || 
             (this.subscriberNo!=null &&
              this.subscriberNo.equals(other.getSubscriberNo()))) &&
            ((this.TCKN==null && other.getTCKN()==null) || 
             (this.TCKN!=null &&
              this.TCKN.equals(other.getTCKN()))) &&
            ((this.token==null && other.getToken()==null) || 
             (this.token!=null &&
              this.token.equals(other.getToken()))) &&
            ((this.totalAmount==null && other.getTotalAmount()==null) || 
             (this.totalAmount!=null &&
              this.totalAmount.equals(other.getTotalAmount()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.transferStatus==null && other.getTransferStatus()==null) || 
             (this.transferStatus!=null &&
              this.transferStatus.equals(other.getTransferStatus()))) &&
            ((this.updateDate==null && other.getUpdateDate()==null) || 
             (this.updateDate!=null &&
              this.updateDate.equals(other.getUpdateDate()))) &&
            ((this.updateUser==null && other.getUpdateUser()==null) || 
             (this.updateUser!=null &&
              this.updateUser.equals(other.getUpdateUser()))) &&
            ((this.vendorName==null && other.getVendorName()==null) || 
             (this.vendorName!=null &&
              this.vendorName.equals(other.getVendorName())));
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
        if (getAd() != null) {
            _hashCode += getAd().hashCode();
        }
        if (getChannelName() != null) {
            _hashCode += getChannelName().hashCode();
        }
        if (getConfirmationDesc() != null) {
            _hashCode += getConfirmationDesc().hashCode();
        }
        if (getCorpName() != null) {
            _hashCode += getCorpName().hashCode();
        }
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getCreateUser() != null) {
            _hashCode += getCreateUser().hashCode();
        }
        if (getDmlDate() != null) {
            _hashCode += getDmlDate().hashCode();
        }
        if (getDmlType() != null) {
            _hashCode += getDmlType().hashCode();
        }
        if (getDmlUser() != null) {
            _hashCode += getDmlUser().hashCode();
        }
        if (getHisId() != null) {
            _hashCode += getHisId().hashCode();
        }
        if (getIban() != null) {
            _hashCode += getIban().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getInvoiceAmount() != null) {
            _hashCode += getInvoiceAmount().hashCode();
        }
        if (getInvoiceId() != null) {
            _hashCode += getInvoiceId().hashCode();
        }
        if (getInvoiceNo() != null) {
            _hashCode += getInvoiceNo().hashCode();
        }
        if (getIslemAciklama() != null) {
            _hashCode += getIslemAciklama().hashCode();
        }
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getOrderDate() != null) {
            _hashCode += getOrderDate().hashCode();
        }
        if (getOrderPlannedDate() != null) {
            _hashCode += getOrderPlannedDate().hashCode();
        }
        if (getRetryCount() != null) {
            _hashCode += getRetryCount().hashCode();
        }
        if (getRetryDate() != null) {
            _hashCode += getRetryDate().hashCode();
        }
        if (getSoyad() != null) {
            _hashCode += getSoyad().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSubscriberName() != null) {
            _hashCode += getSubscriberName().hashCode();
        }
        if (getSubscriberNo() != null) {
            _hashCode += getSubscriberNo().hashCode();
        }
        if (getTCKN() != null) {
            _hashCode += getTCKN().hashCode();
        }
        if (getToken() != null) {
            _hashCode += getToken().hashCode();
        }
        if (getTotalAmount() != null) {
            _hashCode += getTotalAmount().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getTransferStatus() != null) {
            _hashCode += getTransferStatus().hashCode();
        }
        if (getUpdateDate() != null) {
            _hashCode += getUpdateDate().hashCode();
        }
        if (getUpdateUser() != null) {
            _hashCode += getUpdateUser().hashCode();
        }
        if (getVendorName() != null) {
            _hashCode += getVendorName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentRefundHis.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "paymentRefundHis"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "channelName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confirmationDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "confirmationDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmlDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dmlDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmlType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dmlType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmlUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dmlUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hisId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hisId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iban");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iban"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("invoiceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("islemAciklama");
        elemField.setXmlName(new javax.xml.namespace.QName("", "islemAciklama"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderPlannedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderPlannedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retryCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retryCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soyad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "soyad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("TCKN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TCKN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("token");
        elemField.setXmlName(new javax.xml.namespace.QName("", "token"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "updateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "updateUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vendorName"));
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
