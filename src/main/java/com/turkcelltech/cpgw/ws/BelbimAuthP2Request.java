/**
 * BelbimAuthP2Request.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class BelbimAuthP2Request  implements java.io.Serializable {
    private com.turkcelltech.cpgw.ws.BelbimCommands[] authP2CardReturn;

    private com.turkcelltech.cpgw.ws.BelbimClientData clientData;

    private java.lang.Long transactionId;

    private java.lang.String uid;

    public BelbimAuthP2Request() {
    }

    public BelbimAuthP2Request(
           com.turkcelltech.cpgw.ws.BelbimCommands[] authP2CardReturn,
           com.turkcelltech.cpgw.ws.BelbimClientData clientData,
           java.lang.Long transactionId,
           java.lang.String uid) {
           this.authP2CardReturn = authP2CardReturn;
           this.clientData = clientData;
           this.transactionId = transactionId;
           this.uid = uid;
    }


    /**
     * Gets the authP2CardReturn value for this BelbimAuthP2Request.
     * 
     * @return authP2CardReturn
     */
    public com.turkcelltech.cpgw.ws.BelbimCommands[] getAuthP2CardReturn() {
        return authP2CardReturn;
    }


    /**
     * Sets the authP2CardReturn value for this BelbimAuthP2Request.
     * 
     * @param authP2CardReturn
     */
    public void setAuthP2CardReturn(com.turkcelltech.cpgw.ws.BelbimCommands[] authP2CardReturn) {
        this.authP2CardReturn = authP2CardReturn;
    }

    public com.turkcelltech.cpgw.ws.BelbimCommands getAuthP2CardReturn(int i) {
        return this.authP2CardReturn[i];
    }

    public void setAuthP2CardReturn(int i, com.turkcelltech.cpgw.ws.BelbimCommands _value) {
        this.authP2CardReturn[i] = _value;
    }


    /**
     * Gets the clientData value for this BelbimAuthP2Request.
     * 
     * @return clientData
     */
    public com.turkcelltech.cpgw.ws.BelbimClientData getClientData() {
        return clientData;
    }


    /**
     * Sets the clientData value for this BelbimAuthP2Request.
     * 
     * @param clientData
     */
    public void setClientData(com.turkcelltech.cpgw.ws.BelbimClientData clientData) {
        this.clientData = clientData;
    }


    /**
     * Gets the transactionId value for this BelbimAuthP2Request.
     * 
     * @return transactionId
     */
    public java.lang.Long getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this BelbimAuthP2Request.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.Long transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the uid value for this BelbimAuthP2Request.
     * 
     * @return uid
     */
    public java.lang.String getUid() {
        return uid;
    }


    /**
     * Sets the uid value for this BelbimAuthP2Request.
     * 
     * @param uid
     */
    public void setUid(java.lang.String uid) {
        this.uid = uid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BelbimAuthP2Request)) return false;
        BelbimAuthP2Request other = (BelbimAuthP2Request) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.authP2CardReturn==null && other.getAuthP2CardReturn()==null) || 
             (this.authP2CardReturn!=null &&
              java.util.Arrays.equals(this.authP2CardReturn, other.getAuthP2CardReturn()))) &&
            ((this.clientData==null && other.getClientData()==null) || 
             (this.clientData!=null &&
              this.clientData.equals(other.getClientData()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
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
        if (getAuthP2CardReturn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAuthP2CardReturn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAuthP2CardReturn(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getClientData() != null) {
            _hashCode += getClientData().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getUid() != null) {
            _hashCode += getUid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BelbimAuthP2Request.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimAuthP2Request"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authP2CardReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authP2CardReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimCommands"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimClientData"));
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
