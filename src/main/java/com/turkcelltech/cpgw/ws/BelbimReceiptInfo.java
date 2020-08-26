/**
 * BelbimReceiptInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class BelbimReceiptInfo  implements java.io.Serializable {
    private java.lang.String bddk;

    private java.math.BigDecimal channelCommission;

    private java.math.BigDecimal commissionAmount;

    private java.lang.String corpName;

    private java.lang.String customerPaymentMethod;

    private java.lang.String info;

    private java.lang.String lastAmount;

    private java.lang.String lastUpdatedDate;

    private java.lang.String subscriberName;

    private java.lang.String transactionDate;

    private java.lang.String transactionId;

    public BelbimReceiptInfo() {
    }

    public BelbimReceiptInfo(
           java.lang.String bddk,
           java.math.BigDecimal channelCommission,
           java.math.BigDecimal commissionAmount,
           java.lang.String corpName,
           java.lang.String customerPaymentMethod,
           java.lang.String info,
           java.lang.String lastAmount,
           java.lang.String lastUpdatedDate,
           java.lang.String subscriberName,
           java.lang.String transactionDate,
           java.lang.String transactionId) {
           this.bddk = bddk;
           this.channelCommission = channelCommission;
           this.commissionAmount = commissionAmount;
           this.corpName = corpName;
           this.customerPaymentMethod = customerPaymentMethod;
           this.info = info;
           this.lastAmount = lastAmount;
           this.lastUpdatedDate = lastUpdatedDate;
           this.subscriberName = subscriberName;
           this.transactionDate = transactionDate;
           this.transactionId = transactionId;
    }


    /**
     * Gets the bddk value for this BelbimReceiptInfo.
     * 
     * @return bddk
     */
    public java.lang.String getBddk() {
        return bddk;
    }


    /**
     * Sets the bddk value for this BelbimReceiptInfo.
     * 
     * @param bddk
     */
    public void setBddk(java.lang.String bddk) {
        this.bddk = bddk;
    }


    /**
     * Gets the channelCommission value for this BelbimReceiptInfo.
     * 
     * @return channelCommission
     */
    public java.math.BigDecimal getChannelCommission() {
        return channelCommission;
    }


    /**
     * Sets the channelCommission value for this BelbimReceiptInfo.
     * 
     * @param channelCommission
     */
    public void setChannelCommission(java.math.BigDecimal channelCommission) {
        this.channelCommission = channelCommission;
    }


    /**
     * Gets the commissionAmount value for this BelbimReceiptInfo.
     * 
     * @return commissionAmount
     */
    public java.math.BigDecimal getCommissionAmount() {
        return commissionAmount;
    }


    /**
     * Sets the commissionAmount value for this BelbimReceiptInfo.
     * 
     * @param commissionAmount
     */
    public void setCommissionAmount(java.math.BigDecimal commissionAmount) {
        this.commissionAmount = commissionAmount;
    }


    /**
     * Gets the corpName value for this BelbimReceiptInfo.
     * 
     * @return corpName
     */
    public java.lang.String getCorpName() {
        return corpName;
    }


    /**
     * Sets the corpName value for this BelbimReceiptInfo.
     * 
     * @param corpName
     */
    public void setCorpName(java.lang.String corpName) {
        this.corpName = corpName;
    }


    /**
     * Gets the customerPaymentMethod value for this BelbimReceiptInfo.
     * 
     * @return customerPaymentMethod
     */
    public java.lang.String getCustomerPaymentMethod() {
        return customerPaymentMethod;
    }


    /**
     * Sets the customerPaymentMethod value for this BelbimReceiptInfo.
     * 
     * @param customerPaymentMethod
     */
    public void setCustomerPaymentMethod(java.lang.String customerPaymentMethod) {
        this.customerPaymentMethod = customerPaymentMethod;
    }


    /**
     * Gets the info value for this BelbimReceiptInfo.
     * 
     * @return info
     */
    public java.lang.String getInfo() {
        return info;
    }


    /**
     * Sets the info value for this BelbimReceiptInfo.
     * 
     * @param info
     */
    public void setInfo(java.lang.String info) {
        this.info = info;
    }


    /**
     * Gets the lastAmount value for this BelbimReceiptInfo.
     * 
     * @return lastAmount
     */
    public java.lang.String getLastAmount() {
        return lastAmount;
    }


    /**
     * Sets the lastAmount value for this BelbimReceiptInfo.
     * 
     * @param lastAmount
     */
    public void setLastAmount(java.lang.String lastAmount) {
        this.lastAmount = lastAmount;
    }


    /**
     * Gets the lastUpdatedDate value for this BelbimReceiptInfo.
     * 
     * @return lastUpdatedDate
     */
    public java.lang.String getLastUpdatedDate() {
        return lastUpdatedDate;
    }


    /**
     * Sets the lastUpdatedDate value for this BelbimReceiptInfo.
     * 
     * @param lastUpdatedDate
     */
    public void setLastUpdatedDate(java.lang.String lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }


    /**
     * Gets the subscriberName value for this BelbimReceiptInfo.
     * 
     * @return subscriberName
     */
    public java.lang.String getSubscriberName() {
        return subscriberName;
    }


    /**
     * Sets the subscriberName value for this BelbimReceiptInfo.
     * 
     * @param subscriberName
     */
    public void setSubscriberName(java.lang.String subscriberName) {
        this.subscriberName = subscriberName;
    }


    /**
     * Gets the transactionDate value for this BelbimReceiptInfo.
     * 
     * @return transactionDate
     */
    public java.lang.String getTransactionDate() {
        return transactionDate;
    }


    /**
     * Sets the transactionDate value for this BelbimReceiptInfo.
     * 
     * @param transactionDate
     */
    public void setTransactionDate(java.lang.String transactionDate) {
        this.transactionDate = transactionDate;
    }


    /**
     * Gets the transactionId value for this BelbimReceiptInfo.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this BelbimReceiptInfo.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BelbimReceiptInfo)) return false;
        BelbimReceiptInfo other = (BelbimReceiptInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bddk==null && other.getBddk()==null) || 
             (this.bddk!=null &&
              this.bddk.equals(other.getBddk()))) &&
            ((this.channelCommission==null && other.getChannelCommission()==null) || 
             (this.channelCommission!=null &&
              this.channelCommission.equals(other.getChannelCommission()))) &&
            ((this.commissionAmount==null && other.getCommissionAmount()==null) || 
             (this.commissionAmount!=null &&
              this.commissionAmount.equals(other.getCommissionAmount()))) &&
            ((this.corpName==null && other.getCorpName()==null) || 
             (this.corpName!=null &&
              this.corpName.equals(other.getCorpName()))) &&
            ((this.customerPaymentMethod==null && other.getCustomerPaymentMethod()==null) || 
             (this.customerPaymentMethod!=null &&
              this.customerPaymentMethod.equals(other.getCustomerPaymentMethod()))) &&
            ((this.info==null && other.getInfo()==null) || 
             (this.info!=null &&
              this.info.equals(other.getInfo()))) &&
            ((this.lastAmount==null && other.getLastAmount()==null) || 
             (this.lastAmount!=null &&
              this.lastAmount.equals(other.getLastAmount()))) &&
            ((this.lastUpdatedDate==null && other.getLastUpdatedDate()==null) || 
             (this.lastUpdatedDate!=null &&
              this.lastUpdatedDate.equals(other.getLastUpdatedDate()))) &&
            ((this.subscriberName==null && other.getSubscriberName()==null) || 
             (this.subscriberName!=null &&
              this.subscriberName.equals(other.getSubscriberName()))) &&
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
        int _hashCode = 1;
        if (getBddk() != null) {
            _hashCode += getBddk().hashCode();
        }
        if (getChannelCommission() != null) {
            _hashCode += getChannelCommission().hashCode();
        }
        if (getCommissionAmount() != null) {
            _hashCode += getCommissionAmount().hashCode();
        }
        if (getCorpName() != null) {
            _hashCode += getCorpName().hashCode();
        }
        if (getCustomerPaymentMethod() != null) {
            _hashCode += getCustomerPaymentMethod().hashCode();
        }
        if (getInfo() != null) {
            _hashCode += getInfo().hashCode();
        }
        if (getLastAmount() != null) {
            _hashCode += getLastAmount().hashCode();
        }
        if (getLastUpdatedDate() != null) {
            _hashCode += getLastUpdatedDate().hashCode();
        }
        if (getSubscriberName() != null) {
            _hashCode += getSubscriberName().hashCode();
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
        new org.apache.axis.description.TypeDesc(BelbimReceiptInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimReceiptInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bddk");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bddk"));
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
        elemField.setFieldName("corpName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "corpName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerPaymentMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerPaymentMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("info");
        elemField.setXmlName(new javax.xml.namespace.QName("", "info"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastUpdatedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastUpdatedDate"));
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
        elemField.setFieldName("transactionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionDate"));
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
