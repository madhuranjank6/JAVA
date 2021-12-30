// Java Program to demonstrate try-catch-finally blocks

import java.lang.*;
import java.util.Scanner;

class TryCatchFinallyDemo{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any two numbers: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println("main() method started");
		System.out.println("Addition = " + (a+b));
		
		try{
			System.out.println("Division = "+(a/b));
		}
		catch(ArithmeticException e){
			System.out.println("Division by  zero is not possible");
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally{
			System.out.println("Thank You...");
		}
		
		System.out.println("Multiplication = "+(a*b));
		System.out.println("main() method ended");
	}
}