/**
 * ReconcileResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class ReconcileResponse  extends com.turkcelltech.cpgw.ws.ResponseType  implements java.io.Serializable {
    private com.turkcelltech.cpgw.ws.ReconInfo reconInfo;

    public ReconcileResponse() {
    }

    public ReconcileResponse(
           com.turkcelltech.cpgw.ws.ResponseHeader responseHeader,
           com.turkcelltech.cpgw.ws.ReconInfo reconInfo) {
        super(
            responseHeader);
        this.reconInfo = reconInfo;
    }


    /**
     * Gets the reconInfo value for this ReconcileResponse.
     * 
     * @return reconInfo
     */
    public com.turkcelltech.cpgw.ws.ReconInfo getReconInfo() {
        return reconInfo;
    }


    /**
     * Sets the reconInfo value for this ReconcileResponse.
     * 
     * @param reconInfo
     */
    public void setReconInfo(com.turkcelltech.cpgw.ws.ReconInfo reconInfo) {
        this.reconInfo = reconInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReconcileResponse)) return false;
        ReconcileResponse other = (ReconcileResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.reconInfo==null && other.getReconInfo()==null) || 
             (this.reconInfo!=null &&
              this.reconInfo.equals(other.getReconInfo())));
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
        if (getReconInfo() != null) {
            _hashCode += getReconInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReconcileResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "reconcileResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reconInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reconInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "reconInfo"));
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
