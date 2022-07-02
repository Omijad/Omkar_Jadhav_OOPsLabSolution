package com.omkar.service;

import java.util.Random;

public class Service{
 public String generateEmailAddress(String firstName , String lastName , String department) {
	 return firstName + lastName + "@" + department + ".abc.com";
 }
 
public char[] generatePassword() {
	 String capitalLetters = "ASDFGHJKL";
	String smallLetters ="asdfghjkl";
	String numbers = "1234567890";
	String specialCharac = "!@#$%^&*()";
	
	String values = capitalLetters + smallLetters + numbers + specialCharac;
	Random random = new Random();
	
	char[] password = new char[8];
	 for(int i=0;i<8;i++) {
		 password[i] = values.charAt(random.nextInt(values.length()));
		 
	 }return password;
 }

public void showCredentials(String firstName) {
	 System.out.println("Dear " +firstName+ " your generated credentials are as follows");
	 
	 
}
}

