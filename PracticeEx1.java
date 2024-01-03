package rxjavaOperators;

import io.reactivex.rxjava3.core.Observable;

public class PracticeEx1 {

	public static void main(String[] args) {
		Observable<Integer> o1=Observable.just(1,  2,3, 4, 5, 6, 7, 8, 9);
		o1.filter(a->a%2==0).map(x->x*x).reduce((x,y)->x+y).subscribe(evSqSum->System.out.println(evSqSum));

	}

}
