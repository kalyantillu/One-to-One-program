package com.example.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String dress_products;
	private String milk_products;
	private String cosmetics_products;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDress_products() {
		return dress_products;
	}
	public void setDress_products(String dress_products) {
		this.dress_products = dress_products;
	}
	public String getMilk_products() {
		return milk_products;
	}
	public void setMilk_products(String milk_products) {
		this.milk_products = milk_products;
	}
	public String getCosmetics_products() {
		return cosmetics_products;
	}
	public void setCosmetics_products(String cosmetics_products) {
		this.cosmetics_products = cosmetics_products;
	}
	public Product(Long id, String dress_products, String milk_products, String cosmetics_products) {
		super();
		this.id = id;
		this.dress_products = dress_products;
		this.milk_products = milk_products;
		this.cosmetics_products = cosmetics_products;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", dress_products=" + dress_products + ", milk_products=" + milk_products
				+ ", cosmetics_products=" + cosmetics_products + "]";
	}
	
	
}