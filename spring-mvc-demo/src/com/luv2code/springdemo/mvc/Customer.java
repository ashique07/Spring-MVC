package com.luv2code.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {
	
	private String firstName;
	
	//add validation rules
	@NotNull(message="is Required")
	@Size(min=3, message="Minumum 3 characters required")
	private String lastName;
	
	//add validation rules
	@NotNull(message="is Required")
	@Min(value=0, message="Value must be greater than 0")
	@Max(value=10, message="Value must be less than 10")
	//private int freePasses;
	private Integer freePasses;
	
	//add validation rules
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="Only 5 characters or digits allowed")
	private String postalCode;
	
	public Customer()
	{
		
	}
	
	

	public String getPostalCode() {
		return postalCode;
	}



	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}



	public Integer getFreePasses() {
		return freePasses;
	}



	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}



	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}