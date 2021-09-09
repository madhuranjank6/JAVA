import java.lang.*;
class Expression{
	public static void main(String args[]){
		byte a = 10;
		short b = 15;
		
		// byte c = a + b ; //Wrong
		// short c = a + b ; //Wrong
		
		int c = a + b; //Correct
		System.out.println(c);
	}
}