package com.tomcatweb.jndiconfig.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductController {
	
	
	@Autowired
	ProductService productService;

	@GetMapping
	public List getAllProducts(){
		return null;
	}
	
	
	@GetMapping(value = "/product")
	public ResponseEntity<Product> fetchProduct(@RequestParam int id){
		System.out.println("******************"+ id);
		Product product = productService.fetchProductByid(id);
		//System.out.println(product.toString());
		if (product == null){
			System.out.println("******************null");
			return ResponseEntity.notFound().build(); 
		}else {
			System.out.println("******************PP");
			return ResponseEntity.ok().body(product);
		}
	}
	
}
