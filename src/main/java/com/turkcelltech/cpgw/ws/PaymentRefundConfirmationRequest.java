/**
 * PaymentRefundConfirmationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class PaymentRefundConfirmationRequest  extends com.turkcelltech.cpgw.ws.RequestType  implements java.io.Serializable {
    private java.lang.String approvalDesc;

    private java.lang.String approverUser;

    private com.turkcelltech.cpgw.ws.ConfirmationEnum confirmation;

    private java.lang.Long paymentRefundId;

    public PaymentRefundConfirmationRequest() {
    }

    public PaymentRefundConfirmationRequest(
           com.turkcelltech.cpgw.ws.RequestHeader requestHeader,
           java.lang.String approvalDesc,
           java.lang.String approverUser,
           com.turkcelltech.cpgw.ws.ConfirmationEnum confirmation,
           java.lang.Long paymentRefundId) {
        super(
            requestHeader);
        this.approvalDesc = approvalDesc;
        this.approverUser = approverUser;
        this.confirmation = confirmation;
        this.paymentRefundId = paymentRefundId;
    }


    /**
     * Gets the approvalDesc value for this PaymentRefundConfirmationRequest.
     * 
     * @return approvalDesc
     */
    public java.lang.String getApprovalDesc() {
        return approvalDesc;
    }


    /**
     * Sets the approvalDesc value for this PaymentRefundConfirmationRequest.
     * 
     * @param approvalDesc
     */
    public void setApprovalDesc(java.lang.String approvalDesc) {
        this.approvalDesc = approvalDesc;
    }


    /**
     * Gets the approverUser value for this PaymentRefundConfirmationRequest.
     * 
     * @return approverUser
     */
    public java.lang.String getApproverUser() {
        return approverUser;
    }


    /**
     * Sets the approverUser value for this PaymentRefundConfirmationRequest.
     * 
     * @param approverUser
     */
    public void setApproverUser(java.lang.String approverUser) {
        this.approverUser = approverUser;
    }


    /**
     * Gets the confirmation value for this PaymentRefundConfirmationRequest.
     * 
     * @return confirmation
     */
    public com.turkcelltech.cpgw.ws.ConfirmationEnum getConfirmation() {
        return confirmation;
    }


    /**
     * Sets the confirmation value for this PaymentRefundConfirmationRequest.
     * 
     * @param confirmation
     */
    public void setConfirmation(com.turkcelltech.cpgw.ws.ConfirmationEnum confirmation) {
        this.confirmation = confirmation;
    }


    /**
     * Gets the paymentRefundId value for this PaymentRefundConfirmationRequest.
     * 
     * @return paymentRefundId
     */
    public java.lang.Long getPaymentRefundId() {
        return paymentRefundId;
    }


    /**
     * Sets the paymentRefundId value for this PaymentRefundConfirmationRequest.
     * 
     * @param paymentRefundId
     */
    public void setPaymentRefundId(java.lang.Long paymentRefundId) {
        this.paymentRefundId = paymentRefundId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentRefundConfirmationRequest)) return false;
        PaymentRefundConfirmationRequest other = (PaymentRefundConfirmationRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.approvalDesc==null && other.getApprovalDesc()==null) || 
             (this.approvalDesc!=null &&
              this.approvalDesc.equals(other.getApprovalDesc()))) &&
            ((this.approverUser==null && other.getApproverUser()==null) || 
             (this.approverUser!=null &&
              this.approverUser.equals(other.getApproverUser()))) &&
            ((this.confirmation==null && other.getConfirmation()==null) || 
             (this.confirmation!=null &&
              this.confirmation.equals(other.getConfirmation()))) &&
            ((this.paymentRefundId==null && other.getPaymentRefundId()==null) || 
             (this.paymentRefundId!=null &&
              this.paymentRefundId.equals(other.getPaymentRefundId())));
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
        if (getApprovalDesc() != null) {
            _hashCode += getApprovalDesc().hashCode();
        }
        if (getApproverUser() != null) {
            _hashCode += getApproverUser().hashCode();
        }
        if (getConfirmation() != null) {
            _hashCode += getConfirmation().hashCode();
        }
        if (getPaymentRefundId() != null) {
            _hashCode += getPaymentRefundId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentRefundConfirmationRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "paymentRefundConfirmationRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "approvalDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approverUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "approverUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confirmation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "confirmation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "confirmationEnum"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentRefundId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentRefundId"));
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
