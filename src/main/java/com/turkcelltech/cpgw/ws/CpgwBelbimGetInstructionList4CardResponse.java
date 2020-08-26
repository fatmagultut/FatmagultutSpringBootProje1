/**
 * CpgwBelbimGetInstructionList4CardResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class CpgwBelbimGetInstructionList4CardResponse  extends com.turkcelltech.cpgw.ws.ResponseType  implements java.io.Serializable {
    private com.turkcelltech.cpgw.ws.BelbimGetInstructionList4CardResponse belbimInstructionList4Card;

    public CpgwBelbimGetInstructionList4CardResponse() {
    }

    public CpgwBelbimGetInstructionList4CardResponse(
           com.turkcelltech.cpgw.ws.ResponseHeader responseHeader,
           com.turkcelltech.cpgw.ws.BelbimGetInstructionList4CardResponse belbimInstructionList4Card) {
        super(
            responseHeader);
        this.belbimInstructionList4Card = belbimInstructionList4Card;
    }


    /**
     * Gets the belbimInstructionList4Card value for this CpgwBelbimGetInstructionList4CardResponse.
     * 
     * @return belbimInstructionList4Card
     */
    public com.turkcelltech.cpgw.ws.BelbimGetInstructionList4CardResponse getBelbimInstructionList4Card() {
        return belbimInstructionList4Card;
    }


    /**
     * Sets the belbimInstructionList4Card value for this CpgwBelbimGetInstructionList4CardResponse.
     * 
     * @param belbimInstructionList4Card
     */
    public void setBelbimInstructionList4Card(com.turkcelltech.cpgw.ws.BelbimGetInstructionList4CardResponse belbimInstructionList4Card) {
        this.belbimInstructionList4Card = belbimInstructionList4Card;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CpgwBelbimGetInstructionList4CardResponse)) return false;
        CpgwBelbimGetInstructionList4CardResponse other = (CpgwBelbimGetInstructionList4CardResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.belbimInstructionList4Card==null && other.getBelbimInstructionList4Card()==null) || 
             (this.belbimInstructionList4Card!=null &&
              this.belbimInstructionList4Card.equals(other.getBelbimInstructionList4Card())));
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
        if (getBelbimInstructionList4Card() != null) {
            _hashCode += getBelbimInstructionList4Card().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CpgwBelbimGetInstructionList4CardResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwBelbimGetInstructionList4CardResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("belbimInstructionList4Card");
        elemField.setXmlName(new javax.xml.namespace.QName("", "belbimInstructionList4Card"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimGetInstructionList4CardResponse"));
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
