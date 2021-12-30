// Java Program to demonstrate String matching using Quantifiers

class QuantifiersDemo{
	public static void main(String args[]){
		String str1 = "abcdef";
		String str2 = "accbdefg";
		
		System.out.println(str1.matches("[abc]*")); //false
		System.out.println(str2.matches("[abc]+")); //false
		System.out.println(str1.matches("[abc]{3,7}")); //false
	}
}