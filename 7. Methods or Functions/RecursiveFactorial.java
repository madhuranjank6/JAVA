// Java Program to calculate factorial using recursion

import java.lang.*;
import java.util.Scanner;

class RecursiveFactorial{
	public static int fact(int n){
		//base case
		if(n==1){
			return n;
		}
		
		//Smaller Problem: factorial of n-1
		int fnm1 = fact(n-1);
		
		//Converting smaller problem to solve original problem
		int fact = n * fnm1;
		return fact;
	}
	
	public static void main(String args[]){
		int n = 5;
		int fact = fact(5);
		System.out.println("Factorial = " +fact);
	}
}