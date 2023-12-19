package lambdaPractice;

@FunctionalInterface
public interface MyInterface {
	public void sayHello();
}


//Allowed
/*public interface MyInterface
{
	public void sayHello();
	public void sayHi();
}*/



//Not Allowed (Compile Time Error because no two abstract methods are allowed in functional interface)
/*@FunctionalInterface
public interface MyInterface
{
	public void sayHello();
	public void sayHi();
}*/


//Allowed
/*
 * @FunctionalInterface public interface MyInterface { public void sayHello();
 * 
 * static void sayBye() 
 * { System.out.println("Bye Delhi"); } 
 * default void sayHi() 
 * { System.out.println("Hi 2024"); } 
 * private void Hi() {
 * System.out.println(); } }
 */