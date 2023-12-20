package lambdaPractice;
import java.util.*;
//Type 2: Method with no return type but with param
public class OperationWithLambda {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		MathOperation add=(x,y)->System.out.println(x+y);
		add.operation(sc.nextInt(),sc.nextInt());
		
		MathOperation multiply=(x,y)->System.out.println(x*y);
		multiply.operation(sc.nextInt(), sc.nextInt());
		
		MathOperation quot=(x,y)->System.out.println(x/y);
		quot.operation(sc.nextInt(), sc.nextInt());
		
		MathOperation modulo=(x,y)->System.out.println(x%y);
		modulo.operation(sc.nextInt(), sc.nextInt());
		
		MathOperation subtract=(x,y)->System.out.println(x-y);
		subtract.operation(sc.nextInt(), sc.nextInt());
		
		
	}

}
