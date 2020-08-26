/**
 * RemoveFavoriteCorporationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class RemoveFavoriteCorporationRequest  extends com.turkcelltech.cpgw.ws.RequestTypeWithChannelRefNo  implements java.io.Serializable {
    private java.lang.Long corpCode;

    private java.lang.Long favCorpId;

    private java.lang.Long firmaId;

    public RemoveFavoriteCorporationRequest() {
    }

    public RemoveFavoriteCorporationRequest(
           com.turkcelltech.cpgw.ws.RequestHeader requestHeader,
           java.lang.String channelRefNo,
           java.lang.Long corpCode,
           java.lang.Long favCorpId,
           java.lang.Long firmaId) {
        super(
            requestHeader,
            channelRefNo);
        this.corpCode = corpCode;
        this.favCorpId = favCorpId;
        this.firmaId = firmaId;
    }


    /**
     * Gets the corpCode value for this RemoveFavoriteCorporationRequest.
     * 
     * @return corpCode
     */
    public java.lang.Long getCorpCode() {
        return corpCode;
    }


    /**
     * Sets the corpCode value for this RemoveFavoriteCorporationRequest.
     * 
     * @param corpCode
     */
    public void setCorpCode(java.lang.Long corpCode) {
        this.corpCode = corpCode;
    }


    /**
     * Gets the favCorpId value for this RemoveFavoriteCorporationRequest.
     * 
     * @return favCorpId
     */
    public java.lang.Long getFavCorpId() {
        return favCorpId;
    }


    /**
     * Sets the favCorpId value for this RemoveFavoriteCorporationRequest.
     * 
     * @param favCorpId
     */
    public void setFavCorpId(java.lang.Long favCorpId) {
        this.favCorpId = favCorpId;
    }


    /**
     * Gets the firmaId value for this RemoveFavoriteCorporationRequest.
     * 
     * @return firmaId
     */
    public java.lang.Long getFirmaId() {
        return firmaId;
    }


    /**
     * Sets the firmaId value for this RemoveFavoriteCorporationRequest.
     * 
     * @param firmaId
     */
    public void setFirmaId(java.lang.Long firmaId) {
        this.firmaId = firmaId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoveFavoriteCorporationRequest)) return false;
        RemoveFavoriteCorporationRequest other = (RemoveFavoriteCorporationRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.corpCode==null && other.getCorpCode()==null) || 
             (this.corpCode!=null &&
              this.corpCode.equals(other.getCorpCode()))) &&
            ((this.favCorpId==null && other.getFavCorpId()==null) || 
             (this.favCorpId!=null &&
              this.favCorpId.equals(other.getFavCorpId()))) &&
            ((this.firmaId==null && other.getFirmaId()==null) || 
             (this.firmaId!=null &&
              this.firmaId.equals(other.getFirmaId())));
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
        if (getCorpCode() != null) {
            _hashCode += getCorpCode().hashCode();
        }
        if (getFavCorpId() != null) {
            _hashCode += getFavCorpId().hashCode();
        }
        if (getFirmaId() != null) {
            _hashCode += getFirmaId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoveFavoriteCorporationRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "removeFavoriteCorporationRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corpCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "corpCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("favCorpId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "favCorpId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firmaId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firmaId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
