// Java Program to print FIbonacci Series

import java.lang.*;
import java.util.Scanner;

class FibonacciSeries{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of terms:");
		int n = scan.nextInt();
		int a=0,b=1,c;
		System.out.print(a+" "+b+" ");
		for(int i=0;i<n-2;i++){
			c = a + b;
			System.out.print(c+" ");
			a = b;
			b = c;
		}
	}
}