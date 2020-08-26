/**
 * OkcHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class OkcHeader  extends com.turkcelltech.cpgw.ws.CpgwModel  implements java.io.Serializable {
    private java.lang.String deviceInfo;

    private java.lang.Integer menuId;

    private java.lang.String merchantCode;

    private java.lang.String specVersion;

    private java.lang.String terminalId;

    public OkcHeader() {
    }

    public OkcHeader(
           java.lang.String deviceInfo,
           java.lang.Integer menuId,
           java.lang.String merchantCode,
           java.lang.String specVersion,
           java.lang.String terminalId) {
        this.deviceInfo = deviceInfo;
        this.menuId = menuId;
        this.merchantCode = merchantCode;
        this.specVersion = specVersion;
        this.terminalId = terminalId;
    }


    /**
     * Gets the deviceInfo value for this OkcHeader.
     * 
     * @return deviceInfo
     */
    public java.lang.String getDeviceInfo() {
        return deviceInfo;
    }


    /**
     * Sets the deviceInfo value for this OkcHeader.
     * 
     * @param deviceInfo
     */
    public void setDeviceInfo(java.lang.String deviceInfo) {
        this.deviceInfo = deviceInfo;
    }


    /**
     * Gets the menuId value for this OkcHeader.
     * 
     * @return menuId
     */
    public java.lang.Integer getMenuId() {
        return menuId;
    }


    /**
     * Sets the menuId value for this OkcHeader.
     * 
     * @param menuId
     */
    public void setMenuId(java.lang.Integer menuId) {
        this.menuId = menuId;
    }


    /**
     * Gets the merchantCode value for this OkcHeader.
     * 
     * @return merchantCode
     */
    public java.lang.String getMerchantCode() {
        return merchantCode;
    }


    /**
     * Sets the merchantCode value for this OkcHeader.
     * 
     * @param merchantCode
     */
    public void setMerchantCode(java.lang.String merchantCode) {
        this.merchantCode = merchantCode;
    }


    /**
     * Gets the specVersion value for this OkcHeader.
     * 
     * @return specVersion
     */
    public java.lang.String getSpecVersion() {
        return specVersion;
    }


    /**
     * Sets the specVersion value for this OkcHeader.
     * 
     * @param specVersion
     */
    public void setSpecVersion(java.lang.String specVersion) {
        this.specVersion = specVersion;
    }


    /**
     * Gets the terminalId value for this OkcHeader.
     * 
     * @return terminalId
     */
    public java.lang.String getTerminalId() {
        return terminalId;
    }


    /**
     * Sets the terminalId value for this OkcHeader.
     * 
     * @param terminalId
     */
    public void setTerminalId(java.lang.String terminalId) {
        this.terminalId = terminalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OkcHeader)) return false;
        OkcHeader other = (OkcHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.deviceInfo==null && other.getDeviceInfo()==null) || 
             (this.deviceInfo!=null &&
              this.deviceInfo.equals(other.getDeviceInfo()))) &&
            ((this.menuId==null && other.getMenuId()==null) || 
             (this.menuId!=null &&
              this.menuId.equals(other.getMenuId()))) &&
            ((this.merchantCode==null && other.getMerchantCode()==null) || 
             (this.merchantCode!=null &&
              this.merchantCode.equals(other.getMerchantCode()))) &&
            ((this.specVersion==null && other.getSpecVersion()==null) || 
             (this.specVersion!=null &&
              this.specVersion.equals(other.getSpecVersion()))) &&
            ((this.terminalId==null && other.getTerminalId()==null) || 
             (this.terminalId!=null &&
              this.terminalId.equals(other.getTerminalId())));
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
        if (getDeviceInfo() != null) {
            _hashCode += getDeviceInfo().hashCode();
        }
        if (getMenuId() != null) {
            _hashCode += getMenuId().hashCode();
        }
        if (getMerchantCode() != null) {
            _hashCode += getMerchantCode().hashCode();
        }
        if (getSpecVersion() != null) {
            _hashCode += getSpecVersion().hashCode();
        }
        if (getTerminalId() != null) {
            _hashCode += getTerminalId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OkcHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "okcHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deviceInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("menuId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "menuId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "merchantCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "specVersion"));
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
