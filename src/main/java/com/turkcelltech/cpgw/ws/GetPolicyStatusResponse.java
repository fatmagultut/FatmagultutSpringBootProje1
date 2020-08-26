/**
 * GetPolicyStatusResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class GetPolicyStatusResponse  implements java.io.Serializable {
    private java.lang.Double amount;

    private java.lang.String created;

    private java.lang.String currencyCode;

    private java.lang.String policyNumber;

    private java.lang.String proposalId;

    private java.lang.String transactionTypeCode;

    private java.lang.String vendorResultCode;

    private java.lang.String vendorResultDesc;

    private java.lang.String vendorTransactionId;

    public GetPolicyStatusResponse() {
    }

    public GetPolicyStatusResponse(
           java.lang.Double amount,
           java.lang.String created,
           java.lang.String currencyCode,
           java.lang.String policyNumber,
           java.lang.String proposalId,
           java.lang.String transactionTypeCode,
           java.lang.String vendorResultCode,
           java.lang.String vendorResultDesc,
           java.lang.String vendorTransactionId) {
           this.amount = amount;
           this.created = created;
           this.currencyCode = currencyCode;
           this.policyNumber = policyNumber;
           this.proposalId = proposalId;
           this.transactionTypeCode = transactionTypeCode;
           this.vendorResultCode = vendorResultCode;
           this.vendorResultDesc = vendorResultDesc;
           this.vendorTransactionId = vendorTransactionId;
    }


    /**
     * Gets the amount value for this GetPolicyStatusResponse.
     * 
     * @return amount
     */
    public java.lang.Double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this GetPolicyStatusResponse.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Double amount) {
        this.amount = amount;
    }


    /**
     * Gets the created value for this GetPolicyStatusResponse.
     * 
     * @return created
     */
    public java.lang.String getCreated() {
        return created;
    }


    /**
     * Sets the created value for this GetPolicyStatusResponse.
     * 
     * @param created
     */
    public void setCreated(java.lang.String created) {
        this.created = created;
    }


    /**
     * Gets the currencyCode value for this GetPolicyStatusResponse.
     * 
     * @return currencyCode
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this GetPolicyStatusResponse.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the policyNumber value for this GetPolicyStatusResponse.
     * 
     * @return policyNumber
     */
    public java.lang.String getPolicyNumber() {
        return policyNumber;
    }


    /**
     * Sets the policyNumber value for this GetPolicyStatusResponse.
     * 
     * @param policyNumber
     */
    public void setPolicyNumber(java.lang.String policyNumber) {
        this.policyNumber = policyNumber;
    }


    /**
     * Gets the proposalId value for this GetPolicyStatusResponse.
     * 
     * @return proposalId
     */
    public java.lang.String getProposalId() {
        return proposalId;
    }


    /**
     * Sets the proposalId value for this GetPolicyStatusResponse.
     * 
     * @param proposalId
     */
    public void setProposalId(java.lang.String proposalId) {
        this.proposalId = proposalId;
    }


    /**
     * Gets the transactionTypeCode value for this GetPolicyStatusResponse.
     * 
     * @return transactionTypeCode
     */
    public java.lang.String getTransactionTypeCode() {
        return transactionTypeCode;
    }


    /**
     * Sets the transactionTypeCode value for this GetPolicyStatusResponse.
     * 
     * @param transactionTypeCode
     */
    public void setTransactionTypeCode(java.lang.String transactionTypeCode) {
        this.transactionTypeCode = transactionTypeCode;
    }


    /**
     * Gets the vendorResultCode value for this GetPolicyStatusResponse.
     * 
     * @return vendorResultCode
     */
    public java.lang.String getVendorResultCode() {
        return vendorResultCode;
    }


    /**
     * Sets the vendorResultCode value for this GetPolicyStatusResponse.
     * 
     * @param vendorResultCode
     */
    public void setVendorResultCode(java.lang.String vendorResultCode) {
        this.vendorResultCode = vendorResultCode;
    }


    /**
     * Gets the vendorResultDesc value for this GetPolicyStatusResponse.
     * 
     * @return vendorResultDesc
     */
    public java.lang.String getVendorResultDesc() {
        return vendorResultDesc;
    }


    /**
     * Sets the vendorResultDesc value for this GetPolicyStatusResponse.
     * 
     * @param vendorResultDesc
     */
    public void setVendorResultDesc(java.lang.String vendorResultDesc) {
        this.vendorResultDesc = vendorResultDesc;
    }


    /**
     * Gets the vendorTransactionId value for this GetPolicyStatusResponse.
     * 
     * @return vendorTransactionId
     */
    public java.lang.String getVendorTransactionId() {
        return vendorTransactionId;
    }


    /**
     * Sets the vendorTransactionId value for this GetPolicyStatusResponse.
     * 
     * @param vendorTransactionId
     */
    public void setVendorTransactionId(java.lang.String vendorTransactionId) {
        this.vendorTransactionId = vendorTransactionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPolicyStatusResponse)) return false;
        GetPolicyStatusResponse other = (GetPolicyStatusResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode()))) &&
            ((this.policyNumber==null && other.getPolicyNumber()==null) || 
             (this.policyNumber!=null &&
              this.policyNumber.equals(other.getPolicyNumber()))) &&
            ((this.proposalId==null && other.getProposalId()==null) || 
             (this.proposalId!=null &&
              this.proposalId.equals(other.getProposalId()))) &&
            ((this.transactionTypeCode==null && other.getTransactionTypeCode()==null) || 
             (this.transactionTypeCode!=null &&
              this.transactionTypeCode.equals(other.getTransactionTypeCode()))) &&
            ((this.vendorResultCode==null && other.getVendorResultCode()==null) || 
             (this.vendorResultCode!=null &&
              this.vendorResultCode.equals(other.getVendorResultCode()))) &&
            ((this.vendorResultDesc==null && other.getVendorResultDesc()==null) || 
             (this.vendorResultDesc!=null &&
              this.vendorResultDesc.equals(other.getVendorResultDesc()))) &&
            ((this.vendorTransactionId==null && other.getVendorTransactionId()==null) || 
             (this.vendorTransactionId!=null &&
              this.vendorTransactionId.equals(other.getVendorTransactionId())));
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
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        if (getPolicyNumber() != null) {
            _hashCode += getPolicyNumber().hashCode();
        }
        if (getProposalId() != null) {
            _hashCode += getProposalId().hashCode();
        }
        if (getTransactionTypeCode() != null) {
            _hashCode += getTransactionTypeCode().hashCode();
        }
        if (getVendorResultCode() != null) {
            _hashCode += getVendorResultCode().hashCode();
        }
        if (getVendorResultDesc() != null) {
            _hashCode += getVendorResultDesc().hashCode();
        }
        if (getVendorTransactionId() != null) {
            _hashCode += getVendorTransactionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPolicyStatusResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getPolicyStatusResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("created");
        elemField.setXmlName(new javax.xml.namespace.QName("", "created"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionTypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorResultCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vendorResultCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorResultDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vendorResultDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorTransactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vendorTransactionId"));
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
