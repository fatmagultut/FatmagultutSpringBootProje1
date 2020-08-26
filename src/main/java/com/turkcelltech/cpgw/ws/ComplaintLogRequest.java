/**
 * ComplaintLogRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class ComplaintLogRequest  extends com.turkcelltech.cpgw.ws.RequestType  implements java.io.Serializable {
    private java.lang.String complaintDesc;

    private java.lang.Long complaintId;

    private java.lang.Long invoiceRefNo;

    private java.lang.String msisdn;

    public ComplaintLogRequest() {
    }

    public ComplaintLogRequest(
           com.turkcelltech.cpgw.ws.RequestHeader requestHeader,
           java.lang.String complaintDesc,
           java.lang.Long complaintId,
           java.lang.Long invoiceRefNo,
           java.lang.String msisdn) {
        super(
            requestHeader);
        this.complaintDesc = complaintDesc;
        this.complaintId = complaintId;
        this.invoiceRefNo = invoiceRefNo;
        this.msisdn = msisdn;
    }


    /**
     * Gets the complaintDesc value for this ComplaintLogRequest.
     * 
     * @return complaintDesc
     */
    public java.lang.String getComplaintDesc() {
        return complaintDesc;
    }


    /**
     * Sets the complaintDesc value for this ComplaintLogRequest.
     * 
     * @param complaintDesc
     */
    public void setComplaintDesc(java.lang.String complaintDesc) {
        this.complaintDesc = complaintDesc;
    }


    /**
     * Gets the complaintId value for this ComplaintLogRequest.
     * 
     * @return complaintId
     */
    public java.lang.Long getComplaintId() {
        return complaintId;
    }


    /**
     * Sets the complaintId value for this ComplaintLogRequest.
     * 
     * @param complaintId
     */
    public void setComplaintId(java.lang.Long complaintId) {
        this.complaintId = complaintId;
    }


    /**
     * Gets the invoiceRefNo value for this ComplaintLogRequest.
     * 
     * @return invoiceRefNo
     */
    public java.lang.Long getInvoiceRefNo() {
        return invoiceRefNo;
    }


    /**
     * Sets the invoiceRefNo value for this ComplaintLogRequest.
     * 
     * @param invoiceRefNo
     */
    public void setInvoiceRefNo(java.lang.Long invoiceRefNo) {
        this.invoiceRefNo = invoiceRefNo;
    }


    /**
     * Gets the msisdn value for this ComplaintLogRequest.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this ComplaintLogRequest.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ComplaintLogRequest)) return false;
        ComplaintLogRequest other = (ComplaintLogRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.complaintDesc==null && other.getComplaintDesc()==null) || 
             (this.complaintDesc!=null &&
              this.complaintDesc.equals(other.getComplaintDesc()))) &&
            ((this.complaintId==null && other.getComplaintId()==null) || 
             (this.complaintId!=null &&
              this.complaintId.equals(other.getComplaintId()))) &&
            ((this.invoiceRefNo==null && other.getInvoiceRefNo()==null) || 
             (this.invoiceRefNo!=null &&
              this.invoiceRefNo.equals(other.getInvoiceRefNo()))) &&
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn())));
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
        if (getComplaintDesc() != null) {
            _hashCode += getComplaintDesc().hashCode();
        }
        if (getComplaintId() != null) {
            _hashCode += getComplaintId().hashCode();
        }
        if (getInvoiceRefNo() != null) {
            _hashCode += getInvoiceRefNo().hashCode();
        }
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ComplaintLogRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "complaintLogRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "complaintDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "complaintId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceRefNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceRefNo"));
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
