package observableObserver;

import io.reactivex.rxjava3.core.Observable;

public class CreatingObservableEx1 {

	public static void main(String[] args) {
		Observable<Integer> observable=Observable.just(1, 2, 3, 4, 5);
		observable.subscribe(
				item->System.out.println("Received: "+item),
				error->System.err.println("Error: "+error.getMessage()),
				()->System.out.println("Completed")
				);
	}

}
