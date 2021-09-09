// Java Program to find the second largest element in the array

import java.lang.*;
import java.util.Scanner;

class SecondLargestElement{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = scan.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the array Elements:");
		for(int i = 0; i<size; i++){
			arr[i] = scan.nextInt();
		}
		
		int max1, max2;
		max1 = max2	= arr[0];
		for(int j = 1; j < size; j++){
			if(arr[j] > max1){
				max2 = max1;
				max1 = arr[j];
			}
		}
		System.out.println("Second Largest Element = " + max2);
	}
}