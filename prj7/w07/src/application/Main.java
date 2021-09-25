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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) throws FileNotFoundException,IOException {
    	 System.out.print("***Enter file names from baby ranking files : ");
    	  	try {
       
        Scanner in = new Scanner(System.in);
        String path = "src/application/" + in.nextLine() + ".txt";       
        in = new Scanner(new File(path));  	 	

        ArrayList<String> maleNames = new ArrayList<>();
        ArrayList<String> femaleNames = new ArrayList<>();

        while (in.hasNext()) {
            in.nextInt(); 
            maleNames.add(in.next()); 
            in.nextInt(); 
            femaleNames.add(in.next()); 
            in.nextInt(); 
        }
        in.close();
        maleNames.retainAll(femaleNames);
        System.out.println(maleNames.size() + " names used for both genders.\n***Names are:");       
        Iterator<String> iterator = maleNames.iterator();
        int counter = 1;
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
            if (counter % 10 == 0)
                System.out.println();
            counter++;
        }
    	}catch (Exception e) {
			// TODO: handle exception
    		System.out.println(e);
		}
       
    }

}
