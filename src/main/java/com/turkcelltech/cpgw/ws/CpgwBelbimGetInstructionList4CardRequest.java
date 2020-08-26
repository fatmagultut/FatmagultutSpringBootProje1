/**
 * CpgwBelbimGetInstructionList4CardRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class CpgwBelbimGetInstructionList4CardRequest  extends com.turkcelltech.cpgw.ws.RequestTypeWithChannelRefNo  implements java.io.Serializable {
    private com.turkcelltech.cpgw.ws.BelbimGetInstructionList4CardRequest belbimInstList4CardRequest;

    private java.lang.Long corpCode;

    private java.lang.Long vendorId;

    public CpgwBelbimGetInstructionList4CardRequest() {
    }

    public CpgwBelbimGetInstructionList4CardRequest(
           com.turkcelltech.cpgw.ws.RequestHeader requestHeader,
           java.lang.String channelRefNo,
           com.turkcelltech.cpgw.ws.BelbimGetInstructionList4CardRequest belbimInstList4CardRequest,
           java.lang.Long corpCode,
           java.lang.Long vendorId) {
        super(
            requestHeader,
            channelRefNo);
        this.belbimInstList4CardRequest = belbimInstList4CardRequest;
        this.corpCode = corpCode;
        this.vendorId = vendorId;
    }


    /**
     * Gets the belbimInstList4CardRequest value for this CpgwBelbimGetInstructionList4CardRequest.
     * 
     * @return belbimInstList4CardRequest
     */
    public com.turkcelltech.cpgw.ws.BelbimGetInstructionList4CardRequest getBelbimInstList4CardRequest() {
        return belbimInstList4CardRequest;
    }


    /**
     * Sets the belbimInstList4CardRequest value for this CpgwBelbimGetInstructionList4CardRequest.
     * 
     * @param belbimInstList4CardRequest
     */
    public void setBelbimInstList4CardRequest(com.turkcelltech.cpgw.ws.BelbimGetInstructionList4CardRequest belbimInstList4CardRequest) {
        this.belbimInstList4CardRequest = belbimInstList4CardRequest;
    }


    /**
     * Gets the corpCode value for this CpgwBelbimGetInstructionList4CardRequest.
     * 
     * @return corpCode
     */
    public java.lang.Long getCorpCode() {
        return corpCode;
    }


    /**
     * Sets the corpCode value for this CpgwBelbimGetInstructionList4CardRequest.
     * 
     * @param corpCode
     */
    public void setCorpCode(java.lang.Long corpCode) {
        this.corpCode = corpCode;
    }


    /**
     * Gets the vendorId value for this CpgwBelbimGetInstructionList4CardRequest.
     * 
     * @return vendorId
     */
    public java.lang.Long getVendorId() {
        return vendorId;
    }


    /**
     * Sets the vendorId value for this CpgwBelbimGetInstructionList4CardRequest.
     * 
     * @param vendorId
     */
    public void setVendorId(java.lang.Long vendorId) {
        this.vendorId = vendorId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CpgwBelbimGetInstructionList4CardRequest)) return false;
        CpgwBelbimGetInstructionList4CardRequest other = (CpgwBelbimGetInstructionList4CardRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.belbimInstList4CardRequest==null && other.getBelbimInstList4CardRequest()==null) || 
             (this.belbimInstList4CardRequest!=null &&
              this.belbimInstList4CardRequest.equals(other.getBelbimInstList4CardRequest()))) &&
            ((this.corpCode==null && other.getCorpCode()==null) || 
             (this.corpCode!=null &&
              this.corpCode.equals(other.getCorpCode()))) &&
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
        if (getBelbimInstList4CardRequest() != null) {
            _hashCode += getBelbimInstList4CardRequest().hashCode();
        }
        if (getCorpCode() != null) {
            _hashCode += getCorpCode().hashCode();
        }
        if (getVendorId() != null) {
            _hashCode += getVendorId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CpgwBelbimGetInstructionList4CardRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwBelbimGetInstructionList4CardRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("belbimInstList4CardRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("", "belbimInstList4CardRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimGetInstructionList4CardRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corpCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "corpCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
