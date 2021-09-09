// Java Program to take marks of three subjects from user and display the overall grade of the student

import java.lang.*;
import java.util.Scanner;

class StudentGrade{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the marks in three subjects out of 100: ");
		int m1,m2,m3;
		m1 = scan.nextInt();
		m2 = scan.nextInt();
		m3 = scan.nextInt();
		
		float avg = ((float)(m1+m2+m3)/300)*100;
		if(avg >= 90){
			System.out.println("A");
		}
		else if(avg >= 80 && avg <= 89){
			System.out.println("B");
		}
		else if(avg >= 70 && avg <= 79){
			System.out.println("C");
		}
		else if(avg >= 60 && avg <= 69){
			System.out.println("D");
		}
		else if(avg >= 50 && avg <= 59){
			System.out.println("E");
		}else{
			System.out.println("Fail");
		}
	}
}