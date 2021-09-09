// Java Program to check for Armstrong number

import java.lang.*;
import java.util.Scanner;

class ArmstrongNumber{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to check: " );
		int n = scan.nextInt();
		int temp = n;
		int num = n;
		int count = 0;
		int sum = 0;
		while(n>0){
			n = n/10;
			count++;
		}
		
		while(num>0){
			int r = num%10;
			sum += Math.pow(r,count);
			num = num/10;
		}
		
		if(temp==sum){
			System.out.println("Armstrong Number");
		}else{
			System.out.println("Not an Armstrong Number");
		}
	}
}