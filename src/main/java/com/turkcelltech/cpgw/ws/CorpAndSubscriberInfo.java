/**
 * CorpAndSubscriberInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class CorpAndSubscriberInfo  implements java.io.Serializable {
    private java.lang.Long corpCode;

    private java.lang.String corpName;

    private java.lang.String currency;

    private com.turkcelltech.cpgw.ws.InvoiceTypeEnum invoiceType;

    private java.lang.String subsDesc1;

    private java.lang.String subsDesc2;

    private java.lang.String subsDesc3;

    private java.lang.String subscriberName;

    private java.lang.String subscriberNo;

    private java.lang.Long vendorId;

    private java.lang.String vendorName;

    public CorpAndSubscriberInfo() {
    }

    public CorpAndSubscriberInfo(
           java.lang.Long corpCode,
           java.lang.String corpName,
           java.lang.String currency,
           com.turkcelltech.cpgw.ws.InvoiceTypeEnum invoiceType,
           java.lang.String subsDesc1,
           java.lang.String subsDesc2,
           java.lang.String subsDesc3,
           java.lang.String subscriberName,
           java.lang.String subscriberNo,
           java.lang.Long vendorId,
           java.lang.String vendorName) {
           this.corpCode = corpCode;
           this.corpName = corpName;
           this.currency = currency;
           this.invoiceType = invoiceType;
           this.subsDesc1 = subsDesc1;
           this.subsDesc2 = subsDesc2;
           this.subsDesc3 = subsDesc3;
           this.subscriberName = subscriberName;
           this.subscriberNo = subscriberNo;
           this.vendorId = vendorId;
           this.vendorName = vendorName;
    }


    /**
     * Gets the corpCode value for this CorpAndSubscriberInfo.
     * 
     * @return corpCode
     */
    public java.lang.Long getCorpCode() {
        return corpCode;
    }


    /**
     * Sets the corpCode value for this CorpAndSubscriberInfo.
     * 
     * @param corpCode
     */
    public void setCorpCode(java.lang.Long corpCode) {
        this.corpCode = corpCode;
    }


    /**
     * Gets the corpName value for this CorpAndSubscriberInfo.
     * 
     * @return corpName
     */
    public java.lang.String getCorpName() {
        return corpName;
    }


    /**
     * Sets the corpName value for this CorpAndSubscriberInfo.
     * 
     * @param corpName
     */
    public void setCorpName(java.lang.String corpName) {
        this.corpName = corpName;
    }


    /**
     * Gets the currency value for this CorpAndSubscriberInfo.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this CorpAndSubscriberInfo.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the invoiceType value for this CorpAndSubscriberInfo.
     * 
     * @return invoiceType
     */
    public com.turkcelltech.cpgw.ws.InvoiceTypeEnum getInvoiceType() {
        return invoiceType;
    }


    /**
     * Sets the invoiceType value for this CorpAndSubscriberInfo.
     * 
     * @param invoiceType
     */
    public void setInvoiceType(com.turkcelltech.cpgw.ws.InvoiceTypeEnum invoiceType) {
        this.invoiceType = invoiceType;
    }


    /**
     * Gets the subsDesc1 value for this CorpAndSubscriberInfo.
     * 
     * @return subsDesc1
     */
    public java.lang.String getSubsDesc1() {
        return subsDesc1;
    }


    /**
     * Sets the subsDesc1 value for this CorpAndSubscriberInfo.
     * 
     * @param subsDesc1
     */
    public void setSubsDesc1(java.lang.String subsDesc1) {
        this.subsDesc1 = subsDesc1;
    }


    /**
     * Gets the subsDesc2 value for this CorpAndSubscriberInfo.
     * 
     * @return subsDesc2
     */
    public java.lang.String getSubsDesc2() {
        return subsDesc2;
    }


    /**
     * Sets the subsDesc2 value for this CorpAndSubscriberInfo.
     * 
     * @param subsDesc2
     */
    public void setSubsDesc2(java.lang.String subsDesc2) {
        this.subsDesc2 = subsDesc2;
    }


    /**
     * Gets the subsDesc3 value for this CorpAndSubscriberInfo.
     * 
     * @return subsDesc3
     */
    public java.lang.String getSubsDesc3() {
        return subsDesc3;
    }


    /**
     * Sets the subsDesc3 value for this CorpAndSubscriberInfo.
     * 
     * @param subsDesc3
     */
    public void setSubsDesc3(java.lang.String subsDesc3) {
        this.subsDesc3 = subsDesc3;
    }


    /**
     * Gets the subscriberName value for this CorpAndSubscriberInfo.
     * 
     * @return subscriberName
     */
    public java.lang.String getSubscriberName() {
        return subscriberName;
    }


    /**
     * Sets the subscriberName value for this CorpAndSubscriberInfo.
     * 
     * @param subscriberName
     */
    public void setSubscriberName(java.lang.String subscriberName) {
        this.subscriberName = subscriberName;
    }


    /**
     * Gets the subscriberNo value for this CorpAndSubscriberInfo.
     * 
     * @return subscriberNo
     */
    public java.lang.String getSubscriberNo() {
        return subscriberNo;
    }


    /**
     * Sets the subscriberNo value for this CorpAndSubscriberInfo.
     * 
     * @param subscriberNo
     */
    public void setSubscriberNo(java.lang.String subscriberNo) {
        this.subscriberNo = subscriberNo;
    }


    /**
     * Gets the vendorId value for this CorpAndSubscriberInfo.
     * 
     * @return vendorId
     */
    public java.lang.Long getVendorId() {
        return vendorId;
    }


    /**
     * Sets the vendorId value for this CorpAndSubscriberInfo.
     * 
     * @param vendorId
     */
    public void setVendorId(java.lang.Long vendorId) {
        this.vendorId = vendorId;
    }


    /**
     * Gets the vendorName value for this CorpAndSubscriberInfo.
     * 
     * @return vendorName
     */
    public java.lang.String getVendorName() {
        return vendorName;
    }


    /**
     * Sets the vendorName value for this CorpAndSubscriberInfo.
     * 
     * @param vendorName
     */
    public void setVendorName(java.lang.String vendorName) {
        this.vendorName = vendorName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CorpAndSubscriberInfo)) return false;
        CorpAndSubscriberInfo other = (CorpAndSubscriberInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.corpCode==null && other.getCorpCode()==null) || 
             (this.corpCode!=null &&
              this.corpCode.equals(other.getCorpCode()))) &&
            ((this.corpName==null && other.getCorpName()==null) || 
             (this.corpName!=null &&
              this.corpName.equals(other.getCorpName()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.invoiceType==null && other.getInvoiceType()==null) || 
             (this.invoiceType!=null &&
              this.invoiceType.equals(other.getInvoiceType()))) &&
            ((this.subsDesc1==null && other.getSubsDesc1()==null) || 
             (this.subsDesc1!=null &&
              this.subsDesc1.equals(other.getSubsDesc1()))) &&
            ((this.subsDesc2==null && other.getSubsDesc2()==null) || 
             (this.subsDesc2!=null &&
              this.subsDesc2.equals(other.getSubsDesc2()))) &&
            ((this.subsDesc3==null && other.getSubsDesc3()==null) || 
             (this.subsDesc3!=null &&
              this.subsDesc3.equals(other.getSubsDesc3()))) &&
            ((this.subscriberName==null && other.getSubscriberName()==null) || 
             (this.subscriberName!=null &&
              this.subscriberName.equals(other.getSubscriberName()))) &&
            ((this.subscriberNo==null && other.getSubscriberNo()==null) || 
             (this.subscriberNo!=null &&
              this.subscriberNo.equals(other.getSubscriberNo()))) &&
            ((this.vendorId==null && other.getVendorId()==null) || 
             (this.vendorId!=null &&
              this.vendorId.equals(other.getVendorId()))) &&
            ((this.vendorName==null && other.getVendorName()==null) || 
             (this.vendorName!=null &&
              this.vendorName.equals(other.getVendorName())));
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
        if (getCorpCode() != null) {
            _hashCode += getCorpCode().hashCode();
        }
        if (getCorpName() != null) {
            _hashCode += getCorpName().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getInvoiceType() != null) {
            _hashCode += getInvoiceType().hashCode();
        }
        if (getSubsDesc1() != null) {
            _hashCode += getSubsDesc1().hashCode();
        }
        if (getSubsDesc2() != null) {
            _hashCode += getSubsDesc2().hashCode();
        }
        if (getSubsDesc3() != null) {
            _hashCode += getSubsDesc3().hashCode();
        }
        if (getSubscriberName() != null) {
            _hashCode += getSubscriberName().hashCode();
        }
        if (getSubscriberNo() != null) {
            _hashCode += getSubscriberNo().hashCode();
        }
        if (getVendorId() != null) {
            _hashCode += getVendorId().hashCode();
        }
        if (getVendorName() != null) {
            _hashCode += getVendorName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CorpAndSubscriberInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "corpAndSubscriberInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corpCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "corpCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corpName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "corpName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "invoiceTypeEnum"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsDesc1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subsDesc1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsDesc2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subsDesc2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsDesc3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subsDesc3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subscriberName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subscriberNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vendorId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vendorName"));
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
