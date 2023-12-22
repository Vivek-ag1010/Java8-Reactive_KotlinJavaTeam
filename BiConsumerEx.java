package predefined_FI;

import java.util.function.BiConsumer;

public class BiConsumerEx {
public static void main(String[] args) {
	BiConsumer<Integer, Integer> biCons1=(x,y)->System.out.println(x+y);
	biCons1.accept(5, 10);
	
	BiConsumer<String, Integer> bi2=(str, times)->{
		for(int i=1;i<=times;i++)
		{
			System.out.println(str);
		}
	};
	bi2.accept("Jai Sri Ram", 5);
	
	
	// print pattern (Pyramid) for n row
	
	BiConsumer<String, Integer> bi3=(str, row)->
	{
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(str+" ");
			}
			System.out.println();
		}
	};
	bi3.accept("*", 5);
}
}
