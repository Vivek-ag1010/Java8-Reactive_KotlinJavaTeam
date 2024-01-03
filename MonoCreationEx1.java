package reactiveStreams;

import reactor.core.publisher.Mono;

public class MonoCreationEx1 {

	public static void main(String[] args) {
		Mono<Integer> mono=Mono.just(5/0);
		mono.subscribe(
               value->System.out.println("Received: "+value),
               error->System.out.println("Error:" +error),
               ()->System.out.println("Mono Completed!!")
        );
		

	}

}
