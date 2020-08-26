/**
 * InvoiceTypeEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class InvoiceTypeEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected InvoiceTypeEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _PAYMENT = "PAYMENT";
    public static final java.lang.String _PARTIAL_PAYMENT = "PARTIAL_PAYMENT";
    public static final java.lang.String _INTERIM_PAYMENT = "INTERIM_PAYMENT";
    public static final java.lang.String _PRE_PAYMENT = "PRE_PAYMENT";
    public static final java.lang.String _ADVANCE_PAYMENT = "ADVANCE_PAYMENT";
    public static final InvoiceTypeEnum PAYMENT = new InvoiceTypeEnum(_PAYMENT);
    public static final InvoiceTypeEnum PARTIAL_PAYMENT = new InvoiceTypeEnum(_PARTIAL_PAYMENT);
    public static final InvoiceTypeEnum INTERIM_PAYMENT = new InvoiceTypeEnum(_INTERIM_PAYMENT);
    public static final InvoiceTypeEnum PRE_PAYMENT = new InvoiceTypeEnum(_PRE_PAYMENT);
    public static final InvoiceTypeEnum ADVANCE_PAYMENT = new InvoiceTypeEnum(_ADVANCE_PAYMENT);
    public java.lang.String getValue() { return _value_;}
    public static InvoiceTypeEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        InvoiceTypeEnum enumeration = (InvoiceTypeEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static InvoiceTypeEnum fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InvoiceTypeEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "invoiceTypeEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
