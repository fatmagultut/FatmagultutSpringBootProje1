/**
 * ComplaintCategoryInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class ComplaintCategoryInfo  implements java.io.Serializable {
    private java.lang.String complaintDesc;

    private java.lang.Long complaintId;

    public ComplaintCategoryInfo() {
    }

    public ComplaintCategoryInfo(
           java.lang.String complaintDesc,
           java.lang.Long complaintId) {
           this.complaintDesc = complaintDesc;
           this.complaintId = complaintId;
    }


    /**
     * Gets the complaintDesc value for this ComplaintCategoryInfo.
     * 
     * @return complaintDesc
     */
    public java.lang.String getComplaintDesc() {
        return complaintDesc;
    }


    /**
     * Sets the complaintDesc value for this ComplaintCategoryInfo.
     * 
     * @param complaintDesc
     */
    public void setComplaintDesc(java.lang.String complaintDesc) {
        this.complaintDesc = complaintDesc;
    }


    /**
     * Gets the complaintId value for this ComplaintCategoryInfo.
     * 
     * @return complaintId
     */
    public java.lang.Long getComplaintId() {
        return complaintId;
    }


    /**
     * Sets the complaintId value for this ComplaintCategoryInfo.
     * 
     * @param complaintId
     */
    public void setComplaintId(java.lang.Long complaintId) {
        this.complaintId = complaintId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ComplaintCategoryInfo)) return false;
        ComplaintCategoryInfo other = (ComplaintCategoryInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.complaintDesc==null && other.getComplaintDesc()==null) || 
             (this.complaintDesc!=null &&
              this.complaintDesc.equals(other.getComplaintDesc()))) &&
            ((this.complaintId==null && other.getComplaintId()==null) || 
             (this.complaintId!=null &&
              this.complaintId.equals(other.getComplaintId())));
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
        if (getComplaintDesc() != null) {
            _hashCode += getComplaintDesc().hashCode();
        }
        if (getComplaintId() != null) {
            _hashCode += getComplaintId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ComplaintCategoryInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "complaintCategoryInfo"));
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
