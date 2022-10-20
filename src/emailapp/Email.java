package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String alternateEmail;
	private int mailboxCapacity;
	
	//Constructor to receive first and last name
	public Email(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED! Welcome " + this.firstName + " " +  this.lastName);
		
		//Ask for department
		this.department = setDeapartment();
		System.out.println("Department: " + department);
	}
	
	//Generate an email with the following syntax: firstname.lastname@department.company.com
	
	//Ask for department (sales, development, accounting), if none leave blank
	private String setDeapartment() {
		System.out.print("Enter the department\n1 for Sales\n2 for Development\n3 for Accounting\n0 if none.\n Enter code here:");
		Scanner in = new Scanner(System.in);
		int departmentChoice = in.nextInt();
		if(departmentChoice == 1) {return "Sales";}
		else if(departmentChoice == 2) {return "Development";}
		else if(departmentChoice == 3) {return "Accounting";}
		else{return " ";}
	}
	
	//Generate a random  password
	private String randomPassword(int length) {	
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()";
		char[] password = new char[length];
		for(int i = 0; i < length; i++) {
			int random = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(random);
		}
	}
	
	//Have set methods to change the password, set the mailbox capacity, and define an alternate email address
	
	//Have get methods to display the name, email, and mailbox capacity

}
