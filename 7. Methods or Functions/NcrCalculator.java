// Java Program to calculate ncr using methods

import java.lang.*;
import java.util.Scanner;

class NcrCalculator{
	static long fact(int num){
		long fact = 1;
		for(int i = 1; i <= num; i++){
			fact = fact *i;
		}
		return fact;
	}
	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n and r: ");
		int n = scan.nextInt();
		int r = scan.nextInt();
		long result = fact(n)/(fact(r)*fact(n-r));
		System.out.println("Result = " + result);
	}
}