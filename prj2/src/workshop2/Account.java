/**********************************************
 * Workshop 2 
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

public class Account {

	
	protected double m_Balance; //private instance variable of type of account balance
	
	 
	 
	 
	 public Account(double balance){ //a constructor receives an initial balance
		   setBalance(balance);
	   }
	 
	 private void setBalance(double balance) {//validate initial balance
		  if(balance>=0.0) { //balance validation
			  m_Balance=balance;
		  }
		  else {
			  System.err.println("Error! Balance cannot be negative value");
		  }
	  }

	  public double getBalance() { //a get accessor return current balance
		  return m_Balance;
	  }
	 //Public methods
	 public void credit(double amountCredit) { //method credit 
		  m_Balance+=amountCredit; //add amount to currenct balance
	  }
	 public void debit(double amountDebit) { //method debit
		  m_Balance+=amountDebit; //add amount to currenct balance
	  }
	 
	 //to make sure debt amount does not exceed the account balance
	 public boolean debitCheck(double amountDebit) {
		  Boolean flag =false;
		  if(amountDebit<=m_Balance) {
			  m_Balance-=amountDebit;
			 flag=true;
		  }
		  else {
			  System.err.println("Debit amount exceeded account balance.");
			 flag=false;
		  }
		  return flag;
	  }
	 
	 
	   
}
