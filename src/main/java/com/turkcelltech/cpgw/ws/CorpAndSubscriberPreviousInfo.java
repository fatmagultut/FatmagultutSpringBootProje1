/**
 * CorpAndSubscriberPreviousInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class CorpAndSubscriberPreviousInfo  implements java.io.Serializable {
    private java.lang.Long corpCode;

    private java.lang.String corpName;

    private java.lang.String currency;

    private java.lang.String faturaNo;

    private java.lang.String faturaTutari;

    private com.turkcelltech.cpgw.ws.InvoiceTypeEnum invoiceType;

    private java.lang.String kanalkomisyonTutari;

    private java.lang.String komisyonTutari;

    private java.lang.String msisdn;

    private java.lang.String paymentId;

    private java.lang.String paymentOperation;

    private java.lang.String sonOdemeTarihi;

    private com.turkcelltech.cpgw.ws.Pair subsDesc1;

    private com.turkcelltech.cpgw.ws.Pair subsDesc2;

    private com.turkcelltech.cpgw.ws.Pair subsDesc3;

    private java.lang.String subscriberName;

    private com.turkcelltech.cpgw.ws.Pair subscriberNo;

    private java.lang.String tarih;

    private java.lang.String toplamTutar;

    private java.lang.String transactionId;

    public CorpAndSubscriberPreviousInfo() {
    }

    public CorpAndSubscriberPreviousInfo(
           java.lang.Long corpCode,
           java.lang.String corpName,
           java.lang.String currency,
           java.lang.String faturaNo,
           java.lang.String faturaTutari,
           com.turkcelltech.cpgw.ws.InvoiceTypeEnum invoiceType,
           java.lang.String kanalkomisyonTutari,
           java.lang.String komisyonTutari,
           java.lang.String msisdn,
           java.lang.String paymentId,
           java.lang.String paymentOperation,
           java.lang.String sonOdemeTarihi,
           com.turkcelltech.cpgw.ws.Pair subsDesc1,
           com.turkcelltech.cpgw.ws.Pair subsDesc2,
           com.turkcelltech.cpgw.ws.Pair subsDesc3,
           java.lang.String subscriberName,
           com.turkcelltech.cpgw.ws.Pair subscriberNo,
           java.lang.String tarih,
           java.lang.String toplamTutar,
           java.lang.String transactionId) {
           this.corpCode = corpCode;
           this.corpName = corpName;
           this.currency = currency;
           this.faturaNo = faturaNo;
           this.faturaTutari = faturaTutari;
           this.invoiceType = invoiceType;
           this.kanalkomisyonTutari = kanalkomisyonTutari;
           this.komisyonTutari = komisyonTutari;
           this.msisdn = msisdn;
           this.paymentId = paymentId;
           this.paymentOperation = paymentOperation;
           this.sonOdemeTarihi = sonOdemeTarihi;
           this.subsDesc1 = subsDesc1;
           this.subsDesc2 = subsDesc2;
           this.subsDesc3 = subsDesc3;
           this.subscriberName = subscriberName;
           this.subscriberNo = subscriberNo;
           this.tarih = tarih;
           this.toplamTutar = toplamTutar;
           this.transactionId = transactionId;
    }


    /**
     * Gets the corpCode value for this CorpAndSubscriberPreviousInfo.
     * 
     * @return corpCode
     */
    public java.lang.Long getCorpCode() {
        return corpCode;
    }


    /**
     * Sets the corpCode value for this CorpAndSubscriberPreviousInfo.
     * 
     * @param corpCode
     */
    public void setCorpCode(java.lang.Long corpCode) {
        this.corpCode = corpCode;
    }


    /**
     * Gets the corpName value for this CorpAndSubscriberPreviousInfo.
     * 
     * @return corpName
     */
    public java.lang.String getCorpName() {
        return corpName;
    }


    /**
     * Sets the corpName value for this CorpAndSubscriberPreviousInfo.
     * 
     * @param corpName
     */
    public void setCorpName(java.lang.String corpName) {
        this.corpName = corpName;
    }


    /**
     * Gets the currency value for this CorpAndSubscriberPreviousInfo.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this CorpAndSubscriberPreviousInfo.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the faturaNo value for this CorpAndSubscriberPreviousInfo.
     * 
     * @return faturaNo
     */
    public java.lang.String getFaturaNo() {
        return faturaNo;
    }


    /**
     * Sets the faturaNo value for this CorpAndSubscriberPreviousInfo.
     * 
     * @param faturaNo
     */
    public void setFaturaNo(java.lang.String faturaNo) {
        this.faturaNo = faturaNo;
    }


    /**
     * Gets the faturaTutari value for this CorpAndSubscriberPreviousInfo.
     * 
     * @return faturaTutari
     */
    public java.lang.String getFaturaTutari() {
        return faturaTutari;
    }


    /**
     * Sets the faturaTutari value for this CorpAndSubscriberPreviousInfo.
     * 
     * @param faturaTutari
     */
    public void setFaturaTutari(java.lang.String faturaTutari) {
        this.faturaTutari = faturaTutari;
    }


    /**
     * Gets the invoiceType value for this CorpAndSubscriberPreviousInfo.
     * 
     * @return invoiceType
     */
    public com.turkcelltech.cpgw.ws.InvoiceTypeEnum getInvoiceType() {
        return invoiceType;
    }


    /**
     * Sets the invoiceType value for this CorpAndSubscriberPreviousInfo.
     * 
     * @param invoiceType
     */
    public void setInvoiceType(com.turkcelltech.cpgw.ws.InvoiceTypeEnum invoiceType) {
        this.invoiceType = invoiceType;
    }


    /**
     * Gets the kanalkomisyonTutari value for this CorpAndSubscriberPreviousInfo.
     * 
     * @return kanalkomisyonTutari
     */
    public java.lang.String getKanalkomisyonTutari() {
        return kanalkomisyonTutari;
    }


    /**
     * Sets the kanalkomisyonTutari value for this CorpAndSubscriberPreviousInfo.
     * 
     * @param kanalkomisyonTutari
     */
    public void setKanalkomisyonTutari(java.lang.String kanalkomisyonTutari) {
        this.kanalkomisyonTutari = kanalkomisyonTutari;
    }


    /**
     * Gets the komisyonTutari value for this CorpAndSubscriberPreviousInfo.
     * 
     * @return komisyonTutari
     */
    public java.lang.String getKomisyonTutari() {
        return komisyonTutari;
    }


    /**
     * Sets the komisyonTutari value for this CorpAndSubscriberPreviousInfo.
     * 
     * @param komisyonTutari
     */
    public void setKomisyonTutari(java.lang.String komisyonTutari) {
        this.komisyonTutari = komisyonTutari;
    }


    /**
     * Gets the msisdn value for this CorpAndSubscriberPreviousInfo.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this CorpAndSubscriberPreviousInfo.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the paymentId value for this CorpAndSubscriberPreviousInfo.
     * 
     * @return paymentId
     */
    public java.lang.String getPaymentId() {
        return paymentId;
    }


    /**
     * Sets the paymentId value for this CorpAndSubscriberPreviousInfo.
     * 
     * @param paymentId
     */
    public void setPaymentId(java.lang.String paymentId) {
        this.paymentId = paymentId;
    }


    /**
     * Gets the paymentOperation value for this CorpAndSubscriberPreviousInfo.
     * 
     * @return paymentOperation
     */
    public java.lang.String getPaymentOperation() {
        return paymentOperation;
    }


    /**
     * Sets the paymentOperation value for this CorpAndSubscriberPreviousInfo.
     * 
     * @param paymentOperation
     */
    public void setPaymentOperation(java.lang.String paymentOperation) {
        this.paymentOperation = paymentOperation;
    }


    /**
     * Gets the sonOdemeTarihi value for this CorpAndSubscriberPreviousInfo.
     * 
     * @return sonOdemeTarihi
     */
    public java.lang.String getSonOdemeTarihi() {
        return sonOdemeTarihi;
    }


    /**
     * Sets the sonOdemeTarihi value for this CorpAndSubscriberPreviousInfo.
     * 
     * @param sonOdemeTarihi
     */
    public void setSonOdemeTarihi(java.lang.String sonOdemeTarihi) {
        this.sonOdemeTarihi = sonOdemeTarihi;
    }


    /**
     * Gets the subsDesc1 value for this CorpAndSubscriberPreviousInfo.
     * 
     * @return subsDesc1
     */
    public com.turkcelltech.cpgw.ws.Pair getSubsDesc1() {
        return subsDesc1;
    }


    /**
     * Sets the subsDesc1 value for this CorpAndSubscriberPreviousInfo.
     * 
     * @param subsDesc1
     */
    public void setSubsDesc1(com.turkcelltech.cpgw.ws.Pair subsDesc1) {
        this.subsDesc1 = subsDesc1;
    }


    /**
     * Gets the subsDesc2 value for this CorpAndSubscriberPreviousInfo.
     * 
     * @return subsDesc2
     */
    public com.turkcelltech.cpgw.ws.Pair getSubsDesc2() {
        return subsDesc2;
    }


    /**
     * Sets the subsDesc2 value for this CorpAndSubscriberPreviousInfo.
     * 
     * @param subsDesc2
     */
    public void setSubsDesc2(com.turkcelltech.cpgw.ws.Pair subsDesc2) {
        this.subsDesc2 = subsDesc2;
    }


    /**
     * Gets the subsDesc3 value for this CorpAndSubscriberPreviousInfo.
     * 
     * @return subsDesc3
     */
    public com.turkcelltech.cpgw.ws.Pair getSubsDesc3() {
        return subsDesc3;
    }


    /**
     * Sets the subsDesc3 value for this CorpAndSubscriberPreviousInfo.
     * 
     * @param subsDesc3
     */
    public void setSubsDesc3(com.turkcelltech.cpgw.ws.Pair subsDesc3) {
        this.subsDesc3 = subsDesc3;
    }


    /**
     * Gets the subscriberName value for this CorpAndSubscriberPreviousInfo.
     * 
     * @return subscriberName
     */
    public java.lang.String getSubscriberName() {
        return subscriberName;
    }


    /**
     * Sets the subscriberName value for this CorpAndSubscriberPreviousInfo.
     * 
     * @param subscriberName
     */
    public void setSubscriberName(java.lang.String subscriberName) {
        this.subscriberName = subscriberName;
    }


    /**
     * Gets the subscriberNo value for this CorpAndSubscriberPreviousInfo.
     * 
     * @return subscriberNo
     */
    public com.turkcelltech.cpgw.ws.Pair getSubscriberNo() {
        return subscriberNo;
    }


    /**
     * Sets the subscriberNo value for this CorpAndSubscriberPreviousInfo.
     * 
     * @param subscriberNo
     */
    public void setSubscriberNo(com.turkcelltech.cpgw.ws.Pair subscriberNo) {
        this.subscriberNo = subscriberNo;
    }


    /**
     * Gets the tarih value for this CorpAndSubscriberPreviousInfo.
     * 
     * @return tarih
     */
    public java.lang.String getTarih() {
        return tarih;
    }


    /**
     * Sets the tarih value for this CorpAndSubscriberPreviousInfo.
     * 
     * @param tarih
     */
    public void setTarih(java.lang.String tarih) {
        this.tarih = tarih;
    }


    /**
     * Gets the toplamTutar value for this CorpAndSubscriberPreviousInfo.
     * 
     * @return toplamTutar
     */
    public java.lang.String getToplamTutar() {
        return toplamTutar;
    }


    /**
     * Sets the toplamTutar value for this CorpAndSubscriberPreviousInfo.
     * 
     * @param toplamTutar
     */
    public void setToplamTutar(java.lang.String toplamTutar) {
        this.toplamTutar = toplamTutar;
    }


    /**
     * Gets the transactionId value for this CorpAndSubscriberPreviousInfo.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this CorpAndSubscriberPreviousInfo.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CorpAndSubscriberPreviousInfo)) return false;
        CorpAndSubscriberPreviousInfo other = (CorpAndSubscriberPreviousInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.corpCode==null && other.getCorpCode()==null) || 
             (this.corpCode!=null &&
              this.corpCode.equals(other.getCorpCode()))) &&
            ((this.corpName==null && other.getCorpName()==null) || 
             (this.corpName!=null &&
              this.corpName.equals(other.getCorpName()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.faturaNo==null && other.getFaturaNo()==null) || 
             (this.faturaNo!=null &&
              this.faturaNo.equals(other.getFaturaNo()))) &&
            ((this.faturaTutari==null && other.getFaturaTutari()==null) || 
             (this.faturaTutari!=null &&
              this.faturaTutari.equals(other.getFaturaTutari()))) &&
            ((this.invoiceType==null && other.getInvoiceType()==null) || 
             (this.invoiceType!=null &&
              this.invoiceType.equals(other.getInvoiceType()))) &&
            ((this.kanalkomisyonTutari==null && other.getKanalkomisyonTutari()==null) || 
             (this.kanalkomisyonTutari!=null &&
              this.kanalkomisyonTutari.equals(other.getKanalkomisyonTutari()))) &&
            ((this.komisyonTutari==null && other.getKomisyonTutari()==null) || 
             (this.komisyonTutari!=null &&
              this.komisyonTutari.equals(other.getKomisyonTutari()))) &&
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.paymentId==null && other.getPaymentId()==null) || 
             (this.paymentId!=null &&
              this.paymentId.equals(other.getPaymentId()))) &&
            ((this.paymentOperation==null && other.getPaymentOperation()==null) || 
             (this.paymentOperation!=null &&
              this.paymentOperation.equals(other.getPaymentOperation()))) &&
            ((this.sonOdemeTarihi==null && other.getSonOdemeTarihi()==null) || 
             (this.sonOdemeTarihi!=null &&
              this.sonOdemeTarihi.equals(other.getSonOdemeTarihi()))) &&
            ((this.subsDesc1==null && other.getSubsDesc1()==null) || 
             (this.subsDesc1!=null &&
              this.subsDesc1.equals(other.getSubsDesc1()))) &&
            ((this.subsDesc2==null && other.getSubsDesc2()==null) || 
             (this.subsDesc2!=null &&
              this.subsDesc2.equals(other.getSubsDesc2()))) &&
            ((this.subsDesc3==null && other.getSubsDesc3()==null) || 
             (this.subsDesc3!=null &&
              this.subsDesc3.equals(other.getSubsDesc3()))) &&
            ((this.subscriberName==null && other.getSubscriberName()==null) || 
             (this.subscriberName!=null &&
              this.subscriberName.equals(other.getSubscriberName()))) &&
            ((this.subscriberNo==null && other.getSubscriberNo()==null) || 
             (this.subscriberNo!=null &&
              this.subscriberNo.equals(other.getSubscriberNo()))) &&
            ((this.tarih==null && other.getTarih()==null) || 
             (this.tarih!=null &&
              this.tarih.equals(other.getTarih()))) &&
            ((this.toplamTutar==null && other.getToplamTutar()==null) || 
             (this.toplamTutar!=null &&
              this.toplamTutar.equals(other.getToplamTutar()))) &&
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
        int _hashCode = 1;
        if (getCorpCode() != null) {
            _hashCode += getCorpCode().hashCode();
        }
        if (getCorpName() != null) {
            _hashCode += getCorpName().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getFaturaNo() != null) {
            _hashCode += getFaturaNo().hashCode();
        }
        if (getFaturaTutari() != null) {
            _hashCode += getFaturaTutari().hashCode();
        }
        if (getInvoiceType() != null) {
            _hashCode += getInvoiceType().hashCode();
        }
        if (getKanalkomisyonTutari() != null) {
            _hashCode += getKanalkomisyonTutari().hashCode();
        }
        if (getKomisyonTutari() != null) {
            _hashCode += getKomisyonTutari().hashCode();
        }
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getPaymentId() != null) {
            _hashCode += getPaymentId().hashCode();
        }
        if (getPaymentOperation() != null) {
            _hashCode += getPaymentOperation().hashCode();
        }
        if (getSonOdemeTarihi() != null) {
            _hashCode += getSonOdemeTarihi().hashCode();
        }
        if (getSubsDesc1() != null) {
            _hashCode += getSubsDesc1().hashCode();
        }
        if (getSubsDesc2() != null) {
            _hashCode += getSubsDesc2().hashCode();
        }
        if (getSubsDesc3() != null) {
            _hashCode += getSubsDesc3().hashCode();
        }
        if (getSubscriberName() != null) {
            _hashCode += getSubscriberName().hashCode();
        }
        if (getSubscriberNo() != null) {
            _hashCode += getSubscriberNo().hashCode();
        }
        if (getTarih() != null) {
            _hashCode += getTarih().hashCode();
        }
        if (getToplamTutar() != null) {
            _hashCode += getToplamTutar().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CorpAndSubscriberPreviousInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "corpAndSubscriberPreviousInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faturaNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "faturaNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faturaTutari");
        elemField.setXmlName(new javax.xml.namespace.QName("", "faturaTutari"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "invoiceTypeEnum"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kanalkomisyonTutari");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kanalkomisyonTutari"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("komisyonTutari");
        elemField.setXmlName(new javax.xml.namespace.QName("", "komisyonTutari"));
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
        elemField.setFieldName("paymentId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentOperation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentOperation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sonOdemeTarihi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sonOdemeTarihi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsDesc1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subsDesc1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "pair"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsDesc2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subsDesc2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "pair"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsDesc3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subsDesc3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "pair"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "pair"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tarih");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tarih"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toplamTutar");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toplamTutar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
