/**
 * PaymentInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class PaymentInfo  extends com.turkcelltech.cpgw.ws.CpgwModel  implements java.io.Serializable {
    private java.math.BigDecimal partialPaymentAmount;

    private com.turkcelltech.cpgw.ws.CustomerPaymentMethodEnum custPaymentMethod;

    private java.lang.String paymentMethodId;

    private java.lang.String token;

    private com.turkcelltech.cpgw.ws.OkcBankInfo okcInfo;

    private java.lang.String threeDSessionId;

    private com.turkcelltech.cpgw.ws.PaymentOperationEnum paymentOperation;

    private java.lang.Integer templateId;

    private java.lang.String aNumber;

    private java.lang.String aNumberType;

    private java.lang.String aNumberSubType;

    private java.lang.String terminalId;

    private java.lang.String authCode;

    private java.lang.String rrn;

    private java.lang.String issuerBankEftCode;

    private java.lang.String acquirerBankEftCode;

    private java.lang.String ccBinValue;

    private java.lang.String orderId;

    private java.lang.String vendorResult;

    public PaymentInfo() {
    }

    public PaymentInfo(
           java.math.BigDecimal partialPaymentAmount,
           com.turkcelltech.cpgw.ws.CustomerPaymentMethodEnum custPaymentMethod,
           java.lang.String paymentMethodId,
           java.lang.String token,
           com.turkcelltech.cpgw.ws.OkcBankInfo okcInfo,
           java.lang.String threeDSessionId,
           com.turkcelltech.cpgw.ws.PaymentOperationEnum paymentOperation,
           java.lang.Integer templateId,
           java.lang.String aNumber,
           java.lang.String aNumberType,
           java.lang.String aNumberSubType,
           java.lang.String terminalId,
           java.lang.String authCode,
           java.lang.String rrn,
           java.lang.String issuerBankEftCode,
           java.lang.String acquirerBankEftCode,
           java.lang.String ccBinValue,
           java.lang.String orderId,
           java.lang.String vendorResult) {
        this.partialPaymentAmount = partialPaymentAmount;
        this.custPaymentMethod = custPaymentMethod;
        this.paymentMethodId = paymentMethodId;
        this.token = token;
        this.okcInfo = okcInfo;
        this.threeDSessionId = threeDSessionId;
        this.paymentOperation = paymentOperation;
        this.templateId = templateId;
        this.aNumber = aNumber;
        this.aNumberType = aNumberType;
        this.aNumberSubType = aNumberSubType;
        this.terminalId = terminalId;
        this.authCode = authCode;
        this.rrn = rrn;
        this.issuerBankEftCode = issuerBankEftCode;
        this.acquirerBankEftCode = acquirerBankEftCode;
        this.ccBinValue = ccBinValue;
        this.orderId = orderId;
        this.vendorResult = vendorResult;
    }


    /**
     * Gets the partialPaymentAmount value for this PaymentInfo.
     * 
     * @return partialPaymentAmount
     */
    public java.math.BigDecimal getPartialPaymentAmount() {
        return partialPaymentAmount;
    }


    /**
     * Sets the partialPaymentAmount value for this PaymentInfo.
     * 
     * @param partialPaymentAmount
     */
    public void setPartialPaymentAmount(java.math.BigDecimal partialPaymentAmount) {
        this.partialPaymentAmount = partialPaymentAmount;
    }


    /**
     * Gets the custPaymentMethod value for this PaymentInfo.
     * 
     * @return custPaymentMethod
     */
    public com.turkcelltech.cpgw.ws.CustomerPaymentMethodEnum getCustPaymentMethod() {
        return custPaymentMethod;
    }


    /**
     * Sets the custPaymentMethod value for this PaymentInfo.
     * 
     * @param custPaymentMethod
     */
    public void setCustPaymentMethod(com.turkcelltech.cpgw.ws.CustomerPaymentMethodEnum custPaymentMethod) {
        this.custPaymentMethod = custPaymentMethod;
    }


    /**
     * Gets the paymentMethodId value for this PaymentInfo.
     * 
     * @return paymentMethodId
     */
    public java.lang.String getPaymentMethodId() {
        return paymentMethodId;
    }


    /**
     * Sets the paymentMethodId value for this PaymentInfo.
     * 
     * @param paymentMethodId
     */
    public void setPaymentMethodId(java.lang.String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }


    /**
     * Gets the token value for this PaymentInfo.
     * 
     * @return token
     */
    public java.lang.String getToken() {
        return token;
    }


    /**
     * Sets the token value for this PaymentInfo.
     * 
     * @param token
     */
    public void setToken(java.lang.String token) {
        this.token = token;
    }


    /**
     * Gets the okcInfo value for this PaymentInfo.
     * 
     * @return okcInfo
     */
    public com.turkcelltech.cpgw.ws.OkcBankInfo getOkcInfo() {
        return okcInfo;
    }


    /**
     * Sets the okcInfo value for this PaymentInfo.
     * 
     * @param okcInfo
     */
    public void setOkcInfo(com.turkcelltech.cpgw.ws.OkcBankInfo okcInfo) {
        this.okcInfo = okcInfo;
    }


    /**
     * Gets the threeDSessionId value for this PaymentInfo.
     * 
     * @return threeDSessionId
     */
    public java.lang.String getThreeDSessionId() {
        return threeDSessionId;
    }


    /**
     * Sets the threeDSessionId value for this PaymentInfo.
     * 
     * @param threeDSessionId
     */
    public void setThreeDSessionId(java.lang.String threeDSessionId) {
        this.threeDSessionId = threeDSessionId;
    }


    /**
     * Gets the paymentOperation value for this PaymentInfo.
     * 
     * @return paymentOperation
     */
    public com.turkcelltech.cpgw.ws.PaymentOperationEnum getPaymentOperation() {
        return paymentOperation;
    }


    /**
     * Sets the paymentOperation value for this PaymentInfo.
     * 
     * @param paymentOperation
     */
    public void setPaymentOperation(com.turkcelltech.cpgw.ws.PaymentOperationEnum paymentOperation) {
        this.paymentOperation = paymentOperation;
    }


    /**
     * Gets the templateId value for this PaymentInfo.
     * 
     * @return templateId
     */
    public java.lang.Integer getTemplateId() {
        return templateId;
    }


    /**
     * Sets the templateId value for this PaymentInfo.
     * 
     * @param templateId
     */
    public void setTemplateId(java.lang.Integer templateId) {
        this.templateId = templateId;
    }


    /**
     * Gets the aNumber value for this PaymentInfo.
     * 
     * @return aNumber
     */
    public java.lang.String getANumber() {
        return aNumber;
    }


    /**
     * Sets the aNumber value for this PaymentInfo.
     * 
     * @param aNumber
     */
    public void setANumber(java.lang.String aNumber) {
        this.aNumber = aNumber;
    }


    /**
     * Gets the aNumberType value for this PaymentInfo.
     * 
     * @return aNumberType
     */
    public java.lang.String getANumberType() {
        return aNumberType;
    }


    /**
     * Sets the aNumberType value for this PaymentInfo.
     * 
     * @param aNumberType
     */
    public void setANumberType(java.lang.String aNumberType) {
        this.aNumberType = aNumberType;
    }


    /**
     * Gets the aNumberSubType value for this PaymentInfo.
     * 
     * @return aNumberSubType
     */
    public java.lang.String getANumberSubType() {
        return aNumberSubType;
    }


    /**
     * Sets the aNumberSubType value for this PaymentInfo.
     * 
     * @param aNumberSubType
     */
    public void setANumberSubType(java.lang.String aNumberSubType) {
        this.aNumberSubType = aNumberSubType;
    }


    /**
     * Gets the terminalId value for this PaymentInfo.
     * 
     * @return terminalId
     */
    public java.lang.String getTerminalId() {
        return terminalId;
    }


    /**
     * Sets the terminalId value for this PaymentInfo.
     * 
     * @param terminalId
     */
    public void setTerminalId(java.lang.String terminalId) {
        this.terminalId = terminalId;
    }


    /**
     * Gets the authCode value for this PaymentInfo.
     * 
     * @return authCode
     */
    public java.lang.String getAuthCode() {
        return authCode;
    }


    /**
     * Sets the authCode value for this PaymentInfo.
     * 
     * @param authCode
     */
    public void setAuthCode(java.lang.String authCode) {
        this.authCode = authCode;
    }


    /**
     * Gets the rrn value for this PaymentInfo.
     * 
     * @return rrn
     */
    public java.lang.String getRrn() {
        return rrn;
    }


    /**
     * Sets the rrn value for this PaymentInfo.
     * 
     * @param rrn
     */
    public void setRrn(java.lang.String rrn) {
        this.rrn = rrn;
    }


    /**
     * Gets the issuerBankEftCode value for this PaymentInfo.
     * 
     * @return issuerBankEftCode
     */
    public java.lang.String getIssuerBankEftCode() {
        return issuerBankEftCode;
    }


    /**
     * Sets the issuerBankEftCode value for this PaymentInfo.
     * 
     * @param issuerBankEftCode
     */
    public void setIssuerBankEftCode(java.lang.String issuerBankEftCode) {
        this.issuerBankEftCode = issuerBankEftCode;
    }


    /**
     * Gets the acquirerBankEftCode value for this PaymentInfo.
     * 
     * @return acquirerBankEftCode
     */
    public java.lang.String getAcquirerBankEftCode() {
        return acquirerBankEftCode;
    }


    /**
     * Sets the acquirerBankEftCode value for this PaymentInfo.
     * 
     * @param acquirerBankEftCode
     */
    public void setAcquirerBankEftCode(java.lang.String acquirerBankEftCode) {
        this.acquirerBankEftCode = acquirerBankEftCode;
    }


    /**
     * Gets the ccBinValue value for this PaymentInfo.
     * 
     * @return ccBinValue
     */
    public java.lang.String getCcBinValue() {
        return ccBinValue;
    }


    /**
     * Sets the ccBinValue value for this PaymentInfo.
     * 
     * @param ccBinValue
     */
    public void setCcBinValue(java.lang.String ccBinValue) {
        this.ccBinValue = ccBinValue;
    }


    /**
     * Gets the orderId value for this PaymentInfo.
     * 
     * @return orderId
     */
    public java.lang.String getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this PaymentInfo.
     * 
     * @param orderId
     */
    public void setOrderId(java.lang.String orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the vendorResult value for this PaymentInfo.
     * 
     * @return vendorResult
     */
    public java.lang.String getVendorResult() {
        return vendorResult;
    }


    /**
     * Sets the vendorResult value for this PaymentInfo.
     * 
     * @param vendorResult
     */
    public void setVendorResult(java.lang.String vendorResult) {
        this.vendorResult = vendorResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentInfo)) return false;
        PaymentInfo other = (PaymentInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.partialPaymentAmount==null && other.getPartialPaymentAmount()==null) || 
             (this.partialPaymentAmount!=null &&
              this.partialPaymentAmount.equals(other.getPartialPaymentAmount()))) &&
            ((this.custPaymentMethod==null && other.getCustPaymentMethod()==null) || 
             (this.custPaymentMethod!=null &&
              this.custPaymentMethod.equals(other.getCustPaymentMethod()))) &&
            ((this.paymentMethodId==null && other.getPaymentMethodId()==null) || 
             (this.paymentMethodId!=null &&
              this.paymentMethodId.equals(other.getPaymentMethodId()))) &&
            ((this.token==null && other.getToken()==null) || 
             (this.token!=null &&
              this.token.equals(other.getToken()))) &&
            ((this.okcInfo==null && other.getOkcInfo()==null) || 
             (this.okcInfo!=null &&
              this.okcInfo.equals(other.getOkcInfo()))) &&
            ((this.threeDSessionId==null && other.getThreeDSessionId()==null) || 
             (this.threeDSessionId!=null &&
              this.threeDSessionId.equals(other.getThreeDSessionId()))) &&
            ((this.paymentOperation==null && other.getPaymentOperation()==null) || 
             (this.paymentOperation!=null &&
              this.paymentOperation.equals(other.getPaymentOperation()))) &&
            ((this.templateId==null && other.getTemplateId()==null) || 
             (this.templateId!=null &&
              this.templateId.equals(other.getTemplateId()))) &&
            ((this.aNumber==null && other.getANumber()==null) || 
             (this.aNumber!=null &&
              this.aNumber.equals(other.getANumber()))) &&
            ((this.aNumberType==null && other.getANumberType()==null) || 
             (this.aNumberType!=null &&
              this.aNumberType.equals(other.getANumberType()))) &&
            ((this.aNumberSubType==null && other.getANumberSubType()==null) || 
             (this.aNumberSubType!=null &&
              this.aNumberSubType.equals(other.getANumberSubType()))) &&
            ((this.terminalId==null && other.getTerminalId()==null) || 
             (this.terminalId!=null &&
              this.terminalId.equals(other.getTerminalId()))) &&
            ((this.authCode==null && other.getAuthCode()==null) || 
             (this.authCode!=null &&
              this.authCode.equals(other.getAuthCode()))) &&
            ((this.rrn==null && other.getRrn()==null) || 
             (this.rrn!=null &&
              this.rrn.equals(other.getRrn()))) &&
            ((this.issuerBankEftCode==null && other.getIssuerBankEftCode()==null) || 
             (this.issuerBankEftCode!=null &&
              this.issuerBankEftCode.equals(other.getIssuerBankEftCode()))) &&
            ((this.acquirerBankEftCode==null && other.getAcquirerBankEftCode()==null) || 
             (this.acquirerBankEftCode!=null &&
              this.acquirerBankEftCode.equals(other.getAcquirerBankEftCode()))) &&
            ((this.ccBinValue==null && other.getCcBinValue()==null) || 
             (this.ccBinValue!=null &&
              this.ccBinValue.equals(other.getCcBinValue()))) &&
            ((this.orderId==null && other.getOrderId()==null) || 
             (this.orderId!=null &&
              this.orderId.equals(other.getOrderId()))) &&
            ((this.vendorResult==null && other.getVendorResult()==null) || 
             (this.vendorResult!=null &&
              this.vendorResult.equals(other.getVendorResult())));
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
        if (getPartialPaymentAmount() != null) {
            _hashCode += getPartialPaymentAmount().hashCode();
        }
        if (getCustPaymentMethod() != null) {
            _hashCode += getCustPaymentMethod().hashCode();
        }
        if (getPaymentMethodId() != null) {
            _hashCode += getPaymentMethodId().hashCode();
        }
        if (getToken() != null) {
            _hashCode += getToken().hashCode();
        }
        if (getOkcInfo() != null) {
            _hashCode += getOkcInfo().hashCode();
        }
        if (getThreeDSessionId() != null) {
            _hashCode += getThreeDSessionId().hashCode();
        }
        if (getPaymentOperation() != null) {
            _hashCode += getPaymentOperation().hashCode();
        }
        if (getTemplateId() != null) {
            _hashCode += getTemplateId().hashCode();
        }
        if (getANumber() != null) {
            _hashCode += getANumber().hashCode();
        }
        if (getANumberType() != null) {
            _hashCode += getANumberType().hashCode();
        }
        if (getANumberSubType() != null) {
            _hashCode += getANumberSubType().hashCode();
        }
        if (getTerminalId() != null) {
            _hashCode += getTerminalId().hashCode();
        }
        if (getAuthCode() != null) {
            _hashCode += getAuthCode().hashCode();
        }
        if (getRrn() != null) {
            _hashCode += getRrn().hashCode();
        }
        if (getIssuerBankEftCode() != null) {
            _hashCode += getIssuerBankEftCode().hashCode();
        }
        if (getAcquirerBankEftCode() != null) {
            _hashCode += getAcquirerBankEftCode().hashCode();
        }
        if (getCcBinValue() != null) {
            _hashCode += getCcBinValue().hashCode();
        }
        if (getOrderId() != null) {
            _hashCode += getOrderId().hashCode();
        }
        if (getVendorResult() != null) {
            _hashCode += getVendorResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "paymentInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partialPaymentAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partialPaymentAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custPaymentMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "custPaymentMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "customerPaymentMethodEnum"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethodId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentMethodId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("token");
        elemField.setXmlName(new javax.xml.namespace.QName("", "token"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("okcInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "okcInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "okcBankInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("threeDSessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "threeDSessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentOperation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentOperation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "paymentOperationEnum"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "templateId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ANumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ANumberType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aNumberType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ANumberSubType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aNumberSubType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terminalId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "terminalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rrn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rrn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issuerBankEftCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "issuerBankEftCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acquirerBankEftCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acquirerBankEftCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccBinValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ccBinValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorResult");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vendorResult"));
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
