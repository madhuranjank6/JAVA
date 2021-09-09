// Java Program to make simple arithmetic calculator using Switch case

import java.lang.*;
import java.util.Scanner;

class ArithmeticCalculator{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int m, n;
		int option;
		System.out.println("Choose the options: \n1. ADD \n2. SUB \n3. MUL \n4. DIV");
		option = scan.nextInt();
		System.out.println("Enter two numbers: ");
		m = scan.nextInt();
		n = scan.nextInt();
		
		switch(option){
			case 1: System.out.println(m+n);
				break;
			case 2: System.out.println(m-n);
				break;
			case 3: System.out.println(m*n);
				break;
			case 4: System.out.println((float)m/(float)n);
				break;
			default: System.out.println("Invalid Option");
		}
	}
}