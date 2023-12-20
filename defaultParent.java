package functionalInterface;

interface DefaultParent {
	//void sayHello() {}   //error  as abstract do not specify a body or can make default or static
	default void sayHello()
	{
		System.out.println("Parent Says Hello");
	}
}
	class ChildDefault implements DefaultParent
	{
		@Override
		public void sayHello()
		{
			System.out.println("Child says hello");
		}
	}


