// Java Program to display digits of a number in left to right manner

import java.lang.*;
import java.util.Scanner;

class DisplayDigits{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scan.nextInt();
		while(n>0){
			int r = n%10;
			n = n/10;
			System.out.print(r +" ");
		}
	}
}