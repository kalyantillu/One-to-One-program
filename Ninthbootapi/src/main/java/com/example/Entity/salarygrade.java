package com.example.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class salarygrade {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int grade;
	private int min_salary;
	private int max_salary;
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getMin_salary() {
		return min_salary;
	}
	public void setMin_salary(int min_salary) {
		this.min_salary = min_salary;
	}
	public int getMax_salary() {
		return max_salary;
	}
	public void setMax_salary(int max_salary) {
		this.max_salary = max_salary;
	}
	public salarygrade(int grade, int min_salary, int max_salary) {
		super();
		this.grade = grade;
		this.min_salary = min_salary;
		this.max_salary = max_salary;
	}
	public salarygrade() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "salarygrade [grade=" + grade + ", min_salary=" + min_salary + ", max_salary=" + max_salary + "]";
	}
	
	
}
