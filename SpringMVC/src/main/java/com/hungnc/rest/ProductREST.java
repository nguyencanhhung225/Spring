package com.hungnc.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hungnc.model.Product;
import com.hungnc.service.ProductService;

@RestController
public class ProductREST {
	
	@Autowired
	ProductService productService;
	
	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public ResponseEntity<List<Product>> getAll(){
		List<Product> products = productService.getAll();
		if (products.isEmpty()) {
			return new ResponseEntity<List<Product>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
	}
	
}
