/**********************************************
* Workshop 6 (Part 1-2) 
* Course: JAC444 -summer 2021 
* Last Name: Arslan
* First Name: Gozde
* ID: 150320190
* Section: NCC
* This assignment represents my own work in accordance with Seneca Academic Policy.
* Signature G.A
* Date: 13/07/2021
* **********************************************/


package application;


import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	
	 ArrayList<Double> numbers = new ArrayList<Double>();

    public static final ArrayProcessor findMax = (double[] array) -> {
        if (array.length == 0)
            throw new RuntimeException("Empty array");

        double max = array[0];
        for (int i = 1; i < array.length; ++i) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    };

    public static final ArrayProcessor findMin = (double[] array) -> {
        if (array.length == 0)
            throw new RuntimeException("Empty array");

        double min = array[0];
        for (int i = 1; i < array.length; ++i) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    };

    public static final ArrayProcessor findSum = (double[] array) -> {
 double sum = 0;
    
        for (double d : array) {
            sum += d;
        }        return sum;
    };

    public static final ArrayProcessor findAverage = (double[] array) -> {
        if (array.length == 0)
            throw new RuntimeException("Empty array");
        return findSum.apply(array) / array.length;
    };

    public static ArrayProcessor counter( double value ) {
        return (double[] array) -> {
            double cnt = 0;
            for (double d : array) {
                if (d == value) {
                    ++cnt;
                }
            }
            return  cnt;
        };
    }

    
    
    public static void main(String[] args) {
        double[] arr = new double[8];

        System.out.println("Enter 8 doubles :");       
		Scanner scan = new Scanner(System.in);
            for (int i = 0; i < arr.length; ++i)
                arr[i] = scan.nextDouble();        

		System.out.printf("The maximum value of the array is: %.2f,"
				+ "\nThe minimum value of the array is: %.2f,"
				+ "\nThe average of the array values is: %.2f"
				+ "\nThe Sum of the array values is: %.2f",
				findMax.apply(arr),findMin.apply(arr),findSum.apply(arr),findSum.apply(arr));
	    System.out.printf("\nCount of 5: %f\n", counter(10).apply(arr));
    }
}
