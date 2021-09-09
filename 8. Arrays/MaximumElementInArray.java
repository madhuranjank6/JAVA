// Java Program to find maximum element in array

import java.lang.*;
import java.util.Scanner;

class MaximumElementInArray{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = scan.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the array elements: ");
		for(int i = 0; i < size; i++){
			arr[i] = scan.nextInt();
		}
		
		int max = arr[0];
		for(int i = 1; i < size; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		System.out.println("Maximum Element = " + max);
	}
}