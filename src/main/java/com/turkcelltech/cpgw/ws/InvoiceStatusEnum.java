/**
 * InvoiceStatusEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class InvoiceStatusEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected InvoiceStatusEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _PAYMENT_START = "PAYMENT_START";
    public static final java.lang.String _CANCEL_START = "CANCEL_START";
    public static final java.lang.String _NOT_PAID = "NOT_PAID";
    public static final java.lang.String _SUCCESS = "SUCCESS";
    public static final java.lang.String _CANCELLED = "CANCELLED";
    public static final java.lang.String _WAITING = "WAITING";
    public static final java.lang.String _WAITING_FOR_CANCEL = "WAITING_FOR_CANCEL";
    public static final java.lang.String _ERROR = "ERROR";
    public static final java.lang.String _REVERSED = "REVERSED";
    public static final InvoiceStatusEnum PAYMENT_START = new InvoiceStatusEnum(_PAYMENT_START);
    public static final InvoiceStatusEnum CANCEL_START = new InvoiceStatusEnum(_CANCEL_START);
    public static final InvoiceStatusEnum NOT_PAID = new InvoiceStatusEnum(_NOT_PAID);
    public static final InvoiceStatusEnum SUCCESS = new InvoiceStatusEnum(_SUCCESS);
    public static final InvoiceStatusEnum CANCELLED = new InvoiceStatusEnum(_CANCELLED);
    public static final InvoiceStatusEnum WAITING = new InvoiceStatusEnum(_WAITING);
    public static final InvoiceStatusEnum WAITING_FOR_CANCEL = new InvoiceStatusEnum(_WAITING_FOR_CANCEL);
    public static final InvoiceStatusEnum ERROR = new InvoiceStatusEnum(_ERROR);
    public static final InvoiceStatusEnum REVERSED = new InvoiceStatusEnum(_REVERSED);
    public java.lang.String getValue() { return _value_;}
    public static InvoiceStatusEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        InvoiceStatusEnum enumeration = (InvoiceStatusEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static InvoiceStatusEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(InvoiceStatusEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "invoiceStatusEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
