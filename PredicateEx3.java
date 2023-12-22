package predefined_FI;

import java.util.*;
import java.util.function.Predicate;

public class PredicateEx3 {

	public static void main(String[] args) {
	
	
	List<String> strList=Arrays.asList("ankit","sunil","shivani","","xcelore","anil");
	
	Predicate<String> pred=s->s.contains("l");
	List<String> filtered=contains1(strList, pred);
	System.out.println(filtered);
	
	List<String> filter2=contains2(strList, pred);
	System.out.println(filter2);
	//Generic Ex1
	List<Integer> arList=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	Predicate<Integer> oddPred=x->(x%2!=0);
	//generic Ex1
	List<Integer> oddList=contains2(arList,oddPred);
	System.out.println(oddList);
}
	// Using Non Generic
	public static List<String> contains1(List<String> l, Predicate<String> pred)
	{
		List<String> ansList=new ArrayList<>();
		for(String a:l)
		{
			if(pred.test(a))
				ansList.add(a);
		}
		return ansList;
	}
	
	// Similarly using Generic 
	public static <T> List<T> contains2(List<T> l1, Predicate<T> p2)
	{
		List<T> resList=new ArrayList<>();
		for(T a:l1)
		{
			if(p2.test(a))
				resList.add(a);
		}
		return resList;
	}
	
}
