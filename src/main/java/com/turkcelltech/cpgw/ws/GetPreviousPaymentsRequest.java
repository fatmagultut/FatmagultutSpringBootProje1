/**
 * GetPreviousPaymentsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class GetPreviousPaymentsRequest  extends com.turkcelltech.cpgw.ws.RequestType  implements java.io.Serializable {
    private java.lang.String msisdn;

    private java.lang.String paymentEndDate;

    private java.lang.String paymentStartDate;

    public GetPreviousPaymentsRequest() {
    }

    public GetPreviousPaymentsRequest(
           com.turkcelltech.cpgw.ws.RequestHeader requestHeader,
           java.lang.String msisdn,
           java.lang.String paymentEndDate,
           java.lang.String paymentStartDate) {
        super(
            requestHeader);
        this.msisdn = msisdn;
        this.paymentEndDate = paymentEndDate;
        this.paymentStartDate = paymentStartDate;
    }


    /**
     * Gets the msisdn value for this GetPreviousPaymentsRequest.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this GetPreviousPaymentsRequest.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the paymentEndDate value for this GetPreviousPaymentsRequest.
     * 
     * @return paymentEndDate
     */
    public java.lang.String getPaymentEndDate() {
        return paymentEndDate;
    }


    /**
     * Sets the paymentEndDate value for this GetPreviousPaymentsRequest.
     * 
     * @param paymentEndDate
     */
    public void setPaymentEndDate(java.lang.String paymentEndDate) {
        this.paymentEndDate = paymentEndDate;
    }


    /**
     * Gets the paymentStartDate value for this GetPreviousPaymentsRequest.
     * 
     * @return paymentStartDate
     */
    public java.lang.String getPaymentStartDate() {
        return paymentStartDate;
    }


    /**
     * Sets the paymentStartDate value for this GetPreviousPaymentsRequest.
     * 
     * @param paymentStartDate
     */
    public void setPaymentStartDate(java.lang.String paymentStartDate) {
        this.paymentStartDate = paymentStartDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPreviousPaymentsRequest)) return false;
        GetPreviousPaymentsRequest other = (GetPreviousPaymentsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.paymentEndDate==null && other.getPaymentEndDate()==null) || 
             (this.paymentEndDate!=null &&
              this.paymentEndDate.equals(other.getPaymentEndDate()))) &&
            ((this.paymentStartDate==null && other.getPaymentStartDate()==null) || 
             (this.paymentStartDate!=null &&
              this.paymentStartDate.equals(other.getPaymentStartDate())));
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
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getPaymentEndDate() != null) {
            _hashCode += getPaymentEndDate().hashCode();
        }
        if (getPaymentStartDate() != null) {
            _hashCode += getPaymentStartDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPreviousPaymentsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getPreviousPaymentsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentStartDate"));
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
