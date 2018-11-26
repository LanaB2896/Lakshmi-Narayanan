package com.spring4.model;

//POJO - plain old java object
public class Customer {

//properties 
	private String firstname;
	private String lastname;
	
	public Customer () {
		
	}

	//getter or accessor
	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	//setter or mutator
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

}
