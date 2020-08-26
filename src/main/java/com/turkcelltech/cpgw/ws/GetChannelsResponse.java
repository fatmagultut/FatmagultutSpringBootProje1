/**
 * GetChannelsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class GetChannelsResponse  extends com.turkcelltech.cpgw.ws.ResponseType  implements java.io.Serializable {
    private com.turkcelltech.cpgw.ws.ChannelInfo[] channelInfo;

    private java.lang.Integer okcVersion;

    public GetChannelsResponse() {
    }

    public GetChannelsResponse(
           com.turkcelltech.cpgw.ws.ResponseHeader responseHeader,
           com.turkcelltech.cpgw.ws.ChannelInfo[] channelInfo,
           java.lang.Integer okcVersion) {
        super(
            responseHeader);
        this.channelInfo = channelInfo;
        this.okcVersion = okcVersion;
    }


    /**
     * Gets the channelInfo value for this GetChannelsResponse.
     * 
     * @return channelInfo
     */
    public com.turkcelltech.cpgw.ws.ChannelInfo[] getChannelInfo() {
        return channelInfo;
    }


    /**
     * Sets the channelInfo value for this GetChannelsResponse.
     * 
     * @param channelInfo
     */
    public void setChannelInfo(com.turkcelltech.cpgw.ws.ChannelInfo[] channelInfo) {
        this.channelInfo = channelInfo;
    }

    public com.turkcelltech.cpgw.ws.ChannelInfo getChannelInfo(int i) {
        return this.channelInfo[i];
    }

    public void setChannelInfo(int i, com.turkcelltech.cpgw.ws.ChannelInfo _value) {
        this.channelInfo[i] = _value;
    }


    /**
     * Gets the okcVersion value for this GetChannelsResponse.
     * 
     * @return okcVersion
     */
    public java.lang.Integer getOkcVersion() {
        return okcVersion;
    }


    /**
     * Sets the okcVersion value for this GetChannelsResponse.
     * 
     * @param okcVersion
     */
    public void setOkcVersion(java.lang.Integer okcVersion) {
        this.okcVersion = okcVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetChannelsResponse)) return false;
        GetChannelsResponse other = (GetChannelsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.channelInfo==null && other.getChannelInfo()==null) || 
             (this.channelInfo!=null &&
              java.util.Arrays.equals(this.channelInfo, other.getChannelInfo()))) &&
            ((this.okcVersion==null && other.getOkcVersion()==null) || 
             (this.okcVersion!=null &&
              this.okcVersion.equals(other.getOkcVersion())));
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
        if (getChannelInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChannelInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChannelInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOkcVersion() != null) {
            _hashCode += getOkcVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetChannelsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getChannelsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "channelInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "channelInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("okcVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "okcVersion"));
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
