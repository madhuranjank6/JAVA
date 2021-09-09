// Java Program to check if the given year is leap year or not

import java.lang.*;
import java.util.Scanner;

class LeapYear{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int year;
		System.out.println("Enter the year to check: ");
		year = scan.nextInt();
		
		if(year%4 == 0){
			if(year%100 == 0){
				if(year%400 == 0){
					System.out.println("Leap Year");
				}else{
					System.out.println("Not Leap Year");
				}
			}else{
				System.out.println("Leap Year");
			}
		}else{
			System.out.println("Not Leap Year");
		}
	}
}