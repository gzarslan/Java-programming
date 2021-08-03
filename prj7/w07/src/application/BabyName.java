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


package application;

import java.util.Scanner;

public class BabyName {
	public String orderNum = "";
	public String name = "";
	public String count = "";

	

	public static BabyName [] parseLine(String line) {
		BabyName [] arr = new BabyName [2];
		Scanner sc = new Scanner(line);
		String orderNum = sc.next();
		for(int i=0;i<arr.length;++i) {
			arr[i]=new BabyName();
			arr[i].orderNum=orderNum;
			arr[i].name=sc.next();
			arr[i].count=sc.next();
			
		}
		sc.close();
		return arr;
	}
}