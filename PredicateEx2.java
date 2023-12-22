package predefined_FI;

import java.util.*;
import java.util.function.Predicate;

public class PredicateEx2 {

	public static void main(String[] args) {
	
		List<String> strList=Arrays.asList("ankit","sakshi","shivani","vivek","xcelore","sun");
	
	System.out.println("Original String List: "+strList);
	Predicate<String> startWithChar=s->s.startsWith("s");
	for(String s:strList)https://www.youtube.com/watch?v=CuuR6NKgnss&list=PLA3GkZPtsafZR6arC1A3N0i968gk9RvMv&index=12
	{
		if(startWithChar.test(s))
		{
			System.out.println(s);
		}
	}

}
}
