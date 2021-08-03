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
import java.util.Scanner;
public class TesterApp {
 
	
	public static void main(String [] args) {
	
			
		System.out.println("======================");
		  System.out.println("Task 1");
		  System.out.println("======================");
			Account account1=new Account(-10.00);
			Account account=new Account(10.00);
			System.out.println("Account balance is:"+ account1.getBalance()+"\n");
			System.out.println("Account balance is:"+ account.getBalance()+"\n");
			System.out.println("*****Checking Account Info****");	

			account=new CheckingAccount(20.00,0.2);
			System.out.println("CheckingAccount balance is: "+account.getBalance());
						account.credit(10.00);
			System.out.println("CheckingAccount credit : "+account.getBalance());
			account.debit(15.00);
			System.out.println("CheckingAccount debit : "+account.getBalance());
			
			account.credit(20.00);
			System.out.println("Account credit: "+account.getBalance());
			account.debit(25.00);
			System.out.println("Account debit:"+account.getBalance());
			
			
			System.out.println("*****Savings Account Info**** \n");
			SavingsAccount SavingAcc=new SavingsAccount(45.00,0.05);
			System.out.println("Savings Account interest is:"+SavingAcc.calculateInterest());
				
			
			
		
			
			System.out.println("======================");
			System.out.println("Task 2");
			 System.out.println("======================");
			Account [] array=new Account[3];
			array[0]=new Account(0);
			array[1]=new SavingsAccount(0,0.2);
			array[2]=new CheckingAccount(0,0.5);
			
			
			Scanner input=new Scanner(System.in);	
			
			for(int i=0;i<array.length;i++) {
				System.out.println("Enter credit amount:");
				double amount=input.nextDouble();
				array[i].credit(amount);
				System.out.println("Current balance is \n"+array[i].getBalance());
				System.out.println("Enter debit amount: ");
				amount=input.nextDouble();
				array[i].debit(amount);
				System.out.println("Current balance is : "+array[i].getBalance());
				if(array[i] instanceof SavingsAccount) {
					amount=((SavingsAccount)array[i]).calculateInterest();
					array[i].credit(amount);
					System.out.println("Savings Account balance after interest calculation is: "+array[i].getBalance());;
				}
				
				
			}
			input.close();
		}
	
		
	
			
		
    

	}


