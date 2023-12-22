package generics;

public class GenericMethodEx2 {
	public static <T extends Comparable<T>> T  findMax(T elem1, T elem2)
	{
		return (elem1.compareTo(elem2)>0)?elem1:elem2;
	}
	public static void main(String[] args) {
		GenericMethodEx2 ex=new GenericMethodEx2();
		int maxInt=ex.findMax(3,7);
		System.out.println(maxInt);
		
		String maxStr=ex.findMax("Vivek", "Agrahari");
		System.out.println(maxStr);
		
	}

}
