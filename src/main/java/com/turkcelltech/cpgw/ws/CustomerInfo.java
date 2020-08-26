/**
 * CustomerInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class CustomerInfo  extends com.turkcelltech.cpgw.ws.CpgwModel  implements java.io.Serializable {
    private java.lang.String callerMsisdn;

    private com.turkcelltech.cpgw.ws.InformationTypeEnum informationType;

    private java.lang.String mailAddress;

    private java.lang.String msisdn;

    public CustomerInfo() {
    }

    public CustomerInfo(
           java.lang.String callerMsisdn,
           com.turkcelltech.cpgw.ws.InformationTypeEnum informationType,
           java.lang.String mailAddress,
           java.lang.String msisdn) {
        this.callerMsisdn = callerMsisdn;
        this.informationType = informationType;
        this.mailAddress = mailAddress;
        this.msisdn = msisdn;
    }


    /**
     * Gets the callerMsisdn value for this CustomerInfo.
     * 
     * @return callerMsisdn
     */
    public java.lang.String getCallerMsisdn() {
        return callerMsisdn;
    }


    /**
     * Sets the callerMsisdn value for this CustomerInfo.
     * 
     * @param callerMsisdn
     */
    public void setCallerMsisdn(java.lang.String callerMsisdn) {
        this.callerMsisdn = callerMsisdn;
    }


    /**
     * Gets the informationType value for this CustomerInfo.
     * 
     * @return informationType
     */
    public com.turkcelltech.cpgw.ws.InformationTypeEnum getInformationType() {
        return informationType;
    }


    /**
     * Sets the informationType value for this CustomerInfo.
     * 
     * @param informationType
     */
    public void setInformationType(com.turkcelltech.cpgw.ws.InformationTypeEnum informationType) {
        this.informationType = informationType;
    }


    /**
     * Gets the mailAddress value for this CustomerInfo.
     * 
     * @return mailAddress
     */
    public java.lang.String getMailAddress() {
        return mailAddress;
    }


    /**
     * Sets the mailAddress value for this CustomerInfo.
     * 
     * @param mailAddress
     */
    public void setMailAddress(java.lang.String mailAddress) {
        this.mailAddress = mailAddress;
    }


    /**
     * Gets the msisdn value for this CustomerInfo.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this CustomerInfo.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerInfo)) return false;
        CustomerInfo other = (CustomerInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.callerMsisdn==null && other.getCallerMsisdn()==null) || 
             (this.callerMsisdn!=null &&
              this.callerMsisdn.equals(other.getCallerMsisdn()))) &&
            ((this.informationType==null && other.getInformationType()==null) || 
             (this.informationType!=null &&
              this.informationType.equals(other.getInformationType()))) &&
            ((this.mailAddress==null && other.getMailAddress()==null) || 
             (this.mailAddress!=null &&
              this.mailAddress.equals(other.getMailAddress()))) &&
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getCallerMsisdn() != null) {
            _hashCode += getCallerMsisdn().hashCode();
        }
        if (getInformationType() != null) {
            _hashCode += getInformationType().hashCode();
        }
        if (getMailAddress() != null) {
            _hashCode += getMailAddress().hashCode();
        }
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "customerInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callerMsisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callerMsisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("informationType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "informationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "informationTypeEnum"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "msisdn"));
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
