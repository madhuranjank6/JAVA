//Java Program to understand the array Indexes


import java.lang.*;
class ArrayIndex{
	public static void main(String args[]){
		//an array of size 5 is declared and initialized with 0 at all indexes
		int [] arr = new int[5];
		
		//Updating the values at different indexes
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		//Accessing the values from particular  indexes
		System.out.println(arr[0]);
		System.out.println(arr[3]);	
	}
}