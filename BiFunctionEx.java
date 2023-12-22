package predefined_FI;

import java.util.function.BiFunction;

public class BiFunctionEx {

	public static void main(String[] args) {
		BiFunction<Integer, Double, String> formatResult=(num, multiplier)->String.format("%.2f",num*multiplier);
		System.out.println(formatResult.apply(10, 2.5));
		
		BiFunction<String, String, String> biFun1=(s1,s2)->s1+s2;
		System.out.println(biFun1.apply("Basics", " Java"));
		
		BiFunction<String, String, Integer> biFun2=(s1,s2)->(s1+s2).length();
		System.out.println(biFun2.apply("Vivek", " Agrahari"));
	}

}
