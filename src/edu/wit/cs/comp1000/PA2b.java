package edu.wit.cs.comp1000;

import java.util.Scanner;
// TODO:
public class PA2b {

	// TODO: this is a program that solves the quadratic equation in the form ax^2 + bx + c = 0
	public static void main(String[] args) {
		// TODO: write your code here
		
		Scanner input = new Scanner(System.in);
		
		double a;
		double b;
		double c;
		double discriminant;
		double root;

		
		System.out.printf("Please enter three doubles for a, b, and c: ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		discriminant = (Math.pow(b, 2)) - (4*a*c);
		root = (Math.sqrt(discriminant)) / (2*a);
		
		if (discriminant < 0) {
			System.out.printf("The root is imaginary!%n");
		}
		
		else if (discriminant == 0){
			System.out.printf("There is exactly one root, which is equal to %.2f%n", root);
			
		}
		
		else {
			System.out.printf("There are two roots, which are equal to %.2f%n and %.2f%n"
					, -root, root);
		}
		
		
		input.close();
		
	}
		
}