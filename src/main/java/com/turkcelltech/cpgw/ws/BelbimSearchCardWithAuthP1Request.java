/**
 * BelbimSearchCardWithAuthP1Request.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class BelbimSearchCardWithAuthP1Request  implements java.io.Serializable {
    private java.lang.String amount;

    private com.turkcelltech.cpgw.ws.BelbimClientData clientData;

    private java.lang.Long txnType;

    private java.lang.String uid;

    private java.lang.Long voidTransactionId;

    public BelbimSearchCardWithAuthP1Request() {
    }

    public BelbimSearchCardWithAuthP1Request(
           java.lang.String amount,
           com.turkcelltech.cpgw.ws.BelbimClientData clientData,
           java.lang.Long txnType,
           java.lang.String uid,
           java.lang.Long voidTransactionId) {
           this.amount = amount;
           this.clientData = clientData;
           this.txnType = txnType;
           this.uid = uid;
           this.voidTransactionId = voidTransactionId;
    }


    /**
     * Gets the amount value for this BelbimSearchCardWithAuthP1Request.
     * 
     * @return amount
     */
    public java.lang.String getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this BelbimSearchCardWithAuthP1Request.
     * 
     * @param amount
     */
    public void setAmount(java.lang.String amount) {
        this.amount = amount;
    }


    /**
     * Gets the clientData value for this BelbimSearchCardWithAuthP1Request.
     * 
     * @return clientData
     */
    public com.turkcelltech.cpgw.ws.BelbimClientData getClientData() {
        return clientData;
    }


    /**
     * Sets the clientData value for this BelbimSearchCardWithAuthP1Request.
     * 
     * @param clientData
     */
    public void setClientData(com.turkcelltech.cpgw.ws.BelbimClientData clientData) {
        this.clientData = clientData;
    }


    /**
     * Gets the txnType value for this BelbimSearchCardWithAuthP1Request.
     * 
     * @return txnType
     */
    public java.lang.Long getTxnType() {
        return txnType;
    }


    /**
     * Sets the txnType value for this BelbimSearchCardWithAuthP1Request.
     * 
     * @param txnType
     */
    public void setTxnType(java.lang.Long txnType) {
        this.txnType = txnType;
    }


    /**
     * Gets the uid value for this BelbimSearchCardWithAuthP1Request.
     * 
     * @return uid
     */
    public java.lang.String getUid() {
        return uid;
    }


    /**
     * Sets the uid value for this BelbimSearchCardWithAuthP1Request.
     * 
     * @param uid
     */
    public void setUid(java.lang.String uid) {
        this.uid = uid;
    }


    /**
     * Gets the voidTransactionId value for this BelbimSearchCardWithAuthP1Request.
     * 
     * @return voidTransactionId
     */
    public java.lang.Long getVoidTransactionId() {
        return voidTransactionId;
    }


    /**
     * Sets the voidTransactionId value for this BelbimSearchCardWithAuthP1Request.
     * 
     * @param voidTransactionId
     */
    public void setVoidTransactionId(java.lang.Long voidTransactionId) {
        this.voidTransactionId = voidTransactionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BelbimSearchCardWithAuthP1Request)) return false;
        BelbimSearchCardWithAuthP1Request other = (BelbimSearchCardWithAuthP1Request) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.clientData==null && other.getClientData()==null) || 
             (this.clientData!=null &&
              this.clientData.equals(other.getClientData()))) &&
            ((this.txnType==null && other.getTxnType()==null) || 
             (this.txnType!=null &&
              this.txnType.equals(other.getTxnType()))) &&
            ((this.uid==null && other.getUid()==null) || 
             (this.uid!=null &&
              this.uid.equals(other.getUid()))) &&
            ((this.voidTransactionId==null && other.getVoidTransactionId()==null) || 
             (this.voidTransactionId!=null &&
              this.voidTransactionId.equals(other.getVoidTransactionId())));
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
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getClientData() != null) {
            _hashCode += getClientData().hashCode();
        }
        if (getTxnType() != null) {
            _hashCode += getTxnType().hashCode();
        }
        if (getUid() != null) {
            _hashCode += getUid().hashCode();
        }
        if (getVoidTransactionId() != null) {
            _hashCode += getVoidTransactionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BelbimSearchCardWithAuthP1Request.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimSearchCardWithAuthP1Request"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimClientData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("txnType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "txnType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voidTransactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "voidTransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
