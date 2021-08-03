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

public class BasePlusCommissionEmployee extends CommissionEmployee {
	private double baseSalary;
	public double getBaseSalary() {	return baseSalary;}
	public void setBaseSalary(double baseSalary) {		
		try {   if (baseSalary > 0 ) {this.baseSalary = baseSalary;	     }
		else {	throw new Exception();}
		}catch(Exception e) {			
			System.err.println("Base Salary cannot be negative");}	
	}
	public BasePlusCommissionEmployee(String fN, String lN, String sN, double grossSales, double commissionRate,
			double baseSalary) {
		super(fN, lN, sN, grossSales, commissionRate);
		
		setBaseSalary(baseSalary);
	}
	
	@Override
	public double getPaymentAmount() {

		return getBaseSalary() +super.getPaymentAmount() * 0.1;
	}
	@Override
	public String toString() {
		return String.format("%s Base Salary: %.2f", super.toString(), getBaseSalary());

	}

}
