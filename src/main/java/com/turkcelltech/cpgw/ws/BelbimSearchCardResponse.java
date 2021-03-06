/**
 * BelbimSearchCardResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class BelbimSearchCardResponse  implements java.io.Serializable {
    private int cardStatus;

    private com.turkcelltech.cpgw.ws.BelbimInstructions[] instructions;

    private java.lang.String message;

    private com.turkcelltech.cpgw.ws.BelbimReturn ret;

    public BelbimSearchCardResponse() {
    }

    public BelbimSearchCardResponse(
           int cardStatus,
           com.turkcelltech.cpgw.ws.BelbimInstructions[] instructions,
           java.lang.String message,
           com.turkcelltech.cpgw.ws.BelbimReturn ret) {
           this.cardStatus = cardStatus;
           this.instructions = instructions;
           this.message = message;
           this.ret = ret;
    }


    /**
     * Gets the cardStatus value for this BelbimSearchCardResponse.
     * 
     * @return cardStatus
     */
    public int getCardStatus() {
        return cardStatus;
    }


    /**
     * Sets the cardStatus value for this BelbimSearchCardResponse.
     * 
     * @param cardStatus
     */
    public void setCardStatus(int cardStatus) {
        this.cardStatus = cardStatus;
    }


    /**
     * Gets the instructions value for this BelbimSearchCardResponse.
     * 
     * @return instructions
     */
    public com.turkcelltech.cpgw.ws.BelbimInstructions[] getInstructions() {
        return instructions;
    }


    /**
     * Sets the instructions value for this BelbimSearchCardResponse.
     * 
     * @param instructions
     */
    public void setInstructions(com.turkcelltech.cpgw.ws.BelbimInstructions[] instructions) {
        this.instructions = instructions;
    }

    public com.turkcelltech.cpgw.ws.BelbimInstructions getInstructions(int i) {
        return this.instructions[i];
    }

    public void setInstructions(int i, com.turkcelltech.cpgw.ws.BelbimInstructions _value) {
        this.instructions[i] = _value;
    }


    /**
     * Gets the message value for this BelbimSearchCardResponse.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this BelbimSearchCardResponse.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the ret value for this BelbimSearchCardResponse.
     * 
     * @return ret
     */
    public com.turkcelltech.cpgw.ws.BelbimReturn getRet() {
        return ret;
    }


    /**
     * Sets the ret value for this BelbimSearchCardResponse.
     * 
     * @param ret
     */
    public void setRet(com.turkcelltech.cpgw.ws.BelbimReturn ret) {
        this.ret = ret;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BelbimSearchCardResponse)) return false;
        BelbimSearchCardResponse other = (BelbimSearchCardResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.cardStatus == other.getCardStatus() &&
            ((this.instructions==null && other.getInstructions()==null) || 
             (this.instructions!=null &&
              java.util.Arrays.equals(this.instructions, other.getInstructions()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.ret==null && other.getRet()==null) || 
             (this.ret!=null &&
              this.ret.equals(other.getRet())));
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
        _hashCode += getCardStatus();
        if (getInstructions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInstructions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInstructions(), i);
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BelbimSearchCardResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimSearchCardResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instructions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "instructions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimInstructions"));
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
