// Java program to check if the String given by user is palindrome string or not

import java.lang.*;
import java.util.Scanner;

class PalindromeString{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = scan.nextLine();
		String str2 = "";
		
		for(int i = 0; i < str.length(); i++){
			char ch = str.charAt(i);
			str2 = ch + str2;
		}
		
		if(str.equals(str2)){
			System.out.println("Palindrome String");
		}
		else{
			System.out.println("Not Palindrome");
		}
	}
}