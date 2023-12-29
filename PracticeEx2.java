package streams;
import java.util.*;
import java.util.stream.Stream;
public class PracticeEx2 {

	public static void main(String[] args) {
		System.out.println(Stream.of(1,1,2,3,5).peek(System.out::println).filter(x->x==8).count());
	}

}
