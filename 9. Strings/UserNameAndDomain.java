// Java Program to find Username and domain from an email

import java.lang.*;
import java.util.Scanner;

class UserNameAndDomain{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Email Id: ");
		String email = scan.nextLine();
		
		int index = email.indexOf("@");
		
		String user = email.substring(0,index);
		String domain = email.substring(index+1);
		
		System.out.println("User Name: " + user);
		System.out.println("Domain: "+domain);
	}
}