package reactiveStreams;
import java.util.*;
import reactor.core.publisher.Mono;

public class MonoPractice {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		Mono<Integer> m1=Mono.just(42);
		m1.map(a->"Answer: "+a).subscribe(System.out::println);
		
        Mono<Integer> erMono= getMono(sc.nextInt()); //calling getMono method
        erMono.subscribe(System.out::println);
	}
	public static Mono<Integer> getMono(int input)
	{
	    return Mono.defer(() -> {
            if (input % 2 == 0) {
                // If the input is even, create a Mono with the squared value
                return Mono.just(input * input);
            } else {
                // If the input is odd, throw an exception
                return Mono.error(new RuntimeException("Input is odd"));
            }
        }).onErrorReturn(0);
	}

}
