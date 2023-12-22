package generics;


interface MyGenInterface<T>{
	T task(T t1);
}
public class GenFuncInterfaceEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyGenInterface<Integer> sq=x->x*x;
		System.out.println(sq.task(8));
		
		MyGenInterface<String> rev=s->new StringBuilder(s).reverse().toString();
		System.out.println(rev.task("INDIA"));
	}

}
