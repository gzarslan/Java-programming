/**********************************************
 * Workshop 7 (Task 1-2) 
 * Course: JAC444 -summer 2021 
 * Last Name: Arslan
 * First Name: Gozde
 * ID: 150320190
 * Section: NCC
 * This assignment represents my own work in accordance with Seneca Academic Policy.
 * Signature G.A
 * Date: 20/07/2021
 * **********************************************/


package task2;

import java.lang.Math;
import java.util.Scanner;

public class FindPrime {

	 //finds factor for the input from user
	public static void findFactor(int n) {
		while (n % 2 == 0) {
			System.out.print(2 + " ");
			n =n/ 2;}
		for (int i = 3; i <= Math.sqrt(n); i += 2) {
 
			while (n % i == 0) {
				System.out.print(i + " ");
				n =n/ i;
			}}

		if (n > 2)
			System.out.print(n);
	}
	public static void main(String[] args) {
		int val;
		boolean isPrime = true;
		Scanner scan = new Scanner(System.in);
		System.out.println("***Please enter a number :");
		int input = scan.nextInt();
		scan.close();
		for (int i = 2; i <= input / 2; i++) {
			val = input % i;
			if (val == 0) {
				isPrime = false;
				break;
			}}
		if (isPrime)
			System.out.println(input + " is a Prime number");
		else
			System.out.println(input + " is not a Prime Number");
		System.out.println( "***Factors of " +input +" ***");
		findFactor(input);
	}

}
