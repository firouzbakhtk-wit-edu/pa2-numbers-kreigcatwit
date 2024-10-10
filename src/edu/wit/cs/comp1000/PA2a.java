package edu.wit.cs.comp1000;

import java.util.Scanner;
// TODO: Cath Kreig
public class PA2a {

	// TODO: This is a program that reads five integers from the user. and outputs its statistics
	public static void main(String[] args) {
		// TODO: write your code here
		
		Scanner input = new Scanner(System.in);
		
		// initialize variables 
		int num1;
		int num2;
		int num3;
		int num4;
		int num5;
		int sum = 0;
	    int positiveSum = 0;
	    int negativeSum = 0;
	    int numPositive = 0;
	    int numNegative = 0;
	    double averagePositive = 0;
	    double averageNegative = 0;
	    double averageTotal = 0;
	
		
		// input
		System.out.printf("Please enter five whole numbers: ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();
		num4 = input.nextInt();
		num5 = input.nextInt();
   
		//input processing
        if (num1 > 0) {
            positiveSum += num1;
            numPositive++;
            sum++;
        } else {
            negativeSum += num1;
            numNegative++;
            sum++;
        }

        if (num2 > 0) {
            positiveSum += num2;
            numPositive++;
            sum++;
            
        } else {
            negativeSum += num2;
            numNegative++;
            sum++;
        }

        if (num3 > 0) {
            positiveSum += num3;
            numPositive++;
            sum++; 
            
        } else {
            negativeSum += num3;
            numNegative++;
            sum ++;
        }

        if (num4 > 0) {
            positiveSum += num4;
            numPositive++;
            sum++;
            
        } else {
            negativeSum += num4;
            numNegative++;
            sum++;
        }

        if (num5 > 0) {
            positiveSum += num5;
            numPositive++;
            sum++;
            
        } else {
            negativeSum += num5;
            numNegative++;
            sum++;
        }
		
        // math calculations
        averagePositive = positiveSum / 5.0;
        averageNegative = negativeSum / 5.0;
        sum = positiveSum + negativeSum;
        averageTotal = sum / 5.0;
        
        
		
		//output
		System.out.printf("The sum of the positive numbers is: " + positiveSum + "%n");
		System.out.printf("The sum of the negative numbers is: " + negativeSum + "%n");
		System.out.printf("The sum of all five numbers is: %n" + sum + "%n");
		System.out.printf("The average of all positive numbers is: %.2f%n", averagePositive);
		System.out.printf("The average of all negative numbers is: %.2f%n", averageNegative);
		System.out.printf("The average of all of the numbers is: %.2f%n", averageTotal);
		
		
		input.close();
		
		
		
		
		
	}
}
