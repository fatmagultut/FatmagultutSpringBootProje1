/**
 * CorporationInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class CorporationInfo  extends com.turkcelltech.cpgw.ws.CpgwModel  implements java.io.Serializable {
    private java.lang.Boolean active;

    private java.lang.Integer appPriority;

    private java.lang.String appTag;

    private com.turkcelltech.cpgw.ws.CityInfo[] cities;

    private com.turkcelltech.cpgw.ws.CollectionMethodEnum collectionMethod;

    private java.lang.Long corpCode;

    private java.lang.String corpName;

    private java.lang.String currency;

    private com.turkcelltech.cpgw.ws.InvoiceTypeEnum[] invoiceTypes;

    private java.lang.Integer omccChannelId;

    private com.turkcelltech.cpgw.ws.RequiredFieldInfo[] requiredFields;

    private java.lang.String sector;

    private java.lang.Long sectorId;

    private java.lang.String subMerchantCode;

    private java.lang.Long vendorId;

    public CorporationInfo() {
    }

    public CorporationInfo(
           java.lang.Boolean active,
           java.lang.Integer appPriority,
           java.lang.String appTag,
           com.turkcelltech.cpgw.ws.CityInfo[] cities,
           com.turkcelltech.cpgw.ws.CollectionMethodEnum collectionMethod,
           java.lang.Long corpCode,
           java.lang.String corpName,
           java.lang.String currency,
           com.turkcelltech.cpgw.ws.InvoiceTypeEnum[] invoiceTypes,
           java.lang.Integer omccChannelId,
           com.turkcelltech.cpgw.ws.RequiredFieldInfo[] requiredFields,
           java.lang.String sector,
           java.lang.Long sectorId,
           java.lang.String subMerchantCode,
           java.lang.Long vendorId) {
        this.active = active;
        this.appPriority = appPriority;
        this.appTag = appTag;
        this.cities = cities;
        this.collectionMethod = collectionMethod;
        this.corpCode = corpCode;
        this.corpName = corpName;
        this.currency = currency;
        this.invoiceTypes = invoiceTypes;
        this.omccChannelId = omccChannelId;
        this.requiredFields = requiredFields;
        this.sector = sector;
        this.sectorId = sectorId;
        this.subMerchantCode = subMerchantCode;
        this.vendorId = vendorId;
    }


    /**
     * Gets the active value for this CorporationInfo.
     * 
     * @return active
     */
    public java.lang.Boolean getActive() {
        return active;
    }


    /**
     * Sets the active value for this CorporationInfo.
     * 
     * @param active
     */
    public void setActive(java.lang.Boolean active) {
        this.active = active;
    }


    /**
     * Gets the appPriority value for this CorporationInfo.
     * 
     * @return appPriority
     */
    public java.lang.Integer getAppPriority() {
        return appPriority;
    }


    /**
     * Sets the appPriority value for this CorporationInfo.
     * 
     * @param appPriority
     */
    public void setAppPriority(java.lang.Integer appPriority) {
        this.appPriority = appPriority;
    }


    /**
     * Gets the appTag value for this CorporationInfo.
     * 
     * @return appTag
     */
    public java.lang.String getAppTag() {
        return appTag;
    }


    /**
     * Sets the appTag value for this CorporationInfo.
     * 
     * @param appTag
     */
    public void setAppTag(java.lang.String appTag) {
        this.appTag = appTag;
    }


    /**
     * Gets the cities value for this CorporationInfo.
     * 
     * @return cities
     */
    public com.turkcelltech.cpgw.ws.CityInfo[] getCities() {
        return cities;
    }


    /**
     * Sets the cities value for this CorporationInfo.
     * 
     * @param cities
     */
    public void setCities(com.turkcelltech.cpgw.ws.CityInfo[] cities) {
        this.cities = cities;
    }

    public com.turkcelltech.cpgw.ws.CityInfo getCities(int i) {
        return this.cities[i];
    }

    public void setCities(int i, com.turkcelltech.cpgw.ws.CityInfo _value) {
        this.cities[i] = _value;
    }


    /**
     * Gets the collectionMethod value for this CorporationInfo.
     * 
     * @return collectionMethod
     */
    public com.turkcelltech.cpgw.ws.CollectionMethodEnum getCollectionMethod() {
        return collectionMethod;
    }


    /**
     * Sets the collectionMethod value for this CorporationInfo.
     * 
     * @param collectionMethod
     */
    public void setCollectionMethod(com.turkcelltech.cpgw.ws.CollectionMethodEnum collectionMethod) {
        this.collectionMethod = collectionMethod;
    }


    /**
     * Gets the corpCode value for this CorporationInfo.
     * 
     * @return corpCode
     */
    public java.lang.Long getCorpCode() {
        return corpCode;
    }


    /**
     * Sets the corpCode value for this CorporationInfo.
     * 
     * @param corpCode
     */
    public void setCorpCode(java.lang.Long corpCode) {
        this.corpCode = corpCode;
    }


    /**
     * Gets the corpName value for this CorporationInfo.
     * 
     * @return corpName
     */
    public java.lang.String getCorpName() {
        return corpName;
    }


    /**
     * Sets the corpName value for this CorporationInfo.
     * 
     * @param corpName
     */
    public void setCorpName(java.lang.String corpName) {
        this.corpName = corpName;
    }


    /**
     * Gets the currency value for this CorporationInfo.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this CorporationInfo.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the invoiceTypes value for this CorporationInfo.
     * 
     * @return invoiceTypes
     */
    public com.turkcelltech.cpgw.ws.InvoiceTypeEnum[] getInvoiceTypes() {
        return invoiceTypes;
    }


    /**
     * Sets the invoiceTypes value for this CorporationInfo.
     * 
     * @param invoiceTypes
     */
    public void setInvoiceTypes(com.turkcelltech.cpgw.ws.InvoiceTypeEnum[] invoiceTypes) {
        this.invoiceTypes = invoiceTypes;
    }

    public com.turkcelltech.cpgw.ws.InvoiceTypeEnum getInvoiceTypes(int i) {
        return this.invoiceTypes[i];
    }

    public void setInvoiceTypes(int i, com.turkcelltech.cpgw.ws.InvoiceTypeEnum _value) {
        this.invoiceTypes[i] = _value;
    }


    /**
     * Gets the omccChannelId value for this CorporationInfo.
     * 
     * @return omccChannelId
     */
    public java.lang.Integer getOmccChannelId() {
        return omccChannelId;
    }


    /**
     * Sets the omccChannelId value for this CorporationInfo.
     * 
     * @param omccChannelId
     */
    public void setOmccChannelId(java.lang.Integer omccChannelId) {
        this.omccChannelId = omccChannelId;
    }


    /**
     * Gets the requiredFields value for this CorporationInfo.
     * 
     * @return requiredFields
     */
    public com.turkcelltech.cpgw.ws.RequiredFieldInfo[] getRequiredFields() {
        return requiredFields;
    }


    /**
     * Sets the requiredFields value for this CorporationInfo.
     * 
     * @param requiredFields
     */
    public void setRequiredFields(com.turkcelltech.cpgw.ws.RequiredFieldInfo[] requiredFields) {
        this.requiredFields = requiredFields;
    }

    public com.turkcelltech.cpgw.ws.RequiredFieldInfo getRequiredFields(int i) {
        return this.requiredFields[i];
    }

    public void setRequiredFields(int i, com.turkcelltech.cpgw.ws.RequiredFieldInfo _value) {
        this.requiredFields[i] = _value;
    }


    /**
     * Gets the sector value for this CorporationInfo.
     * 
     * @return sector
     */
    public java.lang.String getSector() {
        return sector;
    }


    /**
     * Sets the sector value for this CorporationInfo.
     * 
     * @param sector
     */
    public void setSector(java.lang.String sector) {
        this.sector = sector;
    }


    /**
     * Gets the sectorId value for this CorporationInfo.
     * 
     * @return sectorId
     */
    public java.lang.Long getSectorId() {
        return sectorId;
    }


    /**
     * Sets the sectorId value for this CorporationInfo.
     * 
     * @param sectorId
     */
    public void setSectorId(java.lang.Long sectorId) {
        this.sectorId = sectorId;
    }


    /**
     * Gets the subMerchantCode value for this CorporationInfo.
     * 
     * @return subMerchantCode
     */
    public java.lang.String getSubMerchantCode() {
        return subMerchantCode;
    }


    /**
     * Sets the subMerchantCode value for this CorporationInfo.
     * 
     * @param subMerchantCode
     */
    public void setSubMerchantCode(java.lang.String subMerchantCode) {
        this.subMerchantCode = subMerchantCode;
    }


    /**
     * Gets the vendorId value for this CorporationInfo.
     * 
     * @return vendorId
     */
    public java.lang.Long getVendorId() {
        return vendorId;
    }


    /**
     * Sets the vendorId value for this CorporationInfo.
     * 
     * @param vendorId
     */
    public void setVendorId(java.lang.Long vendorId) {
        this.vendorId = vendorId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CorporationInfo)) return false;
        CorporationInfo other = (CorporationInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.active==null && other.getActive()==null) || 
             (this.active!=null &&
              this.active.equals(other.getActive()))) &&
            ((this.appPriority==null && other.getAppPriority()==null) || 
             (this.appPriority!=null &&
              this.appPriority.equals(other.getAppPriority()))) &&
            ((this.appTag==null && other.getAppTag()==null) || 
             (this.appTag!=null &&
              this.appTag.equals(other.getAppTag()))) &&
            ((this.cities==null && other.getCities()==null) || 
             (this.cities!=null &&
              java.util.Arrays.equals(this.cities, other.getCities()))) &&
            ((this.collectionMethod==null && other.getCollectionMethod()==null) || 
             (this.collectionMethod!=null &&
              this.collectionMethod.equals(other.getCollectionMethod()))) &&
            ((this.corpCode==null && other.getCorpCode()==null) || 
             (this.corpCode!=null &&
              this.corpCode.equals(other.getCorpCode()))) &&
            ((this.corpName==null && other.getCorpName()==null) || 
             (this.corpName!=null &&
              this.corpName.equals(other.getCorpName()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.invoiceTypes==null && other.getInvoiceTypes()==null) || 
             (this.invoiceTypes!=null &&
              java.util.Arrays.equals(this.invoiceTypes, other.getInvoiceTypes()))) &&
            ((this.omccChannelId==null && other.getOmccChannelId()==null) || 
             (this.omccChannelId!=null &&
              this.omccChannelId.equals(other.getOmccChannelId()))) &&
            ((this.requiredFields==null && other.getRequiredFields()==null) || 
             (this.requiredFields!=null &&
              java.util.Arrays.equals(this.requiredFields, other.getRequiredFields()))) &&
            ((this.sector==null && other.getSector()==null) || 
             (this.sector!=null &&
              this.sector.equals(other.getSector()))) &&
            ((this.sectorId==null && other.getSectorId()==null) || 
             (this.sectorId!=null &&
              this.sectorId.equals(other.getSectorId()))) &&
            ((this.subMerchantCode==null && other.getSubMerchantCode()==null) || 
             (this.subMerchantCode!=null &&
              this.subMerchantCode.equals(other.getSubMerchantCode()))) &&
            ((this.vendorId==null && other.getVendorId()==null) || 
             (this.vendorId!=null &&
              this.vendorId.equals(other.getVendorId())));
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
        if (getActive() != null) {
            _hashCode += getActive().hashCode();
        }
        if (getAppPriority() != null) {
            _hashCode += getAppPriority().hashCode();
        }
        if (getAppTag() != null) {
            _hashCode += getAppTag().hashCode();
        }
        if (getCities() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCities());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCities(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCollectionMethod() != null) {
            _hashCode += getCollectionMethod().hashCode();
        }
        if (getCorpCode() != null) {
            _hashCode += getCorpCode().hashCode();
        }
        if (getCorpName() != null) {
            _hashCode += getCorpName().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getInvoiceTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInvoiceTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInvoiceTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOmccChannelId() != null) {
            _hashCode += getOmccChannelId().hashCode();
        }
        if (getRequiredFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRequiredFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRequiredFields(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSector() != null) {
            _hashCode += getSector().hashCode();
        }
        if (getSectorId() != null) {
            _hashCode += getSectorId().hashCode();
        }
        if (getSubMerchantCode() != null) {
            _hashCode += getSubMerchantCode().hashCode();
        }
        if (getVendorId() != null) {
            _hashCode += getVendorId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CorporationInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "corporationInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appPriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appTag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appTag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cities");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cityInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collectionMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "collectionMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "collectionMethodEnum"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corpCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "corpCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corpName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "corpName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "invoiceTypeEnum"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("omccChannelId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "omccChannelId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requiredFields");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requiredFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "requiredFieldInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sector");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sector"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sectorId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sectorId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subMerchantCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subMerchantCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vendorId"));
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
