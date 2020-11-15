package emailApp;

import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private int defaultPasswordLength = 10;
	private String department;
	private String email;
	private int emailBoxCapacity = 500;
	private String alternateEmail;
	private String password;
	private String companySuffix = "claim.com";
	
	//Constructor to recieve the first and last name
	
	public  Email(String firstName, String lastName) {
		this.firstName =  firstName;
		this.lastName =  lastName;
		System.out.println("Email Created: " + this.firstName + " " + this.lastName);
		
		// call a method asking for the department, return department
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		
		// Call a method that generates a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);
		
		//combine elements to create email
		email = firstName.toLowerCase() + "." +lastName.toLowerCase() + "@" + department + "." +  companySuffix;
		System.out.println("Your email is: " + email);
		
		
		
		
		
	}
	
	//Ask for department
	private String setDepartment() {
		System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) { return "Sales"; }
		else if (depChoice == 2) { return "Development";}
		else if (depChoice == 3) { return "Accounting";}
		else { return " ";}
	}
	
	// Generate a random password
	 private String randomPassword(int length) {
		 String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*";
		 char[] password = new char[length];
		 for (int i=0; i<length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		 }
		 return new String(password);
	 }
	 
	
	// Set the mailbox capacity
	 public void setMailBoxCapacity(int capacity) {
		 this.emailBoxCapacity = capacity;
	 }
	
	//Set alternate email
	 public void setAlternateEmail(String altEmail) {
		 this.alternateEmail = altEmail;
	 }
	 
	 // Change password
	 public void changePassword(String password) {
		 this.password = password;
	 }
	 
	 public int getMailboxCapacity() {return getMailboxCapacity(); }
	 public String getAlternateEmail() {return alternateEmail;}
	 public String getPassword() {return password;}
	 
	 public String showInfo() {
		 String mailboxCapacity;
		return "DISPLAY NAME: " + firstName + " " + lastName +
				 "COMPANY EMAIL: " + email + 
				 "MAILBOC CAPACITY: " + mailboxCapacity + "mb";
	 }
	 
	 }

}
