package rxjavaOperators;

import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.core.Observable;

public class TransformingOperators {

	public static void main(String[] args) {
		Observable<String> obs1=Observable.just("bhi","xcelor", "vivek"," kush");
		obs1.map(a->a.length()).subscribe(a->System.out.print(a+" "));
		
		System.out.println();
		Observable<Integer> obs2=Observable.just(1,2, 3,4);
		obs2.map(a->a*a).subscribe(a->System.out.print(a+" "));
		
		System.out.println();
		Observable<String> obs3=Observable.just("bhi","xcelore", "vivek","kush");
		obs3.cast(String.class).subscribe(a->System.out.print(a+" "));
		
		System.out.println();
		Observable<String> obs4=Observable.just("bhi","xcelore", "vivek","kush");
		obs4.delay(1000, TimeUnit.MILLISECONDS).subscribe(a->System.out.print(a+" "));
		try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		System.out.println();
		Observable<Integer> obs5=Observable.just(1,2, 3,4);
		obs5.scan((a,b)->a+b).subscribe(a->System.out.print(a+" "));
		
		System.out.println();
		Observable<Integer> obs6=Observable.just(1,2, 3,4);
		obs6.sorted().subscribe(a->System.out.print(a+" "));
		
		System.out.println();
		Observable<Integer> obs7=Observable.just(1,2, 3,4);
		obs7.repeat(2).subscribe(a->System.out.print(a+" "));
		
	}

}
