package com.digisireditalworld.model; //This is our package for model 

public class Employee {             
	private String firstName;     
	private String lastName;
	public Employee(String firstName, String lastName) { //Parameterized Constructor to pass firstName, Last Name
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {       //Getter First Name
		return firstName;
	}
	public void setFirstName(String firstName) {   //Setter First Name
		this.firstName = firstName;
	}
	public String getLastName() {           //Getter First Name
		return lastName;
	}
	public void setLastName(String lastName) {   //Setter First Name
		this.lastName = lastName;
	}  
	
    }
