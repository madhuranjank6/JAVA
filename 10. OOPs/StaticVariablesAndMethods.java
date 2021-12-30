import java.lang.*;

class Demo{
    static int a = 20;
    static int b = 30;

    static void show(){
        System.out.println("a = "+a+"\t"+"b = "+b);
    }
}

class StaticVariablesAndMethods{
    public static void main(String[] args){

        //Accessing by object creation
        Demo d = new Demo();
        System.out.println("a = "+d.a+"\t"+"b = "+d.b);
        d.show();

        //Accessing without object creation using classname directly
        System.out.println("a = "+Demo.a+"\t"+"b = "+Demo.b);
        Demo.show();
    }

}