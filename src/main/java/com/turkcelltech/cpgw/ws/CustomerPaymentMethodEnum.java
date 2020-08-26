/**
 * CustomerPaymentMethodEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class CustomerPaymentMethodEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CustomerPaymentMethodEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _REGISTERED_CC = "REGISTERED_CC";
    public static final java.lang.String _TOKEN = "TOKEN";
    public static final java.lang.String _E_MONEY = "E_MONEY";
    public static final java.lang.String _MOBILE_PAYMENT = "MOBILE_PAYMENT";
    public static final java.lang.String _OKC_CC = "OKC_CC";
    public static final java.lang.String _OKC_CASH = "OKC_CASH";
    public static final java.lang.String _THREE_D_SESSION_ID = "THREE_D_SESSION_ID";
    public static final java.lang.String _BWP_NTS = "BWP_NTS";
    public static final java.lang.String _BWP_CASH = "BWP_CASH";
    public static final java.lang.String _PAYCELL_CARD = "PAYCELL_CARD";
    public static final java.lang.String _GUVENCELL_NTS = "GUVENCELL_NTS";
    public static final java.lang.String _FOM_NTS = "FOM_NTS";
    public static final CustomerPaymentMethodEnum REGISTERED_CC = new CustomerPaymentMethodEnum(_REGISTERED_CC);
    public static final CustomerPaymentMethodEnum TOKEN = new CustomerPaymentMethodEnum(_TOKEN);
    public static final CustomerPaymentMethodEnum E_MONEY = new CustomerPaymentMethodEnum(_E_MONEY);
    public static final CustomerPaymentMethodEnum MOBILE_PAYMENT = new CustomerPaymentMethodEnum(_MOBILE_PAYMENT);
    public static final CustomerPaymentMethodEnum OKC_CC = new CustomerPaymentMethodEnum(_OKC_CC);
    public static final CustomerPaymentMethodEnum OKC_CASH = new CustomerPaymentMethodEnum(_OKC_CASH);
    public static final CustomerPaymentMethodEnum THREE_D_SESSION_ID = new CustomerPaymentMethodEnum(_THREE_D_SESSION_ID);
    public static final CustomerPaymentMethodEnum BWP_NTS = new CustomerPaymentMethodEnum(_BWP_NTS);
    public static final CustomerPaymentMethodEnum BWP_CASH = new CustomerPaymentMethodEnum(_BWP_CASH);
    public static final CustomerPaymentMethodEnum PAYCELL_CARD = new CustomerPaymentMethodEnum(_PAYCELL_CARD);
    public static final CustomerPaymentMethodEnum GUVENCELL_NTS = new CustomerPaymentMethodEnum(_GUVENCELL_NTS);
    public static final CustomerPaymentMethodEnum FOM_NTS = new CustomerPaymentMethodEnum(_FOM_NTS);
    public java.lang.String getValue() { return _value_;}
    public static CustomerPaymentMethodEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CustomerPaymentMethodEnum enumeration = (CustomerPaymentMethodEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CustomerPaymentMethodEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CustomerPaymentMethodEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "customerPaymentMethodEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
