/**
 * BelbimGetInstructionList4CardRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class BelbimGetInstructionList4CardRequest  implements java.io.Serializable {
    private java.lang.String clientKey;

    private java.lang.String clientPass;

    private java.lang.String endDate;

    private java.lang.String startDate;

    private java.lang.String uidOrAlias;

    public BelbimGetInstructionList4CardRequest() {
    }

    public BelbimGetInstructionList4CardRequest(
           java.lang.String clientKey,
           java.lang.String clientPass,
           java.lang.String endDate,
           java.lang.String startDate,
           java.lang.String uidOrAlias) {
           this.clientKey = clientKey;
           this.clientPass = clientPass;
           this.endDate = endDate;
           this.startDate = startDate;
           this.uidOrAlias = uidOrAlias;
    }


    /**
     * Gets the clientKey value for this BelbimGetInstructionList4CardRequest.
     * 
     * @return clientKey
     */
    public java.lang.String getClientKey() {
        return clientKey;
    }


    /**
     * Sets the clientKey value for this BelbimGetInstructionList4CardRequest.
     * 
     * @param clientKey
     */
    public void setClientKey(java.lang.String clientKey) {
        this.clientKey = clientKey;
    }


    /**
     * Gets the clientPass value for this BelbimGetInstructionList4CardRequest.
     * 
     * @return clientPass
     */
    public java.lang.String getClientPass() {
        return clientPass;
    }


    /**
     * Sets the clientPass value for this BelbimGetInstructionList4CardRequest.
     * 
     * @param clientPass
     */
    public void setClientPass(java.lang.String clientPass) {
        this.clientPass = clientPass;
    }


    /**
     * Gets the endDate value for this BelbimGetInstructionList4CardRequest.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this BelbimGetInstructionList4CardRequest.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the startDate value for this BelbimGetInstructionList4CardRequest.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this BelbimGetInstructionList4CardRequest.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the uidOrAlias value for this BelbimGetInstructionList4CardRequest.
     * 
     * @return uidOrAlias
     */
    public java.lang.String getUidOrAlias() {
        return uidOrAlias;
    }


    /**
     * Sets the uidOrAlias value for this BelbimGetInstructionList4CardRequest.
     * 
     * @param uidOrAlias
     */
    public void setUidOrAlias(java.lang.String uidOrAlias) {
        this.uidOrAlias = uidOrAlias;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BelbimGetInstructionList4CardRequest)) return false;
        BelbimGetInstructionList4CardRequest other = (BelbimGetInstructionList4CardRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clientKey==null && other.getClientKey()==null) || 
             (this.clientKey!=null &&
              this.clientKey.equals(other.getClientKey()))) &&
            ((this.clientPass==null && other.getClientPass()==null) || 
             (this.clientPass!=null &&
              this.clientPass.equals(other.getClientPass()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.uidOrAlias==null && other.getUidOrAlias()==null) || 
             (this.uidOrAlias!=null &&
              this.uidOrAlias.equals(other.getUidOrAlias())));
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
        if (getClientKey() != null) {
            _hashCode += getClientKey().hashCode();
        }
        if (getClientPass() != null) {
            _hashCode += getClientPass().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getUidOrAlias() != null) {
            _hashCode += getUidOrAlias().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BelbimGetInstructionList4CardRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimGetInstructionList4CardRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientPass");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientPass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uidOrAlias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uidOrAlias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
