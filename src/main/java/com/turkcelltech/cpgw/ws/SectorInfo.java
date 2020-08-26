/**
 * SectorInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class SectorInfo  extends com.turkcelltech.cpgw.ws.CpgwModel  implements java.io.Serializable {
    private java.lang.Long sectorId;

    private java.lang.String sectorName;

    public SectorInfo() {
    }

    public SectorInfo(
           java.lang.Long sectorId,
           java.lang.String sectorName) {
        this.sectorId = sectorId;
        this.sectorName = sectorName;
    }


    /**
     * Gets the sectorId value for this SectorInfo.
     * 
     * @return sectorId
     */
    public java.lang.Long getSectorId() {
        return sectorId;
    }


    /**
     * Sets the sectorId value for this SectorInfo.
     * 
     * @param sectorId
     */
    public void setSectorId(java.lang.Long sectorId) {
        this.sectorId = sectorId;
    }


    /**
     * Gets the sectorName value for this SectorInfo.
     * 
     * @return sectorName
     */
    public java.lang.String getSectorName() {
        return sectorName;
    }


    /**
     * Sets the sectorName value for this SectorInfo.
     * 
     * @param sectorName
     */
    public void setSectorName(java.lang.String sectorName) {
        this.sectorName = sectorName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SectorInfo)) return false;
        SectorInfo other = (SectorInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sectorId==null && other.getSectorId()==null) || 
             (this.sectorId!=null &&
              this.sectorId.equals(other.getSectorId()))) &&
            ((this.sectorName==null && other.getSectorName()==null) || 
             (this.sectorName!=null &&
              this.sectorName.equals(other.getSectorName())));
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
        if (getSectorId() != null) {
            _hashCode += getSectorId().hashCode();
        }
        if (getSectorName() != null) {
            _hashCode += getSectorName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SectorInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "sectorInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sectorId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sectorId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sectorName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sectorName"));
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
