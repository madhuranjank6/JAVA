// Java Program to display AP Series

import java.lang.*;
import java.util.Scanner;

class ArithmeticSeries{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a, d and n:");
		int a = scan.nextInt();
		int d = scan.nextInt();
		int n = scan.nextInt();
		for(int i = 1; i<=n; i++){
			System.out.print(a+" ");
			a = a + d;
		}
	}
}