// Accessing array elements using for loop

import java.lang.*;
class ArrayAndLoop{
	public static void main(String args[]){
		int[] arr = {1,3,9,8,11,12};
		
		//Accessing each element with its property
		for(int i = 0; i<arr.length; i++){
			//Printing each elements
			System.out.print(arr[i] + " ");
		}
	}
}