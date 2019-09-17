package com.demo.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

	@GetMapping("/user/product")
	public Product getProduct() {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject("http://product-service-deployment.default.svc.cluster.local/product", Product.class);
	}

}
