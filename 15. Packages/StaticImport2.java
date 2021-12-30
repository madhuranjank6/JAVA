// Java Program to demonstrate Static imports


import static java.lang.Byte.*;
import static java.lang.Integer.*;

class StaticImport2{
	public static void main(String args[]){
			System.out.println(MIN_VALUE);
	}
}

/*
	OUTPUT:
	StaticImport2.java:9: error: reference to MIN_VALUE is ambiguous
                        System.out.println(MIN_VALUE);
                                           ^
  both variable MIN_VALUE in Byte and variable MIN_VALUE in Integer match
1 error
*/