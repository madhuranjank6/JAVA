import java.lang.*;
class FormatSpecifier{
	public static void main(String args[]){
		int x = 10;
		float y = 12.5f;
		char z = 'A';
		
		System.out.printf("%1$d %1$d %1$d \n",x);  //10 10 10
		System.out.printf("%2$f %1$d %2$f \n",x,y); // 12.500000 10 12.500000
		System.out.printf("%3$c %1$d %2$f \n",x,y,z); // A 10 12.500000
	}
}