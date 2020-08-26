/**
 * CityInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class CityInfo  implements java.io.Serializable {
    private java.lang.Long cityCode;

    private java.lang.Long cityId;

    private java.lang.String cityName;

    public CityInfo() {
    }

    public CityInfo(
           java.lang.Long cityCode,
           java.lang.Long cityId,
           java.lang.String cityName) {
           this.cityCode = cityCode;
           this.cityId = cityId;
           this.cityName = cityName;
    }


    /**
     * Gets the cityCode value for this CityInfo.
     * 
     * @return cityCode
     */
    public java.lang.Long getCityCode() {
        return cityCode;
    }


    /**
     * Sets the cityCode value for this CityInfo.
     * 
     * @param cityCode
     */
    public void setCityCode(java.lang.Long cityCode) {
        this.cityCode = cityCode;
    }


    /**
     * Gets the cityId value for this CityInfo.
     * 
     * @return cityId
     */
    public java.lang.Long getCityId() {
        return cityId;
    }


    /**
     * Sets the cityId value for this CityInfo.
     * 
     * @param cityId
     */
    public void setCityId(java.lang.Long cityId) {
        this.cityId = cityId;
    }


    /**
     * Gets the cityName value for this CityInfo.
     * 
     * @return cityName
     */
    public java.lang.String getCityName() {
        return cityName;
    }


    /**
     * Sets the cityName value for this CityInfo.
     * 
     * @param cityName
     */
    public void setCityName(java.lang.String cityName) {
        this.cityName = cityName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CityInfo)) return false;
        CityInfo other = (CityInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cityCode==null && other.getCityCode()==null) || 
             (this.cityCode!=null &&
              this.cityCode.equals(other.getCityCode()))) &&
            ((this.cityId==null && other.getCityId()==null) || 
             (this.cityId!=null &&
              this.cityId.equals(other.getCityId()))) &&
            ((this.cityName==null && other.getCityName()==null) || 
             (this.cityName!=null &&
              this.cityName.equals(other.getCityName())));
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
        if (getCityCode() != null) {
            _hashCode += getCityCode().hashCode();
        }
        if (getCityId() != null) {
            _hashCode += getCityId().hashCode();
        }
        if (getCityName() != null) {
            _hashCode += getCityName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CityInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cityInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cityCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cityCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cityId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cityName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cityName"));
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
