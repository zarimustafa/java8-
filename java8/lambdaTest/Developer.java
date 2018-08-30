package com.java8.lambdaTest;

import java.math.BigDecimal;

public class Developer {
	private String name;
	private String major;
	private BigDecimal salary;
	public Developer(String name, String major, BigDecimal salary) {
		super();
		this.name = name;
		this.major = major;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Developer [name=" + name + ", major=" + major + ", salary=" + salary + "]";
	}
	
	
}
