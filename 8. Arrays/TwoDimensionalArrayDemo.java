// Java Program to demonstrate 2-D array

import java.lang.*;
import java.util.Scanner;

class TwoDimensionalArrayDemo{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		int rows = scan.nextInt();
		int column = scan.nextInt();
		
		// Declaring 2-D Array
		int[][] arr = new int[rows][column];
		
		//Taking input from user
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < column; j++){
				arr[i][j] = scan.nextInt();
			}
		}
		
		//Displaying 2-D Array
		System.out.println("The Contents of 2-D array are: ");
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < column; j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}