package com.omkar.main;

import java.util.Scanner;

import com.omkar.model.Employee;

import com.omkar.service.Service;

public class Driver {

	public static void main(String[] args) {
		Employee em = new Employee("Omkar", "Jadhav");
		Service se = new Service();
		Scanner sc = new Scanner(System.in);
		int option;
		
		String generatedEmail;
		char[] generatedPassword;
		
		
		
	 	
			System.out.println("Please enter the department from the following");
			
			System.out.println("1. Technical");
			System.out.println("2. Admin");
			System.out.println("3. Human Resource");
			System.out.println("4. Legal");
			option = sc.nextInt();
			
			switch(option)
			{
			case 1:
				se.showCredentials("Omkar");
				generatedEmail = se.generateEmailAddress(em.getFirstName() , em.getLastName() , "Tech");
				System.out.println(generatedEmail.toLowerCase() );
				generatedPassword = se.generatePassword();
				System.out.println(generatedPassword);
				
				
				break;
				
			case 2:
				se.showCredentials("Omkar");
				generatedEmail = se.generateEmailAddress(em.getFirstName() , em.getLastName() ,  "Admin");
				System.out.println(generatedEmail.toLowerCase()  );
				generatedPassword = se.generatePassword();
				System.out.println(generatedPassword);
				break;
			case 3:
				se.showCredentials("Omkar");
				generatedEmail = se.generateEmailAddress(em.getFirstName() , em.getLastName() ,  "HR");
				System.out.println(generatedEmail.toLowerCase()  );
				generatedPassword = se.generatePassword();
				System.out.println(generatedPassword);
				break;
			case 4:
				se.showCredentials("Omkar");
				generatedEmail = se.generateEmailAddress(em.getFirstName() , em.getLastName() ,  "Legal");
				System.out.println(generatedEmail.toLowerCase()  );
				generatedPassword = se.generatePassword();
				System.out.println(generatedPassword);
				break;
			default:
				System.out.println("Enter valid option");
			}
			
	}
	
}
