/**
 * BelbimClientData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class BelbimClientData  implements java.io.Serializable {
    private long clientConnectionIndex;

    private java.lang.String clientKey;

    private java.lang.String clientPass;

    public BelbimClientData() {
    }

    public BelbimClientData(
           long clientConnectionIndex,
           java.lang.String clientKey,
           java.lang.String clientPass) {
           this.clientConnectionIndex = clientConnectionIndex;
           this.clientKey = clientKey;
           this.clientPass = clientPass;
    }


    /**
     * Gets the clientConnectionIndex value for this BelbimClientData.
     * 
     * @return clientConnectionIndex
     */
    public long getClientConnectionIndex() {
        return clientConnectionIndex;
    }


    /**
     * Sets the clientConnectionIndex value for this BelbimClientData.
     * 
     * @param clientConnectionIndex
     */
    public void setClientConnectionIndex(long clientConnectionIndex) {
        this.clientConnectionIndex = clientConnectionIndex;
    }


    /**
     * Gets the clientKey value for this BelbimClientData.
     * 
     * @return clientKey
     */
    public java.lang.String getClientKey() {
        return clientKey;
    }


    /**
     * Sets the clientKey value for this BelbimClientData.
     * 
     * @param clientKey
     */
    public void setClientKey(java.lang.String clientKey) {
        this.clientKey = clientKey;
    }


    /**
     * Gets the clientPass value for this BelbimClientData.
     * 
     * @return clientPass
     */
    public java.lang.String getClientPass() {
        return clientPass;
    }


    /**
     * Sets the clientPass value for this BelbimClientData.
     * 
     * @param clientPass
     */
    public void setClientPass(java.lang.String clientPass) {
        this.clientPass = clientPass;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BelbimClientData)) return false;
        BelbimClientData other = (BelbimClientData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.clientConnectionIndex == other.getClientConnectionIndex() &&
            ((this.clientKey==null && other.getClientKey()==null) || 
             (this.clientKey!=null &&
              this.clientKey.equals(other.getClientKey()))) &&
            ((this.clientPass==null && other.getClientPass()==null) || 
             (this.clientPass!=null &&
              this.clientPass.equals(other.getClientPass())));
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
        _hashCode += new Long(getClientConnectionIndex()).hashCode();
        if (getClientKey() != null) {
            _hashCode += getClientKey().hashCode();
        }
        if (getClientPass() != null) {
            _hashCode += getClientPass().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BelbimClientData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimClientData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientConnectionIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientConnectionIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientPass");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientPass"));
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
