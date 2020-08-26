/**
 * PaymentRefundRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class PaymentRefundRequest  extends com.turkcelltech.cpgw.ws.RequestType  implements java.io.Serializable {
    private java.lang.String ad;

    private java.lang.String channelName;

    private java.lang.String corpName;

    private java.lang.String iban;

    private java.math.BigDecimal invoiceAmount;

    private java.lang.Long invoiceId;

    private java.lang.String invoiceNo;

    private java.lang.String islemAciklama;

    private java.lang.String msisdn;

    private java.lang.String soyad;

    private java.lang.Integer status;

    private java.lang.String subscriberName;

    private java.lang.String subscriberNo;

    private java.lang.String TCKN;

    private java.math.BigDecimal totalAmount;

    private java.lang.String vendorName;

    public PaymentRefundRequest() {
    }

    public PaymentRefundRequest(
           com.turkcelltech.cpgw.ws.RequestHeader requestHeader,
           java.lang.String ad,
           java.lang.String channelName,
           java.lang.String corpName,
           java.lang.String iban,
           java.math.BigDecimal invoiceAmount,
           java.lang.Long invoiceId,
           java.lang.String invoiceNo,
           java.lang.String islemAciklama,
           java.lang.String msisdn,
           java.lang.String soyad,
           java.lang.Integer status,
           java.lang.String subscriberName,
           java.lang.String subscriberNo,
           java.lang.String TCKN,
           java.math.BigDecimal totalAmount,
           java.lang.String vendorName) {
        super(
            requestHeader);
        this.ad = ad;
        this.channelName = channelName;
        this.corpName = corpName;
        this.iban = iban;
        this.invoiceAmount = invoiceAmount;
        this.invoiceId = invoiceId;
        this.invoiceNo = invoiceNo;
        this.islemAciklama = islemAciklama;
        this.msisdn = msisdn;
        this.soyad = soyad;
        this.status = status;
        this.subscriberName = subscriberName;
        this.subscriberNo = subscriberNo;
        this.TCKN = TCKN;
        this.totalAmount = totalAmount;
        this.vendorName = vendorName;
    }


    /**
     * Gets the ad value for this PaymentRefundRequest.
     * 
     * @return ad
     */
    public java.lang.String getAd() {
        return ad;
    }


    /**
     * Sets the ad value for this PaymentRefundRequest.
     * 
     * @param ad
     */
    public void setAd(java.lang.String ad) {
        this.ad = ad;
    }


    /**
     * Gets the channelName value for this PaymentRefundRequest.
     * 
     * @return channelName
     */
    public java.lang.String getChannelName() {
        return channelName;
    }


    /**
     * Sets the channelName value for this PaymentRefundRequest.
     * 
     * @param channelName
     */
    public void setChannelName(java.lang.String channelName) {
        this.channelName = channelName;
    }


    /**
     * Gets the corpName value for this PaymentRefundRequest.
     * 
     * @return corpName
     */
    public java.lang.String getCorpName() {
        return corpName;
    }


    /**
     * Sets the corpName value for this PaymentRefundRequest.
     * 
     * @param corpName
     */
    public void setCorpName(java.lang.String corpName) {
        this.corpName = corpName;
    }


    /**
     * Gets the iban value for this PaymentRefundRequest.
     * 
     * @return iban
     */
    public java.lang.String getIban() {
        return iban;
    }


    /**
     * Sets the iban value for this PaymentRefundRequest.
     * 
     * @param iban
     */
    public void setIban(java.lang.String iban) {
        this.iban = iban;
    }


    /**
     * Gets the invoiceAmount value for this PaymentRefundRequest.
     * 
     * @return invoiceAmount
     */
    public java.math.BigDecimal getInvoiceAmount() {
        return invoiceAmount;
    }


    /**
     * Sets the invoiceAmount value for this PaymentRefundRequest.
     * 
     * @param invoiceAmount
     */
    public void setInvoiceAmount(java.math.BigDecimal invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }


    /**
     * Gets the invoiceId value for this PaymentRefundRequest.
     * 
     * @return invoiceId
     */
    public java.lang.Long getInvoiceId() {
        return invoiceId;
    }


    /**
     * Sets the invoiceId value for this PaymentRefundRequest.
     * 
     * @param invoiceId
     */
    public void setInvoiceId(java.lang.Long invoiceId) {
        this.invoiceId = invoiceId;
    }


    /**
     * Gets the invoiceNo value for this PaymentRefundRequest.
     * 
     * @return invoiceNo
     */
    public java.lang.String getInvoiceNo() {
        return invoiceNo;
    }


    /**
     * Sets the invoiceNo value for this PaymentRefundRequest.
     * 
     * @param invoiceNo
     */
    public void setInvoiceNo(java.lang.String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }


    /**
     * Gets the islemAciklama value for this PaymentRefundRequest.
     * 
     * @return islemAciklama
     */
    public java.lang.String getIslemAciklama() {
        return islemAciklama;
    }


    /**
     * Sets the islemAciklama value for this PaymentRefundRequest.
     * 
     * @param islemAciklama
     */
    public void setIslemAciklama(java.lang.String islemAciklama) {
        this.islemAciklama = islemAciklama;
    }


    /**
     * Gets the msisdn value for this PaymentRefundRequest.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this PaymentRefundRequest.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the soyad value for this PaymentRefundRequest.
     * 
     * @return soyad
     */
    public java.lang.String getSoyad() {
        return soyad;
    }


    /**
     * Sets the soyad value for this PaymentRefundRequest.
     * 
     * @param soyad
     */
    public void setSoyad(java.lang.String soyad) {
        this.soyad = soyad;
    }


    /**
     * Gets the status value for this PaymentRefundRequest.
     * 
     * @return status
     */
    public java.lang.Integer getStatus() {
        return status;
    }


    /**
     * Sets the status value for this PaymentRefundRequest.
     * 
     * @param status
     */
    public void setStatus(java.lang.Integer status) {
        this.status = status;
    }


    /**
     * Gets the subscriberName value for this PaymentRefundRequest.
     * 
     * @return subscriberName
     */
    public java.lang.String getSubscriberName() {
        return subscriberName;
    }


    /**
     * Sets the subscriberName value for this PaymentRefundRequest.
     * 
     * @param subscriberName
     */
    public void setSubscriberName(java.lang.String subscriberName) {
        this.subscriberName = subscriberName;
    }


    /**
     * Gets the subscriberNo value for this PaymentRefundRequest.
     * 
     * @return subscriberNo
     */
    public java.lang.String getSubscriberNo() {
        return subscriberNo;
    }


    /**
     * Sets the subscriberNo value for this PaymentRefundRequest.
     * 
     * @param subscriberNo
     */
    public void setSubscriberNo(java.lang.String subscriberNo) {
        this.subscriberNo = subscriberNo;
    }


    /**
     * Gets the TCKN value for this PaymentRefundRequest.
     * 
     * @return TCKN
     */
    public java.lang.String getTCKN() {
        return TCKN;
    }


    /**
     * Sets the TCKN value for this PaymentRefundRequest.
     * 
     * @param TCKN
     */
    public void setTCKN(java.lang.String TCKN) {
        this.TCKN = TCKN;
    }


    /**
     * Gets the totalAmount value for this PaymentRefundRequest.
     * 
     * @return totalAmount
     */
    public java.math.BigDecimal getTotalAmount() {
        return totalAmount;
    }


    /**
     * Sets the totalAmount value for this PaymentRefundRequest.
     * 
     * @param totalAmount
     */
    public void setTotalAmount(java.math.BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }


    /**
     * Gets the vendorName value for this PaymentRefundRequest.
     * 
     * @return vendorName
     */
    public java.lang.String getVendorName() {
        return vendorName;
    }


    /**
     * Sets the vendorName value for this PaymentRefundRequest.
     * 
     * @param vendorName
     */
    public void setVendorName(java.lang.String vendorName) {
        this.vendorName = vendorName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentRefundRequest)) return false;
        PaymentRefundRequest other = (PaymentRefundRequest) obj;
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
            ((this.corpName==null && other.getCorpName()==null) || 
             (this.corpName!=null &&
              this.corpName.equals(other.getCorpName()))) &&
            ((this.iban==null && other.getIban()==null) || 
             (this.iban!=null &&
              this.iban.equals(other.getIban()))) &&
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
            ((this.totalAmount==null && other.getTotalAmount()==null) || 
             (this.totalAmount!=null &&
              this.totalAmount.equals(other.getTotalAmount()))) &&
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
        if (getCorpName() != null) {
            _hashCode += getCorpName().hashCode();
        }
        if (getIban() != null) {
            _hashCode += getIban().hashCode();
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
        if (getTotalAmount() != null) {
            _hashCode += getTotalAmount().hashCode();
        }
        if (getVendorName() != null) {
            _hashCode += getVendorName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentRefundRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "paymentRefundRequest"));
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
        elemField.setFieldName("corpName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "corpName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("totalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
