package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AllOperations {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,4322,9,8,5,44,23,33,2,4,6);
		List<Integer> evenOp=list.stream().filter(x->x%2==0 ).collect(Collectors.toList());
		
		System.out.println(evenOp);
		
		List<Integer> distEvenOp=list.stream().filter(x->x%2==0 ).distinct().collect(Collectors.toList());
		System.out.println(distEvenOp);
		
		List<Integer> distEvenSortOp=list.stream().filter(x->x%2==0 ).distinct().sorted().collect(Collectors.toList());
		System.out.println(distEvenSortOp);
		
		List<Integer> distEvenCusSortOp=list.stream().filter(x->x%2==0).distinct().sorted((a,b)->b-a).collect(Collectors.toList());
		System.out.println(distEvenCusSortOp);
		
		// apply limit 
		List<Integer> limitOp=distEvenCusSortOp.stream().limit(distEvenCusSortOp.size()-1).collect(Collectors.toList());
		System.out.println(limitOp);
		
		//apply skip
		List<Integer> skipOp=distEvenCusSortOp.stream().skip(1).collect(Collectors.toList());
		System.out.println(skipOp);
		
		//apply skip and limit
		List<Integer> limSkipOp=distEvenCusSortOp.stream().skip(1).limit(distEvenCusSortOp.size()-1).peek(x->System.out.println(x)).collect(Collectors.toList());
		System.out.println(limSkipOp);
		
	}
	

}
