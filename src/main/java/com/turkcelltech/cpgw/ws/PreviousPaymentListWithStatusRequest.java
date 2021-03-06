/**
 * PreviousPaymentListWithStatusRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class PreviousPaymentListWithStatusRequest  extends com.turkcelltech.cpgw.ws.RequestType  implements java.io.Serializable {
    private java.lang.String branchId;

    private java.lang.String[] channelList;

    private java.lang.Long corpCode;

    private java.lang.String invoiceNo;

    private java.lang.String msisdn;

    private java.lang.String orderId;

    private java.lang.String paymentEndDate;

    private java.lang.String paymentStartDate;

    private java.lang.String subscriberNo;

    public PreviousPaymentListWithStatusRequest() {
    }

    public PreviousPaymentListWithStatusRequest(
           com.turkcelltech.cpgw.ws.RequestHeader requestHeader,
           java.lang.String branchId,
           java.lang.String[] channelList,
           java.lang.Long corpCode,
           java.lang.String invoiceNo,
           java.lang.String msisdn,
           java.lang.String orderId,
           java.lang.String paymentEndDate,
           java.lang.String paymentStartDate,
           java.lang.String subscriberNo) {
        super(
            requestHeader);
        this.branchId = branchId;
        this.channelList = channelList;
        this.corpCode = corpCode;
        this.invoiceNo = invoiceNo;
        this.msisdn = msisdn;
        this.orderId = orderId;
        this.paymentEndDate = paymentEndDate;
        this.paymentStartDate = paymentStartDate;
        this.subscriberNo = subscriberNo;
    }


    /**
     * Gets the branchId value for this PreviousPaymentListWithStatusRequest.
     * 
     * @return branchId
     */
    public java.lang.String getBranchId() {
        return branchId;
    }


    /**
     * Sets the branchId value for this PreviousPaymentListWithStatusRequest.
     * 
     * @param branchId
     */
    public void setBranchId(java.lang.String branchId) {
        this.branchId = branchId;
    }


    /**
     * Gets the channelList value for this PreviousPaymentListWithStatusRequest.
     * 
     * @return channelList
     */
    public java.lang.String[] getChannelList() {
        return channelList;
    }


    /**
     * Sets the channelList value for this PreviousPaymentListWithStatusRequest.
     * 
     * @param channelList
     */
    public void setChannelList(java.lang.String[] channelList) {
        this.channelList = channelList;
    }

    public java.lang.String getChannelList(int i) {
        return this.channelList[i];
    }

    public void setChannelList(int i, java.lang.String _value) {
        this.channelList[i] = _value;
    }


    /**
     * Gets the corpCode value for this PreviousPaymentListWithStatusRequest.
     * 
     * @return corpCode
     */
    public java.lang.Long getCorpCode() {
        return corpCode;
    }


    /**
     * Sets the corpCode value for this PreviousPaymentListWithStatusRequest.
     * 
     * @param corpCode
     */
    public void setCorpCode(java.lang.Long corpCode) {
        this.corpCode = corpCode;
    }


    /**
     * Gets the invoiceNo value for this PreviousPaymentListWithStatusRequest.
     * 
     * @return invoiceNo
     */
    public java.lang.String getInvoiceNo() {
        return invoiceNo;
    }


    /**
     * Sets the invoiceNo value for this PreviousPaymentListWithStatusRequest.
     * 
     * @param invoiceNo
     */
    public void setInvoiceNo(java.lang.String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }


    /**
     * Gets the msisdn value for this PreviousPaymentListWithStatusRequest.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this PreviousPaymentListWithStatusRequest.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the orderId value for this PreviousPaymentListWithStatusRequest.
     * 
     * @return orderId
     */
    public java.lang.String getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this PreviousPaymentListWithStatusRequest.
     * 
     * @param orderId
     */
    public void setOrderId(java.lang.String orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the paymentEndDate value for this PreviousPaymentListWithStatusRequest.
     * 
     * @return paymentEndDate
     */
    public java.lang.String getPaymentEndDate() {
        return paymentEndDate;
    }


    /**
     * Sets the paymentEndDate value for this PreviousPaymentListWithStatusRequest.
     * 
     * @param paymentEndDate
     */
    public void setPaymentEndDate(java.lang.String paymentEndDate) {
        this.paymentEndDate = paymentEndDate;
    }


    /**
     * Gets the paymentStartDate value for this PreviousPaymentListWithStatusRequest.
     * 
     * @return paymentStartDate
     */
    public java.lang.String getPaymentStartDate() {
        return paymentStartDate;
    }


    /**
     * Sets the paymentStartDate value for this PreviousPaymentListWithStatusRequest.
     * 
     * @param paymentStartDate
     */
    public void setPaymentStartDate(java.lang.String paymentStartDate) {
        this.paymentStartDate = paymentStartDate;
    }


    /**
     * Gets the subscriberNo value for this PreviousPaymentListWithStatusRequest.
     * 
     * @return subscriberNo
     */
    public java.lang.String getSubscriberNo() {
        return subscriberNo;
    }


    /**
     * Sets the subscriberNo value for this PreviousPaymentListWithStatusRequest.
     * 
     * @param subscriberNo
     */
    public void setSubscriberNo(java.lang.String subscriberNo) {
        this.subscriberNo = subscriberNo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PreviousPaymentListWithStatusRequest)) return false;
        PreviousPaymentListWithStatusRequest other = (PreviousPaymentListWithStatusRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.branchId==null && other.getBranchId()==null) || 
             (this.branchId!=null &&
              this.branchId.equals(other.getBranchId()))) &&
            ((this.channelList==null && other.getChannelList()==null) || 
             (this.channelList!=null &&
              java.util.Arrays.equals(this.channelList, other.getChannelList()))) &&
            ((this.corpCode==null && other.getCorpCode()==null) || 
             (this.corpCode!=null &&
              this.corpCode.equals(other.getCorpCode()))) &&
            ((this.invoiceNo==null && other.getInvoiceNo()==null) || 
             (this.invoiceNo!=null &&
              this.invoiceNo.equals(other.getInvoiceNo()))) &&
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.orderId==null && other.getOrderId()==null) || 
             (this.orderId!=null &&
              this.orderId.equals(other.getOrderId()))) &&
            ((this.paymentEndDate==null && other.getPaymentEndDate()==null) || 
             (this.paymentEndDate!=null &&
              this.paymentEndDate.equals(other.getPaymentEndDate()))) &&
            ((this.paymentStartDate==null && other.getPaymentStartDate()==null) || 
             (this.paymentStartDate!=null &&
              this.paymentStartDate.equals(other.getPaymentStartDate()))) &&
            ((this.subscriberNo==null && other.getSubscriberNo()==null) || 
             (this.subscriberNo!=null &&
              this.subscriberNo.equals(other.getSubscriberNo())));
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
        if (getBranchId() != null) {
            _hashCode += getBranchId().hashCode();
        }
        if (getChannelList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChannelList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChannelList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCorpCode() != null) {
            _hashCode += getCorpCode().hashCode();
        }
        if (getInvoiceNo() != null) {
            _hashCode += getInvoiceNo().hashCode();
        }
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getOrderId() != null) {
            _hashCode += getOrderId().hashCode();
        }
        if (getPaymentEndDate() != null) {
            _hashCode += getPaymentEndDate().hashCode();
        }
        if (getPaymentStartDate() != null) {
            _hashCode += getPaymentStartDate().hashCode();
        }
        if (getSubscriberNo() != null) {
            _hashCode += getSubscriberNo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PreviousPaymentListWithStatusRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "previousPaymentListWithStatusRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("branchId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "branchId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "channelList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corpCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "corpCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("orderId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderId"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subscriberNo"));
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
