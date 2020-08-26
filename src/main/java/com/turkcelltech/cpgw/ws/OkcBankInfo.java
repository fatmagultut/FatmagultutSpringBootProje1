/**
 * OkcBankInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class OkcBankInfo  extends com.turkcelltech.cpgw.ws.CpgwModel  implements java.io.Serializable {
    private java.lang.String authCode;

    private java.lang.String eftCode;

    private java.lang.String rrn;

    private java.lang.String stan;

    public OkcBankInfo() {
    }

    public OkcBankInfo(
           java.lang.String authCode,
           java.lang.String eftCode,
           java.lang.String rrn,
           java.lang.String stan) {
        this.authCode = authCode;
        this.eftCode = eftCode;
        this.rrn = rrn;
        this.stan = stan;
    }


    /**
     * Gets the authCode value for this OkcBankInfo.
     * 
     * @return authCode
     */
    public java.lang.String getAuthCode() {
        return authCode;
    }


    /**
     * Sets the authCode value for this OkcBankInfo.
     * 
     * @param authCode
     */
    public void setAuthCode(java.lang.String authCode) {
        this.authCode = authCode;
    }


    /**
     * Gets the eftCode value for this OkcBankInfo.
     * 
     * @return eftCode
     */
    public java.lang.String getEftCode() {
        return eftCode;
    }


    /**
     * Sets the eftCode value for this OkcBankInfo.
     * 
     * @param eftCode
     */
    public void setEftCode(java.lang.String eftCode) {
        this.eftCode = eftCode;
    }


    /**
     * Gets the rrn value for this OkcBankInfo.
     * 
     * @return rrn
     */
    public java.lang.String getRrn() {
        return rrn;
    }


    /**
     * Sets the rrn value for this OkcBankInfo.
     * 
     * @param rrn
     */
    public void setRrn(java.lang.String rrn) {
        this.rrn = rrn;
    }


    /**
     * Gets the stan value for this OkcBankInfo.
     * 
     * @return stan
     */
    public java.lang.String getStan() {
        return stan;
    }


    /**
     * Sets the stan value for this OkcBankInfo.
     * 
     * @param stan
     */
    public void setStan(java.lang.String stan) {
        this.stan = stan;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OkcBankInfo)) return false;
        OkcBankInfo other = (OkcBankInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.authCode==null && other.getAuthCode()==null) || 
             (this.authCode!=null &&
              this.authCode.equals(other.getAuthCode()))) &&
            ((this.eftCode==null && other.getEftCode()==null) || 
             (this.eftCode!=null &&
              this.eftCode.equals(other.getEftCode()))) &&
            ((this.rrn==null && other.getRrn()==null) || 
             (this.rrn!=null &&
              this.rrn.equals(other.getRrn()))) &&
            ((this.stan==null && other.getStan()==null) || 
             (this.stan!=null &&
              this.stan.equals(other.getStan())));
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
        if (getAuthCode() != null) {
            _hashCode += getAuthCode().hashCode();
        }
        if (getEftCode() != null) {
            _hashCode += getEftCode().hashCode();
        }
        if (getRrn() != null) {
            _hashCode += getRrn().hashCode();
        }
        if (getStan() != null) {
            _hashCode += getStan().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OkcBankInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "okcBankInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eftCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eftCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rrn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rrn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stan"));
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
