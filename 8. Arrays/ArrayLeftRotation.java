//Array Rotation
//Array Left Rotation by one
import java.lang.*;

class ArrayLeftRotation{
	public static void main(String args[]){
		int[] arr = {5,6,7,8,9,10};
		int[] arr1 = arr;
		int n = arr.length;
		
		System.out.println("Original Array: ");
		for(int i = 0; i < n; i++){
			System.out.print(arr[i] + " ");
		}
		
		//Left Rotation Code
		int temp = arr[0];
		for(int i = 1; i < n; i++){
			arr[i-1] = arr[i];
		}
		arr[n-1] = temp;
		System.out.println("\nArray After Left Rotation: ");
		for(int i = 0; i < n; i++){
			System.out.print(arr[i] + " ");
		}
	}
}