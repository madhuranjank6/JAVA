// Java Program to calculate Nth Fibonacci term

import java.lang.*;
import java.util.Scanner;

class FibonacciTerm{
	public static int fibonacci(int n){
		//base case
		if(n==0||n==1){
			return n;
		}else{
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n = scan.nextInt();
		System.out.println(fibonacci(n));
	}	
}