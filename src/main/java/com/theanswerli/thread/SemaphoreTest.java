package com.theanswerli.thread;

import java.util.concurrent.Semaphore;

/**
 * Created by Wade on 2017/03/07.
 */
public class SemaphoreTest {
	private Semaphore semaphore = new Semaphore(2);

	public void testMethod(){
		try {
			semaphore.acquire();
			System.out.println(Thread.currentThread().getName() + " begin time: " + System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName() + " end time: " + System.currentTimeMillis());
			semaphore.release();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
