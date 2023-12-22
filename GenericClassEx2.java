package generics;

class MathOperation<T,R>
{
	T obj1;
	R obj2;
	MathOperation(T obj1, R obj2)
	{
		this.obj1=obj1;
		this.obj2=obj2;
	}
	
		public String getGenericField() {
	        if (obj1 instanceof Number && obj2 instanceof Number) {
	            int sum = ((Number) obj1).intValue() + ((Number) obj2).intValue();
	            return String.valueOf(sum);
	        } else {
	            return obj1.toString() + obj2.toString();
	        }
	    }
}
public class GenericClassEx2
{
	public static void main(String[] args) {
		MathOperation sum=new MathOperation(10, 15);
		
		System.out.println(sum.getGenericField());
		
		MathOperation append=new MathOperation("Vivek", "Agrahari");
		
		System.out.println(append.getGenericField());
	}

}
