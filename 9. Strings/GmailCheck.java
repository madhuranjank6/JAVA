// Java Program to check if email Id is on gmail or not

import java.lang.*;
import java.util.Scanner;

class GmailCheck{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Email Id: ");
		String email = scan.nextLine();
		
		int index1 = email.indexOf("@");
		int index2 = email.lastIndexOf(".");
		String domain = email.substring(index1+1,index2);
		
		if(domain.equals("gmail")){
			System.out.println("Email is on Gmail");
		}else{
			System.out.println("Email is not on Gmail");
		}
	}
}