/**
 * RequestTypeWithChannelRefNo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class RequestTypeWithChannelRefNo  extends com.turkcelltech.cpgw.ws.RequestType  implements java.io.Serializable {
    private java.lang.String channelRefNo;

    public RequestTypeWithChannelRefNo() {
    }

    public RequestTypeWithChannelRefNo(
           com.turkcelltech.cpgw.ws.RequestHeader requestHeader,
           java.lang.String channelRefNo) {
        super(
            requestHeader);
        this.channelRefNo = channelRefNo;
    }


    /**
     * Gets the channelRefNo value for this RequestTypeWithChannelRefNo.
     * 
     * @return channelRefNo
     */
    public java.lang.String getChannelRefNo() {
        return channelRefNo;
    }


    /**
     * Sets the channelRefNo value for this RequestTypeWithChannelRefNo.
     * 
     * @param channelRefNo
     */
    public void setChannelRefNo(java.lang.String channelRefNo) {
        this.channelRefNo = channelRefNo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestTypeWithChannelRefNo)) return false;
        RequestTypeWithChannelRefNo other = (RequestTypeWithChannelRefNo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.channelRefNo==null && other.getChannelRefNo()==null) || 
             (this.channelRefNo!=null &&
              this.channelRefNo.equals(other.getChannelRefNo())));
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
        if (getChannelRefNo() != null) {
            _hashCode += getChannelRefNo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestTypeWithChannelRefNo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "requestTypeWithChannelRefNo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelRefNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "channelRefNo"));
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
