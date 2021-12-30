//String Demo

class StringDemo{
	public static void main(String args[]){
		//String Creation using String literal Directly
		String str1 = "Java Program";
		
		//String Creation using new keyword
		String str2 = new String("Java");
		
		//String Creation using Character array
		char c[] = {'H','e','l','l','o'};
		String str3 = new String(c);
		
		//String Creation using Byte Array
		byte b[] = {65,66,67,68};
		String str4 = new String(b);
		
		//Printing all the Strings
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
	}
}