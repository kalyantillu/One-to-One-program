package com.example.Entity;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity

public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String productname;
	private String producttype;
	private String produtdescp;
	
	@OneToOne(mappedBy="n",cascade = CascadeType.ALL)
	//@JsonIgnore
	private Category m;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProducttype() {
		return producttype;
	}
	public void setProducttype(String producttype) {
		this.producttype = producttype;
	}
	public String getProdutdescp() {
		return produtdescp;
	}
	public void setProdutdescp(String produtdescp) {
		this.produtdescp = produtdescp;
	}
	public Category getM() {
		return m;
	}
	public void setM(Category m) {
		this.m = m;
	}
	public Product(Long id, String productname, String producttype, String produtdescp, Category m) {
		super();
		this.id = id;
		this.productname = productname;
		this.producttype = producttype;
		this.produtdescp = produtdescp;
		this.m = m;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", productname=" + productname + ", producttype=" + producttype + ", produtdescp="
				+ produtdescp + ", m=" + m + "]";
	}

	
}