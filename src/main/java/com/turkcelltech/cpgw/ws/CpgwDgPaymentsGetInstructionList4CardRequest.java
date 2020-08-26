/**
 * CpgwDgPaymentsGetInstructionList4CardRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class CpgwDgPaymentsGetInstructionList4CardRequest  extends com.turkcelltech.cpgw.ws.RequestTypeWithChannelRefNo  implements java.io.Serializable {
    private java.lang.Long corpCode;

    private com.turkcelltech.cpgw.ws.DgPaymentsInstList4CardRequest dgPaymentsInstList4CardRequest;

    private java.lang.String msisdn;

    private java.lang.Long vendorId;

    public CpgwDgPaymentsGetInstructionList4CardRequest() {
    }

    public CpgwDgPaymentsGetInstructionList4CardRequest(
           com.turkcelltech.cpgw.ws.RequestHeader requestHeader,
           java.lang.String channelRefNo,
           java.lang.Long corpCode,
           com.turkcelltech.cpgw.ws.DgPaymentsInstList4CardRequest dgPaymentsInstList4CardRequest,
           java.lang.String msisdn,
           java.lang.Long vendorId) {
        super(
            requestHeader,
            channelRefNo);
        this.corpCode = corpCode;
        this.dgPaymentsInstList4CardRequest = dgPaymentsInstList4CardRequest;
        this.msisdn = msisdn;
        this.vendorId = vendorId;
    }


    /**
     * Gets the corpCode value for this CpgwDgPaymentsGetInstructionList4CardRequest.
     * 
     * @return corpCode
     */
    public java.lang.Long getCorpCode() {
        return corpCode;
    }


    /**
     * Sets the corpCode value for this CpgwDgPaymentsGetInstructionList4CardRequest.
     * 
     * @param corpCode
     */
    public void setCorpCode(java.lang.Long corpCode) {
        this.corpCode = corpCode;
    }


    /**
     * Gets the dgPaymentsInstList4CardRequest value for this CpgwDgPaymentsGetInstructionList4CardRequest.
     * 
     * @return dgPaymentsInstList4CardRequest
     */
    public com.turkcelltech.cpgw.ws.DgPaymentsInstList4CardRequest getDgPaymentsInstList4CardRequest() {
        return dgPaymentsInstList4CardRequest;
    }


    /**
     * Sets the dgPaymentsInstList4CardRequest value for this CpgwDgPaymentsGetInstructionList4CardRequest.
     * 
     * @param dgPaymentsInstList4CardRequest
     */
    public void setDgPaymentsInstList4CardRequest(com.turkcelltech.cpgw.ws.DgPaymentsInstList4CardRequest dgPaymentsInstList4CardRequest) {
        this.dgPaymentsInstList4CardRequest = dgPaymentsInstList4CardRequest;
    }


    /**
     * Gets the msisdn value for this CpgwDgPaymentsGetInstructionList4CardRequest.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this CpgwDgPaymentsGetInstructionList4CardRequest.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the vendorId value for this CpgwDgPaymentsGetInstructionList4CardRequest.
     * 
     * @return vendorId
     */
    public java.lang.Long getVendorId() {
        return vendorId;
    }


    /**
     * Sets the vendorId value for this CpgwDgPaymentsGetInstructionList4CardRequest.
     * 
     * @param vendorId
     */
    public void setVendorId(java.lang.Long vendorId) {
        this.vendorId = vendorId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CpgwDgPaymentsGetInstructionList4CardRequest)) return false;
        CpgwDgPaymentsGetInstructionList4CardRequest other = (CpgwDgPaymentsGetInstructionList4CardRequest) obj;
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
            ((this.dgPaymentsInstList4CardRequest==null && other.getDgPaymentsInstList4CardRequest()==null) || 
             (this.dgPaymentsInstList4CardRequest!=null &&
              this.dgPaymentsInstList4CardRequest.equals(other.getDgPaymentsInstList4CardRequest()))) &&
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.vendorId==null && other.getVendorId()==null) || 
             (this.vendorId!=null &&
              this.vendorId.equals(other.getVendorId())));
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
        if (getDgPaymentsInstList4CardRequest() != null) {
            _hashCode += getDgPaymentsInstList4CardRequest().hashCode();
        }
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getVendorId() != null) {
            _hashCode += getVendorId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CpgwDgPaymentsGetInstructionList4CardRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwDgPaymentsGetInstructionList4CardRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corpCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "corpCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dgPaymentsInstList4CardRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dgPaymentsInstList4CardRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "dgPaymentsInstList4CardRequest"));
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
        elemField.setFieldName("vendorId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vendorId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
