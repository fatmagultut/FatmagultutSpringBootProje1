/**
 * DgPaymentsInstList4CardRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class DgPaymentsInstList4CardRequest  implements java.io.Serializable {
    private java.lang.String dateTime;

    private java.lang.String endDate;

    private java.lang.String hash;

    private java.lang.String institutionId;

    private java.lang.String language;

    private java.lang.String orderId;

    private java.lang.String rnd;

    private java.lang.String startDate;

    private java.lang.String uidOralias;

    private java.lang.String userName;

    private java.lang.String userPass;

    public DgPaymentsInstList4CardRequest() {
    }

    public DgPaymentsInstList4CardRequest(
           java.lang.String dateTime,
           java.lang.String endDate,
           java.lang.String hash,
           java.lang.String institutionId,
           java.lang.String language,
           java.lang.String orderId,
           java.lang.String rnd,
           java.lang.String startDate,
           java.lang.String uidOralias,
           java.lang.String userName,
           java.lang.String userPass) {
           this.dateTime = dateTime;
           this.endDate = endDate;
           this.hash = hash;
           this.institutionId = institutionId;
           this.language = language;
           this.orderId = orderId;
           this.rnd = rnd;
           this.startDate = startDate;
           this.uidOralias = uidOralias;
           this.userName = userName;
           this.userPass = userPass;
    }


    /**
     * Gets the dateTime value for this DgPaymentsInstList4CardRequest.
     * 
     * @return dateTime
     */
    public java.lang.String getDateTime() {
        return dateTime;
    }


    /**
     * Sets the dateTime value for this DgPaymentsInstList4CardRequest.
     * 
     * @param dateTime
     */
    public void setDateTime(java.lang.String dateTime) {
        this.dateTime = dateTime;
    }


    /**
     * Gets the endDate value for this DgPaymentsInstList4CardRequest.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this DgPaymentsInstList4CardRequest.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the hash value for this DgPaymentsInstList4CardRequest.
     * 
     * @return hash
     */
    public java.lang.String getHash() {
        return hash;
    }


    /**
     * Sets the hash value for this DgPaymentsInstList4CardRequest.
     * 
     * @param hash
     */
    public void setHash(java.lang.String hash) {
        this.hash = hash;
    }


    /**
     * Gets the institutionId value for this DgPaymentsInstList4CardRequest.
     * 
     * @return institutionId
     */
    public java.lang.String getInstitutionId() {
        return institutionId;
    }


    /**
     * Sets the institutionId value for this DgPaymentsInstList4CardRequest.
     * 
     * @param institutionId
     */
    public void setInstitutionId(java.lang.String institutionId) {
        this.institutionId = institutionId;
    }


    /**
     * Gets the language value for this DgPaymentsInstList4CardRequest.
     * 
     * @return language
     */
    public java.lang.String getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this DgPaymentsInstList4CardRequest.
     * 
     * @param language
     */
    public void setLanguage(java.lang.String language) {
        this.language = language;
    }


    /**
     * Gets the orderId value for this DgPaymentsInstList4CardRequest.
     * 
     * @return orderId
     */
    public java.lang.String getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this DgPaymentsInstList4CardRequest.
     * 
     * @param orderId
     */
    public void setOrderId(java.lang.String orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the rnd value for this DgPaymentsInstList4CardRequest.
     * 
     * @return rnd
     */
    public java.lang.String getRnd() {
        return rnd;
    }


    /**
     * Sets the rnd value for this DgPaymentsInstList4CardRequest.
     * 
     * @param rnd
     */
    public void setRnd(java.lang.String rnd) {
        this.rnd = rnd;
    }


    /**
     * Gets the startDate value for this DgPaymentsInstList4CardRequest.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this DgPaymentsInstList4CardRequest.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the uidOralias value for this DgPaymentsInstList4CardRequest.
     * 
     * @return uidOralias
     */
    public java.lang.String getUidOralias() {
        return uidOralias;
    }


    /**
     * Sets the uidOralias value for this DgPaymentsInstList4CardRequest.
     * 
     * @param uidOralias
     */
    public void setUidOralias(java.lang.String uidOralias) {
        this.uidOralias = uidOralias;
    }


    /**
     * Gets the userName value for this DgPaymentsInstList4CardRequest.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this DgPaymentsInstList4CardRequest.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the userPass value for this DgPaymentsInstList4CardRequest.
     * 
     * @return userPass
     */
    public java.lang.String getUserPass() {
        return userPass;
    }


    /**
     * Sets the userPass value for this DgPaymentsInstList4CardRequest.
     * 
     * @param userPass
     */
    public void setUserPass(java.lang.String userPass) {
        this.userPass = userPass;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DgPaymentsInstList4CardRequest)) return false;
        DgPaymentsInstList4CardRequest other = (DgPaymentsInstList4CardRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dateTime==null && other.getDateTime()==null) || 
             (this.dateTime!=null &&
              this.dateTime.equals(other.getDateTime()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.hash==null && other.getHash()==null) || 
             (this.hash!=null &&
              this.hash.equals(other.getHash()))) &&
            ((this.institutionId==null && other.getInstitutionId()==null) || 
             (this.institutionId!=null &&
              this.institutionId.equals(other.getInstitutionId()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.orderId==null && other.getOrderId()==null) || 
             (this.orderId!=null &&
              this.orderId.equals(other.getOrderId()))) &&
            ((this.rnd==null && other.getRnd()==null) || 
             (this.rnd!=null &&
              this.rnd.equals(other.getRnd()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.uidOralias==null && other.getUidOralias()==null) || 
             (this.uidOralias!=null &&
              this.uidOralias.equals(other.getUidOralias()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.userPass==null && other.getUserPass()==null) || 
             (this.userPass!=null &&
              this.userPass.equals(other.getUserPass())));
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
        if (getDateTime() != null) {
            _hashCode += getDateTime().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getHash() != null) {
            _hashCode += getHash().hashCode();
        }
        if (getInstitutionId() != null) {
            _hashCode += getInstitutionId().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getOrderId() != null) {
            _hashCode += getOrderId().hashCode();
        }
        if (getRnd() != null) {
            _hashCode += getRnd().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getUidOralias() != null) {
            _hashCode += getUidOralias().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getUserPass() != null) {
            _hashCode += getUserPass().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DgPaymentsInstList4CardRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "dgPaymentsInstList4CardRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateTime"));
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
        elemField.setFieldName("hash");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hash"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("institutionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "institutionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("", "language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rnd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rnd"));
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
        elemField.setFieldName("uidOralias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uidOralias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPass");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userPass"));
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
