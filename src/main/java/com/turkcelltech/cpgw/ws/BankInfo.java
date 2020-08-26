/**
 * BankInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class BankInfo  extends com.turkcelltech.cpgw.ws.CpgwModel  implements java.io.Serializable {
    private java.lang.String acquirerBankCode;

    private java.lang.String acquirerBankName;

    private java.lang.String issuerBankCode;

    private java.lang.String issuerBankName;

    private com.turkcelltech.cpgw.ws.ProvisionTypeEnum provisionType;

    public BankInfo() {
    }

    public BankInfo(
           java.lang.String acquirerBankCode,
           java.lang.String acquirerBankName,
           java.lang.String issuerBankCode,
           java.lang.String issuerBankName,
           com.turkcelltech.cpgw.ws.ProvisionTypeEnum provisionType) {
        this.acquirerBankCode = acquirerBankCode;
        this.acquirerBankName = acquirerBankName;
        this.issuerBankCode = issuerBankCode;
        this.issuerBankName = issuerBankName;
        this.provisionType = provisionType;
    }


    /**
     * Gets the acquirerBankCode value for this BankInfo.
     * 
     * @return acquirerBankCode
     */
    public java.lang.String getAcquirerBankCode() {
        return acquirerBankCode;
    }


    /**
     * Sets the acquirerBankCode value for this BankInfo.
     * 
     * @param acquirerBankCode
     */
    public void setAcquirerBankCode(java.lang.String acquirerBankCode) {
        this.acquirerBankCode = acquirerBankCode;
    }


    /**
     * Gets the acquirerBankName value for this BankInfo.
     * 
     * @return acquirerBankName
     */
    public java.lang.String getAcquirerBankName() {
        return acquirerBankName;
    }


    /**
     * Sets the acquirerBankName value for this BankInfo.
     * 
     * @param acquirerBankName
     */
    public void setAcquirerBankName(java.lang.String acquirerBankName) {
        this.acquirerBankName = acquirerBankName;
    }


    /**
     * Gets the issuerBankCode value for this BankInfo.
     * 
     * @return issuerBankCode
     */
    public java.lang.String getIssuerBankCode() {
        return issuerBankCode;
    }


    /**
     * Sets the issuerBankCode value for this BankInfo.
     * 
     * @param issuerBankCode
     */
    public void setIssuerBankCode(java.lang.String issuerBankCode) {
        this.issuerBankCode = issuerBankCode;
    }


    /**
     * Gets the issuerBankName value for this BankInfo.
     * 
     * @return issuerBankName
     */
    public java.lang.String getIssuerBankName() {
        return issuerBankName;
    }


    /**
     * Sets the issuerBankName value for this BankInfo.
     * 
     * @param issuerBankName
     */
    public void setIssuerBankName(java.lang.String issuerBankName) {
        this.issuerBankName = issuerBankName;
    }


    /**
     * Gets the provisionType value for this BankInfo.
     * 
     * @return provisionType
     */
    public com.turkcelltech.cpgw.ws.ProvisionTypeEnum getProvisionType() {
        return provisionType;
    }


    /**
     * Sets the provisionType value for this BankInfo.
     * 
     * @param provisionType
     */
    public void setProvisionType(com.turkcelltech.cpgw.ws.ProvisionTypeEnum provisionType) {
        this.provisionType = provisionType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BankInfo)) return false;
        BankInfo other = (BankInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.acquirerBankCode==null && other.getAcquirerBankCode()==null) || 
             (this.acquirerBankCode!=null &&
              this.acquirerBankCode.equals(other.getAcquirerBankCode()))) &&
            ((this.acquirerBankName==null && other.getAcquirerBankName()==null) || 
             (this.acquirerBankName!=null &&
              this.acquirerBankName.equals(other.getAcquirerBankName()))) &&
            ((this.issuerBankCode==null && other.getIssuerBankCode()==null) || 
             (this.issuerBankCode!=null &&
              this.issuerBankCode.equals(other.getIssuerBankCode()))) &&
            ((this.issuerBankName==null && other.getIssuerBankName()==null) || 
             (this.issuerBankName!=null &&
              this.issuerBankName.equals(other.getIssuerBankName()))) &&
            ((this.provisionType==null && other.getProvisionType()==null) || 
             (this.provisionType!=null &&
              this.provisionType.equals(other.getProvisionType())));
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
        if (getAcquirerBankCode() != null) {
            _hashCode += getAcquirerBankCode().hashCode();
        }
        if (getAcquirerBankName() != null) {
            _hashCode += getAcquirerBankName().hashCode();
        }
        if (getIssuerBankCode() != null) {
            _hashCode += getIssuerBankCode().hashCode();
        }
        if (getIssuerBankName() != null) {
            _hashCode += getIssuerBankName().hashCode();
        }
        if (getProvisionType() != null) {
            _hashCode += getProvisionType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BankInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "bankInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acquirerBankCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acquirerBankCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acquirerBankName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acquirerBankName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issuerBankCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "issuerBankCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issuerBankName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "issuerBankName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provisionType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "provisionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "provisionTypeEnum"));
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
