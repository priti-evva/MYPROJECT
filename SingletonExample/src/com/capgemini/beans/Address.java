package com.capgemini.beans;

public class Address {
	private String city;
	
	private int zipcode;
	public Address()
	{
		System.out.println("From Address constructor");
	}
	
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	

}
