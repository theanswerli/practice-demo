package com.theanswerli.thread;

/**
 * Created by Wade on 2017/03/07.
 */
public class ThreadB extends Thread {
	SemaphoreTest semaphoreTest;

	public ThreadB(SemaphoreTest semaphoreTest) {
		super();
		this.semaphoreTest = semaphoreTest;
	}

	@Override
	public void run() {
		semaphoreTest.testMethod();
	}
}
