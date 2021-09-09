import java.lang.*;
class RelationalOperators{
	public static void main(String args[]){
		int a = 10;
		int b = 20;
		int c = 10;
		
		System.out.println(a==b); //false
		System.out.println(a==c); //true
		System.out.println(a!=b); //true
		System.out.println(a>b); //false
		System.out.println(b>c); //true
		System.out.println(a<b); //true
		System.out.println(a>=b); //false
		System.out.println(a<=b); //true
	}
}