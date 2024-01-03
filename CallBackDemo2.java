package com.reactive1;

public class CallBackDemo2 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main Thread is Running");
		Runnable r = new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				new CallBackDemo2().runningAsync(new Callback2() {

					@Override
					public void pushData(String data) {
						System.out.println("Callbacl data: "+data);
						
					}

					@Override
					public void pushComplete() {
						System.out.println("Calllback done !");
						
					}

					@Override
					public void pushError(Exception ex) {
						System.out.println("Callback error called, got an exception: "+ex);
						
					}

					
				});
			}
		};
		Thread t = new Thread(r);
		t.start();

		Thread.sleep(2000);
		System.out.println("Main Thread Completed");
	}

	public void runningAsync(Callback2 callBack) {
		System.out.println("I am runnning in separate thread!");
		sleep(1000);
		callBack.pushData("Data1");
		callBack.pushData("Data2");
		callBack.pushData("Data3");
		
		callBack.pushError(new Exception("Oops"));
		callBack.pushComplete();   // in general push complete doesn't execute if there is an error in the code 
	}

	private void sleep(int duration) {
		try {
			Thread.sleep(duration);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
