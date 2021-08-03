 /**********************************************
 * Workshop 3 (Part 1-2) 
 * Course: JAC444 -summer 2021 
 * Last Name: Arslan
 * First Name: Gozde
 * ID: 150320190
 * Section: NCC
 * This assignment represents my own work in accordance with Seneca Academic Policy.
 * Signature G.A
 * Date:08/06/2021
 * **********************************************/

package ca.senecacollege.workshop3;
public class HourlyEmployee extends Employee {
	public HourlyEmployee(String fN, String lN, String sN,double wage,double hours) {
		// TODO Auto-generated constructor stub
		super(fN, lN, sN);		
		setWage(wage);
		setHours(hours) ;
	}
	private double wage;
	private double hours;
	public double getWage() {return wage;}
	public void setWage(double wage) {
		try {   if (wage > 0 ) {this.wage = wage;	     }
		else {	throw new Exception();}
		}catch(Exception e) {			
			System.err.println("Wage cannot be negative");}		
	}		
	public double getHours() {	return hours;}
	public void setHours(double hours) {
		try {
		     if (hours > 0 || hours < 168) {
			this.hours = hours;			
		      }
		else {				
			throw new Exception();
		}
		}catch(Exception e) {	System.err.println("must be in range 0 - 168");}		
	}		public String toString() {
		return String.format("%s Salary: wage:$%.2f, hours:%.2f ", super.toString(), getWage(), getHours());

	}	
	public double getPaymentAmount() {

		return getWage() * getHours();
	}
	
}
