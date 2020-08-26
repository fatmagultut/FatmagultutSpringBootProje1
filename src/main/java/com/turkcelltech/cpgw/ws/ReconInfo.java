/**
 * ReconInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class ReconInfo  implements java.io.Serializable {
    private java.lang.String reconDate;

    private java.math.BigDecimal totalCancelAmount;

    private java.lang.Long totalCancelNumber;

    private java.math.BigDecimal totalPaymentAmount;

    private java.lang.Long totalPaymentNumber;

    public ReconInfo() {
    }

    public ReconInfo(
           java.lang.String reconDate,
           java.math.BigDecimal totalCancelAmount,
           java.lang.Long totalCancelNumber,
           java.math.BigDecimal totalPaymentAmount,
           java.lang.Long totalPaymentNumber) {
           this.reconDate = reconDate;
           this.totalCancelAmount = totalCancelAmount;
           this.totalCancelNumber = totalCancelNumber;
           this.totalPaymentAmount = totalPaymentAmount;
           this.totalPaymentNumber = totalPaymentNumber;
    }


    /**
     * Gets the reconDate value for this ReconInfo.
     * 
     * @return reconDate
     */
    public java.lang.String getReconDate() {
        return reconDate;
    }


    /**
     * Sets the reconDate value for this ReconInfo.
     * 
     * @param reconDate
     */
    public void setReconDate(java.lang.String reconDate) {
        this.reconDate = reconDate;
    }


    /**
     * Gets the totalCancelAmount value for this ReconInfo.
     * 
     * @return totalCancelAmount
     */
    public java.math.BigDecimal getTotalCancelAmount() {
        return totalCancelAmount;
    }


    /**
     * Sets the totalCancelAmount value for this ReconInfo.
     * 
     * @param totalCancelAmount
     */
    public void setTotalCancelAmount(java.math.BigDecimal totalCancelAmount) {
        this.totalCancelAmount = totalCancelAmount;
    }


    /**
     * Gets the totalCancelNumber value for this ReconInfo.
     * 
     * @return totalCancelNumber
     */
    public java.lang.Long getTotalCancelNumber() {
        return totalCancelNumber;
    }


    /**
     * Sets the totalCancelNumber value for this ReconInfo.
     * 
     * @param totalCancelNumber
     */
    public void setTotalCancelNumber(java.lang.Long totalCancelNumber) {
        this.totalCancelNumber = totalCancelNumber;
    }


    /**
     * Gets the totalPaymentAmount value for this ReconInfo.
     * 
     * @return totalPaymentAmount
     */
    public java.math.BigDecimal getTotalPaymentAmount() {
        return totalPaymentAmount;
    }


    /**
     * Sets the totalPaymentAmount value for this ReconInfo.
     * 
     * @param totalPaymentAmount
     */
    public void setTotalPaymentAmount(java.math.BigDecimal totalPaymentAmount) {
        this.totalPaymentAmount = totalPaymentAmount;
    }


    /**
     * Gets the totalPaymentNumber value for this ReconInfo.
     * 
     * @return totalPaymentNumber
     */
    public java.lang.Long getTotalPaymentNumber() {
        return totalPaymentNumber;
    }


    /**
     * Sets the totalPaymentNumber value for this ReconInfo.
     * 
     * @param totalPaymentNumber
     */
    public void setTotalPaymentNumber(java.lang.Long totalPaymentNumber) {
        this.totalPaymentNumber = totalPaymentNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReconInfo)) return false;
        ReconInfo other = (ReconInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.reconDate==null && other.getReconDate()==null) || 
             (this.reconDate!=null &&
              this.reconDate.equals(other.getReconDate()))) &&
            ((this.totalCancelAmount==null && other.getTotalCancelAmount()==null) || 
             (this.totalCancelAmount!=null &&
              this.totalCancelAmount.equals(other.getTotalCancelAmount()))) &&
            ((this.totalCancelNumber==null && other.getTotalCancelNumber()==null) || 
             (this.totalCancelNumber!=null &&
              this.totalCancelNumber.equals(other.getTotalCancelNumber()))) &&
            ((this.totalPaymentAmount==null && other.getTotalPaymentAmount()==null) || 
             (this.totalPaymentAmount!=null &&
              this.totalPaymentAmount.equals(other.getTotalPaymentAmount()))) &&
            ((this.totalPaymentNumber==null && other.getTotalPaymentNumber()==null) || 
             (this.totalPaymentNumber!=null &&
              this.totalPaymentNumber.equals(other.getTotalPaymentNumber())));
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
        if (getReconDate() != null) {
            _hashCode += getReconDate().hashCode();
        }
        if (getTotalCancelAmount() != null) {
            _hashCode += getTotalCancelAmount().hashCode();
        }
        if (getTotalCancelNumber() != null) {
            _hashCode += getTotalCancelNumber().hashCode();
        }
        if (getTotalPaymentAmount() != null) {
            _hashCode += getTotalPaymentAmount().hashCode();
        }
        if (getTotalPaymentNumber() != null) {
            _hashCode += getTotalPaymentNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReconInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "reconInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reconDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reconDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCancelAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalCancelAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCancelNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalCancelNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalPaymentAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalPaymentAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalPaymentNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalPaymentNumber"));
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
