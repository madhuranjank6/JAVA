// You are given with an input number N, then you have to print the given pattern corresponding to the number N
//for N=4,
//    *
//   **
//  ***
// ****

/*
	Here, no of rows(i) = n
		  no of columns(j) = row number(i)
		  We have to print (n-i) spaces Followed by i *'s
*/

import java.lang.*;
import java.util.Scanner;

class Pattern11{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = scan.nextInt();
		int i = 1;
		while(i<=n){
			int j = 1;
			while(j<=(n-i)){
				System.out.print(" ");
				j++;
			}
			int k = 1;
			while(k<=i){
				System.out.print("*");
				k++;
			}
			System.out.println();
			i++;
		}
		
	}
}