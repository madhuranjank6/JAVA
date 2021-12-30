// Demonstraton of 'this' Keyword

import java.lang.*;

class Employee{
	int empno;
	String ename;
	double salary;
	
	/* Prameterized Constructor using 'this' keyword */
	Employee(int eno,String name,double sal){
		this.empno = eno;
		this.ename = name;
		this.salary = sal;
	}
	
	/* Normal Display method*/
	void display(){
		System.out.println(empno+"\t"+ename+"\t"+salary);
	}
}

class EmployeeDetails{
	public static void main(String args[]){
		Employee e1 = new Employee(1,"Madhuranjan",15000);
		e1.display();
		Employee e2 = new Employee(2,"Manika", 20000);
		e2.display();
	}
}