package com.example.Entity;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
//import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;


@Entity

public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long categoryid;
	private String categoryname;
	private String categorydescp;
  
   @OneToOne(cascade = CascadeType.ALL)
   @JoinTable(name="Category_product",            
	joinColumns = { @JoinColumn(name="m_id")},
	inverseJoinColumns= { @JoinColumn(name="n_categoryid")})  // @JsonManagedReference
 	private Product n;

public Long getCategoryid() {
	return categoryid;
}

public void setCategoryid(Long categoryid) {
	this.categoryid = categoryid;
}

public String getCategoryname() {
	return categoryname;
}

public void setCategoryname(String categoryname) {
	this.categoryname = categoryname;
}

public String getCategorydescp() {
	return categorydescp;
}

public void setCategorydescp(String categorydescp) {
	this.categorydescp = categorydescp;
}

public Product getN() {
	return n;
}

public void setN(Product n) {
	this.n = n;
}

public Category(Long categoryid, String categoryname, String categorydescp, Product n) {
	super();
	this.categoryid = categoryid;
	this.categoryname = categoryname;
	this.categorydescp = categorydescp;
	this.n = n;
}

public Category() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Category [categoryid=" + categoryid + ", categoryname=" + categoryname + ", categorydescp=" + categorydescp
			+ ", n=" + n + "]";
}


     
	// @ManyToOne(cascade = CascadeType.ALL)
	 //	@JoinColumn(name="p_Id", referencedColumnName="id")
	 //	private Product n;
	 
}