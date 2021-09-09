import java.util.*;
class FloatExpression{
	public static void main(String args[]){
		float a = 10.5f;
		double b = 5.6;
		
		// float c = a + b; //Wrong
		
		double c = a + b; //Correct
		System.out.println(c);
	}
}