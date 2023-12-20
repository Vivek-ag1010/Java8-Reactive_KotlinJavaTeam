package lambdaPractice;
//import lambdaPractice.Name;
public class MyName {
//Type1. Method with no return type and no parameter
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Name name=()->System.out.println("Vivek Ag");
//		name.myName();

//		Name name=new Name2();
//		name.myName();
		
		
		nam(()->System.out.println("Vivek Ag"));
		
	}
	public static void nam(Name name)
	{
		name.myName();
	}

}
