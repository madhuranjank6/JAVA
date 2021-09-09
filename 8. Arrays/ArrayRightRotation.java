//Array Rotation
//Array Right Rotation

import java.lang.*;

class ArrayRightRotation{
	public static void main(String args[]){
		int[] arr = {5,6,7,8,9,10};
		int[] arr1 = arr;
		int n = arr.length;
		
		System.out.println("Original Array: ");
		for(int i = 0; i < n; i++){
			System.out.print(arr[i] + " ");
		}
		
		//Right Rotation Code
		int temp = arr[n-1];
		for(int i = n-1; i > 0; i--){
			arr[i] = arr[i-1];
		}
		arr[0] = temp;
		System.out.println("\nArray After Right Rotation: ");
		for(int i = 0; i < n; i++){
			System.out.print(arr[i] + " ");
		}
	}
}