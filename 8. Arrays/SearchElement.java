// Java Program to search an element in an array

import java.lang.*;
import java.util.Scanner;
class SearchElement{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int[] arr = {10,20,30,40,50,60};
		System.out.println("Enter the element to search: ");
		int key = scan.nextInt();
		for(int i = 0; i<arr.length; i++){
			if(arr[i] == key){
				System.out.println("Element found at index = " + i);
			}
		}
	}
}