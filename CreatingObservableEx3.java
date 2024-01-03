package observableObserver;
import java.util.*;
import io.reactivex.rxjava3.core.Observable;

public class CreatingObservableEx3 {

	public static void main(String[] args) {
		//Rarely used method create()
		Observable<Integer> source=Observable.create(
				e->{
					e.onNext(10);
					e.onNext(11);
					e.onNext(12);
					e.onComplete();
				});
		source.subscribe(System.out::println);
		
		//just() method
		
		Observable<Integer> just=Observable.just(10, 20, 30);
		just.subscribe(System.out::println);
		
		
		//fromIterable() method
		List<String> list=List.of("Ram", "Shyam", "Mike");
		Observable<String> fromIte=Observable.fromIterable(list);
		
		fromIte.subscribe(System.out::println);
		
		
	}

}
