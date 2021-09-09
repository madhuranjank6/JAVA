import java.lang.*;
class FloatAndLong{
	public static void main(String args[]){
		float a = 12.5f;
		long b = 1231;
		
		// long c = a*b;  //Wrong
		
		float c = a * b; //Correct
		
		System.out.println(c);
	}
}