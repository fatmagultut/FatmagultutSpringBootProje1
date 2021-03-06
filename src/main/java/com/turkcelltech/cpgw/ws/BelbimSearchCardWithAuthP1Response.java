/**
 * BelbimSearchCardWithAuthP1Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class BelbimSearchCardWithAuthP1Response  implements java.io.Serializable {
    private java.lang.Integer batchId;

    private java.lang.Integer cardStatus;

    private com.turkcelltech.cpgw.ws.BelbimCommands[] commands;

    private java.lang.String message;

    private com.turkcelltech.cpgw.ws.BelbimReturn ret;

    private java.lang.Long transactionId;

    public BelbimSearchCardWithAuthP1Response() {
    }

    public BelbimSearchCardWithAuthP1Response(
           java.lang.Integer batchId,
           java.lang.Integer cardStatus,
           com.turkcelltech.cpgw.ws.BelbimCommands[] commands,
           java.lang.String message,
           com.turkcelltech.cpgw.ws.BelbimReturn ret,
           java.lang.Long transactionId) {
           this.batchId = batchId;
           this.cardStatus = cardStatus;
           this.commands = commands;
           this.message = message;
           this.ret = ret;
           this.transactionId = transactionId;
    }


    /**
     * Gets the batchId value for this BelbimSearchCardWithAuthP1Response.
     * 
     * @return batchId
     */
    public java.lang.Integer getBatchId() {
        return batchId;
    }


    /**
     * Sets the batchId value for this BelbimSearchCardWithAuthP1Response.
     * 
     * @param batchId
     */
    public void setBatchId(java.lang.Integer batchId) {
        this.batchId = batchId;
    }


    /**
     * Gets the cardStatus value for this BelbimSearchCardWithAuthP1Response.
     * 
     * @return cardStatus
     */
    public java.lang.Integer getCardStatus() {
        return cardStatus;
    }


    /**
     * Sets the cardStatus value for this BelbimSearchCardWithAuthP1Response.
     * 
     * @param cardStatus
     */
    public void setCardStatus(java.lang.Integer cardStatus) {
        this.cardStatus = cardStatus;
    }


    /**
     * Gets the commands value for this BelbimSearchCardWithAuthP1Response.
     * 
     * @return commands
     */
    public com.turkcelltech.cpgw.ws.BelbimCommands[] getCommands() {
        return commands;
    }


    /**
     * Sets the commands value for this BelbimSearchCardWithAuthP1Response.
     * 
     * @param commands
     */
    public void setCommands(com.turkcelltech.cpgw.ws.BelbimCommands[] commands) {
        this.commands = commands;
    }

    public com.turkcelltech.cpgw.ws.BelbimCommands getCommands(int i) {
        return this.commands[i];
    }

    public void setCommands(int i, com.turkcelltech.cpgw.ws.BelbimCommands _value) {
        this.commands[i] = _value;
    }


    /**
     * Gets the message value for this BelbimSearchCardWithAuthP1Response.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this BelbimSearchCardWithAuthP1Response.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the ret value for this BelbimSearchCardWithAuthP1Response.
     * 
     * @return ret
     */
    public com.turkcelltech.cpgw.ws.BelbimReturn getRet() {
        return ret;
    }


    /**
     * Sets the ret value for this BelbimSearchCardWithAuthP1Response.
     * 
     * @param ret
     */
    public void setRet(com.turkcelltech.cpgw.ws.BelbimReturn ret) {
        this.ret = ret;
    }


    /**
     * Gets the transactionId value for this BelbimSearchCardWithAuthP1Response.
     * 
     * @return transactionId
     */
    public java.lang.Long getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this BelbimSearchCardWithAuthP1Response.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.Long transactionId) {
        this.transactionId = transactionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BelbimSearchCardWithAuthP1Response)) return false;
        BelbimSearchCardWithAuthP1Response other = (BelbimSearchCardWithAuthP1Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.batchId==null && other.getBatchId()==null) || 
             (this.batchId!=null &&
              this.batchId.equals(other.getBatchId()))) &&
            ((this.cardStatus==null && other.getCardStatus()==null) || 
             (this.cardStatus!=null &&
              this.cardStatus.equals(other.getCardStatus()))) &&
            ((this.commands==null && other.getCommands()==null) || 
             (this.commands!=null &&
              java.util.Arrays.equals(this.commands, other.getCommands()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.ret==null && other.getRet()==null) || 
             (this.ret!=null &&
              this.ret.equals(other.getRet()))) &&
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
        if (getBatchId() != null) {
            _hashCode += getBatchId().hashCode();
        }
        if (getCardStatus() != null) {
            _hashCode += getCardStatus().hashCode();
        }
        if (getCommands() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCommands());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCommands(), i);
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BelbimSearchCardWithAuthP1Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimSearchCardWithAuthP1Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "batchId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commands");
        elemField.setXmlName(new javax.xml.namespace.QName("", "commands"));
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
