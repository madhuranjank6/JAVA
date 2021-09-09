// Java Program to calculate Factorial of a Number

import java.lang.*;
import java.util.Scanner;

class FactorialOfNumber{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to calculate the Factorial: ");
		int num = scan.nextInt();
		long fact = 1;
		for(int i=1;i<=num;i++){
			fact = fact * i;
		}
		System.out.println("Factorial of "+num+" = "+fact);
	}
}