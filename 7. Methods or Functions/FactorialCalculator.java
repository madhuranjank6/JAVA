// Java Program to calculate factorial of small numbers

import java.lang.*;
import java.util.Scanner;

class FactorialCalculator{
	static long fact(int num){
		long fact = 1;
		for(int i = 1; i <= num; i++){
			fact = fact *i;
		}
		return fact;
	}
	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to calculate Factorial: ");
		int n = scan.nextInt();
		long fact = fact(n);
		System.out.println("Factorial of "+n+" is " + fact);
	}
}