package com.capgemini.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class Employee {
	private int empNumber;
	
	private String name;

	
	private Address address;

	


	public Employee() {
		super();
		System.out.println("Empty Constructor is called");
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
