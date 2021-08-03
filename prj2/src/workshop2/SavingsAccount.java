/**********************************************
 * Workshop 2 )
 * Course:JAC444 -summer 2021 
 * Last  Name: Arslan
 * First Name: Gozde
 * ID: 150320190
 * Section:NCC
 * This assignment represents my own work in accordance with Seneca Academic Policy.
 * Signature 
 * Date:08/06/2021
 * **********************************************/


package workshop2;

	public class SavingsAccount extends Account { //savings account inherit from Account 
	  double m_rateOfInterest;
	   public SavingsAccount(double initialBalance,double interestRate) {
		   super(initialBalance); 
		   m_rateOfInterest=interestRate;
	   }
	   
	   public double calculateInterest() {
		  double  interest  =0.0;
		  interest=getBalance()*m_rateOfInterest;
		  return interest;
	   }
	}




