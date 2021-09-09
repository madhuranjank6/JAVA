// You are given with an input number N, then you have to print the given pattern corresponding to the number N
//for N=4,
// 1
// 12
// 123
// 1234

/*
	Here, no of rows(i) = n
		  no of columns(j) = row number(i)
		  We have to print Corresponding column number in every row
*/

import java.lang.*;
import java.util.Scanner;

class Pattern5{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = scan.nextInt();
		int i = 1;
		while(i<=n){
			int j = 1;
			while(j<=i){
				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;
		}
		
	}
}