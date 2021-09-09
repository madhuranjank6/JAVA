// Java Program to reverse a number

import java.lang.*;
import java.util.Scanner;

class ReverseNumber{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to reverse: ");
		int n = scan.nextInt();
		int reverse = 0;
		while(n>0){
			int r = n%10;
			reverse = reverse*10+r;
			n = n/10;
		}
		System.out.println("Reverse = " + reverse);
	}
}