// Java program to count the number of alphabets, number and Special Character in the given String

import java.lang.*;
import java.util.Scanner;

class CountAlphabetsNumbersCharacters{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = scan.nextLine();
		int alphabet_count = 0;
		int num_count = 0;
		int char_count = 0;
		
		for(int i = 0; i < str.length(); i++){
			char[] ch = {str.charAt(i)};
			String str1 = new String(ch);
			if(str1.matches("[a-zA-z]")){
				alphabet_count = alphabet_count + 1;
			}else if(str1.matches("[0-9]")){
				num_count = num_count + 1;
			}
			else{
				char_count = char_count + 1;
			}
		}
		System.out.println("Alphabets = " + alphabet_count);
		System.out.println("Numbers Count = " + num_count);
		System.out.println("Special Characters Count = " + char_count);
	}
}