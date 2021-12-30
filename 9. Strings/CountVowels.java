// Write a java Program to count the number of Vowels in the String

import java.lang.*;
import java.util.Scanner;

class CountVowels{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = scan.nextLine();
		int vowels = 0;
		
		for(int i = 0; i < str.length(); i++){
			char[] ch = {str.charAt(i)};
			String str1 = new String(ch);
			if(str1.matches("[aeiouAEIOU]")){
				vowels = vowels + 1;
			}
		}
		System.out.println("Vowels = " + vowels);
	}
}