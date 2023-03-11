package com.example.firstdynamic.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ZohoInvoice {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String customername;  
	private String invoicenumber;  
	private String title;
	private String ordernumber;
	private String customeremail;  
	private String customeraddress; 
	private String description; 
	private String amount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getInvoicenumber() {
		return invoicenumber;
	}
	public void setInvoicenumber(String invoicenumber) {
		this.invoicenumber = invoicenumber;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getOrdernumber() {
		return ordernumber;
	}
	public void setOrdernumber(String ordernumber) {
		this.ordernumber = ordernumber;
	}
	public String getCustomeremail() {
		return customeremail;
	}
	public void setCustomeremail(String customeremail) {
		this.customeremail = customeremail;
	}
	public String getCustomeraddress() {
		return customeraddress;
	}
	public void setCustomeraddress(String customeraddress) {
		this.customeraddress = customeraddress;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public ZohoInvoice(int id, String customername, String invoicenumber, String title, String ordernumber,
			String customeremail, String customeraddress, String description, String amount) {
		super();
		this.id = id;
		this.customername = customername;
		this.invoicenumber = invoicenumber;
		this.title = title;
		this.ordernumber = ordernumber;
		this.customeremail = customeremail;
		this.customeraddress = customeraddress;
		this.description = description;
		this.amount = amount;
	}
	public ZohoInvoice() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ZohoInvoice [id=" + id + ", customername=" + customername + ", invoicenumber=" + invoicenumber
				+ ", title=" + title + ", ordernumber=" + ordernumber + ", customeremail=" + customeremail
				+ ", customeraddress=" + customeraddress + ", description=" + description + ", amount=" + amount + "]";
	}

	
}
