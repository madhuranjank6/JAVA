import java.lang.*;

class Product{
	int id;
	String name;
	double price;
	
	//Constructor
	Product(int pid, String pname, double cost){
		this.id = pid;
		this.name = pname;
		this.price = cost;
	}
	
	//Normal Display Method
	void display(){
		System.out.println(id+"\t"+name+"\t"+price);
	}
}

class ProductDetails{
	public static void main(String args[]){
		Product p1 = new Product(1,"Apple",20);
		p1.display();
		
		Product p2 = new Product(2,"Cream Roll", 15.5);
		p2.display();
	}
}