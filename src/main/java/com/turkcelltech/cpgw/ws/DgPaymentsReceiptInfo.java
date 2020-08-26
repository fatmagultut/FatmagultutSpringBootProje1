/**
 * DgPaymentsReceiptInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class DgPaymentsReceiptInfo  implements java.io.Serializable {
    private java.lang.String corpName;

    private java.lang.String info;

    private java.lang.String lastAmount;

    private java.lang.String lastUpdatedDate;

    private java.lang.String recordName;

    private java.lang.String subscriberName;

    private java.lang.String transactionId;

    public DgPaymentsReceiptInfo() {
    }

    public DgPaymentsReceiptInfo(
           java.lang.String corpName,
           java.lang.String info,
           java.lang.String lastAmount,
           java.lang.String lastUpdatedDate,
           java.lang.String recordName,
           java.lang.String subscriberName,
           java.lang.String transactionId) {
           this.corpName = corpName;
           this.info = info;
           this.lastAmount = lastAmount;
           this.lastUpdatedDate = lastUpdatedDate;
           this.recordName = recordName;
           this.subscriberName = subscriberName;
           this.transactionId = transactionId;
    }


    /**
     * Gets the corpName value for this DgPaymentsReceiptInfo.
     * 
     * @return corpName
     */
    public java.lang.String getCorpName() {
        return corpName;
    }


    /**
     * Sets the corpName value for this DgPaymentsReceiptInfo.
     * 
     * @param corpName
     */
    public void setCorpName(java.lang.String corpName) {
        this.corpName = corpName;
    }


    /**
     * Gets the info value for this DgPaymentsReceiptInfo.
     * 
     * @return info
     */
    public java.lang.String getInfo() {
        return info;
    }


    /**
     * Sets the info value for this DgPaymentsReceiptInfo.
     * 
     * @param info
     */
    public void setInfo(java.lang.String info) {
        this.info = info;
    }


    /**
     * Gets the lastAmount value for this DgPaymentsReceiptInfo.
     * 
     * @return lastAmount
     */
    public java.lang.String getLastAmount() {
        return lastAmount;
    }


    /**
     * Sets the lastAmount value for this DgPaymentsReceiptInfo.
     * 
     * @param lastAmount
     */
    public void setLastAmount(java.lang.String lastAmount) {
        this.lastAmount = lastAmount;
    }


    /**
     * Gets the lastUpdatedDate value for this DgPaymentsReceiptInfo.
     * 
     * @return lastUpdatedDate
     */
    public java.lang.String getLastUpdatedDate() {
        return lastUpdatedDate;
    }


    /**
     * Sets the lastUpdatedDate value for this DgPaymentsReceiptInfo.
     * 
     * @param lastUpdatedDate
     */
    public void setLastUpdatedDate(java.lang.String lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }


    /**
     * Gets the recordName value for this DgPaymentsReceiptInfo.
     * 
     * @return recordName
     */
    public java.lang.String getRecordName() {
        return recordName;
    }


    /**
     * Sets the recordName value for this DgPaymentsReceiptInfo.
     * 
     * @param recordName
     */
    public void setRecordName(java.lang.String recordName) {
        this.recordName = recordName;
    }


    /**
     * Gets the subscriberName value for this DgPaymentsReceiptInfo.
     * 
     * @return subscriberName
     */
    public java.lang.String getSubscriberName() {
        return subscriberName;
    }


    /**
     * Sets the subscriberName value for this DgPaymentsReceiptInfo.
     * 
     * @param subscriberName
     */
    public void setSubscriberName(java.lang.String subscriberName) {
        this.subscriberName = subscriberName;
    }


    /**
     * Gets the transactionId value for this DgPaymentsReceiptInfo.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this DgPaymentsReceiptInfo.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DgPaymentsReceiptInfo)) return false;
        DgPaymentsReceiptInfo other = (DgPaymentsReceiptInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.corpName==null && other.getCorpName()==null) || 
             (this.corpName!=null &&
              this.corpName.equals(other.getCorpName()))) &&
            ((this.info==null && other.getInfo()==null) || 
             (this.info!=null &&
              this.info.equals(other.getInfo()))) &&
            ((this.lastAmount==null && other.getLastAmount()==null) || 
             (this.lastAmount!=null &&
              this.lastAmount.equals(other.getLastAmount()))) &&
            ((this.lastUpdatedDate==null && other.getLastUpdatedDate()==null) || 
             (this.lastUpdatedDate!=null &&
              this.lastUpdatedDate.equals(other.getLastUpdatedDate()))) &&
            ((this.recordName==null && other.getRecordName()==null) || 
             (this.recordName!=null &&
              this.recordName.equals(other.getRecordName()))) &&
            ((this.subscriberName==null && other.getSubscriberName()==null) || 
             (this.subscriberName!=null &&
              this.subscriberName.equals(other.getSubscriberName()))) &&
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
        if (getCorpName() != null) {
            _hashCode += getCorpName().hashCode();
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
        if (getRecordName() != null) {
            _hashCode += getRecordName().hashCode();
        }
        if (getSubscriberName() != null) {
            _hashCode += getSubscriberName().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DgPaymentsReceiptInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "dgPaymentsReceiptInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corpName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "corpName"));
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
        elemField.setFieldName("recordName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recordName"));
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
