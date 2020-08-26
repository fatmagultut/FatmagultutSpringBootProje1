/**
 * CorpPaymentWsImplServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws.impl;

public class CorpPaymentWsImplServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.turkcelltech.cpgw.ws.CorpPaymentService {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[37];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("listSavedInvoice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "listSavedInvoice"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "invoiceListRequest"), com.turkcelltech.cpgw.ws.InvoiceListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "invoiceListResponse"));
        oper.setReturnClass(com.turkcelltech.cpgw.ws.InvoiceListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "listSavedInvoiceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cpgwAuthP1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwAuthP1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwBelbimAuthP1Request"), com.turkcelltech.cpgw.ws.CpgwBelbimAuthP1Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwBelbimAuthP1Response"));
        oper.setReturnClass(com.turkcelltech.cpgw.ws.CpgwBelbimAuthP1Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwAuthP1Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPaymentRefundList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getPaymentRefundList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "paymentRefundListRequest"), com.turkcelltech.cpgw.ws.PaymentRefundListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "paymentRefundListResponse"));
        oper.setReturnClass(com.turkcelltech.cpgw.ws.PaymentRefundListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getPaymentRefundListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPolicyStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getPolicyStatus"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwGetPolicyStatusRequest"), com.turkcelltech.cpgw.ws.CpgwGetPolicyStatusRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwGetPolicyStatusResponse"));
        oper.setReturnClass(com.turkcelltech.cpgw.ws.CpgwGetPolicyStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getPolicyStatusResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cpgwAuthP2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwAuthP2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwBelbimAuthP2Request"), com.turkcelltech.cpgw.ws.CpgwBelbimAuthP2Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwBelbimAuthP2Response"));
        oper.setReturnClass(com.turkcelltech.cpgw.ws.CpgwBelbimAuthP2Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwAuthP2Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cpgwBelbimInstructionList4Card");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwBelbimInstructionList4Card"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwBelbimGetInstructionList4CardRequest"), com.turkcelltech.cpgw.ws.CpgwBelbimGetInstructionList4CardRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwBelbimGetInstructionList4CardResponse"));
        oper.setReturnClass(com.turkcelltech.cpgw.ws.CpgwBelbimGetInstructionList4CardResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwBelbimInstructionList4CardResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("inquireInvoice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "inquireInvoice"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "inquireInvoiceRequest"), com.turkcelltech.cpgw.ws.InquireInvoiceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "inquireInvoiceResponse"));
        oper.setReturnClass(com.turkcelltech.cpgw.ws.InquireInvoiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "inquireInvoiceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cpgwBelbimSearchCard");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwBelbimSearchCard"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwBelbimSearchCardRequest"), com.turkcelltech.cpgw.ws.CpgwBelbimSearchCardRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwBelbimSearchCardResponse"));
        oper.setReturnClass(com.turkcelltech.cpgw.ws.CpgwBelbimSearchCardResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwBelbimSearchCardResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cpgwBelbimSearchCardWithAuthP1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwBelbimSearchCardWithAuthP1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwBelbimSearchCardWithAuth1P1Request"), com.turkcelltech.cpgw.ws.CpgwBelbimSearchCardWithAuth1P1Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwBelbimSearchCardWithAuthP1Response"));
        oper.setReturnClass(com.turkcelltech.cpgw.ws.CpgwBelbimSearchCardWithAuthP1Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwBelbimSearchCardWithAuthP1Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getReceipt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getReceipt"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getReceiptRequest"), com.turkcelltech.cpgw.ws.GetReceiptRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getReceiptResponse"));
        oper.setReturnClass(com.turkcelltech.cpgw.ws.GetReceiptResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getReceiptResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("savePaymentRefundConfirmation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "savePaymentRefundConfirmation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "paymentRefundConfirmationRequest"), com.turkcelltech.cpgw.ws.PaymentRefundConfirmationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "responseType"));
        oper.setReturnClass(com.turkcelltech.cpgw.ws.ResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "savePaymentRefundConfirmationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cpgwWriteCard");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwWriteCard"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwBelbimWriteCardRequest"), com.turkcelltech.cpgw.ws.CpgwBelbimWriteCardRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwBelbimWriteCardResponse"));
        oper.setReturnClass(com.turkcelltech.cpgw.ws.CpgwBelbimWriteCardResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwWriteCardResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAllComplaintCategories");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getAllComplaintCategories"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getComplaintCategoriesRequest"), com.turkcelltech.cpgw.ws.GetComplaintCategoriesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getComplaintCategoriesResponse"));
        oper.setReturnClass(com.turkcelltech.cpgw.ws.GetComplaintCategoriesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getAllComplaintCategoriesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeFavoriteCorporation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "removeFavoriteCorporation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "removeFavoriteCorporationRequest"), com.turkcelltech.cpgw.ws.RemoveFavoriteCorporationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "removeFavoriteCorporationResponse"));
        oper.setReturnClass(com.turkcelltech.cpgw.ws.RemoveFavoriteCorporationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "removeFavoriteCorporationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCorporation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getCorporation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getCorporationRequest"), com.turkcelltech.cpgw.ws.GetCorporationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getCorporationResponse"));
        oper.setReturnClass(com.turkcelltech.cpgw.ws.GetCorporationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getCorporationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("saveComplaintLog");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "saveComplaintLog"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "complaintLogRequest"), com.turkcelltech.cpgw.ws.ComplaintLogRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "responseType"));
        oper.setReturnClass(com.turkcelltech.cpgw.ws.ResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "saveComplaintLogResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cpgwReadCardResult");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwReadCardResult"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwBelbimReadCardResultRequest"), com.turkcelltech.cpgw.ws.CpgwBelbimReadCardResultRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwBelbimReadCardResultResponse"));
        oper.setReturnClass(com.turkcelltech.cpgw.ws.CpgwBelbimReadCardResultResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwReadCardResultResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteSavedInvoice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "deleteSavedInvoice"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "deleteSavedInvoiceRequest"), com.turkcelltech.cpgw.ws.DeleteSavedInvoiceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "deleteSavedInvoiceResponse"));
        oper.setReturnClass(com.turkcelltech.cpgw.ws.DeleteSavedInvoiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "deleteSavedInvoiceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cpgwWriteCardResult");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwWriteCardResult"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwBelbimWriteCardResultRequest"), com.turkcelltech.cpgw.ws.CpgwBelbimWriteCardResultRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwBelbimWriteCardResultResponse"));
        oper.setReturnClass(com.turkcelltech.cpgw.ws.CpgwBelbimWriteCardResultResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwWriteCardResultResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPreviousPaymentsWithStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getPreviousPaymentsWithStatus"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "previousPaymentListWithStatusRequest"), com.turkcelltech.cpgw.ws.PreviousPaymentListWithStatusRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "previousPaymentListWithStatusResponse"));
        oper.setReturnClass(com.turkcelltech.cpgw.ws.PreviousPaymentListWithStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getPreviousPaymentsWithStatusResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPreviousPayments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getPreviousPayments"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getPreviousPaymentsRequest"), com.turkcelltech.cpgw.ws.GetPreviousPaymentsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getPreviousPaymentsResponse"));
        oper.setReturnClass(com.turkcelltech.cpgw.ws.GetPreviousPaymentsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getPreviousPaymentsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPaymentRefundCategories");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getPaymentRefundCategories"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "paymentRefundCategoriesRequest"), com.turkcelltech.cpgw.ws.PaymentRefundCategoriesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "paymentRefundCategoriesResponse"));
        oper.setReturnClass(com.turkcelltech.cpgw.ws.PaymentRefundCategoriesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getPaymentRefundCategoriesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateSavedInvoice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "updateSavedInvoice"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "updateSavedInvoiceRequest"), com.turkcelltech.cpgw.ws.UpdateSavedInvoiceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "updateSavedInvoiceResponse"));
        oper.setReturnClass(com.turkcelltech.cpgw.ws.UpdateSavedInvoiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "updateSavedInvoiceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPaymentRefundHis");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getPaymentRefundHis"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "paymentRefundHisRequest"), com.turkcelltech.cpgw.ws.PaymentRefundHisRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "paymentRefundHisResponse"));
        oper.setReturnClass(com.turkcelltech.cpgw.ws.PaymentRefundHisResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getPaymentRefundHisResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("payInvoice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "payInvoice"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "payInvoiceRequest"), com.turkcelltech.cpgw.ws.PayInvoiceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "payInvoiceResponse"));
        oper.setReturnClass(com.turkcelltech.cpgw.ws.PayInvoiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "payInvoiceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAllCorporation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getAllCorporation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getCorporationRequest"), com.turkcelltech.cpgw.ws.GetCorporationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getAllCorporationResponse"));
        oper.setReturnClass(com.turkcelltech.cpgw.ws.GetAllCorporationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getAllCorporationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addFavoriteCorporation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "addFavoriteCorporation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "addFavoriteCorporationRequest"), com.turkcelltech.cpgw.ws.AddFavoriteCorporationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "addFavoriteCorporationResponse"));
        oper.setReturnClass(com.turkcelltech.cpgw.ws.AddFavoriteCorporationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "addFavoriteCorporationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("reconcile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "reconcile"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "reconcileRequest"), com.turkcelltech.cpgw.ws.ReconcileRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "reconcileResponse"));
        oper.setReturnClass(com.turkcelltech.cpgw.ws.ReconcileResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "reconcileResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cpgwDgPaymentsInstructionList4Card");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwDgPaymentsInstructionList4Card"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwDgPaymentsGetInstructionList4CardRequest"), com.turkcelltech.cpgw.ws.CpgwDgPaymentsGetInstructionList4CardRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwDgPaymentsGetInstructionList4CardResponse"));
        oper.setReturnClass(com.turkcelltech.cpgw.ws.CpgwDgPaymentsGetInstructionList4CardResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwDgPaymentsInstructionList4CardResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("saveInvoice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "saveInvoice"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "saveInvoiceRequest"), com.turkcelltech.cpgw.ws.SaveInvoiceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "saveInvoiceResponse"));
        oper.setReturnClass(com.turkcelltech.cpgw.ws.SaveInvoiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "saveInvoiceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("reconcileDetail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "reconcileDetail"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "reconcileRequest"), com.turkcelltech.cpgw.ws.ReconcileRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "reconcileDetailResponse"));
        oper.setReturnClass(com.turkcelltech.cpgw.ws.ReconcileDetailResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "reconcileDetailResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getFavoriteCorporation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getFavoriteCorporation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getFavoriteCorporationRequest"), com.turkcelltech.cpgw.ws.GetFavoriteCorporationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getFavoriteCorporationResponse"));
        oper.setReturnClass(com.turkcelltech.cpgw.ws.GetFavoriteCorporationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getFavoriteCorporationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("savePaymentRefund");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "savePaymentRefund"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "paymentRefundRequest"), com.turkcelltech.cpgw.ws.PaymentRefundRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "paymentRefundResponse"));
        oper.setReturnClass(com.turkcelltech.cpgw.ws.PaymentRefundResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "savePaymentRefundResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getChannels");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getChannels"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getChannelsRequest"), com.turkcelltech.cpgw.ws.GetChannelsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getChannelsResponse"));
        oper.setReturnClass(com.turkcelltech.cpgw.ws.GetChannelsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getChannelsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getParameters");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getParameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "requestType"), com.turkcelltech.cpgw.ws.RequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getParametersResponse"));
        oper.setReturnClass(com.turkcelltech.cpgw.ws.GetParametersResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getParametersResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("checkInvoice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "checkInvoice"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "checkInvoiceRequest"), com.turkcelltech.cpgw.ws.CheckInvoiceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "checkInvoiceResponse"));
        oper.setReturnClass(com.turkcelltech.cpgw.ws.CheckInvoiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "checkInvoiceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cpgwEndTxn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwEndTxn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwBelbimEndTxnRequest"), com.turkcelltech.cpgw.ws.CpgwBelbimEndTxnRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwBelbimEndTxnResponse"));
        oper.setReturnClass(com.turkcelltech.cpgw.ws.CpgwBelbimEndTxnResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwEndTxnResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[36] = oper;

    }

    public CorpPaymentWsImplServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public CorpPaymentWsImplServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public CorpPaymentWsImplServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "addFavoriteCorporationRequest");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.AddFavoriteCorporationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "addFavoriteCorporationResponse");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.AddFavoriteCorporationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "bankInfo");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.BankInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimAuthP1Request");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.BelbimAuthP1Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimAuthP1Response");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.BelbimAuthP1Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimAuthP2Request");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.BelbimAuthP2Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimAuthP2Response");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.BelbimAuthP2Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimClientData");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.BelbimClientData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimCommands");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.BelbimCommands.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimEndTxnRequest");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.BelbimEndTxnRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimEndTxnResponse");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.BelbimEndTxnResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimGetInstructionList4CardRequest");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.BelbimGetInstructionList4CardRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimGetInstructionList4CardResponse");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.BelbimGetInstructionList4CardResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimInstructions");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.BelbimInstructions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimReadCardResultRequest");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.BelbimReadCardResultRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimReadCardResultResponse");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.BelbimReadCardResultResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimReceiptInfo");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.BelbimReceiptInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimReturn");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.BelbimReturn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimSearchCardRequest");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.BelbimSearchCardRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimSearchCardResponse");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.BelbimSearchCardResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimSearchCardWithAuthP1Request");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.BelbimSearchCardWithAuthP1Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimSearchCardWithAuthP1Response");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.BelbimSearchCardWithAuthP1Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimTxnInfo");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.BelbimTxnInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimWriteCardRequest");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.BelbimWriteCardRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimWriteCardResponse");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.BelbimWriteCardResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimWriteCardResultRequest");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.BelbimWriteCardResultRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "belbimWriteCardResultResponse");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.BelbimWriteCardResultResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "channelInfo");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.ChannelInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "checkInvoiceRequest");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.CheckInvoiceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "checkInvoiceResponse");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.CheckInvoiceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cityInfo");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.CityInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "collectionMethodEnum");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.CollectionMethodEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "complaintCategoryInfo");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.ComplaintCategoryInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "complaintLogRequest");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.ComplaintLogRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "confirmationEnum");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.ConfirmationEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "corpAndSubscriberInfo");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.CorpAndSubscriberInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "corpAndSubscriberPreviousInfo");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.CorpAndSubscriberPreviousInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "corporationInfo");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.CorporationInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "corporationInfoWithChannel");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.CorporationInfoWithChannel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwBelbimAuthP1Request");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.CpgwBelbimAuthP1Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwBelbimAuthP1Response");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.CpgwBelbimAuthP1Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwBelbimAuthP2Request");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.CpgwBelbimAuthP2Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwBelbimAuthP2Response");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.CpgwBelbimAuthP2Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwBelbimEndTxnRequest");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.CpgwBelbimEndTxnRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwBelbimEndTxnResponse");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.CpgwBelbimEndTxnResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwBelbimGetInstructionList4CardRequest");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.CpgwBelbimGetInstructionList4CardRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwBelbimGetInstructionList4CardResponse");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.CpgwBelbimGetInstructionList4CardResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwBelbimReadCardResultRequest");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.CpgwBelbimReadCardResultRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwBelbimReadCardResultResponse");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.CpgwBelbimReadCardResultResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwBelbimSearchCardRequest");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.CpgwBelbimSearchCardRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwBelbimSearchCardResponse");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.CpgwBelbimSearchCardResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwBelbimSearchCardWithAuth1P1Request");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.CpgwBelbimSearchCardWithAuth1P1Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwBelbimSearchCardWithAuthP1Response");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.CpgwBelbimSearchCardWithAuthP1Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwBelbimWriteCardRequest");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.CpgwBelbimWriteCardRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwBelbimWriteCardResponse");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.CpgwBelbimWriteCardResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwBelbimWriteCardResultRequest");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.CpgwBelbimWriteCardResultRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwBelbimWriteCardResultResponse");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.CpgwBelbimWriteCardResultResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwDgPaymentsGetInstructionList4CardRequest");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.CpgwDgPaymentsGetInstructionList4CardRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwDgPaymentsGetInstructionList4CardResponse");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.CpgwDgPaymentsGetInstructionList4CardResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwGetPolicyStatusRequest");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.CpgwGetPolicyStatusRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwGetPolicyStatusResponse");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.CpgwGetPolicyStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "cpgwModel");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.CpgwModel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "customerInfo");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.CustomerInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "customerPaymentMethodEnum");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.CustomerPaymentMethodEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "deleteSavedInvoiceRequest");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.DeleteSavedInvoiceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "deleteSavedInvoiceResponse");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.DeleteSavedInvoiceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "dgPaymentsInstList4Card");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.DgPaymentsInstList4Card.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "dgPaymentsInstList4CardRequest");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.DgPaymentsInstList4CardRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "dgPaymentsInstructionList4CardResponse");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.DgPaymentsInstructionList4CardResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "dgPaymentsReceiptInfo");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.DgPaymentsReceiptInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "favoriteCorporationInfo");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.FavoriteCorporationInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getAllCorporationResponse");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.GetAllCorporationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getChannelsRequest");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.GetChannelsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getChannelsResponse");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.GetChannelsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getComplaintCategoriesRequest");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.GetComplaintCategoriesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getComplaintCategoriesResponse");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.GetComplaintCategoriesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getCorporationRequest");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.GetCorporationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getCorporationResponse");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.GetCorporationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getFavoriteCorporationRequest");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.GetFavoriteCorporationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getFavoriteCorporationResponse");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.GetFavoriteCorporationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getParametersResponse");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.GetParametersResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getPolicyStatusRequest");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.GetPolicyStatusRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getPolicyStatusResponse");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.GetPolicyStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getPreviousPaymentsRequest");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.GetPreviousPaymentsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getPreviousPaymentsResponse");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.GetPreviousPaymentsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getReceiptRequest");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.GetReceiptRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "getReceiptResponse");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.GetReceiptResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "infoLog");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.InfoLog.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "informationTypeEnum");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.InformationTypeEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "inquireInvoiceRequest");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.InquireInvoiceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "inquireInvoiceResponse");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.InquireInvoiceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "instructionList4Card");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.InstructionList4Card.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "invoiceCommissionInfo");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.InvoiceCommissionInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "invoiceInfo");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.InvoiceInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "invoiceListRequest");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.InvoiceListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "invoiceListResponse");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.InvoiceListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "invoiceStatusEnum");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.InvoiceStatusEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "invoiceTypeEnum");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.InvoiceTypeEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "invoiceWithCommissionInfo");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.InvoiceWithCommissionInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "okcBankInfo");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.OkcBankInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "okcHeader");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.OkcHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "pair");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.Pair.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "payInvoiceRequest");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.PayInvoiceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "payInvoiceResponse");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.PayInvoiceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "paymentInfo");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.PaymentInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "paymentLog");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.PaymentLog.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "paymentOperationEnum");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.PaymentOperationEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "paymentRefund");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.PaymentRefund.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "paymentRefundCategoriesRequest");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.PaymentRefundCategoriesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "paymentRefundCategoriesResponse");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.PaymentRefundCategoriesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "paymentRefundCategoryInfo");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.PaymentRefundCategoryInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "paymentRefundConfirmationRequest");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.PaymentRefundConfirmationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "paymentRefundHis");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.PaymentRefundHis.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "paymentRefundHisRequest");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.PaymentRefundHisRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "paymentRefundHisResponse");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.PaymentRefundHisResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "paymentRefundListRequest");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.PaymentRefundListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "paymentRefundListResponse");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.PaymentRefundListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "paymentRefundRequest");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.PaymentRefundRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "paymentRefundResponse");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.PaymentRefundResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "previousPaymentInfoWithStatus");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.PreviousPaymentInfoWithStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "previousPaymentListWithStatusRequest");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.PreviousPaymentListWithStatusRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "previousPaymentListWithStatusResponse");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.PreviousPaymentListWithStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "provisionTypeEnum");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.ProvisionTypeEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "reconcileDetailResponse");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.ReconcileDetailResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "reconcileRequest");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.ReconcileRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "reconcileResponse");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.ReconcileResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "reconDetailInfo");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.ReconDetailInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "reconInfo");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.ReconInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "registeredInvoice");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.RegisteredInvoice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "removeFavoriteCorporationRequest");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.RemoveFavoriteCorporationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "removeFavoriteCorporationResponse");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.RemoveFavoriteCorporationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "requestHeader");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.RequestHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "requestType");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.RequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "requestTypeWithChannelRefNo");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.RequestTypeWithChannelRefNo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "requiredFieldInfo");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.RequiredFieldInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "responseHeader");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.ResponseHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "responseType");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.ResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "resultCodeInfo");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.ResultCodeInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "saveInvoiceRequest");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.SaveInvoiceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "saveInvoiceResponse");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.SaveInvoiceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "sectorInfo");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.SectorInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "updateSavedInvoiceRequest");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.UpdateSavedInvoiceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "updateSavedInvoiceResponse");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.UpdateSavedInvoiceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.cpgw.turkcelltech.com/", "warning");
            cachedSerQNames.add(qName);
            cls = com.turkcelltech.cpgw.ws.Warning.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.turkcelltech.cpgw.ws.InvoiceListResponse listSavedInvoice(com.turkcelltech.cpgw.ws.InvoiceListRequest listSavedInvoice) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "listSavedInvoice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {listSavedInvoice});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.turkcelltech.cpgw.ws.InvoiceListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.turkcelltech.cpgw.ws.InvoiceListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.turkcelltech.cpgw.ws.InvoiceListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.turkcelltech.cpgw.ws.CpgwBelbimAuthP1Response cpgwAuthP1(com.turkcelltech.cpgw.ws.CpgwBelbimAuthP1Request cpgwAuthP1) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "cpgwAuthP1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cpgwAuthP1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.turkcelltech.cpgw.ws.CpgwBelbimAuthP1Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.turkcelltech.cpgw.ws.CpgwBelbimAuthP1Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.turkcelltech.cpgw.ws.CpgwBelbimAuthP1Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.turkcelltech.cpgw.ws.PaymentRefundListResponse getPaymentRefundList(com.turkcelltech.cpgw.ws.PaymentRefundListRequest getPaymentRefundList) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getPaymentRefundList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getPaymentRefundList});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.turkcelltech.cpgw.ws.PaymentRefundListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.turkcelltech.cpgw.ws.PaymentRefundListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.turkcelltech.cpgw.ws.PaymentRefundListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.turkcelltech.cpgw.ws.CpgwGetPolicyStatusResponse getPolicyStatus(com.turkcelltech.cpgw.ws.CpgwGetPolicyStatusRequest getPolicyStatus) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getPolicyStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getPolicyStatus});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.turkcelltech.cpgw.ws.CpgwGetPolicyStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.turkcelltech.cpgw.ws.CpgwGetPolicyStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.turkcelltech.cpgw.ws.CpgwGetPolicyStatusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.turkcelltech.cpgw.ws.CpgwBelbimAuthP2Response cpgwAuthP2(com.turkcelltech.cpgw.ws.CpgwBelbimAuthP2Request cpgwAuthP2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "cpgwAuthP2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cpgwAuthP2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.turkcelltech.cpgw.ws.CpgwBelbimAuthP2Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.turkcelltech.cpgw.ws.CpgwBelbimAuthP2Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.turkcelltech.cpgw.ws.CpgwBelbimAuthP2Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.turkcelltech.cpgw.ws.CpgwBelbimGetInstructionList4CardResponse cpgwBelbimInstructionList4Card(com.turkcelltech.cpgw.ws.CpgwBelbimGetInstructionList4CardRequest cpgwBelbimInstructionList4Card) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "cpgwBelbimInstructionList4Card"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cpgwBelbimInstructionList4Card});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.turkcelltech.cpgw.ws.CpgwBelbimGetInstructionList4CardResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.turkcelltech.cpgw.ws.CpgwBelbimGetInstructionList4CardResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.turkcelltech.cpgw.ws.CpgwBelbimGetInstructionList4CardResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.turkcelltech.cpgw.ws.InquireInvoiceResponse inquireInvoice(com.turkcelltech.cpgw.ws.InquireInvoiceRequest inquireInvoice) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "inquireInvoice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {inquireInvoice});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.turkcelltech.cpgw.ws.InquireInvoiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.turkcelltech.cpgw.ws.InquireInvoiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.turkcelltech.cpgw.ws.InquireInvoiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.turkcelltech.cpgw.ws.CpgwBelbimSearchCardResponse cpgwBelbimSearchCard(com.turkcelltech.cpgw.ws.CpgwBelbimSearchCardRequest cpgwBelbimSearchCard) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "cpgwBelbimSearchCard"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cpgwBelbimSearchCard});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.turkcelltech.cpgw.ws.CpgwBelbimSearchCardResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.turkcelltech.cpgw.ws.CpgwBelbimSearchCardResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.turkcelltech.cpgw.ws.CpgwBelbimSearchCardResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.turkcelltech.cpgw.ws.CpgwBelbimSearchCardWithAuthP1Response cpgwBelbimSearchCardWithAuthP1(com.turkcelltech.cpgw.ws.CpgwBelbimSearchCardWithAuth1P1Request cpgwBelbimSearchCardWithAuthP1) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "cpgwBelbimSearchCardWithAuthP1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cpgwBelbimSearchCardWithAuthP1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.turkcelltech.cpgw.ws.CpgwBelbimSearchCardWithAuthP1Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.turkcelltech.cpgw.ws.CpgwBelbimSearchCardWithAuthP1Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.turkcelltech.cpgw.ws.CpgwBelbimSearchCardWithAuthP1Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.turkcelltech.cpgw.ws.GetReceiptResponse getReceipt(com.turkcelltech.cpgw.ws.GetReceiptRequest getReceipt) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getReceipt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getReceipt});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.turkcelltech.cpgw.ws.GetReceiptResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.turkcelltech.cpgw.ws.GetReceiptResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.turkcelltech.cpgw.ws.GetReceiptResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.turkcelltech.cpgw.ws.ResponseType savePaymentRefundConfirmation(com.turkcelltech.cpgw.ws.PaymentRefundConfirmationRequest savePaymentRefundConfirmation) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "savePaymentRefundConfirmation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {savePaymentRefundConfirmation});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.turkcelltech.cpgw.ws.ResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.turkcelltech.cpgw.ws.ResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.turkcelltech.cpgw.ws.ResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.turkcelltech.cpgw.ws.CpgwBelbimWriteCardResponse cpgwWriteCard(com.turkcelltech.cpgw.ws.CpgwBelbimWriteCardRequest cpgwWriteCard) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "cpgwWriteCard"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cpgwWriteCard});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.turkcelltech.cpgw.ws.CpgwBelbimWriteCardResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.turkcelltech.cpgw.ws.CpgwBelbimWriteCardResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.turkcelltech.cpgw.ws.CpgwBelbimWriteCardResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.turkcelltech.cpgw.ws.GetComplaintCategoriesResponse getAllComplaintCategories(com.turkcelltech.cpgw.ws.GetComplaintCategoriesRequest getAllComplaintCategories) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getAllComplaintCategories"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getAllComplaintCategories});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.turkcelltech.cpgw.ws.GetComplaintCategoriesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.turkcelltech.cpgw.ws.GetComplaintCategoriesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.turkcelltech.cpgw.ws.GetComplaintCategoriesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.turkcelltech.cpgw.ws.RemoveFavoriteCorporationResponse removeFavoriteCorporation(com.turkcelltech.cpgw.ws.RemoveFavoriteCorporationRequest removeFavoriteCorporation) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "removeFavoriteCorporation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {removeFavoriteCorporation});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.turkcelltech.cpgw.ws.RemoveFavoriteCorporationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.turkcelltech.cpgw.ws.RemoveFavoriteCorporationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.turkcelltech.cpgw.ws.RemoveFavoriteCorporationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.turkcelltech.cpgw.ws.GetCorporationResponse getCorporation(com.turkcelltech.cpgw.ws.GetCorporationRequest getCorporation) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getCorporation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getCorporation});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.turkcelltech.cpgw.ws.GetCorporationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.turkcelltech.cpgw.ws.GetCorporationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.turkcelltech.cpgw.ws.GetCorporationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.turkcelltech.cpgw.ws.ResponseType saveComplaintLog(com.turkcelltech.cpgw.ws.ComplaintLogRequest saveComplaintLog) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "saveComplaintLog"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {saveComplaintLog});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.turkcelltech.cpgw.ws.ResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.turkcelltech.cpgw.ws.ResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.turkcelltech.cpgw.ws.ResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.turkcelltech.cpgw.ws.CpgwBelbimReadCardResultResponse cpgwReadCardResult(com.turkcelltech.cpgw.ws.CpgwBelbimReadCardResultRequest cpgwReadCardResult) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "cpgwReadCardResult"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cpgwReadCardResult});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.turkcelltech.cpgw.ws.CpgwBelbimReadCardResultResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.turkcelltech.cpgw.ws.CpgwBelbimReadCardResultResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.turkcelltech.cpgw.ws.CpgwBelbimReadCardResultResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.turkcelltech.cpgw.ws.DeleteSavedInvoiceResponse deleteSavedInvoice(com.turkcelltech.cpgw.ws.DeleteSavedInvoiceRequest deleteSavedInvoice) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteSavedInvoice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deleteSavedInvoice});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.turkcelltech.cpgw.ws.DeleteSavedInvoiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.turkcelltech.cpgw.ws.DeleteSavedInvoiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.turkcelltech.cpgw.ws.DeleteSavedInvoiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.turkcelltech.cpgw.ws.CpgwBelbimWriteCardResultResponse cpgwWriteCardResult(com.turkcelltech.cpgw.ws.CpgwBelbimWriteCardResultRequest cpgwWriteCardResult) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "cpgwWriteCardResult"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cpgwWriteCardResult});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.turkcelltech.cpgw.ws.CpgwBelbimWriteCardResultResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.turkcelltech.cpgw.ws.CpgwBelbimWriteCardResultResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.turkcelltech.cpgw.ws.CpgwBelbimWriteCardResultResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.turkcelltech.cpgw.ws.PreviousPaymentListWithStatusResponse getPreviousPaymentsWithStatus(com.turkcelltech.cpgw.ws.PreviousPaymentListWithStatusRequest getPreviousPaymentsWithStatus) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getPreviousPaymentsWithStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getPreviousPaymentsWithStatus});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.turkcelltech.cpgw.ws.PreviousPaymentListWithStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.turkcelltech.cpgw.ws.PreviousPaymentListWithStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.turkcelltech.cpgw.ws.PreviousPaymentListWithStatusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.turkcelltech.cpgw.ws.GetPreviousPaymentsResponse getPreviousPayments(com.turkcelltech.cpgw.ws.GetPreviousPaymentsRequest getPreviousPayments) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getPreviousPayments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getPreviousPayments});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.turkcelltech.cpgw.ws.GetPreviousPaymentsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.turkcelltech.cpgw.ws.GetPreviousPaymentsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.turkcelltech.cpgw.ws.GetPreviousPaymentsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.turkcelltech.cpgw.ws.PaymentRefundCategoriesResponse getPaymentRefundCategories(com.turkcelltech.cpgw.ws.PaymentRefundCategoriesRequest getPaymentRefundCategories) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getPaymentRefundCategories"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getPaymentRefundCategories});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.turkcelltech.cpgw.ws.PaymentRefundCategoriesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.turkcelltech.cpgw.ws.PaymentRefundCategoriesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.turkcelltech.cpgw.ws.PaymentRefundCategoriesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.turkcelltech.cpgw.ws.UpdateSavedInvoiceResponse updateSavedInvoice(com.turkcelltech.cpgw.ws.UpdateSavedInvoiceRequest updateSavedInvoice) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "updateSavedInvoice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {updateSavedInvoice});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.turkcelltech.cpgw.ws.UpdateSavedInvoiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.turkcelltech.cpgw.ws.UpdateSavedInvoiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.turkcelltech.cpgw.ws.UpdateSavedInvoiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.turkcelltech.cpgw.ws.PaymentRefundHisResponse getPaymentRefundHis(com.turkcelltech.cpgw.ws.PaymentRefundHisRequest getPaymentRefundHis) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getPaymentRefundHis"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getPaymentRefundHis});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.turkcelltech.cpgw.ws.PaymentRefundHisResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.turkcelltech.cpgw.ws.PaymentRefundHisResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.turkcelltech.cpgw.ws.PaymentRefundHisResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.turkcelltech.cpgw.ws.PayInvoiceResponse payInvoice(com.turkcelltech.cpgw.ws.PayInvoiceRequest payInvoice) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "payInvoice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {payInvoice});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.turkcelltech.cpgw.ws.PayInvoiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.turkcelltech.cpgw.ws.PayInvoiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.turkcelltech.cpgw.ws.PayInvoiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.turkcelltech.cpgw.ws.GetAllCorporationResponse getAllCorporation(com.turkcelltech.cpgw.ws.GetCorporationRequest getAllCorporation) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getAllCorporation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getAllCorporation});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.turkcelltech.cpgw.ws.GetAllCorporationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.turkcelltech.cpgw.ws.GetAllCorporationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.turkcelltech.cpgw.ws.GetAllCorporationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.turkcelltech.cpgw.ws.AddFavoriteCorporationResponse addFavoriteCorporation(com.turkcelltech.cpgw.ws.AddFavoriteCorporationRequest addFavoriteCorporation) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "addFavoriteCorporation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {addFavoriteCorporation});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.turkcelltech.cpgw.ws.AddFavoriteCorporationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.turkcelltech.cpgw.ws.AddFavoriteCorporationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.turkcelltech.cpgw.ws.AddFavoriteCorporationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.turkcelltech.cpgw.ws.ReconcileResponse reconcile(com.turkcelltech.cpgw.ws.ReconcileRequest reconcile) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "reconcile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {reconcile});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.turkcelltech.cpgw.ws.ReconcileResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.turkcelltech.cpgw.ws.ReconcileResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.turkcelltech.cpgw.ws.ReconcileResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.turkcelltech.cpgw.ws.CpgwDgPaymentsGetInstructionList4CardResponse cpgwDgPaymentsInstructionList4Card(com.turkcelltech.cpgw.ws.CpgwDgPaymentsGetInstructionList4CardRequest cpgwDgPaymentsInstructionList4Card) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "cpgwDgPaymentsInstructionList4Card"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cpgwDgPaymentsInstructionList4Card});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.turkcelltech.cpgw.ws.CpgwDgPaymentsGetInstructionList4CardResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.turkcelltech.cpgw.ws.CpgwDgPaymentsGetInstructionList4CardResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.turkcelltech.cpgw.ws.CpgwDgPaymentsGetInstructionList4CardResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.turkcelltech.cpgw.ws.SaveInvoiceResponse saveInvoice(com.turkcelltech.cpgw.ws.SaveInvoiceRequest saveInvoice) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "saveInvoice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {saveInvoice});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.turkcelltech.cpgw.ws.SaveInvoiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.turkcelltech.cpgw.ws.SaveInvoiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.turkcelltech.cpgw.ws.SaveInvoiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.turkcelltech.cpgw.ws.ReconcileDetailResponse reconcileDetail(com.turkcelltech.cpgw.ws.ReconcileRequest reconcileDetail) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "reconcileDetail"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {reconcileDetail});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.turkcelltech.cpgw.ws.ReconcileDetailResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.turkcelltech.cpgw.ws.ReconcileDetailResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.turkcelltech.cpgw.ws.ReconcileDetailResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.turkcelltech.cpgw.ws.GetFavoriteCorporationResponse getFavoriteCorporation(com.turkcelltech.cpgw.ws.GetFavoriteCorporationRequest getFavoriteCorporation) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getFavoriteCorporation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getFavoriteCorporation});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.turkcelltech.cpgw.ws.GetFavoriteCorporationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.turkcelltech.cpgw.ws.GetFavoriteCorporationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.turkcelltech.cpgw.ws.GetFavoriteCorporationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.turkcelltech.cpgw.ws.PaymentRefundResponse savePaymentRefund(com.turkcelltech.cpgw.ws.PaymentRefundRequest savePaymentRefund) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "savePaymentRefund"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {savePaymentRefund});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.turkcelltech.cpgw.ws.PaymentRefundResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.turkcelltech.cpgw.ws.PaymentRefundResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.turkcelltech.cpgw.ws.PaymentRefundResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.turkcelltech.cpgw.ws.GetChannelsResponse getChannels(com.turkcelltech.cpgw.ws.GetChannelsRequest getChannels) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getChannels"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getChannels});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.turkcelltech.cpgw.ws.GetChannelsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.turkcelltech.cpgw.ws.GetChannelsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.turkcelltech.cpgw.ws.GetChannelsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.turkcelltech.cpgw.ws.GetParametersResponse getParameters(com.turkcelltech.cpgw.ws.RequestType getParameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getParameters"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getParameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.turkcelltech.cpgw.ws.GetParametersResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.turkcelltech.cpgw.ws.GetParametersResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.turkcelltech.cpgw.ws.GetParametersResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.turkcelltech.cpgw.ws.CheckInvoiceResponse checkInvoice(com.turkcelltech.cpgw.ws.CheckInvoiceRequest checkInvoice) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "checkInvoice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {checkInvoice});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.turkcelltech.cpgw.ws.CheckInvoiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.turkcelltech.cpgw.ws.CheckInvoiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.turkcelltech.cpgw.ws.CheckInvoiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.turkcelltech.cpgw.ws.CpgwBelbimEndTxnResponse cpgwEndTxn(com.turkcelltech.cpgw.ws.CpgwBelbimEndTxnRequest cpgwEndTxn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "cpgwEndTxn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cpgwEndTxn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.turkcelltech.cpgw.ws.CpgwBelbimEndTxnResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.turkcelltech.cpgw.ws.CpgwBelbimEndTxnResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.turkcelltech.cpgw.ws.CpgwBelbimEndTxnResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
