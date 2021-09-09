import java.lang.*;
import java.util.Scanner;
class EvenOrOdd{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to check: ");
		int num = scan.nextInt();
		if(num%2 == 0){
			System.out.println("Even");
		}else{
			System.out.println("Odd");
		}
	}
}