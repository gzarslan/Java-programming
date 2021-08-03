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
 import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

import java.util.Scanner;



public class Main {
	

	    private static ArrayList<String> combineListName(ArrayList<String> list1, ArrayList<String> list2) {
	        ArrayList<String> res = new ArrayList<>();
	        res.addAll(list1);
	        res.addAll(list2);
	        java.util.Collections.sort(res);
	        LinkedHashSet<String> set = new LinkedHashSet<>(res);
	        res.clear();
	        res.addAll(set);
	        return res;
	    }


    public static void main(String[] args)  {
    	 System.out.print("***Enter file names from baby ranking files : ");

        ArrayList<String> maleNames = new ArrayList<>();
        ArrayList<String> femaleNames = new ArrayList<>();    
    	try {
    	    
            Scanner in = new Scanner(System.in);
           String path = "src/application/" + in.nextLine() + ".txt";       
            in = new Scanner(new File(path));  		      
	        while (in.hasNext()) {
	            in.nextInt(); 
	            maleNames.add(in.next()); 
	            in.nextInt(); 
	            femaleNames.add(in.next()); 
	            in.nextInt(); 
	        	in.close();
	        	maleNames.retainAll(femaleNames);
	        	
	        } 
	      
	        } catch (Exception e) {
	           
	        }
        Iterator<String> iterator = maleNames.iterator();
        int counter = 1;
        
        combineListName(maleNames, femaleNames);
        while (iterator.hasNext()) {
        	 System.out.println("Sorted Names"); 
            System.out.print(iterator.next() + ", ");
            if (counter % 10 == 0)
                System.out.println();
            counter++;
        }
           

           
        }
    	
}  	
    	    

           
       
    

