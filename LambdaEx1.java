package lambdaPractice;

public class LambdaEx1 {

	public static void main(String[] args) {
		
		//Thread Creation by Implementing Runnable Interface
//		MyRunnable runnable=new MyRunnable();
//		Thread t=new Thread(runnable);
//		t.start();

		//Thread Creation by extending Thread class using Anonymous class
//		Thread t = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("Thread Executed !");
//			}
//		});
//		t.start();
		
		
		//Thread XCreation by extending Thread class using Lambda instead of anonymous class
		Thread t=new Thread(()->System.out.println("Thread Executed !"));
		t.start();
	}

}
