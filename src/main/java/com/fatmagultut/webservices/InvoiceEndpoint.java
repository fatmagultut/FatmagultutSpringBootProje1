package com.fatmagultut.webservices;
	
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.ws.server.endpoint.annotation.Endpoint;
	import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
	import org.springframework.ws.server.endpoint.annotation.RequestPayload;
	import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

	import io.spring.guides.demo.GetInvoiceRequest;
	import io.spring.guides.demo.GetInvoiceResponse;

	@Endpoint
	public class InvoiceEndpoint {
		private static final String NAMESPACE_URI = "http://spring.io/guides/demo";

		private InvoiceRepository invoiceRepository;

		@Autowired
		public InvoiceEndpoint(InvoiceRepository invoiceRepository) {
			this.invoiceRepository = invoiceRepository;
		}

		@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getInvoiceRequest")
		@ResponsePayload
		public GetInvoiceResponse getInvoice(@RequestPayload GetInvoiceRequest request) {
			GetInvoiceResponse response = new GetInvoiceResponse();
			response.setInvoice(invoiceRepository.findInvoice(request.getName()));

			return response;
		}
	}



