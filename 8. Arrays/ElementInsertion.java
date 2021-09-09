// Inserting an element at particular index of an array

//Inserting is possible only if there is some vacant spaces in array

import java.lang.*;
import java.util.Scanner;

class ElementInsertion{

	//Method to print the array
	static void printArray(int[] A){
		for(int i = 0; i < A.length; i++){
			if(A[i] != 0){
				System.out.print(A[i] + " ");
			}
		}
	}
	
	//Main Method
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the index and element: ");
		int index = scan.nextInt();
		int element = scan.nextInt();
		
		int[] A = new int[10];
		A[0] = 5;
		A[1] = 6;
		A[2] = 7;
		A[3] = 8;
		A[4] = 9;
		
		System.out.println("Original Array:");
		printArray(A);
		
		//Code for inserting element
		for(int i = A.length-1; i > index; i--){
			A[i] = A[i-1];
		}
		
		A[index] = element;
		
		System.out.println("\nArray After insertion:");
		printArray(A);
		
		
		
		
		
	}
}