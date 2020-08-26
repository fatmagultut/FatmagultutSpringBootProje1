/**
 * GetParametersResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class GetParametersResponse  extends com.turkcelltech.cpgw.ws.ResponseType  implements java.io.Serializable {
    private com.turkcelltech.cpgw.ws.CorporationInfo[] corporations;

    private java.lang.Integer okcVersion;

    private com.turkcelltech.cpgw.ws.ResultCodeInfo[] resultCodes;

    private com.turkcelltech.cpgw.ws.SectorInfo[] sectors;

    public GetParametersResponse() {
    }

    public GetParametersResponse(
           com.turkcelltech.cpgw.ws.ResponseHeader responseHeader,
           com.turkcelltech.cpgw.ws.CorporationInfo[] corporations,
           java.lang.Integer okcVersion,
           com.turkcelltech.cpgw.ws.ResultCodeInfo[] resultCodes,
           com.turkcelltech.cpgw.ws.SectorInfo[] sectors) {
        super(
            responseHeader);
        this.corporations = corporations;
        this.okcVersion = okcVersion;
        this.resultCodes = resultCodes;
        this.sectors = sectors;
    }


    /**
     * Gets the corporations value for this GetParametersResponse.
     * 
     * @return corporations
     */
    public com.turkcelltech.cpgw.ws.CorporationInfo[] getCorporations() {
        return corporations;
    }


    /**
     * Sets the corporations value for this GetParametersResponse.
     * 
     * @param corporations
     */
    public void setCorporations(com.turkcelltech.cpgw.ws.CorporationInfo[] corporations) {
        this.corporations = corporations;
    }

    public com.turkcelltech.cpgw.ws.CorporationInfo getCorporations(int i) {
        return this.corporations[i];
    }

    public void setCorporations(int i, com.turkcelltech.cpgw.ws.CorporationInfo _value) {
        this.corporations[i] = _value;
    }


    /**
     * Gets the okcVersion value for this GetParametersResponse.
     * 
     * @return okcVersion
     */
    public java.lang.Integer getOkcVersion() {
        return okcVersion;
    }


    /**
     * Sets the okcVersion value for this GetParametersResponse.
     * 
     * @param okcVersion
     */
    public void setOkcVersion(java.lang.Integer okcVersion) {
        this.okcVersion = okcVersion;
    }


    /**
     * Gets the resultCodes value for this GetParametersResponse.
     * 
     * @return resultCodes
     */
    public com.turkcelltech.cpgw.ws.ResultCodeInfo[] getResultCodes() {
        return resultCodes;
    }


    /**
     * Sets the resultCodes value for this GetParametersResponse.
     * 
     * @param resultCodes
     */
    public void setResultCodes(com.turkcelltech.cpgw.ws.ResultCodeInfo[] resultCodes) {
        this.resultCodes = resultCodes;
    }

    public com.turkcelltech.cpgw.ws.ResultCodeInfo getResultCodes(int i) {
        return this.resultCodes[i];
    }

    public void setResultCodes(int i, com.turkcelltech.cpgw.ws.ResultCodeInfo _value) {
        this.resultCodes[i] = _value;
    }


    /**
     * Gets the sectors value for this GetParametersResponse.
     * 
     * @return sectors
     */
    public com.turkcelltech.cpgw.ws.SectorInfo[] getSectors() {
        return sectors;
    }


    /**
     * Sets the sectors value for this GetParametersResponse.
     * 
     * @param sectors
     */
    public void setSectors(com.turkcelltech.cpgw.ws.SectorInfo[] sectors) {
        this.sectors = sectors;
    }

    public com.turkcelltech.cpgw.ws.SectorInfo getSectors(int i) {
        return this.sectors[i];
    }

    public void setSectors(int i, com.turkcelltech.cpgw.ws.SectorInfo _value) {
        this.sectors[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetParametersResponse)) return false;
        GetParametersResponse other = (GetParametersResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.corporations==null && other.getCorporations()==null) || 
             (this.corporations!=null &&
              java.util.Arrays.equals(this.corporations, other.getCorporations()))) &&
            ((this.okcVersion==null && other.getOkcVersion()==null) || 
             (this.okcVersion!=null &&
              this.okcVersion.equals(other.getOkcVersion()))) &&
            ((this.resultCodes==null && other.getResultCodes()==null) || 
             (this.resultCodes!=null &&
              java.util.Arrays.equals(this.resultCodes, other.getResultCodes()))) &&
            ((this.sectors==null && other.getSectors()==null) || 
             (this.sectors!=null &&
              java.util.Arrays.equals(this.sectors, other.getSectors())));
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
        if (getCorporations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCorporations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCorporations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOkcVersion() != null) {
            _hashCode += getOkcVersion().hashCode();
        }
        if (getResultCodes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResultCodes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResultCodes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSectors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSectors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSectors(), i);
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
        new org.apache.axis.description.TypeDesc(GetParametersResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getParametersResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corporations");
        elemField.setXmlName(new javax.xml.namespace.QName("", "corporations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "corporationInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("okcVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "okcVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultCodes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultCodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "resultCodeInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sectors");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sectors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "sectorInfo"));
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
