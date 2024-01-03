package observableObserver;

import io.reactivex.rxjava3.core.Observable;

public class CreatingObserverEx {

	public static void main(String[] args) {
		Observable<String> source=Observable.just("Happ", "New", "Year");
		source.subscribe(i->System.out.println(i), Throwable::printStackTrace, ()->System.out.println("Completed!"));
	System.out.println();
	
	source.subscribe(i->System.out.println(i), Throwable::printStackTrace);
	System.out.println();
	
	source.subscribe(i->System.out.println(i));
	System.out.println();
	}

}
