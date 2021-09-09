// Java Program to print sum of n numbers

import java.lang.*;
import java.util.Scanner;

class SumOfNNumbers{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of  n: " );
		int n = scan.nextInt();
		int sum = 0;
		for(int i =0; i<=n; i++){
			sum = sum + i;
		}
		System.out.println(sum);
	}
}