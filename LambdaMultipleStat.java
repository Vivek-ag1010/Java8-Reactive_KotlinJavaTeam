package lambdaPractice;

public class LambdaMultipleStat {

	public static void main(String[] args) {
		
		//Normal single statement inside lambda expression
		LengthOfString len=s->s.length(); 
		int length=len.length("vivek");
		System.out.println(length);
		
		//Lambda with multiple statements
		LengthOfString ln=s->{
			int l=s.length();
			System.out.println("Length: "+l);
			return l;
		};
		int lnt=ln.length("Vivek");
		

	}

}
