package predefined_FI;

import java.util.*;
import java.util.function.Predicate;

public class PredicateEx4 {

	public static void main(String[] args) {
	
	Predicate<String> startsWithV=x->x.toLowerCase().charAt(0)=='v';
	Predicate<String> endsWithK=x->x.toLowerCase().charAt(x.length()-1)=='k';
	System.out.println(startsWithV.test("Vivek"));
	System.out.println(endsWithK.test("Vivek"));
	// us of default and method
	Predicate<String> and=startsWithV.and(endsWithK);
	System.out.println(and.test("Vivek"));
	System.out.println(and.test("Vipul"));
	// use of default or method
	Predicate<String> or=startsWithV.or(endsWithK);
	System.out.println(or.test("Vivek"));
	System.out.println(or.test("Ankit"));
	System.out.println(or.test("Kaka"));
	// use of default negate method
	System.out.println(startsWithV.negate().test("Vivek"));
	
	Student s1=new Student("Vipul", 1);
	Student s2=new Student("Ram", 2);
	Predicate<Student> studPrcatice=x->x.getId()>1;
	System.out.println(studPrcatice.test(s1));
	
	Predicate<Object> checkEq=Predicate.isEqual(2);
	System.out.println(checkEq.test(2));
	
	// using isEqual default method
	}
	
	private static class Student{
		String name;
		int id;
		Student(String name, int id)
		{
			this.name=name;
			this.id=id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		
		
	}
}
