// You are given with an input number N, then you have to print the given pattern corresponding to the number N
//for N=4,
// ABCD
// BCDE
// CDEF
// DEFG

/*
	Here, no of rows(i) = n
		  no of columns(j) = n
		  We have to print the alphabets starting from the ith alphabet in each row
*/

import java.lang.*;
import java.util.Scanner;

class Pattern9{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = scan.nextInt();
		int i = 1;
		while(i<=n){
			int j = 1;
			char startingChar = (char)('A'+i-1);
			while(j<=n){
				System.out.print(startingChar);
				j++;
				startingChar = (char)(startingChar + 1);
			}
			System.out.println();
			i++;
		}
		
	}
}