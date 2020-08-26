/**
 * DgPaymentsInstList4Card.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws;

public class DgPaymentsInstList4Card  implements java.io.Serializable {
    private java.lang.String alias;

    private java.lang.String amount;

    private java.lang.String cardUID;

    private java.lang.String insertionDate;

    private java.lang.String instructionId;

    private java.lang.Long instructionStatusId;

    private com.turkcelltech.cpgw.ws.DgPaymentsReceiptInfo receiptInfo;

    public DgPaymentsInstList4Card() {
    }

    public DgPaymentsInstList4Card(
           java.lang.String alias,
           java.lang.String amount,
           java.lang.String cardUID,
           java.lang.String insertionDate,
           java.lang.String instructionId,
           java.lang.Long instructionStatusId,
           com.turkcelltech.cpgw.ws.DgPaymentsReceiptInfo receiptInfo) {
           this.alias = alias;
           this.amount = amount;
           this.cardUID = cardUID;
           this.insertionDate = insertionDate;
           this.instructionId = instructionId;
           this.instructionStatusId = instructionStatusId;
           this.receiptInfo = receiptInfo;
    }


    /**
     * Gets the alias value for this DgPaymentsInstList4Card.
     * 
     * @return alias
     */
    public java.lang.String getAlias() {
        return alias;
    }


    /**
     * Sets the alias value for this DgPaymentsInstList4Card.
     * 
     * @param alias
     */
    public void setAlias(java.lang.String alias) {
        this.alias = alias;
    }


    /**
     * Gets the amount value for this DgPaymentsInstList4Card.
     * 
     * @return amount
     */
    public java.lang.String getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this DgPaymentsInstList4Card.
     * 
     * @param amount
     */
    public void setAmount(java.lang.String amount) {
        this.amount = amount;
    }


    /**
     * Gets the cardUID value for this DgPaymentsInstList4Card.
     * 
     * @return cardUID
     */
    public java.lang.String getCardUID() {
        return cardUID;
    }


    /**
     * Sets the cardUID value for this DgPaymentsInstList4Card.
     * 
     * @param cardUID
     */
    public void setCardUID(java.lang.String cardUID) {
        this.cardUID = cardUID;
    }


    /**
     * Gets the insertionDate value for this DgPaymentsInstList4Card.
     * 
     * @return insertionDate
     */
    public java.lang.String getInsertionDate() {
        return insertionDate;
    }


    /**
     * Sets the insertionDate value for this DgPaymentsInstList4Card.
     * 
     * @param insertionDate
     */
    public void setInsertionDate(java.lang.String insertionDate) {
        this.insertionDate = insertionDate;
    }


    /**
     * Gets the instructionId value for this DgPaymentsInstList4Card.
     * 
     * @return instructionId
     */
    public java.lang.String getInstructionId() {
        return instructionId;
    }


    /**
     * Sets the instructionId value for this DgPaymentsInstList4Card.
     * 
     * @param instructionId
     */
    public void setInstructionId(java.lang.String instructionId) {
        this.instructionId = instructionId;
    }


    /**
     * Gets the instructionStatusId value for this DgPaymentsInstList4Card.
     * 
     * @return instructionStatusId
     */
    public java.lang.Long getInstructionStatusId() {
        return instructionStatusId;
    }


    /**
     * Sets the instructionStatusId value for this DgPaymentsInstList4Card.
     * 
     * @param instructionStatusId
     */
    public void setInstructionStatusId(java.lang.Long instructionStatusId) {
        this.instructionStatusId = instructionStatusId;
    }


    /**
     * Gets the receiptInfo value for this DgPaymentsInstList4Card.
     * 
     * @return receiptInfo
     */
    public com.turkcelltech.cpgw.ws.DgPaymentsReceiptInfo getReceiptInfo() {
        return receiptInfo;
    }


    /**
     * Sets the receiptInfo value for this DgPaymentsInstList4Card.
     * 
     * @param receiptInfo
     */
    public void setReceiptInfo(com.turkcelltech.cpgw.ws.DgPaymentsReceiptInfo receiptInfo) {
        this.receiptInfo = receiptInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DgPaymentsInstList4Card)) return false;
        DgPaymentsInstList4Card other = (DgPaymentsInstList4Card) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.alias==null && other.getAlias()==null) || 
             (this.alias!=null &&
              this.alias.equals(other.getAlias()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.cardUID==null && other.getCardUID()==null) || 
             (this.cardUID!=null &&
              this.cardUID.equals(other.getCardUID()))) &&
            ((this.insertionDate==null && other.getInsertionDate()==null) || 
             (this.insertionDate!=null &&
              this.insertionDate.equals(other.getInsertionDate()))) &&
            ((this.instructionId==null && other.getInstructionId()==null) || 
             (this.instructionId!=null &&
              this.instructionId.equals(other.getInstructionId()))) &&
            ((this.instructionStatusId==null && other.getInstructionStatusId()==null) || 
             (this.instructionStatusId!=null &&
              this.instructionStatusId.equals(other.getInstructionStatusId()))) &&
            ((this.receiptInfo==null && other.getReceiptInfo()==null) || 
             (this.receiptInfo!=null &&
              this.receiptInfo.equals(other.getReceiptInfo())));
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
        if (getAlias() != null) {
            _hashCode += getAlias().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getCardUID() != null) {
            _hashCode += getCardUID().hashCode();
        }
        if (getInsertionDate() != null) {
            _hashCode += getInsertionDate().hashCode();
        }
        if (getInstructionId() != null) {
            _hashCode += getInstructionId().hashCode();
        }
        if (getInstructionStatusId() != null) {
            _hashCode += getInstructionStatusId().hashCode();
        }
        if (getReceiptInfo() != null) {
            _hashCode += getReceiptInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DgPaymentsInstList4Card.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "dgPaymentsInstList4Card"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardUID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "insertionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instructionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "instructionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instructionStatusId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "instructionStatusId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiptInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "dgPaymentsReceiptInfo"));
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
