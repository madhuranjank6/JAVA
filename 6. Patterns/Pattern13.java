// You are given with an input number N, then you have to print the given pattern corresponding to the number N
//for N=4,
//    1
//   121
//  12321
// 1234321


/*
	Here, no of rows(i) = n
		  Here we need to print (n-i) spaces followed by increasing sequence starting from 1 and then print the decreasing sequence starting from i-1 till 1
*/
import java.lang.*;
import java.util.Scanner;

class Pattern13{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = scan.nextInt();
		int i = 1;
		while(i<=n){
			int spaces = 1;
			while(spaces<=n-i){
				System.out.print(" ");
				spaces++;
			}
			int j = 1;
			int p = 1;
			while(j <= i){
				System.out.print(p);
				p++;
				j++;
			}
			p = i-1;
			j = 1;
			while(j<=i-1){
				System.out.print(p);
				p--;
				j++;
			}
			System.out.println();
			i++;
		}
	}
}