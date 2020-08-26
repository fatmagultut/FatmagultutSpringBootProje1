/**
 * InquireInvoiceResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class InquireInvoiceResponse  extends com.turkcelltech.cpgw.ws.ResponseType  implements java.io.Serializable {
    private com.turkcelltech.cpgw.ws.CorpAndSubscriberInfo corpAndSubscriberInfo;

    private java.lang.Long inquireRefNo;

    private com.turkcelltech.cpgw.ws.InvoiceWithCommissionInfo[] invoiceInfo;

    private java.lang.Integer okcVersion;

    private com.turkcelltech.cpgw.ws.Warning warning;

    public InquireInvoiceResponse() {
    }

    public InquireInvoiceResponse(
           com.turkcelltech.cpgw.ws.ResponseHeader responseHeader,
           com.turkcelltech.cpgw.ws.CorpAndSubscriberInfo corpAndSubscriberInfo,
           java.lang.Long inquireRefNo,
           com.turkcelltech.cpgw.ws.InvoiceWithCommissionInfo[] invoiceInfo,
           java.lang.Integer okcVersion,
           com.turkcelltech.cpgw.ws.Warning warning) {
        super(
            responseHeader);
        this.corpAndSubscriberInfo = corpAndSubscriberInfo;
        this.inquireRefNo = inquireRefNo;
        this.invoiceInfo = invoiceInfo;
        this.okcVersion = okcVersion;
        this.warning = warning;
    }


    /**
     * Gets the corpAndSubscriberInfo value for this InquireInvoiceResponse.
     * 
     * @return corpAndSubscriberInfo
     */
    public com.turkcelltech.cpgw.ws.CorpAndSubscriberInfo getCorpAndSubscriberInfo() {
        return corpAndSubscriberInfo;
    }


    /**
     * Sets the corpAndSubscriberInfo value for this InquireInvoiceResponse.
     * 
     * @param corpAndSubscriberInfo
     */
    public void setCorpAndSubscriberInfo(com.turkcelltech.cpgw.ws.CorpAndSubscriberInfo corpAndSubscriberInfo) {
        this.corpAndSubscriberInfo = corpAndSubscriberInfo;
    }


    /**
     * Gets the inquireRefNo value for this InquireInvoiceResponse.
     * 
     * @return inquireRefNo
     */
    public java.lang.Long getInquireRefNo() {
        return inquireRefNo;
    }


    /**
     * Sets the inquireRefNo value for this InquireInvoiceResponse.
     * 
     * @param inquireRefNo
     */
    public void setInquireRefNo(java.lang.Long inquireRefNo) {
        this.inquireRefNo = inquireRefNo;
    }


    /**
     * Gets the invoiceInfo value for this InquireInvoiceResponse.
     * 
     * @return invoiceInfo
     */
    public com.turkcelltech.cpgw.ws.InvoiceWithCommissionInfo[] getInvoiceInfo() {
        return invoiceInfo;
    }


    /**
     * Sets the invoiceInfo value for this InquireInvoiceResponse.
     * 
     * @param invoiceInfo
     */
    public void setInvoiceInfo(com.turkcelltech.cpgw.ws.InvoiceWithCommissionInfo[] invoiceInfo) {
        this.invoiceInfo = invoiceInfo;
    }

    public com.turkcelltech.cpgw.ws.InvoiceWithCommissionInfo getInvoiceInfo(int i) {
        return this.invoiceInfo[i];
    }

    public void setInvoiceInfo(int i, com.turkcelltech.cpgw.ws.InvoiceWithCommissionInfo _value) {
        this.invoiceInfo[i] = _value;
    }


    /**
     * Gets the okcVersion value for this InquireInvoiceResponse.
     * 
     * @return okcVersion
     */
    public java.lang.Integer getOkcVersion() {
        return okcVersion;
    }


    /**
     * Sets the okcVersion value for this InquireInvoiceResponse.
     * 
     * @param okcVersion
     */
    public void setOkcVersion(java.lang.Integer okcVersion) {
        this.okcVersion = okcVersion;
    }


    /**
     * Gets the warning value for this InquireInvoiceResponse.
     * 
     * @return warning
     */
    public com.turkcelltech.cpgw.ws.Warning getWarning() {
        return warning;
    }


    /**
     * Sets the warning value for this InquireInvoiceResponse.
     * 
     * @param warning
     */
    public void setWarning(com.turkcelltech.cpgw.ws.Warning warning) {
        this.warning = warning;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InquireInvoiceResponse)) return false;
        InquireInvoiceResponse other = (InquireInvoiceResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.corpAndSubscriberInfo==null && other.getCorpAndSubscriberInfo()==null) || 
             (this.corpAndSubscriberInfo!=null &&
              this.corpAndSubscriberInfo.equals(other.getCorpAndSubscriberInfo()))) &&
            ((this.inquireRefNo==null && other.getInquireRefNo()==null) || 
             (this.inquireRefNo!=null &&
              this.inquireRefNo.equals(other.getInquireRefNo()))) &&
            ((this.invoiceInfo==null && other.getInvoiceInfo()==null) || 
             (this.invoiceInfo!=null &&
              java.util.Arrays.equals(this.invoiceInfo, other.getInvoiceInfo()))) &&
            ((this.okcVersion==null && other.getOkcVersion()==null) || 
             (this.okcVersion!=null &&
              this.okcVersion.equals(other.getOkcVersion()))) &&
            ((this.warning==null && other.getWarning()==null) || 
             (this.warning!=null &&
              this.warning.equals(other.getWarning())));
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
        if (getCorpAndSubscriberInfo() != null) {
            _hashCode += getCorpAndSubscriberInfo().hashCode();
        }
        if (getInquireRefNo() != null) {
            _hashCode += getInquireRefNo().hashCode();
        }
        if (getInvoiceInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInvoiceInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInvoiceInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOkcVersion() != null) {
            _hashCode += getOkcVersion().hashCode();
        }
        if (getWarning() != null) {
            _hashCode += getWarning().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InquireInvoiceResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "inquireInvoiceResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corpAndSubscriberInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "corpAndSubscriberInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "corpAndSubscriberInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inquireRefNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inquireRefNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "invoiceWithCommissionInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("okcVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "okcVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("warning");
        elemField.setXmlName(new javax.xml.namespace.QName("", "warning"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "warning"));
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
