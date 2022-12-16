package com.example.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;


@Entity

public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String category_1;
	private String category_2;
	private String category_3;
  
    @OneToOne(cascade = CascadeType.ALL)
 	@JoinColumn(name="p_Id", referencedColumnName="id")
 	private Product n;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategory_1() {
		return category_1;
	}

	public void setCategory_1(String category_1) {
		this.category_1 = category_1;
	}

	public String getCategory_2() {
		return category_2;
	}

	public void setCategory_2(String category_2) {
		this.category_2 = category_2;
	}

	public String getCategory_3() {
		return category_3;
	}

	public void setCategory_3(String category_3) {
		this.category_3 = category_3;
	}

	public Product getN() {
		return n;
	}

	public void setN(Product n) {
		this.n = n;
	}

	public Category(Long id, String category_1, String category_2, String category_3, Product n) {
		super();
		this.id = id;
		this.category_1 = category_1;
		this.category_2 = category_2;
		this.category_3 = category_3;
		this.n = n;
	}

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", category_1=" + category_1 + ", category_2=" + category_2 + ", category_3="
				+ category_3 + ", n=" + n + "]";
	}
     
    
 
}