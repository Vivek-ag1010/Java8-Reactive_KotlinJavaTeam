package javaFunctional;
import java.util.*;
import java.util.function.BiConsumer;
//Write a bi-consumer that merges two maps, adding values for common keys.
 
public class CombinedPracticeEx2 {

	public static void main(String[] args) {
		Map<Integer, Integer> map1=Map.of(1,200, 2, 300, 4, 500, 6, 300, 3, 100);
		Map<Integer, Integer> map2=Map.of(3,200, 7, 300, 2, 500, 1, 300, 8, 100);
		
		Map<Integer, Integer> mergedMap=new HashMap<>();
		BiConsumer<Integer, Integer> bi=(a,b)->
		{
			if(map2.containsKey(a))
				mergedMap.put(a, b+map2.get(a));
		};
		map1.forEach(bi);
		System.out.println(mergedMap);
		
	}

}
