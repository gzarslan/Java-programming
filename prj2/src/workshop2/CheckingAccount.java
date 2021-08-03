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

public class CheckingAccount extends Account { //inherit from base
       private double m_Charge=0.0;
     
   
     
    public CheckingAccount(double initialBalance,double charge) {
    	super(initialBalance);
    	m_Charge=charge;
    }
    
    @Override
    public void credit(double amountCredit) {
    	super.credit(amountCredit);
    	m_Balance=m_Balance-m_Charge;
    }
   
	 
    @Override
    public boolean debitCheck(double amountDebit) {
    	  Boolean flag =false;
    	if(super.debitCheck(amountDebit)) {
    		m_Balance-=m_Charge;
    		 flag=true;
    	}
    	else {
    		  System.err.println("Debit amount exceeded account balance.");
    		 flag=false;
    	}
    	return flag;
    }
    
}



