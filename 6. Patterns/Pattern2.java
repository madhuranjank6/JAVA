// You are given with an input number N, then you have to print the given pattern corresponding to the number N
//for N=4,
// 1111
// 2222
// 3333
// 4444

/*
	Here, no of rows(i) = n
		  no of columns(j) = n
		  We have to print row number(i) in each columns of that particular row
*/
import java.lang.*;
import java.util.Scanner;

class Pattern2{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = scan.nextInt();
		int i = 1;
		while(i<=n){
			int j = 1;
			while(j<=n){
				System.out.print(i);
				j++;
			}
			System.out.println();
			i++;
		}
		
	}
}