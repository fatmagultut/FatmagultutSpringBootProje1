/**
 * BelbimReadCardResultRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class BelbimReadCardResultRequest  implements java.io.Serializable {
    private com.turkcelltech.cpgw.ws.BelbimClientData clientData;

    private com.turkcelltech.cpgw.ws.BelbimCommands[] readCardResult;

    private java.lang.Long transactionId;

    private java.lang.String uid;

    public BelbimReadCardResultRequest() {
    }

    public BelbimReadCardResultRequest(
           com.turkcelltech.cpgw.ws.BelbimClientData clientData,
           com.turkcelltech.cpgw.ws.BelbimCommands[] readCardResult,
           java.lang.Long transactionId,
           java.lang.String uid) {
           this.clientData = clientData;
           this.readCardResult = readCardResult;
           this.transactionId = transactionId;
           this.uid = uid;
    }


    /**
     * Gets the clientData value for this BelbimReadCardResultRequest.
     * 
     * @return clientData
     */
    public com.turkcelltech.cpgw.ws.BelbimClientData getClientData() {
        return clientData;
    }


    /**
     * Sets the clientData value for this BelbimReadCardResultRequest.
     * 
     * @param clientData
     */
    public void setClientData(com.turkcelltech.cpgw.ws.BelbimClientData clientData) {
        this.clientData = clientData;
    }


    /**
     * Gets the readCardResult value for this BelbimReadCardResultRequest.
     * 
     * @return readCardResult
     */
    public com.turkcelltech.cpgw.ws.BelbimCommands[] getReadCardResult() {
        return readCardResult;
    }


    /**
     * Sets the readCardResult value for this BelbimReadCardResultRequest.
     * 
     * @param readCardResult
     */
    public void setReadCardResult(com.turkcelltech.cpgw.ws.BelbimCommands[] readCardResult) {
        this.readCardResult = readCardResult;
    }

    public com.turkcelltech.cpgw.ws.BelbimCommands getReadCardResult(int i) {
        return this.readCardResult[i];
    }

    public void setReadCardResult(int i, com.turkcelltech.cpgw.ws.BelbimCommands _value) {
        this.readCardResult[i] = _value;
    }


    /**
     * Gets the transactionId value for this BelbimReadCardResultRequest.
     * 
     * @return transactionId
     */
    public java.lang.Long getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this BelbimReadCardResultRequest.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.Long transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the uid value for this BelbimReadCardResultRequest.
     * 
     * @return uid
     */
    public java.lang.String getUid() {
        return uid;
    }


    /**
     * Sets the uid value for this BelbimReadCardResultRequest.
     * 
     * @param uid
     */
    public void setUid(java.lang.String uid) {
        this.uid = uid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BelbimReadCardResultRequest)) return false;
        BelbimReadCardResultRequest other = (BelbimReadCardResultRequest) obj;
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
            ((this.readCardResult==null && other.getReadCardResult()==null) || 
             (this.readCardResult!=null &&
              java.util.Arrays.equals(this.readCardResult, other.getReadCardResult()))) &&
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
        if (getClientData() != null) {
            _hashCode += getClientData().hashCode();
        }
        if (getReadCardResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReadCardResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReadCardResult(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        new org.apache.axis.description.TypeDesc(BelbimReadCardResultRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimReadCardResultRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimClientData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readCardResult");
        elemField.setXmlName(new javax.xml.namespace.QName("", "readCardResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimCommands"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
