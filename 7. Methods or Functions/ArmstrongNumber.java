/*
	Given lower limit and upper limit, write a java program to print all armstrong numbers between that range using functions
*/

import java.lang.*;
import java.util.Scanner;

class ArmstrongNumber{
	// Function to count the number of digits in the number
	static int len(int num){
		int count = 0;
		while(num !=0){
			num = num/10;
			count++;
		}
		return count;
	}
	
	//Function to check for armstrong number
	static boolean armstrongNumber(int num){
		int sum = 0;
		int temp = num;
		while(num!=0){
			int r = num%10;
			sum += Math.pow(r,len(temp));
			num = num /10;
		}
		
		if(sum == temp){
			return true;
		}else{
			return false;
		}
	}
	
	//Main Function
	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Lower and Upper limits respectively:");
		int l = scan.nextInt();
		int u = scan.nextInt();
		for(int i = l; i<=u; i++){
			if(i>10 && armstrongNumber(i)){
				System.out.println(i);
			}
		}
	}
}