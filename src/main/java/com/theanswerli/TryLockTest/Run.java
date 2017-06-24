package com.theanswerli.TryLockTest;

/**
 * Author: Liming
 * Date: 2017/06/02
 * Company: Lenovo
 */
public class Run {

	public static void main(String[] args) {
		final MyService myService = new MyService();
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				myService.waitMethod();
			}
		};
		Thread threadA = new Thread(runnable);
		threadA.setName("A");
		threadA.start();
		Thread threadB = new Thread(runnable);
		threadB.setName("B");
		threadB.start();
	}

}
