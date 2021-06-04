package polymorphism_demo;

public class MethodOverloadingDemo {
	
	void show()
	{
	System.out.println("Method with no argument");	
	}
	
	void show(String s)
	{
	System.out.println("Method with one argument of type String");	
	}
	
	void show(int a) 
	{
		System.out.println("Method with one argument of type int");
	}
	
	void show(int a, String s) 
	{
		System.out.println("Method with two arguments of type int and string and seq. int,string");
	}
	
	void show(String s, int a) 
	{
		System.out.println("Method with two arguments of type int and string and seq. string,int");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloadingDemo obj = new MethodOverloadingDemo();
		obj.show();
		obj.show(1);
		obj.show("Shweta");
		obj.show(1, "abc");
		obj.show("abc", 1);
	}

}
