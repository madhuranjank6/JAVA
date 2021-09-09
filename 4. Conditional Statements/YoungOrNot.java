/* 
	Java Program to check if a person is young or not young
	
	For this program I have considered people from age 14 to 55 as young.
*/

import java.lang.*;
import java.util.Scanner;
class YoungOrNot{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int age;
		System.out.println("Eneter your age:");
		age = scan.nextInt();
		if(age >= 14 && age <= 55){
			System.out.println("Young");
		}
		else{
			System.out.println("Not Young");
		}
	}
}