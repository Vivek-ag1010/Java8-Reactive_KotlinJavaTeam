package reactiveStreams;
import java.util.List;
import reactor.core.publisher.Flux;

public class FluxOperation {

	public static void main(String[] args) {
		Flux<Integer> f1=Flux.just(1,2,3,4,5);
		f1.map(a->a+10).subscribe(System.out::println);
		
		List<Integer> list=List.of(10,21,30,41,50);
		Flux<Integer> f2=Flux.fromIterable(list);
		f2.filter(a->a%2==0).subscribe(a->System.out.println("Even from flux: "+a));
		
		//Combining flux
		//merge
		Flux<String> f3=Flux.just("Hey","Pikaachu");
		Flux<String> f4=Flux.just("Ram","Shyam");
		Flux<String> f5=Flux.just("Namaskar", "Radhe");
		Flux<String> mergedFlux=Flux.merge(f3, f4, f5);
		mergedFlux.map(a->a.length()).subscribe(length->System.out.println("Length of each String: "+length));
		
		//concat
		
		Flux<String> f6= Flux.concat(f3, f4, f5,mergedFlux);
		f6.subscribe(a->System.out.println(a));
		
		// Error Handling
		
		Flux<Integer> f7=Flux.just(1,3,4,12,3,6);
		Flux<Integer> fluxWithErrorHandling = f7.map(number -> {
		    if (number == 3) {
		        throw new RuntimeException("Error at number 3");
		    }
		    return number;
		}).onErrorResume(error -> Flux.just(100, 200));

		fluxWithErrorHandling.subscribe(System.out::println);
		
	}

}
