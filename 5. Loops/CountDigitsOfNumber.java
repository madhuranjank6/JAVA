// Java Program to count digits in a number

import java.lang.*;
import java.util.Scanner;

class CountDigitsOfNumber{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the Number: ");
		int n = scan.nextInt();
		int count = 0;
		while(n>0){
			n = n/10;
			count = count + 1;
		}
		System.out.println(count);
	}
}