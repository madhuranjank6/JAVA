// You are given with an input number N, then you have to print the given pattern corresponding to the number N
//for N=4,
// 1
// 23
// 345
// 4567

/*
	Here, no of rows(i) = n
		  no of columns(j) = row number(i)
		  We have to print Counting numbers staring from the row number(i)
*/

import java.lang.*;
import java.util.Scanner;

class Pattern6{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = scan.nextInt();
		int i = 1;
		while(i<=n){
			int j = 1;
			int count = i;
			while(j<=i){
				System.out.print(count);
				j++;
				count++;
			}
			System.out.println();
			i++;
		}
		
	}
}