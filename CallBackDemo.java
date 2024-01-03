package com.reactive1;

public class CallBackDemo {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main Thread is Running");
		Runnable r = new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				new CallBackDemo().runningAsync(new Callback() {

					public void call() {
						System.out.println("Callback called!");
					}
				});
			}
		};
		Thread t = new Thread(r);
		t.start();

		Thread.sleep(2000);
		System.out.println("Main Thread Completed");
	}

	public void runningAsync(Callback callBack) {
		System.out.println("I am runnning in separate thread!");
		sleep(1000);
		callBack.call();
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
