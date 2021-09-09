// Java Program to display GP Series

import java.lang.*;
import java.util.Scanner;

class GeometricSeries{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a, r and n:");
		int a = scan.nextInt();
		int r = scan.nextInt();
		int n = scan.nextInt();
		for(int i = 1; i<=n; i++){
			System.out.print(a+" ");
			a = a * r;
		}
	}
}