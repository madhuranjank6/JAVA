//java program to demonstarte Dynamic method Dispatch

import java.lang.*;

class Parent6{
	void meth1(){
		System.out.println("meth1");
	}
	
	void meth2(){
		System.out.println("meth2");
	}
}

class Child6 extends Parent6{
	/* Overriding the meth2*/
	@Override
	void meth2(){
		System.out.println("Child meth2");
	}
	
	/*new method of child class*/
	void meth3(){
		System.out.println("meth3");
	}
}


class DynamicMethodDispatch{
	public static void main(String args[]){
		Parent6 p = new Child6();
		
		p.meth1();
		p.meth2();
		// p.meth3(); //Invalid
	}
}
