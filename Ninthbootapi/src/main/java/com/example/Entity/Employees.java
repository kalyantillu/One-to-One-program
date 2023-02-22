package com.example.Entity;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Employees {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int emp_id;
	private String emp_name;
	private String job_name;
	private int manager_id;
	private Date hire_date;
	private double salary;
	private double commission;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="dep_id",referencedColumnName = "dep_id")
	private department d;
	
    
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employees(int emp_id, String emp_name, String job_name, int manager_id, Date hire_date, double salary,
			double commission, department d) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.job_name = job_name;
		this.manager_id = manager_id;
		this.hire_date = hire_date;
		this.salary = salary;
		this.commission = commission;
		this.d = d;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getJob_name() {
		return job_name;
	}

	public void setJob_name(String job_name) {
		this.job_name = job_name;
	}

	public int getManager_id() {
		return manager_id;
	}

	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}

	public Date getHire_date() {
		return hire_date;
	}

	public void setHire_date(Date hire_date) {
		this.hire_date = hire_date;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	public department getD() {
		return d;
	}

	public void setD(department d) {
		this.d = d;
	}

	@Override
	public String toString() {
		return "Employees [emp_id=" + emp_id + ", emp_name=" + emp_name + ", job_name=" + job_name + ", manager_id="
				+ manager_id + ", hire_date=" + hire_date + ", salary=" + salary + ", commission=" + commission + ", d="
				+ d + "]";
	}
	
	
}
