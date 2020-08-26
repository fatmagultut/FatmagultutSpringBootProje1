/**
 * GetPolicyStatusRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class GetPolicyStatusRequest  implements java.io.Serializable {
    private java.lang.Integer customerOid;

    private java.lang.String policyNumber;

    private java.lang.Integer proposalId;

    public GetPolicyStatusRequest() {
    }

    public GetPolicyStatusRequest(
           java.lang.Integer customerOid,
           java.lang.String policyNumber,
           java.lang.Integer proposalId) {
           this.customerOid = customerOid;
           this.policyNumber = policyNumber;
           this.proposalId = proposalId;
    }


    /**
     * Gets the customerOid value for this GetPolicyStatusRequest.
     * 
     * @return customerOid
     */
    public java.lang.Integer getCustomerOid() {
        return customerOid;
    }


    /**
     * Sets the customerOid value for this GetPolicyStatusRequest.
     * 
     * @param customerOid
     */
    public void setCustomerOid(java.lang.Integer customerOid) {
        this.customerOid = customerOid;
    }


    /**
     * Gets the policyNumber value for this GetPolicyStatusRequest.
     * 
     * @return policyNumber
     */
    public java.lang.String getPolicyNumber() {
        return policyNumber;
    }


    /**
     * Sets the policyNumber value for this GetPolicyStatusRequest.
     * 
     * @param policyNumber
     */
    public void setPolicyNumber(java.lang.String policyNumber) {
        this.policyNumber = policyNumber;
    }


    /**
     * Gets the proposalId value for this GetPolicyStatusRequest.
     * 
     * @return proposalId
     */
    public java.lang.Integer getProposalId() {
        return proposalId;
    }


    /**
     * Sets the proposalId value for this GetPolicyStatusRequest.
     * 
     * @param proposalId
     */
    public void setProposalId(java.lang.Integer proposalId) {
        this.proposalId = proposalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPolicyStatusRequest)) return false;
        GetPolicyStatusRequest other = (GetPolicyStatusRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customerOid==null && other.getCustomerOid()==null) || 
             (this.customerOid!=null &&
              this.customerOid.equals(other.getCustomerOid()))) &&
            ((this.policyNumber==null && other.getPolicyNumber()==null) || 
             (this.policyNumber!=null &&
              this.policyNumber.equals(other.getPolicyNumber()))) &&
            ((this.proposalId==null && other.getProposalId()==null) || 
             (this.proposalId!=null &&
              this.proposalId.equals(other.getProposalId())));
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
        if (getCustomerOid() != null) {
            _hashCode += getCustomerOid().hashCode();
        }
        if (getPolicyNumber() != null) {
            _hashCode += getPolicyNumber().hashCode();
        }
        if (getProposalId() != null) {
            _hashCode += getProposalId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPolicyStatusRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getPolicyStatusRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerOid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerOid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "policyNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proposalId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "proposalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
