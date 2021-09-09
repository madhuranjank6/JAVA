import java.util.*;
import java.lang.*;
class CharAndFloat{
	public static void main(String args[]){
		float x = 5.3f;
		char y = 'A';
		float a = x++;
		float b = ++x;
		char c = y++;
		char d = ++y;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
	}
}