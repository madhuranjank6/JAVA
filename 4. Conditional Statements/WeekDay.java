// Java Program to display the day based on number

import java.lang.*;
import java.util.Scanner;

class WeekDay{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int day;
		System.out.println("Eneter the day number: ");
		day = scan.nextInt();
		
		switch(day){
			case 1: System.out.println("Monday");
				break;
			case 2: System.out.println("Tuesday");
				break;
			case 3: System.out.println("Wednesday");
				break;
			case 4: System.out.println("Thursday");
				break;
			case 5: System.out.println("Friday");
				break;
			case 6: System.out.println("Saturday");
				break;
			case 7: System.out.println("Sunday");
				break;
			default: System.out.println("Invalid Day Number");
		}
	}
}