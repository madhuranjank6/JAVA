import java.util.Scanner;
class OperatorExample{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 1st number: ");
		int a = scan.nextInt();
		System.out.println("Enter the 2nd number: ");
		int b = scan.nextInt();
		
		int sum = a + b ; // '+' This will give the sum of a and b
		int diff = a - b ;// '-' This will give the result when b is subtracted from a
		int mul = a * b; // '*' This will give the product of a and b
		int div = a/b; // '/' This will give the quotient when a is divided by b
		int mod = a % b; // '%' This will return the remainder when a is divided by b
		
		System.out.println("Sum = " + sum);
		System.out.println("Difference = " + diff);
		System.out.println("Product = " + mul);
		System.out.println("Quotient = " + div);
		System.out.println("Remainder = " + mod);
	}
}