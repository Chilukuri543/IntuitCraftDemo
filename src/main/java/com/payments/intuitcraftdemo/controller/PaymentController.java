package com.payments.intuitcraftdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.payments.intuitcraftdemo.model.PaymentDetails;
import com.payments.intuitcraftdemo.model.Response;
import com.payments.intuitcraftdemo.service.PaymentService;

@RestController
@RequestMapping(value = "/api/v1")
public class PaymentController {

	@Autowired
	PaymentService paymentService;

	@PostMapping("/payment")
	public Response processPayment(@RequestBody PaymentDetails paymentDetails) {
		return paymentService.processPayment(paymentDetails);
	}

}
