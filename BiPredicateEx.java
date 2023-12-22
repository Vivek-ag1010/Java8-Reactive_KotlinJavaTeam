package predefined_FI;

import java.util.function.BiPredicate;

public class BiPredicateEx {

	public static void main(String[] args) {
		BiPredicate<Integer, Integer> biPred1=(x,y)->x%2==0 && y%2==0;
		System.out.println(biPred1.test(2, 6));
		System.out.println(biPred1.test(2, 5));
		
		BiPredicate<String, Integer> biPred2=(str, x)->str.length()==x;
		System.out.println(biPred2.test("Vivek", 5));
		System.out.println(biPred2.test("Vivek", 7));
		
		BiPredicate<String, String> biPred3=(s1, s2)->s1.equalsIgnoreCase(s2);
		System.out.println(biPred3.test("Vivek", "vIvEK"));
		
	}

}
