/**
 * CpgwGetPolicyStatusRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class CpgwGetPolicyStatusRequest  extends com.turkcelltech.cpgw.ws.RequestTypeWithChannelRefNo  implements java.io.Serializable {
    private java.lang.Long corpCode;

    private com.turkcelltech.cpgw.ws.GetPolicyStatusRequest policyStatusRequest;

    private java.lang.Long vendorId;

    public CpgwGetPolicyStatusRequest() {
    }

    public CpgwGetPolicyStatusRequest(
           com.turkcelltech.cpgw.ws.RequestHeader requestHeader,
           java.lang.String channelRefNo,
           java.lang.Long corpCode,
           com.turkcelltech.cpgw.ws.GetPolicyStatusRequest policyStatusRequest,
           java.lang.Long vendorId) {
        super(
            requestHeader,
            channelRefNo);
        this.corpCode = corpCode;
        this.policyStatusRequest = policyStatusRequest;
        this.vendorId = vendorId;
    }


    /**
     * Gets the corpCode value for this CpgwGetPolicyStatusRequest.
     * 
     * @return corpCode
     */
    public java.lang.Long getCorpCode() {
        return corpCode;
    }


    /**
     * Sets the corpCode value for this CpgwGetPolicyStatusRequest.
     * 
     * @param corpCode
     */
    public void setCorpCode(java.lang.Long corpCode) {
        this.corpCode = corpCode;
    }


    /**
     * Gets the policyStatusRequest value for this CpgwGetPolicyStatusRequest.
     * 
     * @return policyStatusRequest
     */
    public com.turkcelltech.cpgw.ws.GetPolicyStatusRequest getPolicyStatusRequest() {
        return policyStatusRequest;
    }


    /**
     * Sets the policyStatusRequest value for this CpgwGetPolicyStatusRequest.
     * 
     * @param policyStatusRequest
     */
    public void setPolicyStatusRequest(com.turkcelltech.cpgw.ws.GetPolicyStatusRequest policyStatusRequest) {
        this.policyStatusRequest = policyStatusRequest;
    }


    /**
     * Gets the vendorId value for this CpgwGetPolicyStatusRequest.
     * 
     * @return vendorId
     */
    public java.lang.Long getVendorId() {
        return vendorId;
    }


    /**
     * Sets the vendorId value for this CpgwGetPolicyStatusRequest.
     * 
     * @param vendorId
     */
    public void setVendorId(java.lang.Long vendorId) {
        this.vendorId = vendorId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CpgwGetPolicyStatusRequest)) return false;
        CpgwGetPolicyStatusRequest other = (CpgwGetPolicyStatusRequest) obj;
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
            ((this.policyStatusRequest==null && other.getPolicyStatusRequest()==null) || 
             (this.policyStatusRequest!=null &&
              this.policyStatusRequest.equals(other.getPolicyStatusRequest()))) &&
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
        if (getPolicyStatusRequest() != null) {
            _hashCode += getPolicyStatusRequest().hashCode();
        }
        if (getVendorId() != null) {
            _hashCode += getVendorId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CpgwGetPolicyStatusRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwGetPolicyStatusRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corpCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "corpCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyStatusRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("", "policyStatusRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getPolicyStatusRequest"));
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
