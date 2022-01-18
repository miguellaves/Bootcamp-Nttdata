package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductController {

	@Value("${server.port}")
	private String port;
	
	@Value("${product.product-name}")
	private String name;
	
	public ProductController() {
		super();
	}

	@GetMapping("/product")
	public String getPort() {
		return "El puerto del micro es " + port;
	}
	
	@GetMapping("/product-name")
	public String getProductName() {
		return "El nombre del producto es " + name;
	}

}