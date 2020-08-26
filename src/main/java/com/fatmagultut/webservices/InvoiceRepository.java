package com.fatmagultut.webservices;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import io.spring.guides.demo.Invoice;
import io.spring.guides.demo.Currency;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class InvoiceRepository {
	private static final Map<String, Invoice> invoices = new HashMap<>();

	@PostConstruct
	public void initData() {
	

	
	}

	public Invoice findInvoice(String telephoneNumber) {
		Assert.notNull(telephoneNumber, "Bu numaraya ait fatura yoktur");
		return invoices.get(telephonNumber);
	}
}

