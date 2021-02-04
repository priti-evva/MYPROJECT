package com.capgemini.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("emp")
public class Employee {
	private int empNumber;
	
	private String name;
	 @Autowired
	 @Qualifier("address2")
	private Address address;

	


	public Employee() {
		super();
		System.out.println("Empty Constructor is called");
	}
	
	public Employee(int empNumber) {
		super();
		this.empNumber = empNumber;
		System.out.println(" Constructor with one para empNumber is called");
	}
	
	public Employee(String name) {
		super();
		this.name = name;
		System.out.println(" Constructor with one para name is called");
	}

	public Address getAddress() {
		return address;
	}
   
	public void setAddress(Address address) {
		this.address = address;
	}

	
	public int getEmpNumber() {
		return empNumber;
	}
	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	

}
