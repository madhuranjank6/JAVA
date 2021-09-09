import java.lang.*;
class LogicalOperator{
	public static void main(String args[]){
		boolean a = true;
		boolean b = false;
		
		boolean c = a && b; //false
		boolean d = a || b; //true
		boolean e = !a;   //flase
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
}