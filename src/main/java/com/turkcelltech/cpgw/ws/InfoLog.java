/**
 * InfoLog.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class InfoLog  extends com.turkcelltech.cpgw.ws.CpgwModel  implements java.io.Serializable {
    private java.lang.String commonTransactionId;

    private java.util.Calendar createDate;

    private java.lang.String createUser;

    private java.lang.Long id;

    private java.lang.Integer informationType;

    private java.lang.String messageBody;

    private java.lang.Long paymentId;

    private java.lang.String receiver;

    private java.lang.String result;

    private java.lang.String resultDesc;

    private java.lang.Integer retryCount;

    private java.util.Calendar sendDate;

    private java.lang.String sender;

    private java.lang.String senderText;

    private java.lang.Integer status;

    private java.lang.String transactionId;

    public InfoLog() {
    }

    public InfoLog(
           java.lang.String commonTransactionId,
           java.util.Calendar createDate,
           java.lang.String createUser,
           java.lang.Long id,
           java.lang.Integer informationType,
           java.lang.String messageBody,
           java.lang.Long paymentId,
           java.lang.String receiver,
           java.lang.String result,
           java.lang.String resultDesc,
           java.lang.Integer retryCount,
           java.util.Calendar sendDate,
           java.lang.String sender,
           java.lang.String senderText,
           java.lang.Integer status,
           java.lang.String transactionId) {
        this.commonTransactionId = commonTransactionId;
        this.createDate = createDate;
        this.createUser = createUser;
        this.id = id;
        this.informationType = informationType;
        this.messageBody = messageBody;
        this.paymentId = paymentId;
        this.receiver = receiver;
        this.result = result;
        this.resultDesc = resultDesc;
        this.retryCount = retryCount;
        this.sendDate = sendDate;
        this.sender = sender;
        this.senderText = senderText;
        this.status = status;
        this.transactionId = transactionId;
    }


    /**
     * Gets the commonTransactionId value for this InfoLog.
     * 
     * @return commonTransactionId
     */
    public java.lang.String getCommonTransactionId() {
        return commonTransactionId;
    }


    /**
     * Sets the commonTransactionId value for this InfoLog.
     * 
     * @param commonTransactionId
     */
    public void setCommonTransactionId(java.lang.String commonTransactionId) {
        this.commonTransactionId = commonTransactionId;
    }


    /**
     * Gets the createDate value for this InfoLog.
     * 
     * @return createDate
     */
    public java.util.Calendar getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this InfoLog.
     * 
     * @param createDate
     */
    public void setCreateDate(java.util.Calendar createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the createUser value for this InfoLog.
     * 
     * @return createUser
     */
    public java.lang.String getCreateUser() {
        return createUser;
    }


    /**
     * Sets the createUser value for this InfoLog.
     * 
     * @param createUser
     */
    public void setCreateUser(java.lang.String createUser) {
        this.createUser = createUser;
    }


    /**
     * Gets the id value for this InfoLog.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this InfoLog.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the informationType value for this InfoLog.
     * 
     * @return informationType
     */
    public java.lang.Integer getInformationType() {
        return informationType;
    }


    /**
     * Sets the informationType value for this InfoLog.
     * 
     * @param informationType
     */
    public void setInformationType(java.lang.Integer informationType) {
        this.informationType = informationType;
    }


    /**
     * Gets the messageBody value for this InfoLog.
     * 
     * @return messageBody
     */
    public java.lang.String getMessageBody() {
        return messageBody;
    }


    /**
     * Sets the messageBody value for this InfoLog.
     * 
     * @param messageBody
     */
    public void setMessageBody(java.lang.String messageBody) {
        this.messageBody = messageBody;
    }


    /**
     * Gets the paymentId value for this InfoLog.
     * 
     * @return paymentId
     */
    public java.lang.Long getPaymentId() {
        return paymentId;
    }


    /**
     * Sets the paymentId value for this InfoLog.
     * 
     * @param paymentId
     */
    public void setPaymentId(java.lang.Long paymentId) {
        this.paymentId = paymentId;
    }


    /**
     * Gets the receiver value for this InfoLog.
     * 
     * @return receiver
     */
    public java.lang.String getReceiver() {
        return receiver;
    }


    /**
     * Sets the receiver value for this InfoLog.
     * 
     * @param receiver
     */
    public void setReceiver(java.lang.String receiver) {
        this.receiver = receiver;
    }


    /**
     * Gets the result value for this InfoLog.
     * 
     * @return result
     */
    public java.lang.String getResult() {
        return result;
    }


    /**
     * Sets the result value for this InfoLog.
     * 
     * @param result
     */
    public void setResult(java.lang.String result) {
        this.result = result;
    }


    /**
     * Gets the resultDesc value for this InfoLog.
     * 
     * @return resultDesc
     */
    public java.lang.String getResultDesc() {
        return resultDesc;
    }


    /**
     * Sets the resultDesc value for this InfoLog.
     * 
     * @param resultDesc
     */
    public void setResultDesc(java.lang.String resultDesc) {
        this.resultDesc = resultDesc;
    }


    /**
     * Gets the retryCount value for this InfoLog.
     * 
     * @return retryCount
     */
    public java.lang.Integer getRetryCount() {
        return retryCount;
    }


    /**
     * Sets the retryCount value for this InfoLog.
     * 
     * @param retryCount
     */
    public void setRetryCount(java.lang.Integer retryCount) {
        this.retryCount = retryCount;
    }


    /**
     * Gets the sendDate value for this InfoLog.
     * 
     * @return sendDate
     */
    public java.util.Calendar getSendDate() {
        return sendDate;
    }


    /**
     * Sets the sendDate value for this InfoLog.
     * 
     * @param sendDate
     */
    public void setSendDate(java.util.Calendar sendDate) {
        this.sendDate = sendDate;
    }


    /**
     * Gets the sender value for this InfoLog.
     * 
     * @return sender
     */
    public java.lang.String getSender() {
        return sender;
    }


    /**
     * Sets the sender value for this InfoLog.
     * 
     * @param sender
     */
    public void setSender(java.lang.String sender) {
        this.sender = sender;
    }


    /**
     * Gets the senderText value for this InfoLog.
     * 
     * @return senderText
     */
    public java.lang.String getSenderText() {
        return senderText;
    }


    /**
     * Sets the senderText value for this InfoLog.
     * 
     * @param senderText
     */
    public void setSenderText(java.lang.String senderText) {
        this.senderText = senderText;
    }


    /**
     * Gets the status value for this InfoLog.
     * 
     * @return status
     */
    public java.lang.Integer getStatus() {
        return status;
    }


    /**
     * Sets the status value for this InfoLog.
     * 
     * @param status
     */
    public void setStatus(java.lang.Integer status) {
        this.status = status;
    }


    /**
     * Gets the transactionId value for this InfoLog.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this InfoLog.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InfoLog)) return false;
        InfoLog other = (InfoLog) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.commonTransactionId==null && other.getCommonTransactionId()==null) || 
             (this.commonTransactionId!=null &&
              this.commonTransactionId.equals(other.getCommonTransactionId()))) &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.createUser==null && other.getCreateUser()==null) || 
             (this.createUser!=null &&
              this.createUser.equals(other.getCreateUser()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.informationType==null && other.getInformationType()==null) || 
             (this.informationType!=null &&
              this.informationType.equals(other.getInformationType()))) &&
            ((this.messageBody==null && other.getMessageBody()==null) || 
             (this.messageBody!=null &&
              this.messageBody.equals(other.getMessageBody()))) &&
            ((this.paymentId==null && other.getPaymentId()==null) || 
             (this.paymentId!=null &&
              this.paymentId.equals(other.getPaymentId()))) &&
            ((this.receiver==null && other.getReceiver()==null) || 
             (this.receiver!=null &&
              this.receiver.equals(other.getReceiver()))) &&
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              this.result.equals(other.getResult()))) &&
            ((this.resultDesc==null && other.getResultDesc()==null) || 
             (this.resultDesc!=null &&
              this.resultDesc.equals(other.getResultDesc()))) &&
            ((this.retryCount==null && other.getRetryCount()==null) || 
             (this.retryCount!=null &&
              this.retryCount.equals(other.getRetryCount()))) &&
            ((this.sendDate==null && other.getSendDate()==null) || 
             (this.sendDate!=null &&
              this.sendDate.equals(other.getSendDate()))) &&
            ((this.sender==null && other.getSender()==null) || 
             (this.sender!=null &&
              this.sender.equals(other.getSender()))) &&
            ((this.senderText==null && other.getSenderText()==null) || 
             (this.senderText!=null &&
              this.senderText.equals(other.getSenderText()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId())));
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
        if (getCommonTransactionId() != null) {
            _hashCode += getCommonTransactionId().hashCode();
        }
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getCreateUser() != null) {
            _hashCode += getCreateUser().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getInformationType() != null) {
            _hashCode += getInformationType().hashCode();
        }
        if (getMessageBody() != null) {
            _hashCode += getMessageBody().hashCode();
        }
        if (getPaymentId() != null) {
            _hashCode += getPaymentId().hashCode();
        }
        if (getReceiver() != null) {
            _hashCode += getReceiver().hashCode();
        }
        if (getResult() != null) {
            _hashCode += getResult().hashCode();
        }
        if (getResultDesc() != null) {
            _hashCode += getResultDesc().hashCode();
        }
        if (getRetryCount() != null) {
            _hashCode += getRetryCount().hashCode();
        }
        if (getSendDate() != null) {
            _hashCode += getSendDate().hashCode();
        }
        if (getSender() != null) {
            _hashCode += getSender().hashCode();
        }
        if (getSenderText() != null) {
            _hashCode += getSenderText().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InfoLog.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "infoLog"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commonTransactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "commonTransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("informationType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "informationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageBody");
        elemField.setXmlName(new javax.xml.namespace.QName("", "messageBody"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("", "result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retryCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retryCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sendDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sender");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "senderText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionId"));
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
