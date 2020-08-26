package com.turkcelltech.cpgw.ws;

public class CorpPaymentServiceProxy implements com.turkcelltech.cpgw.ws.CorpPaymentService {
  private String _endpoint = null;
  private com.turkcelltech.cpgw.ws.CorpPaymentService corpPaymentService = null;
  
  public CorpPaymentServiceProxy() {
    _initCorpPaymentServiceProxy();
  }
  
  public CorpPaymentServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initCorpPaymentServiceProxy();
  }
  
  private void _initCorpPaymentServiceProxy() {
    try {
      corpPaymentService = (new com.turkcelltech.cpgw.ws.impl.CorpPaymentWsImplServiceLocator()).getCorpPaymentWsImplPort();
      if (corpPaymentService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)corpPaymentService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)corpPaymentService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (corpPaymentService != null)
      ((javax.xml.rpc.Stub)corpPaymentService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.turkcelltech.cpgw.ws.CorpPaymentService getCorpPaymentService() {
    if (corpPaymentService == null)
      _initCorpPaymentServiceProxy();
    return corpPaymentService;
  }
  
  public com.turkcelltech.cpgw.ws.InvoiceListResponse listSavedInvoice(com.turkcelltech.cpgw.ws.InvoiceListRequest listSavedInvoice) throws java.rmi.RemoteException{
    if (corpPaymentService == null)
      _initCorpPaymentServiceProxy();
    return corpPaymentService.listSavedInvoice(listSavedInvoice);
  }
  
  public com.turkcelltech.cpgw.ws.CpgwBelbimAuthP1Response cpgwAuthP1(com.turkcelltech.cpgw.ws.CpgwBelbimAuthP1Request cpgwAuthP1) throws java.rmi.RemoteException{
    if (corpPaymentService == null)
      _initCorpPaymentServiceProxy();
    return corpPaymentService.cpgwAuthP1(cpgwAuthP1);
  }
  
  public com.turkcelltech.cpgw.ws.PaymentRefundListResponse getPaymentRefundList(com.turkcelltech.cpgw.ws.PaymentRefundListRequest getPaymentRefundList) throws java.rmi.RemoteException{
    if (corpPaymentService == null)
      _initCorpPaymentServiceProxy();
    return corpPaymentService.getPaymentRefundList(getPaymentRefundList);
  }
  
  public com.turkcelltech.cpgw.ws.CpgwBelbimGetInstructionList4CardResponse cpgwBelbimInstructionList4Card(com.turkcelltech.cpgw.ws.CpgwBelbimGetInstructionList4CardRequest cpgwBelbimInstructionList4Card) throws java.rmi.RemoteException{
    if (corpPaymentService == null)
      _initCorpPaymentServiceProxy();
    return corpPaymentService.cpgwBelbimInstructionList4Card(cpgwBelbimInstructionList4Card);
  }
  
  public com.turkcelltech.cpgw.ws.CpgwBelbimAuthP2Response cpgwAuthP2(com.turkcelltech.cpgw.ws.CpgwBelbimAuthP2Request cpgwAuthP2) throws java.rmi.RemoteException{
    if (corpPaymentService == null)
      _initCorpPaymentServiceProxy();
    return corpPaymentService.cpgwAuthP2(cpgwAuthP2);
  }
  
  public com.turkcelltech.cpgw.ws.CpgwGetPolicyStatusResponse getPolicyStatus(com.turkcelltech.cpgw.ws.CpgwGetPolicyStatusRequest getPolicyStatus) throws java.rmi.RemoteException{
    if (corpPaymentService == null)
      _initCorpPaymentServiceProxy();
    return corpPaymentService.getPolicyStatus(getPolicyStatus);
  }
  
  public com.turkcelltech.cpgw.ws.InquireInvoiceResponse inquireInvoice(com.turkcelltech.cpgw.ws.InquireInvoiceRequest inquireInvoice) throws java.rmi.RemoteException{
    if (corpPaymentService == null)
      _initCorpPaymentServiceProxy();
    return corpPaymentService.inquireInvoice(inquireInvoice);
  }
  
  public com.turkcelltech.cpgw.ws.CpgwBelbimSearchCardResponse cpgwBelbimSearchCard(com.turkcelltech.cpgw.ws.CpgwBelbimSearchCardRequest cpgwBelbimSearchCard) throws java.rmi.RemoteException{
    if (corpPaymentService == null)
      _initCorpPaymentServiceProxy();
    return corpPaymentService.cpgwBelbimSearchCard(cpgwBelbimSearchCard);
  }
  
  public com.turkcelltech.cpgw.ws.CpgwBelbimSearchCardWithAuthP1Response cpgwBelbimSearchCardWithAuthP1(com.turkcelltech.cpgw.ws.CpgwBelbimSearchCardWithAuth1P1Request cpgwBelbimSearchCardWithAuthP1) throws java.rmi.RemoteException{
    if (corpPaymentService == null)
      _initCorpPaymentServiceProxy();
    return corpPaymentService.cpgwBelbimSearchCardWithAuthP1(cpgwBelbimSearchCardWithAuthP1);
  }
  
  public com.turkcelltech.cpgw.ws.GetReceiptResponse getReceipt(com.turkcelltech.cpgw.ws.GetReceiptRequest getReceipt) throws java.rmi.RemoteException{
    if (corpPaymentService == null)
      _initCorpPaymentServiceProxy();
    return corpPaymentService.getReceipt(getReceipt);
  }
  
  public com.turkcelltech.cpgw.ws.ResponseType savePaymentRefundConfirmation(com.turkcelltech.cpgw.ws.PaymentRefundConfirmationRequest savePaymentRefundConfirmation) throws java.rmi.RemoteException{
    if (corpPaymentService == null)
      _initCorpPaymentServiceProxy();
    return corpPaymentService.savePaymentRefundConfirmation(savePaymentRefundConfirmation);
  }
  
  public com.turkcelltech.cpgw.ws.CpgwBelbimWriteCardResponse cpgwWriteCard(com.turkcelltech.cpgw.ws.CpgwBelbimWriteCardRequest cpgwWriteCard) throws java.rmi.RemoteException{
    if (corpPaymentService == null)
      _initCorpPaymentServiceProxy();
    return corpPaymentService.cpgwWriteCard(cpgwWriteCard);
  }
  
  public com.turkcelltech.cpgw.ws.GetComplaintCategoriesResponse getAllComplaintCategories(com.turkcelltech.cpgw.ws.GetComplaintCategoriesRequest getAllComplaintCategories) throws java.rmi.RemoteException{
    if (corpPaymentService == null)
      _initCorpPaymentServiceProxy();
    return corpPaymentService.getAllComplaintCategories(getAllComplaintCategories);
  }
  
  public com.turkcelltech.cpgw.ws.RemoveFavoriteCorporationResponse removeFavoriteCorporation(com.turkcelltech.cpgw.ws.RemoveFavoriteCorporationRequest removeFavoriteCorporation) throws java.rmi.RemoteException{
    if (corpPaymentService == null)
      _initCorpPaymentServiceProxy();
    return corpPaymentService.removeFavoriteCorporation(removeFavoriteCorporation);
  }
  
  public com.turkcelltech.cpgw.ws.GetCorporationResponse getCorporation(com.turkcelltech.cpgw.ws.GetCorporationRequest getCorporation) throws java.rmi.RemoteException{
    if (corpPaymentService == null)
      _initCorpPaymentServiceProxy();
    return corpPaymentService.getCorporation(getCorporation);
  }
  
  public com.turkcelltech.cpgw.ws.ResponseType saveComplaintLog(com.turkcelltech.cpgw.ws.ComplaintLogRequest saveComplaintLog) throws java.rmi.RemoteException{
    if (corpPaymentService == null)
      _initCorpPaymentServiceProxy();
    return corpPaymentService.saveComplaintLog(saveComplaintLog);
  }
  
  public com.turkcelltech.cpgw.ws.CpgwBelbimReadCardResultResponse cpgwReadCardResult(com.turkcelltech.cpgw.ws.CpgwBelbimReadCardResultRequest cpgwReadCardResult) throws java.rmi.RemoteException{
    if (corpPaymentService == null)
      _initCorpPaymentServiceProxy();
    return corpPaymentService.cpgwReadCardResult(cpgwReadCardResult);
  }
  
  public com.turkcelltech.cpgw.ws.DeleteSavedInvoiceResponse deleteSavedInvoice(com.turkcelltech.cpgw.ws.DeleteSavedInvoiceRequest deleteSavedInvoice) throws java.rmi.RemoteException{
    if (corpPaymentService == null)
      _initCorpPaymentServiceProxy();
    return corpPaymentService.deleteSavedInvoice(deleteSavedInvoice);
  }
  
  public com.turkcelltech.cpgw.ws.CpgwBelbimWriteCardResultResponse cpgwWriteCardResult(com.turkcelltech.cpgw.ws.CpgwBelbimWriteCardResultRequest cpgwWriteCardResult) throws java.rmi.RemoteException{
    if (corpPaymentService == null)
      _initCorpPaymentServiceProxy();
    return corpPaymentService.cpgwWriteCardResult(cpgwWriteCardResult);
  }
  
  public com.turkcelltech.cpgw.ws.PreviousPaymentListWithStatusResponse getPreviousPaymentsWithStatus(com.turkcelltech.cpgw.ws.PreviousPaymentListWithStatusRequest getPreviousPaymentsWithStatus) throws java.rmi.RemoteException{
    if (corpPaymentService == null)
      _initCorpPaymentServiceProxy();
    return corpPaymentService.getPreviousPaymentsWithStatus(getPreviousPaymentsWithStatus);
  }
  
  public com.turkcelltech.cpgw.ws.GetPreviousPaymentsResponse getPreviousPayments(com.turkcelltech.cpgw.ws.GetPreviousPaymentsRequest getPreviousPayments) throws java.rmi.RemoteException{
    if (corpPaymentService == null)
      _initCorpPaymentServiceProxy();
    return corpPaymentService.getPreviousPayments(getPreviousPayments);
  }
  
  public com.turkcelltech.cpgw.ws.PaymentRefundCategoriesResponse getPaymentRefundCategories(com.turkcelltech.cpgw.ws.PaymentRefundCategoriesRequest getPaymentRefundCategories) throws java.rmi.RemoteException{
    if (corpPaymentService == null)
      _initCorpPaymentServiceProxy();
    return corpPaymentService.getPaymentRefundCategories(getPaymentRefundCategories);
  }
  
  public com.turkcelltech.cpgw.ws.UpdateSavedInvoiceResponse updateSavedInvoice(com.turkcelltech.cpgw.ws.UpdateSavedInvoiceRequest updateSavedInvoice) throws java.rmi.RemoteException{
    if (corpPaymentService == null)
      _initCorpPaymentServiceProxy();
    return corpPaymentService.updateSavedInvoice(updateSavedInvoice);
  }
  
  public com.turkcelltech.cpgw.ws.PaymentRefundHisResponse getPaymentRefundHis(com.turkcelltech.cpgw.ws.PaymentRefundHisRequest getPaymentRefundHis) throws java.rmi.RemoteException{
    if (corpPaymentService == null)
      _initCorpPaymentServiceProxy();
    return corpPaymentService.getPaymentRefundHis(getPaymentRefundHis);
  }
  
  public com.turkcelltech.cpgw.ws.PayInvoiceResponse payInvoice(com.turkcelltech.cpgw.ws.PayInvoiceRequest payInvoice) throws java.rmi.RemoteException{
    if (corpPaymentService == null)
      _initCorpPaymentServiceProxy();
    return corpPaymentService.payInvoice(payInvoice);
  }
  
  public com.turkcelltech.cpgw.ws.GetAllCorporationResponse getAllCorporation(com.turkcelltech.cpgw.ws.GetCorporationRequest getAllCorporation) throws java.rmi.RemoteException{
    if (corpPaymentService == null)
      _initCorpPaymentServiceProxy();
    return corpPaymentService.getAllCorporation(getAllCorporation);
  }
  
  public com.turkcelltech.cpgw.ws.AddFavoriteCorporationResponse addFavoriteCorporation(com.turkcelltech.cpgw.ws.AddFavoriteCorporationRequest addFavoriteCorporation) throws java.rmi.RemoteException{
    if (corpPaymentService == null)
      _initCorpPaymentServiceProxy();
    return corpPaymentService.addFavoriteCorporation(addFavoriteCorporation);
  }
  
  public com.turkcelltech.cpgw.ws.ReconcileResponse reconcile(com.turkcelltech.cpgw.ws.ReconcileRequest reconcile) throws java.rmi.RemoteException{
    if (corpPaymentService == null)
      _initCorpPaymentServiceProxy();
    return corpPaymentService.reconcile(reconcile);
  }
  
  public com.turkcelltech.cpgw.ws.CpgwDgPaymentsGetInstructionList4CardResponse cpgwDgPaymentsInstructionList4Card(com.turkcelltech.cpgw.ws.CpgwDgPaymentsGetInstructionList4CardRequest cpgwDgPaymentsInstructionList4Card) throws java.rmi.RemoteException{
    if (corpPaymentService == null)
      _initCorpPaymentServiceProxy();
    return corpPaymentService.cpgwDgPaymentsInstructionList4Card(cpgwDgPaymentsInstructionList4Card);
  }
  
  public com.turkcelltech.cpgw.ws.SaveInvoiceResponse saveInvoice(com.turkcelltech.cpgw.ws.SaveInvoiceRequest saveInvoice) throws java.rmi.RemoteException{
    if (corpPaymentService == null)
      _initCorpPaymentServiceProxy();
    return corpPaymentService.saveInvoice(saveInvoice);
  }
  
  public com.turkcelltech.cpgw.ws.ReconcileDetailResponse reconcileDetail(com.turkcelltech.cpgw.ws.ReconcileRequest reconcileDetail) throws java.rmi.RemoteException{
    if (corpPaymentService == null)
      _initCorpPaymentServiceProxy();
    return corpPaymentService.reconcileDetail(reconcileDetail);
  }
  
  public com.turkcelltech.cpgw.ws.GetFavoriteCorporationResponse getFavoriteCorporation(com.turkcelltech.cpgw.ws.GetFavoriteCorporationRequest getFavoriteCorporation) throws java.rmi.RemoteException{
    if (corpPaymentService == null)
      _initCorpPaymentServiceProxy();
    return corpPaymentService.getFavoriteCorporation(getFavoriteCorporation);
  }
  
  public com.turkcelltech.cpgw.ws.PaymentRefundResponse savePaymentRefund(com.turkcelltech.cpgw.ws.PaymentRefundRequest savePaymentRefund) throws java.rmi.RemoteException{
    if (corpPaymentService == null)
      _initCorpPaymentServiceProxy();
    return corpPaymentService.savePaymentRefund(savePaymentRefund);
  }
  
  public com.turkcelltech.cpgw.ws.GetChannelsResponse getChannels(com.turkcelltech.cpgw.ws.GetChannelsRequest getChannels) throws java.rmi.RemoteException{
    if (corpPaymentService == null)
      _initCorpPaymentServiceProxy();
    return corpPaymentService.getChannels(getChannels);
  }
  
  public com.turkcelltech.cpgw.ws.GetParametersResponse getParameters(com.turkcelltech.cpgw.ws.RequestType getParameters) throws java.rmi.RemoteException{
    if (corpPaymentService == null)
      _initCorpPaymentServiceProxy();
    return corpPaymentService.getParameters(getParameters);
  }
  
  public com.turkcelltech.cpgw.ws.CheckInvoiceResponse checkInvoice(com.turkcelltech.cpgw.ws.CheckInvoiceRequest checkInvoice) throws java.rmi.RemoteException{
    if (corpPaymentService == null)
      _initCorpPaymentServiceProxy();
    return corpPaymentService.checkInvoice(checkInvoice);
  }
  
  public com.turkcelltech.cpgw.ws.CpgwBelbimEndTxnResponse cpgwEndTxn(com.turkcelltech.cpgw.ws.CpgwBelbimEndTxnRequest cpgwEndTxn) throws java.rmi.RemoteException{
    if (corpPaymentService == null)
      _initCorpPaymentServiceProxy();
    return corpPaymentService.cpgwEndTxn(cpgwEndTxn);
  }
  
  
}