// A program to demonstrate array

class ArrayDemo{
	public static void main(String args[]){
		int arr[]; //Array Declaration
		arr = new int[5]; // Space allocated to 5 integers in heap memory
		
		System.out.println(arr); //Prints the base addredd like [I@852e922
		System.out.println(arr[0]); //Prints the 1st element i.e, 0 by default
		System.out.println(arr[1]); //Prints 2nd element i.e, 0 by default
		
		//System.out.println(arr[6]); //Error, ArrayIndexOutOfBoundException
		
		//Updating the values at indexes
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		//Printing the new values
		System.out.println(arr[0]); //10
		
		//Printing using for loop
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		//Printing using for-each loop
		for(int j : arr){
		System.out.print(j +" ");
		}
	}
}