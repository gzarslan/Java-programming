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

public class SalariedEmployee extends Employee {
	private double weeklysalary;
	public SalariedEmployee(String fN, String lN, String sN,double salary) {
		super(fN, lN, sN);
		// TODO Auto-generated constructor stub
		setWeeklysalary(salary);
	}

	public double getWeeklysalary() {
		return weeklysalary;
	}

	public void setWeeklysalary(double weeklysalary) {
		try {
		
		if (weeklysalary >0) 
		{	this.weeklysalary = weeklysalary;
			
		}
		else {			
			throw new Exception();			
		}
		}catch(Exception e) {
			System.err.println("Salary cannot be negative value");			
		}	
	}
	@Override
	public double getPaymentAmount() {

		return getWeeklysalary();
		}

	@Override
	public String toString() {
		return String.format(" %s Salary :weekly salary: $%.2f ", super.toString(), getWeeklysalary());

	}
	
}
