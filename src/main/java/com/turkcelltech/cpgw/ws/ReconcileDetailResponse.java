/**
 * ReconcileDetailResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class ReconcileDetailResponse  extends com.turkcelltech.cpgw.ws.ResponseType  implements java.io.Serializable {
    private java.lang.String reconDate;

    private com.turkcelltech.cpgw.ws.ReconDetailInfo[] reconDetailList;

    public ReconcileDetailResponse() {
    }

    public ReconcileDetailResponse(
           com.turkcelltech.cpgw.ws.ResponseHeader responseHeader,
           java.lang.String reconDate,
           com.turkcelltech.cpgw.ws.ReconDetailInfo[] reconDetailList) {
        super(
            responseHeader);
        this.reconDate = reconDate;
        this.reconDetailList = reconDetailList;
    }


    /**
     * Gets the reconDate value for this ReconcileDetailResponse.
     * 
     * @return reconDate
     */
    public java.lang.String getReconDate() {
        return reconDate;
    }


    /**
     * Sets the reconDate value for this ReconcileDetailResponse.
     * 
     * @param reconDate
     */
    public void setReconDate(java.lang.String reconDate) {
        this.reconDate = reconDate;
    }


    /**
     * Gets the reconDetailList value for this ReconcileDetailResponse.
     * 
     * @return reconDetailList
     */
    public com.turkcelltech.cpgw.ws.ReconDetailInfo[] getReconDetailList() {
        return reconDetailList;
    }


    /**
     * Sets the reconDetailList value for this ReconcileDetailResponse.
     * 
     * @param reconDetailList
     */
    public void setReconDetailList(com.turkcelltech.cpgw.ws.ReconDetailInfo[] reconDetailList) {
        this.reconDetailList = reconDetailList;
    }

    public com.turkcelltech.cpgw.ws.ReconDetailInfo getReconDetailList(int i) {
        return this.reconDetailList[i];
    }

    public void setReconDetailList(int i, com.turkcelltech.cpgw.ws.ReconDetailInfo _value) {
        this.reconDetailList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReconcileDetailResponse)) return false;
        ReconcileDetailResponse other = (ReconcileDetailResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.reconDate==null && other.getReconDate()==null) || 
             (this.reconDate!=null &&
              this.reconDate.equals(other.getReconDate()))) &&
            ((this.reconDetailList==null && other.getReconDetailList()==null) || 
             (this.reconDetailList!=null &&
              java.util.Arrays.equals(this.reconDetailList, other.getReconDetailList())));
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
        if (getReconDate() != null) {
            _hashCode += getReconDate().hashCode();
        }
        if (getReconDetailList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReconDetailList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReconDetailList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReconcileDetailResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "reconcileDetailResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reconDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reconDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reconDetailList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reconDetailList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "reconDetailInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
