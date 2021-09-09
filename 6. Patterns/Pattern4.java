// You are given with an input number N, then you have to print the given pattern corresponding to the number N
//for N=4,
// 4321
// 4321
// 4321
// 4321

/*
	Here, no of rows(i) = n
		  no of columns(j) = n
		  We have to print (n-j+1) in each columns of every row
*/

import java.lang.*;
import java.util.Scanner;

class Pattern4{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = scan.nextInt();
		int i = 1;
		while(i<=n){
			int j = 1;
			while(j<=n){
				System.out.print(n-j+1);
				j++;
			}
			System.out.println();
			i++;
		}
		
	}
}