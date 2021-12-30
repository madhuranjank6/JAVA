// Java Program to demonstrate try and catch block

import java.lang.*;
import java.util.Scanner;

class ExceptionHandling1{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any two numbers: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		// int c = a/b; // Here Exception Handling is required
		
		try{
			int c = a/b;
			System.out.println("Division = "+c);
		}
		catch(ArithmeticException ae){
			System.out.println("Division by Zero is not defined");
		}
	}
}