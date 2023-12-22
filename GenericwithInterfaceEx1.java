package generics;
interface MyGenericInterface<T>
{
	T m1(T item);
}
class MyImp implements MyGenericInterface<String>
{

	@Override
	public String m1(String s1) {
		return "Result: "+s1;  
	}
	
}
public class GenericwithInterfaceEx1 {

	public static void main(String[] args) {
		MyImp obj=new MyImp();
		String res=obj.m1("hello");
		System.out.println(res);
	}

}
