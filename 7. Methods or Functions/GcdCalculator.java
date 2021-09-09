/*
	Given two numbers, Write a java program to calculate the GCD of two numbers using method
*/

import java.lang.*;
import java.util.Scanner;

class GcdCalculator{
	// Method to calculate GCD
	static int gcd(int a, int b){
		while(a!=b){
			if(a>b){
				a = a - b;
			}else{
				b = b - a;
			}
		}
		return a;
	}
	
	//main method
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int x = scan.nextInt();
		int y = scan.nextInt();
		int result = gcd(x,y);
		System.out.println("GCD of "+x + " and "+y+ " = " + result);
	}
}