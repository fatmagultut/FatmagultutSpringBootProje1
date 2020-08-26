/**
 * DgPaymentsInstructionList4CardResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class DgPaymentsInstructionList4CardResponse  implements java.io.Serializable {
    private com.turkcelltech.cpgw.ws.DgPaymentsInstList4Card[] instructionList;

    private com.turkcelltech.cpgw.ws.BelbimReturn ret;

    public DgPaymentsInstructionList4CardResponse() {
    }

    public DgPaymentsInstructionList4CardResponse(
           com.turkcelltech.cpgw.ws.DgPaymentsInstList4Card[] instructionList,
           com.turkcelltech.cpgw.ws.BelbimReturn ret) {
           this.instructionList = instructionList;
           this.ret = ret;
    }


    /**
     * Gets the instructionList value for this DgPaymentsInstructionList4CardResponse.
     * 
     * @return instructionList
     */
    public com.turkcelltech.cpgw.ws.DgPaymentsInstList4Card[] getInstructionList() {
        return instructionList;
    }


    /**
     * Sets the instructionList value for this DgPaymentsInstructionList4CardResponse.
     * 
     * @param instructionList
     */
    public void setInstructionList(com.turkcelltech.cpgw.ws.DgPaymentsInstList4Card[] instructionList) {
        this.instructionList = instructionList;
    }

    public com.turkcelltech.cpgw.ws.DgPaymentsInstList4Card getInstructionList(int i) {
        return this.instructionList[i];
    }

    public void setInstructionList(int i, com.turkcelltech.cpgw.ws.DgPaymentsInstList4Card _value) {
        this.instructionList[i] = _value;
    }


    /**
     * Gets the ret value for this DgPaymentsInstructionList4CardResponse.
     * 
     * @return ret
     */
    public com.turkcelltech.cpgw.ws.BelbimReturn getRet() {
        return ret;
    }


    /**
     * Sets the ret value for this DgPaymentsInstructionList4CardResponse.
     * 
     * @param ret
     */
    public void setRet(com.turkcelltech.cpgw.ws.BelbimReturn ret) {
        this.ret = ret;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DgPaymentsInstructionList4CardResponse)) return false;
        DgPaymentsInstructionList4CardResponse other = (DgPaymentsInstructionList4CardResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.instructionList==null && other.getInstructionList()==null) || 
             (this.instructionList!=null &&
              java.util.Arrays.equals(this.instructionList, other.getInstructionList()))) &&
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
        if (getInstructionList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInstructionList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInstructionList(), i);
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
        new org.apache.axis.description.TypeDesc(DgPaymentsInstructionList4CardResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "dgPaymentsInstructionList4CardResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instructionList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "instructionList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "dgPaymentsInstList4Card"));
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
