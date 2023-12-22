package predefined_FI;
import java.util.*;
import java.util.function.Consumer;

public class ConsumerFIEx1 {

	public static void main(String[] args) {
		List<Integer> list=List.of(13, 23, 45, 3, 54);
		Consumer<Integer> c1=a->System.out.print(a+" ");
		c1.accept(56);
		System.out.println();
//		for(Integer i:list)
//			c1.accept(i);       gives output 13 23 45 3 54
		printArr(list,c1);      //Gives output 13 23 45 3 54
		System.out.println();
		Consumer<List<Integer>> c2=li->{
			for(Integer a:li)
			{
				System.out.print((a+100)+" ");
			}
		};
		c2.accept(List.of(10,20,30,40,50));
		
		
	}
	public static <T> void printArr(List<T> l, Consumer<T> cons)
	{
		for(T ls: l)
		{
			cons.accept(ls);  
		}
	}

}
