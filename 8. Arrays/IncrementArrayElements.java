// Java Program to Increment Array Element using methods

import java.lang.*;
class IncrementArrayElements{
	//Increment Method
	static void increment(int[] arr){
		for(int i = 0; i < arr.length; i++){
			arr[i]++;
		}
	}
	
	//Main Method
	public static void main(String args[]){
		int[] arr = {1,2,3,4,5};
		increment(arr);
		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}