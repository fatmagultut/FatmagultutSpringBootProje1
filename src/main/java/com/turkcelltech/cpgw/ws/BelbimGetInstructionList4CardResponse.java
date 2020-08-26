/**
 * BelbimGetInstructionList4CardResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class BelbimGetInstructionList4CardResponse  implements java.io.Serializable {
    private com.turkcelltech.cpgw.ws.InstructionList4Card[] list;

    private com.turkcelltech.cpgw.ws.BelbimReturn ret;

    public BelbimGetInstructionList4CardResponse() {
    }

    public BelbimGetInstructionList4CardResponse(
           com.turkcelltech.cpgw.ws.InstructionList4Card[] list,
           com.turkcelltech.cpgw.ws.BelbimReturn ret) {
           this.list = list;
           this.ret = ret;
    }


    /**
     * Gets the list value for this BelbimGetInstructionList4CardResponse.
     * 
     * @return list
     */
    public com.turkcelltech.cpgw.ws.InstructionList4Card[] getList() {
        return list;
    }


    /**
     * Sets the list value for this BelbimGetInstructionList4CardResponse.
     * 
     * @param list
     */
    public void setList(com.turkcelltech.cpgw.ws.InstructionList4Card[] list) {
        this.list = list;
    }

    public com.turkcelltech.cpgw.ws.InstructionList4Card getList(int i) {
        return this.list[i];
    }

    public void setList(int i, com.turkcelltech.cpgw.ws.InstructionList4Card _value) {
        this.list[i] = _value;
    }


    /**
     * Gets the ret value for this BelbimGetInstructionList4CardResponse.
     * 
     * @return ret
     */
    public com.turkcelltech.cpgw.ws.BelbimReturn getRet() {
        return ret;
    }


    /**
     * Sets the ret value for this BelbimGetInstructionList4CardResponse.
     * 
     * @param ret
     */
    public void setRet(com.turkcelltech.cpgw.ws.BelbimReturn ret) {
        this.ret = ret;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BelbimGetInstructionList4CardResponse)) return false;
        BelbimGetInstructionList4CardResponse other = (BelbimGetInstructionList4CardResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.list==null && other.getList()==null) || 
             (this.list!=null &&
              java.util.Arrays.equals(this.list, other.getList()))) &&
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
        int _hashCode = 1;
        if (getList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getList(), i);
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
        new org.apache.axis.description.TypeDesc(BelbimGetInstructionList4CardResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimGetInstructionList4CardResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("list");
        elemField.setXmlName(new javax.xml.namespace.QName("", "list"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "instructionList4Card"));
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
