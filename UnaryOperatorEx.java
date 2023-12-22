package predefined_FI;
import java.util.*;
import java.util.function.UnaryOperator;

public class UnaryOperatorEx {

	public static void main(String[] args) {
		UnaryOperator<Integer> square=a->a*a;
		System.out.println(square.apply(5));
	
	
	//UnaryOperator<String> slength=a->a.length();   //C omplie time error, can't  convert integer to String
	List<Integer> inputList=List.of(10,20,30,40,50);
	UnaryOperator<Integer> op1=i->i*100;
	List<Integer> outList=mapper(inputList,op1);
	System.out.println(outList);
	}
	private static <T> List<T> mapper(List<T> l, UnaryOperator<T> op)
	{
		List<T> resList=new ArrayList<>();
		for(T a:l)
		{
			resList.add(op.apply(a));
		}
		return resList;
	}
}
