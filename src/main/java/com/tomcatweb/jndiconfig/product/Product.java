package com.tomcatweb.jndiconfig.product;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	private int id;
	
	private String name;
	
	private String price;

}
