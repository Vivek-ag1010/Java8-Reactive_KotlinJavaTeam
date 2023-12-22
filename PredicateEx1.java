package predefined_FI;

import java.util.*;
import java.util.function.Predicate;

public class PredicateEx1 {

	public static void main(String[] args) {
	Predicate<Integer> pred1=x->(x>10000);
	System.out.println(pred1.test(500000));

	
	Predicate<String> pred2=s->s.equalsIgnoreCase("Ankit");
	System.out.println(pred2.test("ANkiT"));
	
     //Finding Even from 1 t0 10
	Predicate<Integer> isEven=a->(a%2==0);
	for(int i=1;i<=10;i++) {
		if(isEven.test(i))
			System.out.println(i+" is Even");
		else
			System.out.println(i+" is Odd");
	}
	
	

}
}
