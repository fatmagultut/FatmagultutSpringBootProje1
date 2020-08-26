package com.fatmagultut.webservices;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InvoiceClassApi {

	@GetMapping
	
	@RequestMapping("/TelephonNumber")
	public String fatura() {
		return "5513840852";
	}
		
	
}

