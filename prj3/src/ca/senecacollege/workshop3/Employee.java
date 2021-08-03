 /**********************************************
 * Workshop 3 (Part 1-2) 
 * Course: JAC444 -summer 2021 
 * Last Name: Arslan
 * First Name: Gozde
 * ID: 150320190
 * Section: NCC
 * This assignment represents my own work in accordance with Seneca Academic Policy.
 * Signature G.A
 * Date:14/06/2021
 * **********************************************/




package ca.senecacollege.workshop3;

public abstract class Employee implements Payable {
     private String firstName;
     private String lastName;
     private String socialSecurityNumber;	
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
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	public Employee(String fName, String lName, String sNumber) {
		firstName = fName;
		lastName = lName;
		socialSecurityNumber = sNumber;
	}
	@Override
	public String toString() {
		return String.format("Employee:\n Name: %s %s \n SSN: %s \n",  getFirstName(), getLastName(), getSocialSecurityNumber());

	}
		
	

	

}
