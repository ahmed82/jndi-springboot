package com.tomcatweb.jndiconfig.product;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	

	@Autowired
	ProductRepository productRepository;
	
	
	public Product fetchProductByid(int id){
		
		Optional<Product> product =	productRepository.findById(id);
		System.out.println(product.get().toString());
		if (product.isPresent())
			return product.get();
		else
		return null;
		
		
	}

}
