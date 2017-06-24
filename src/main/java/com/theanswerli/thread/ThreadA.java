package com.theanswerli.thread;

/**
 * Created by Wade on 2017/03/07.
 */
public class ThreadA extends Thread {
	SemaphoreTest semaphoreTest;
	
	public ThreadA(SemaphoreTest semaphoreTest) {
		super();
		this.semaphoreTest = semaphoreTest;
	}

	@Override
	public void run() {
		semaphoreTest.testMethod();
	}
}
