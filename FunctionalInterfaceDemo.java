package com.lambda.section2;
import com.lambda.section2.MyFunInterface;
public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
//		MyFunInterface fun=()->System.out.println("hello");
//		fun.myMethod();
		
		onTheFly(()->System.out.println("Hello"));

	}
	public static void onTheFly(MyFunInterface fun)
	{
		fun.myMethod();
	}

}
