package observableObserver;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

public class RxJavaObserverExample {
    public static void main(String[] args) {
        // Creating an Observer
        Observer<Integer> observer = new Observer<Integer>() {
            @Override
            public void onSubscribe(Disposable d) {
                System.out.println("Subscribed");
            }

            @Override
            public void onNext(Integer item) {
                System.out.println("Received: " + item);
            }

            @Override
            public void onError(Throwable e) {
                System.err.println("Error: " + e.getMessage());
            }

            @Override
            public void onComplete() {
                System.out.println("Completed");
            }
        };

        // Creating an Observable emitting integers 1 to 5
        Observable<Integer> observable = Observable.just(1, 2, 3, 4, 5);

        // Subscribing the Observer to the Observable
        observable.subscribe(observer);
    }
}

