package com.tomcatweb.jndiconfig.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ProductController {
	
	
	@Autowired
	ProductService productService;

	@GetMapping
	public List getAllProducts(){
		return null;
	}
	
	
	@GetMapping(value = "/product")
	public ResponseEntity<Product> fetchProduct(@RequestParam int id){
		Product product = productService.fetchProductByid(id);
		if (product ==null){
			return ResponseEntity.notFound().build(); 
		}else {
			return ResponseEntity.ok().body(product);
		}
	}
	
}
