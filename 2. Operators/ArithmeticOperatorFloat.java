import java.util.Scanner;
class ArithmeticOperatorFloat{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 1st number: ");
		float a = scan.nextFloat();
		System.out.println("Enter the 2nd number: ");
		float b = scan.nextFloat();
		
		float sum = a + b;
		float diff = a - b;
		float mul = a * b;
		float div = a/b;
		float mod = a % b;
		
		System.out.println("Sum = " + sum);
		System.out.println("Difference = " + diff);
		System.out.println("Product = " + mul);
		System.out.println("Quotient = " + div);
		System.out.println("Remainder = " + mod);
		
	}
}