/**
 * InvoiceListResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class InvoiceListResponse  extends com.turkcelltech.cpgw.ws.ResponseType  implements java.io.Serializable {
    private com.turkcelltech.cpgw.ws.RegisteredInvoice[] registeredInvoice;

    public InvoiceListResponse() {
    }

    public InvoiceListResponse(
           com.turkcelltech.cpgw.ws.ResponseHeader responseHeader,
           com.turkcelltech.cpgw.ws.RegisteredInvoice[] registeredInvoice) {
        super(
            responseHeader);
        this.registeredInvoice = registeredInvoice;
    }


    /**
     * Gets the registeredInvoice value for this InvoiceListResponse.
     * 
     * @return registeredInvoice
     */
    public com.turkcelltech.cpgw.ws.RegisteredInvoice[] getRegisteredInvoice() {
        return registeredInvoice;
    }


    /**
     * Sets the registeredInvoice value for this InvoiceListResponse.
     * 
     * @param registeredInvoice
     */
    public void setRegisteredInvoice(com.turkcelltech.cpgw.ws.RegisteredInvoice[] registeredInvoice) {
        this.registeredInvoice = registeredInvoice;
    }

    public com.turkcelltech.cpgw.ws.RegisteredInvoice getRegisteredInvoice(int i) {
        return this.registeredInvoice[i];
    }

    public void setRegisteredInvoice(int i, com.turkcelltech.cpgw.ws.RegisteredInvoice _value) {
        this.registeredInvoice[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvoiceListResponse)) return false;
        InvoiceListResponse other = (InvoiceListResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.registeredInvoice==null && other.getRegisteredInvoice()==null) || 
             (this.registeredInvoice!=null &&
              java.util.Arrays.equals(this.registeredInvoice, other.getRegisteredInvoice())));
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
        if (getRegisteredInvoice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRegisteredInvoice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRegisteredInvoice(), i);
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
        new org.apache.axis.description.TypeDesc(InvoiceListResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "invoiceListResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registeredInvoice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "registeredInvoice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "registeredInvoice"));
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
