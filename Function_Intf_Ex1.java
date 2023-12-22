package predefined_FI;
import java.util.*;
import java.util.function.Function;

public class Function_Intf_Ex1 {
public static void main(String[] args) {
	
	
	Function<String, Integer> fun1=s->s.length();
	System.out.println(fun1.apply("Xcelore"));
	
	List<String> list=List.of("Dairy","Milk","Good", "Morning");
	List<Integer> newList=map(list,fun1);
	System.out.println(newList);
	
	Function<String, String> fun2=e->e.substring(2, 6);
	System.out.println(fun2.apply("Lucknow"));
}
private static <T,R>List<R> map(List<T> l, Function<T,R> fun)
{
	List<R> ans=new ArrayList<>();
	for(T a:l)
	{
		ans.add(fun.apply(a));
	}
	return ans;
}
}
