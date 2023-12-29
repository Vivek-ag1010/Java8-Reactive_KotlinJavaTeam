package streams;
import java.util.*;
import java.util.Arrays;

public class SteamCreationEx1 {

	public static void main(String[] args) {
		int []a= {1,2,3,4,5};
		
		//Imperative Approach
		int evenSum=0;
		for(int i=0;i<a.length;i++)
			if(a[i]%2==0)
				evenSum+=a[i];
		System.out.println("Sum of Array Imperative App: "+evenSum);
		
		// Declarative Using Stream
		
		int evenSum1=Arrays.stream(a).filter(n->n%2==0).sum();
		System.out.println("Sum using Stream: "+evenSum1);
	}

}
