package com.digisireditalworld.app;   //This is a package name for our application

import java.util.Scanner;

import com.digisiredigitalworld.service.CredentialService;
import com.digisireditalworld.model.Employee;

public class Main {  //This is our main class which is known by Driver class 
	public static void main(String[] args) { //This is our main method
		Employee e1 = new Employee("Nishant", "Saxena"); // Use Parameterized Constructor with 2 arguments
		
		CredentialService cs = new CredentialService();  //Creating object from CredentialService class
		String generateEmail= ""; //Create variable to generate email 
	    char [] genPass = null;   // Create Passwrod to generate password
		
		Scanner scanner = new Scanner(System.in);  //import scanner class for getting the input from user 
		
		System.out.println("Please enter the department from the following\n1-Technical\n2-Admin\n3-Human Resource\n4-Legal");
		int option = scanner.nextInt(); // Get input from the user
		
		switch (option) { // Use switch case 
		
		case 1 :
			       generateEmail= cs.generateEmailAddress(e1.getFirstName().toLowerCase(), e1.getLastName().toLowerCase(), "tech");
			       genPass= cs.generatePassword(); //Get generateEmail and generatePassword to CredentialService class 
			       cs.showCredentials(e1.getFirstName(), generateEmail,genPass);
			       break;
		case 2 :   
			       generateEmail=cs.generateEmailAddress(e1.getFirstName().toLowerCase(), e1.getLastName().toLowerCase(), "admin");
		           genPass= cs.generatePassword();
		           cs.showCredentials(e1.getFirstName(), generateEmail,genPass);
		           break;
		case 3 :  
			       generateEmail=cs.generateEmailAddress(e1.getFirstName().toLowerCase(), e1.getLastName().toLowerCase(), "hr");
		           genPass= cs.generatePassword();
		           cs.showCredentials(e1.getFirstName(), generateEmail,genPass);
		           break;
		case 4 :   
			       generateEmail=cs.generateEmailAddress(e1.getFirstName().toLowerCase(), e1.getLastName().toLowerCase(), "legal");
		           genPass= cs.generatePassword();  
		           cs.showCredentials(e1.getFirstName(), generateEmail,genPass);
		           break;
		default :  System.out.println("Please enter the valid option");  // This is default result for invalid option
		}
		     
		            //Show Credentials 
	}
}
