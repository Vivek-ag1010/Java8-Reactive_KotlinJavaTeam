package generics;

public class GenericMethodEx1 {
	public static <T> void  printArr(T[] a)
	{
		for(T  elem: a)
			System.out.print(elem+" ");
		System.out.println();
	}
	public static void main(String[] args) {
		Integer []arr= {1,2,3,4,5};
		printArr(arr);
		
		String []strArr= {"Vivek", "Agrahari", "Abhi", "Pandey", "Xcelore"};
		printArr(strArr);
	}

}
