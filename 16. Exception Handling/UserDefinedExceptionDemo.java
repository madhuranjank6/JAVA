// Java Program to demonstrate User Defined Exception

import java.lang.*;
import java.util.Scanner;

class AgeException extends Exception{
	AgeException(String msg){
		super(msg);
	}
}

class UserDefinedExceptionDemo{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = scan.nextInt();
		try{
			if(age < 18){
				AgeException ae = new AgeException("Not Eligible for Voting");
				throw ae;
			}
			System.out.println("Eligible for Voting");
		}
		catch(AgeException ae){
			System.out.println(ae);
		}
	}
}