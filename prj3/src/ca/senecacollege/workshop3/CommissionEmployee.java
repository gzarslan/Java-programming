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
public class CommissionEmployee extends Employee{
	private double grossSales;
	private double commissionRate;
	public double getGrossSales() {
		return grossSales;	}
	public CommissionEmployee(String fN, String lN, String sN,double grossSales,double commissionRate) {
		super(fN, lN, sN);
		// TODO Auto-generated constructor stub
		this.grossSales = grossSales;
		setCommissionRate(commissionRate);
	}	
	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}
	public double getCommissionRate() {
		return commissionRate;
	}
	public void setCommissionRate(double commissionRate) {
		
		try {
		     if (commissionRate < 0 || commissionRate > 1.0) {
			this.commissionRate = commissionRate;			
		      }
		else {				
			throw new Exception();
		}
		}catch(Exception e) {			
			System.err.println("Commission rate should between 0 - 1");}		
	}	
	@Override
	public double getPaymentAmount() {
		return getCommissionRate() * getGrossSales();
	}
	@Override
	public String toString() {
		return String.format("%s Commission: Gross Sales:$%.2f, Commission Rate: %.2f ", super.toString(),
				getGrossSales(), getCommissionRate());
	}
}
