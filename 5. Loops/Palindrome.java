// Java Program to Check for Palindrome Number

import java.lang.*;
import java.util.Scanner;

class Palindrome{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check: ");
		int n = scan.nextInt();
		int reverse = 0;
		int temp = n;
		while(n>0){
			int r = n%10;
			reverse = reverse*10+r;
			n = n/10;
		}
		if(temp == reverse){
			System.out.println("Palindrome");
		}else{
			System.out.println("Not Palindrome");
		}
	}
}