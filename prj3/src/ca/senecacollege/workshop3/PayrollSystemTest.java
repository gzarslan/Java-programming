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

public class PayrollSystemTest {

	public static void main(String[] args) {
		System.out.printf("Task 1 :\n");
		System.out.printf("=========================================\n");
		
		//new
		
		SalariedEmployee emp=new SalariedEmployee("Runny", "rohn", "669-00-55-55-88", 500.0);
		BasePlusCommissionEmployee emp2= new BasePlusCommissionEmployee("justin", "harris", "947-188-25-42", 4500, 0.18,100.00);
		
		System.out.printf("%s%n Earned: %.2f%n", emp.toString(), emp.getPaymentAmount());		
		System.out.printf("%s%n Earned: %.2f%n", emp2.toString(),emp2.getPaymentAmount());
	
		
		System.out.printf("Task 2 :\n");
		System.out.printf("========================================\n");
		Employee [] tempEmp = new Employee[4];
		tempEmp[0] = new SalariedEmployee("allen", "harrison", "647-555-55-88", -345.00);
		tempEmp[1] = new HourlyEmployee("mary", "ronald", "747-222-22-22", -20,100);
		tempEmp[2] = new CommissionEmployee("John", "nicky", "744-555-33-33", -250, 0.18);				
		tempEmp[3] = new BasePlusCommissionEmployee("justin", "harris", "947-188-25-42", -4500, 5, -1000);		

		for (int i =0;i<tempEmp.length;i++) 
		{			
			System.out.printf("%s%n Earned: %.2f%n", tempEmp[i].toString(),tempEmp[i].getPaymentAmount());
			System.out.printf("%s is of %s %n",tempEmp[i].getFirstName() + " " +tempEmp[i].getLastName(),tempEmp[i].getClass().toString());
			
	}
	
	}

}
