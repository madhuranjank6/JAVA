// Java Program to print Multiplication Table

import java.lang.*;
import java.util.Scanner;

class MultiplicationTable{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to print the Table: ");
		int num = scan.nextInt();
		for(int i = 1; i<= 10; i++){
			System.out.println(num+" X "+i+" = "+(num*i));
		}
	}
}