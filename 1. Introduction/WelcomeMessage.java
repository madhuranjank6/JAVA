import java.lang.*;
import java.util.*;

class WelcomeMessage{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String name;
		name = s.nextLine();
		System.out.println("Welcome " + name);
	}
}