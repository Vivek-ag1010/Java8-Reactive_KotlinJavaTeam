package predefined_FI;

import java.util.function.BinaryOperator;

public class BinaryOperatorEx {

	public static void main(String[] args) {
		BinaryOperator<String> op1=(a,b)->a+" "+b;
		System.out.println(op1.apply("My"," God"));

	}

}
