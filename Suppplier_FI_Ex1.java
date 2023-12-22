package predefined_FI;

import java.util.function.Supplier;

public class Suppplier_FI_Ex1 {

	public static void main(String[] args) {
		Supplier<String> sup1=()->"Hello!";
		System.out.println(sup1.get());
		
		Supplier <Integer> intSupplier=()->1;
		System.out.println(intSupplier);
		Supplier<String> stringSupp=()->new String("Good Morning");
		System.out.println(stringSupp.get());
		
		Supplier<Double> rand=()->Math.random();
		System.out.println(rand.get());
	}

}
