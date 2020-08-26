/**
 * CpgwDgPaymentsGetInstructionList4CardResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class CpgwDgPaymentsGetInstructionList4CardResponse  extends com.turkcelltech.cpgw.ws.ResponseType  implements java.io.Serializable {
    private com.turkcelltech.cpgw.ws.DgPaymentsInstructionList4CardResponse[] dgPaymentsInstructionList4Card;

    private com.turkcelltech.cpgw.ws.BelbimReturn ret;

    public CpgwDgPaymentsGetInstructionList4CardResponse() {
    }

    public CpgwDgPaymentsGetInstructionList4CardResponse(
           com.turkcelltech.cpgw.ws.ResponseHeader responseHeader,
           com.turkcelltech.cpgw.ws.DgPaymentsInstructionList4CardResponse[] dgPaymentsInstructionList4Card,
           com.turkcelltech.cpgw.ws.BelbimReturn ret) {
        super(
            responseHeader);
        this.dgPaymentsInstructionList4Card = dgPaymentsInstructionList4Card;
        this.ret = ret;
    }


    /**
     * Gets the dgPaymentsInstructionList4Card value for this CpgwDgPaymentsGetInstructionList4CardResponse.
     * 
     * @return dgPaymentsInstructionList4Card
     */
    public com.turkcelltech.cpgw.ws.DgPaymentsInstructionList4CardResponse[] getDgPaymentsInstructionList4Card() {
        return dgPaymentsInstructionList4Card;
    }


    /**
     * Sets the dgPaymentsInstructionList4Card value for this CpgwDgPaymentsGetInstructionList4CardResponse.
     * 
     * @param dgPaymentsInstructionList4Card
     */
    public void setDgPaymentsInstructionList4Card(com.turkcelltech.cpgw.ws.DgPaymentsInstructionList4CardResponse[] dgPaymentsInstructionList4Card) {
        this.dgPaymentsInstructionList4Card = dgPaymentsInstructionList4Card;
    }

    public com.turkcelltech.cpgw.ws.DgPaymentsInstructionList4CardResponse getDgPaymentsInstructionList4Card(int i) {
        return this.dgPaymentsInstructionList4Card[i];
    }

    public void setDgPaymentsInstructionList4Card(int i, com.turkcelltech.cpgw.ws.DgPaymentsInstructionList4CardResponse _value) {
        this.dgPaymentsInstructionList4Card[i] = _value;
    }


    /**
     * Gets the ret value for this CpgwDgPaymentsGetInstructionList4CardResponse.
     * 
     * @return ret
     */
    public com.turkcelltech.cpgw.ws.BelbimReturn getRet() {
        return ret;
    }


    /**
     * Sets the ret value for this CpgwDgPaymentsGetInstructionList4CardResponse.
     * 
     * @param ret
     */
    public void setRet(com.turkcelltech.cpgw.ws.BelbimReturn ret) {
        this.ret = ret;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CpgwDgPaymentsGetInstructionList4CardResponse)) return false;
        CpgwDgPaymentsGetInstructionList4CardResponse other = (CpgwDgPaymentsGetInstructionList4CardResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.dgPaymentsInstructionList4Card==null && other.getDgPaymentsInstructionList4Card()==null) || 
             (this.dgPaymentsInstructionList4Card!=null &&
              java.util.Arrays.equals(this.dgPaymentsInstructionList4Card, other.getDgPaymentsInstructionList4Card()))) &&
            ((this.ret==null && other.getRet()==null) || 
             (this.ret!=null &&
              this.ret.equals(other.getRet())));
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
        if (getDgPaymentsInstructionList4Card() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDgPaymentsInstructionList4Card());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDgPaymentsInstructionList4Card(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRet() != null) {
            _hashCode += getRet().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CpgwDgPaymentsGetInstructionList4CardResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwDgPaymentsGetInstructionList4CardResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dgPaymentsInstructionList4Card");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dgPaymentsInstructionList4Card"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "dgPaymentsInstructionList4CardResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ret");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ret"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimReturn"));
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
