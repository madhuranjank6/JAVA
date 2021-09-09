import java.lang.*;
class IncrementAndDecrementExpression{
	public static void main(String args[]){
		int a = 2;
		int b = 5;
		int x = 4;
		int c = a* ++x + b;
		int d = a* x++ + b;

		System.out.println("c = " + c);
		System.out.println("d = " + d);
	}
}