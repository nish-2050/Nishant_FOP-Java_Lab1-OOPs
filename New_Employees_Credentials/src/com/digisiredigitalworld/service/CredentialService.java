package com.digisiredigitalworld.service;  //This is a package for Services like: Credential Service

import java.security.PublicKey;
import java.util.Random;

public class CredentialService {

        public String generateEmailAddress(String firstName, String lastName, String department) { //Generate Email 
        	return firstName+lastName+"@"+department +".digisiredigitalworld.com";
        }
        
        public char [] generatePassword() { // Generate password via using function
        	String capLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
        	String smallLetters = "abcdefghijklmnopqrstuvwxyz";
        	String numbers = "1234567890";
        	String splchars = "!@#$%^&*()?><:{}[]";
        	String value = capLetters+smallLetters+numbers+splchars; //
        	int i;
        	char password [] = new char [8];   //Use array for set the length the password
        	Random random = new Random();   //Import Random Class
        	
        	for (i=0; i<8; i++) {  //Use fro loop 
        		password [i] = value.charAt(random.nextInt(value.length()));
        	}
        	 return password;  //Return the value    	  	
        	
         }
       
        	public void showCredentials(String firstName, String generateEmail, char[] genPass) { //Use showCredential Method
				System.out.println("Dear " + firstName + " your generated credential are as follows" );
				System.out.println("Email id is--->>" + generateEmail);
				System.out.println("Password is--->>" +  new String(genPass));
			}
        }
        
