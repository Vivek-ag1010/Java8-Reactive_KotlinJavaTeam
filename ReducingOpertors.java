package rxjavaOperators;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

public class ReducingOpertors {

	public static void main(String[] args) {
		Observable<Integer> obs1=Observable.just(2,  3, 4,  5,  6,  7, 8);
		
		obs1.count().subscribe(count->System.out.println(count));
		
		obs1.reduce((a,b)->a+b).subscribe(sum->System.out.println(sum));
		obs1.reduce((a,b)->a*b).subscribe(sum->System.out.println(sum));
		obs1.contains(4).subscribe(isPresent->System.out.println(isPresent));
		obs1.contains(100).subscribe(isPresent->System.out.println(isPresent));
		obs1.all(x->x>0).subscribe(allQ->System.out.println(allQ));
		obs1.all(x->x<1).subscribe(allQ->System.out.println(allQ));
		obs1.any(x->x>0).subscribe(allQ->System.out.println(allQ));
		obs1.any(x->x<1).subscribe(allQ->System.out.println(allQ));
		
	}

}
