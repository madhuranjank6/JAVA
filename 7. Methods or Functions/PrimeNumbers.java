/*
	Given lower limit and upper limit write a method to print all primes within that range
*/

import java.lang.*;
import java.util.Scanner;

class PrimeNumbers{
	public static void findPrimes(int lower_limit, int upper_limit){
		for(int j = lower_limit;j<=upper_limit;j++){
			boolean flag = true;
			for(int i = 2; i<j; i++){
				if(j%i == 0){
					flag = false;
					break;
				}
			}
			if(flag){
				System.out.println(j);
			}
		}
	}
	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the lower limit: ");
		int l = scan.nextInt();
		System.out.println("Enter the upper limit: ");
		int u = scan.nextInt();
		findPrimes(l,u);
	}
}