/**
 * GetCorporationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class GetCorporationRequest  extends com.turkcelltech.cpgw.ws.RequestTypeWithChannelRefNo  implements java.io.Serializable {
    private java.lang.Long corpCode;

    public GetCorporationRequest() {
    }

    public GetCorporationRequest(
           com.turkcelltech.cpgw.ws.RequestHeader requestHeader,
           java.lang.String channelRefNo,
           java.lang.Long corpCode) {
        super(
            requestHeader,
            channelRefNo);
        this.corpCode = corpCode;
    }


    /**
     * Gets the corpCode value for this GetCorporationRequest.
     * 
     * @return corpCode
     */
    public java.lang.Long getCorpCode() {
        return corpCode;
    }


    /**
     * Sets the corpCode value for this GetCorporationRequest.
     * 
     * @param corpCode
     */
    public void setCorpCode(java.lang.Long corpCode) {
        this.corpCode = corpCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCorporationRequest)) return false;
        GetCorporationRequest other = (GetCorporationRequest) obj;
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
              this.corpCode.equals(other.getCorpCode())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCorporationRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getCorporationRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corpCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "corpCode"));
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
