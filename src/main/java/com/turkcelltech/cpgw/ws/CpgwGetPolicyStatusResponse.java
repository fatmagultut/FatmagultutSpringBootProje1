/**
 * CpgwGetPolicyStatusResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class CpgwGetPolicyStatusResponse  extends com.turkcelltech.cpgw.ws.ResponseType  implements java.io.Serializable {
    private com.turkcelltech.cpgw.ws.GetPolicyStatusResponse[] policyStatusResponse;

    public CpgwGetPolicyStatusResponse() {
    }

    public CpgwGetPolicyStatusResponse(
           com.turkcelltech.cpgw.ws.ResponseHeader responseHeader,
           com.turkcelltech.cpgw.ws.GetPolicyStatusResponse[] policyStatusResponse) {
        super(
            responseHeader);
        this.policyStatusResponse = policyStatusResponse;
    }


    /**
     * Gets the policyStatusResponse value for this CpgwGetPolicyStatusResponse.
     * 
     * @return policyStatusResponse
     */
    public com.turkcelltech.cpgw.ws.GetPolicyStatusResponse[] getPolicyStatusResponse() {
        return policyStatusResponse;
    }


    /**
     * Sets the policyStatusResponse value for this CpgwGetPolicyStatusResponse.
     * 
     * @param policyStatusResponse
     */
    public void setPolicyStatusResponse(com.turkcelltech.cpgw.ws.GetPolicyStatusResponse[] policyStatusResponse) {
        this.policyStatusResponse = policyStatusResponse;
    }

    public com.turkcelltech.cpgw.ws.GetPolicyStatusResponse getPolicyStatusResponse(int i) {
        return this.policyStatusResponse[i];
    }

    public void setPolicyStatusResponse(int i, com.turkcelltech.cpgw.ws.GetPolicyStatusResponse _value) {
        this.policyStatusResponse[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CpgwGetPolicyStatusResponse)) return false;
        CpgwGetPolicyStatusResponse other = (CpgwGetPolicyStatusResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.policyStatusResponse==null && other.getPolicyStatusResponse()==null) || 
             (this.policyStatusResponse!=null &&
              java.util.Arrays.equals(this.policyStatusResponse, other.getPolicyStatusResponse())));
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
        if (getPolicyStatusResponse() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPolicyStatusResponse());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPolicyStatusResponse(), i);
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
        new org.apache.axis.description.TypeDesc(CpgwGetPolicyStatusResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwGetPolicyStatusResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyStatusResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "policyStatusResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getPolicyStatusResponse"));
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
