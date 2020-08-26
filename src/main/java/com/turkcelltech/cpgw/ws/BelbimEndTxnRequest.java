/**
 * BelbimEndTxnRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class BelbimEndTxnRequest  implements java.io.Serializable {
    private com.turkcelltech.cpgw.ws.BelbimClientData clientData;

    private java.lang.String description;

    private java.lang.Long transactionId;

    private java.lang.String txnStatus;

    private java.lang.String uid;

    public BelbimEndTxnRequest() {
    }

    public BelbimEndTxnRequest(
           com.turkcelltech.cpgw.ws.BelbimClientData clientData,
           java.lang.String description,
           java.lang.Long transactionId,
           java.lang.String txnStatus,
           java.lang.String uid) {
           this.clientData = clientData;
           this.description = description;
           this.transactionId = transactionId;
           this.txnStatus = txnStatus;
           this.uid = uid;
    }


    /**
     * Gets the clientData value for this BelbimEndTxnRequest.
     * 
     * @return clientData
     */
    public com.turkcelltech.cpgw.ws.BelbimClientData getClientData() {
        return clientData;
    }


    /**
     * Sets the clientData value for this BelbimEndTxnRequest.
     * 
     * @param clientData
     */
    public void setClientData(com.turkcelltech.cpgw.ws.BelbimClientData clientData) {
        this.clientData = clientData;
    }


    /**
     * Gets the description value for this BelbimEndTxnRequest.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this BelbimEndTxnRequest.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the transactionId value for this BelbimEndTxnRequest.
     * 
     * @return transactionId
     */
    public java.lang.Long getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this BelbimEndTxnRequest.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.Long transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the txnStatus value for this BelbimEndTxnRequest.
     * 
     * @return txnStatus
     */
    public java.lang.String getTxnStatus() {
        return txnStatus;
    }


    /**
     * Sets the txnStatus value for this BelbimEndTxnRequest.
     * 
     * @param txnStatus
     */
    public void setTxnStatus(java.lang.String txnStatus) {
        this.txnStatus = txnStatus;
    }


    /**
     * Gets the uid value for this BelbimEndTxnRequest.
     * 
     * @return uid
     */
    public java.lang.String getUid() {
        return uid;
    }


    /**
     * Sets the uid value for this BelbimEndTxnRequest.
     * 
     * @param uid
     */
    public void setUid(java.lang.String uid) {
        this.uid = uid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BelbimEndTxnRequest)) return false;
        BelbimEndTxnRequest other = (BelbimEndTxnRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clientData==null && other.getClientData()==null) || 
             (this.clientData!=null &&
              this.clientData.equals(other.getClientData()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.txnStatus==null && other.getTxnStatus()==null) || 
             (this.txnStatus!=null &&
              this.txnStatus.equals(other.getTxnStatus()))) &&
            ((this.uid==null && other.getUid()==null) || 
             (this.uid!=null &&
              this.uid.equals(other.getUid())));
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
        if (getClientData() != null) {
            _hashCode += getClientData().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getTxnStatus() != null) {
            _hashCode += getTxnStatus().hashCode();
        }
        if (getUid() != null) {
            _hashCode += getUid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BelbimEndTxnRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimEndTxnRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimClientData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("txnStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "txnStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
