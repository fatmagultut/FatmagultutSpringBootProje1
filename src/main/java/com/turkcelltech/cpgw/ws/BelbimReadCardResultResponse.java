/**
 * BelbimReadCardResultResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class BelbimReadCardResultResponse  implements java.io.Serializable {
    private java.lang.String amount;

    private java.lang.String balance;

    private int cardStatus;

    private com.turkcelltech.cpgw.ws.BelbimCommands[] instructionCommands;

    private java.lang.String message;

    private com.turkcelltech.cpgw.ws.BelbimReturn ret;

    private java.lang.Long transactionId;

    private com.turkcelltech.cpgw.ws.BelbimTxnInfo[] txnInfo;

    public BelbimReadCardResultResponse() {
    }

    public BelbimReadCardResultResponse(
           java.lang.String amount,
           java.lang.String balance,
           int cardStatus,
           com.turkcelltech.cpgw.ws.BelbimCommands[] instructionCommands,
           java.lang.String message,
           com.turkcelltech.cpgw.ws.BelbimReturn ret,
           java.lang.Long transactionId,
           com.turkcelltech.cpgw.ws.BelbimTxnInfo[] txnInfo) {
           this.amount = amount;
           this.balance = balance;
           this.cardStatus = cardStatus;
           this.instructionCommands = instructionCommands;
           this.message = message;
           this.ret = ret;
           this.transactionId = transactionId;
           this.txnInfo = txnInfo;
    }


    /**
     * Gets the amount value for this BelbimReadCardResultResponse.
     * 
     * @return amount
     */
    public java.lang.String getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this BelbimReadCardResultResponse.
     * 
     * @param amount
     */
    public void setAmount(java.lang.String amount) {
        this.amount = amount;
    }


    /**
     * Gets the balance value for this BelbimReadCardResultResponse.
     * 
     * @return balance
     */
    public java.lang.String getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this BelbimReadCardResultResponse.
     * 
     * @param balance
     */
    public void setBalance(java.lang.String balance) {
        this.balance = balance;
    }


    /**
     * Gets the cardStatus value for this BelbimReadCardResultResponse.
     * 
     * @return cardStatus
     */
    public int getCardStatus() {
        return cardStatus;
    }


    /**
     * Sets the cardStatus value for this BelbimReadCardResultResponse.
     * 
     * @param cardStatus
     */
    public void setCardStatus(int cardStatus) {
        this.cardStatus = cardStatus;
    }


    /**
     * Gets the instructionCommands value for this BelbimReadCardResultResponse.
     * 
     * @return instructionCommands
     */
    public com.turkcelltech.cpgw.ws.BelbimCommands[] getInstructionCommands() {
        return instructionCommands;
    }


    /**
     * Sets the instructionCommands value for this BelbimReadCardResultResponse.
     * 
     * @param instructionCommands
     */
    public void setInstructionCommands(com.turkcelltech.cpgw.ws.BelbimCommands[] instructionCommands) {
        this.instructionCommands = instructionCommands;
    }

    public com.turkcelltech.cpgw.ws.BelbimCommands getInstructionCommands(int i) {
        return this.instructionCommands[i];
    }

    public void setInstructionCommands(int i, com.turkcelltech.cpgw.ws.BelbimCommands _value) {
        this.instructionCommands[i] = _value;
    }


    /**
     * Gets the message value for this BelbimReadCardResultResponse.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this BelbimReadCardResultResponse.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the ret value for this BelbimReadCardResultResponse.
     * 
     * @return ret
     */
    public com.turkcelltech.cpgw.ws.BelbimReturn getRet() {
        return ret;
    }


    /**
     * Sets the ret value for this BelbimReadCardResultResponse.
     * 
     * @param ret
     */
    public void setRet(com.turkcelltech.cpgw.ws.BelbimReturn ret) {
        this.ret = ret;
    }


    /**
     * Gets the transactionId value for this BelbimReadCardResultResponse.
     * 
     * @return transactionId
     */
    public java.lang.Long getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this BelbimReadCardResultResponse.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.Long transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the txnInfo value for this BelbimReadCardResultResponse.
     * 
     * @return txnInfo
     */
    public com.turkcelltech.cpgw.ws.BelbimTxnInfo[] getTxnInfo() {
        return txnInfo;
    }


    /**
     * Sets the txnInfo value for this BelbimReadCardResultResponse.
     * 
     * @param txnInfo
     */
    public void setTxnInfo(com.turkcelltech.cpgw.ws.BelbimTxnInfo[] txnInfo) {
        this.txnInfo = txnInfo;
    }

    public com.turkcelltech.cpgw.ws.BelbimTxnInfo getTxnInfo(int i) {
        return this.txnInfo[i];
    }

    public void setTxnInfo(int i, com.turkcelltech.cpgw.ws.BelbimTxnInfo _value) {
        this.txnInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BelbimReadCardResultResponse)) return false;
        BelbimReadCardResultResponse other = (BelbimReadCardResultResponse) obj;
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
            ((this.balance==null && other.getBalance()==null) || 
             (this.balance!=null &&
              this.balance.equals(other.getBalance()))) &&
            this.cardStatus == other.getCardStatus() &&
            ((this.instructionCommands==null && other.getInstructionCommands()==null) || 
             (this.instructionCommands!=null &&
              java.util.Arrays.equals(this.instructionCommands, other.getInstructionCommands()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.ret==null && other.getRet()==null) || 
             (this.ret!=null &&
              this.ret.equals(other.getRet()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.txnInfo==null && other.getTxnInfo()==null) || 
             (this.txnInfo!=null &&
              java.util.Arrays.equals(this.txnInfo, other.getTxnInfo())));
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
        if (getBalance() != null) {
            _hashCode += getBalance().hashCode();
        }
        _hashCode += getCardStatus();
        if (getInstructionCommands() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInstructionCommands());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInstructionCommands(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getRet() != null) {
            _hashCode += getRet().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getTxnInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTxnInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTxnInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BelbimReadCardResultResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimReadCardResultResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instructionCommands");
        elemField.setXmlName(new javax.xml.namespace.QName("", "instructionCommands"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimCommands"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ret");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ret"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimReturn"));
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
        elemField.setFieldName("txnInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "txnInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimTxnInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
