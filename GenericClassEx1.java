package generics;

class Test<T>
{
	T obj;
	Test(T obj)
	{
		this.obj=obj;
	}
	public T getGenericField()
	{
		return obj;
	}
}
public class GenericClassEx1
{
	public static void main(String[] args) {
		Test<Integer> t1=new Test<>(143);
		System.out.println(t1.getGenericField());
		
		Test<String> t2=new Test<>("Vivek");
		System.out.println(t2.getGenericField());
	}

}
