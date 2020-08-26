/**
 * DeleteSavedInvoiceRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class DeleteSavedInvoiceRequest  extends com.turkcelltech.cpgw.ws.RequestTypeWithChannelRefNo  implements java.io.Serializable {
    private java.lang.Long corpCode;

    private java.lang.String msisdn;

    private java.lang.String subscriberNo1;

    private java.lang.String subscriberNo2;

    public DeleteSavedInvoiceRequest() {
    }

    public DeleteSavedInvoiceRequest(
           com.turkcelltech.cpgw.ws.RequestHeader requestHeader,
           java.lang.String channelRefNo,
           java.lang.Long corpCode,
           java.lang.String msisdn,
           java.lang.String subscriberNo1,
           java.lang.String subscriberNo2) {
        super(
            requestHeader,
            channelRefNo);
        this.corpCode = corpCode;
        this.msisdn = msisdn;
        this.subscriberNo1 = subscriberNo1;
        this.subscriberNo2 = subscriberNo2;
    }


    /**
     * Gets the corpCode value for this DeleteSavedInvoiceRequest.
     * 
     * @return corpCode
     */
    public java.lang.Long getCorpCode() {
        return corpCode;
    }


    /**
     * Sets the corpCode value for this DeleteSavedInvoiceRequest.
     * 
     * @param corpCode
     */
    public void setCorpCode(java.lang.Long corpCode) {
        this.corpCode = corpCode;
    }


    /**
     * Gets the msisdn value for this DeleteSavedInvoiceRequest.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this DeleteSavedInvoiceRequest.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the subscriberNo1 value for this DeleteSavedInvoiceRequest.
     * 
     * @return subscriberNo1
     */
    public java.lang.String getSubscriberNo1() {
        return subscriberNo1;
    }


    /**
     * Sets the subscriberNo1 value for this DeleteSavedInvoiceRequest.
     * 
     * @param subscriberNo1
     */
    public void setSubscriberNo1(java.lang.String subscriberNo1) {
        this.subscriberNo1 = subscriberNo1;
    }


    /**
     * Gets the subscriberNo2 value for this DeleteSavedInvoiceRequest.
     * 
     * @return subscriberNo2
     */
    public java.lang.String getSubscriberNo2() {
        return subscriberNo2;
    }


    /**
     * Sets the subscriberNo2 value for this DeleteSavedInvoiceRequest.
     * 
     * @param subscriberNo2
     */
    public void setSubscriberNo2(java.lang.String subscriberNo2) {
        this.subscriberNo2 = subscriberNo2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteSavedInvoiceRequest)) return false;
        DeleteSavedInvoiceRequest other = (DeleteSavedInvoiceRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.corpCode==null && other.getCorpCode()==null) || 
             (this.corpCode!=null &&
              this.corpCode.equals(other.getCorpCode()))) &&
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.subscriberNo1==null && other.getSubscriberNo1()==null) || 
             (this.subscriberNo1!=null &&
              this.subscriberNo1.equals(other.getSubscriberNo1()))) &&
            ((this.subscriberNo2==null && other.getSubscriberNo2()==null) || 
             (this.subscriberNo2!=null &&
              this.subscriberNo2.equals(other.getSubscriberNo2())));
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
        if (getCorpCode() != null) {
            _hashCode += getCorpCode().hashCode();
        }
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getSubscriberNo1() != null) {
            _hashCode += getSubscriberNo1().hashCode();
        }
        if (getSubscriberNo2() != null) {
            _hashCode += getSubscriberNo2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteSavedInvoiceRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "deleteSavedInvoiceRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corpCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "corpCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberNo1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subscriberNo1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberNo2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subscriberNo2"));
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
