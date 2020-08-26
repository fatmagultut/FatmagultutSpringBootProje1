/**
 * UpdateSavedInvoiceRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class UpdateSavedInvoiceRequest  extends com.turkcelltech.cpgw.ws.RequestTypeWithChannelRefNo  implements java.io.Serializable {
    private java.lang.Long corpCode;

    private java.lang.String msisdn;

    private boolean notification;

    private java.lang.String recordName;

    private java.lang.String subscriberNo1;

    private java.lang.String subscriberNo2;

    public UpdateSavedInvoiceRequest() {
    }

    public UpdateSavedInvoiceRequest(
           com.turkcelltech.cpgw.ws.RequestHeader requestHeader,
           java.lang.String channelRefNo,
           java.lang.Long corpCode,
           java.lang.String msisdn,
           boolean notification,
           java.lang.String recordName,
           java.lang.String subscriberNo1,
           java.lang.String subscriberNo2) {
        super(
            requestHeader,
            channelRefNo);
        this.corpCode = corpCode;
        this.msisdn = msisdn;
        this.notification = notification;
        this.recordName = recordName;
        this.subscriberNo1 = subscriberNo1;
        this.subscriberNo2 = subscriberNo2;
    }


    /**
     * Gets the corpCode value for this UpdateSavedInvoiceRequest.
     * 
     * @return corpCode
     */
    public java.lang.Long getCorpCode() {
        return corpCode;
    }


    /**
     * Sets the corpCode value for this UpdateSavedInvoiceRequest.
     * 
     * @param corpCode
     */
    public void setCorpCode(java.lang.Long corpCode) {
        this.corpCode = corpCode;
    }


    /**
     * Gets the msisdn value for this UpdateSavedInvoiceRequest.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this UpdateSavedInvoiceRequest.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the notification value for this UpdateSavedInvoiceRequest.
     * 
     * @return notification
     */
    public boolean isNotification() {
        return notification;
    }


    /**
     * Sets the notification value for this UpdateSavedInvoiceRequest.
     * 
     * @param notification
     */
    public void setNotification(boolean notification) {
        this.notification = notification;
    }


    /**
     * Gets the recordName value for this UpdateSavedInvoiceRequest.
     * 
     * @return recordName
     */
    public java.lang.String getRecordName() {
        return recordName;
    }


    /**
     * Sets the recordName value for this UpdateSavedInvoiceRequest.
     * 
     * @param recordName
     */
    public void setRecordName(java.lang.String recordName) {
        this.recordName = recordName;
    }


    /**
     * Gets the subscriberNo1 value for this UpdateSavedInvoiceRequest.
     * 
     * @return subscriberNo1
     */
    public java.lang.String getSubscriberNo1() {
        return subscriberNo1;
    }


    /**
     * Sets the subscriberNo1 value for this UpdateSavedInvoiceRequest.
     * 
     * @param subscriberNo1
     */
    public void setSubscriberNo1(java.lang.String subscriberNo1) {
        this.subscriberNo1 = subscriberNo1;
    }


    /**
     * Gets the subscriberNo2 value for this UpdateSavedInvoiceRequest.
     * 
     * @return subscriberNo2
     */
    public java.lang.String getSubscriberNo2() {
        return subscriberNo2;
    }


    /**
     * Sets the subscriberNo2 value for this UpdateSavedInvoiceRequest.
     * 
     * @param subscriberNo2
     */
    public void setSubscriberNo2(java.lang.String subscriberNo2) {
        this.subscriberNo2 = subscriberNo2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateSavedInvoiceRequest)) return false;
        UpdateSavedInvoiceRequest other = (UpdateSavedInvoiceRequest) obj;
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
            this.notification == other.isNotification() &&
            ((this.recordName==null && other.getRecordName()==null) || 
             (this.recordName!=null &&
              this.recordName.equals(other.getRecordName()))) &&
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
        _hashCode += (isNotification() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getRecordName() != null) {
            _hashCode += getRecordName().hashCode();
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
        new org.apache.axis.description.TypeDesc(UpdateSavedInvoiceRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "updateSavedInvoiceRequest"));
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
        elemField.setFieldName("notification");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recordName"));
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
