package reactiveStreams;

import reactor.core.publisher.Flux;

public class FluxWithRandomNumber {

	public static void main(String[] args) {
		Flux<Double> randFlux=Flux.generate(a->{
			double randNum=Math.random();
			a.next(randNum);
		});
		randFlux.map(a->a*a).subscribe(System.out::println);

	}

}
