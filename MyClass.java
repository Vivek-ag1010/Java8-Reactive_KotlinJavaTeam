package functionalInterface;
interface A {
default void sayHello()
{
	System.out.println("A says hello");
}
}
interface B{
	default void sayHello()
	{
		System.out.println("B says hello");
	}
}

//Compiler will confuse which sayHello method either A or of B
//public class MyClass implements A,B  
//{
//	public static void main(String[] args) {
//		MyClass myClass=new MyClass();		//can't instantiate
//		
//		myClass.sayHello();
//	}
//}

public class MyClass implements A, B 
{
	public static void main(String[] args) {
		MyClass myClass=new MyClass();		//can't instantiate
		
		myClass.sayHello();
	}
	
	@Override
	public void sayHello()
	{
		A.super.sayHello();
		
	}
}