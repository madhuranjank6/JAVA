// Java Program to demonstrate Jagged Array

import java.lang.*;

class JaggedArray{
	public static void main(String args[]){
		//Declaring 2-D array with 2 rows and column not specified
		int[][] arr = new int[2][];
		
		//Making jagged array by instanting columns later
		arr[0] = new int[3]; //First row has 3 column
		arr[1] = new int[2]; //Second row has 2 columns
		
		int count = 1;
		
		//Taking input of jagged array
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				arr[i][j] = count++;
			}
		}
		
		//Displaying the Content of 2-D jagged array
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}