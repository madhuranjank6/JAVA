// You are given with an input number N, then you have to print the given pattern corresponding to the number N
//for N=4,
// ****
// ****
// ****
// ****


/*
	Here, no of rows(i) = n
		  no of columns(j) in ith row = n-i+1
		  We have to print *
*/
import java.lang.*;
import java.util.Scanner;

class Pattern12{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = scan.nextInt();
		int i = 1;
		while(i<=n){
			int j = 1;
			while(j<=(n-i+1)){
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}