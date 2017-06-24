package com.theanswerli.thread;

/**
 * Created by Wade on 2017/03/07.
 */
public class RunTest {

	public static void main(String[] args) {
		SemaphoreTest semaphoreTest = new SemaphoreTest();
		ThreadA a = new ThreadA(semaphoreTest);
		a.setName("A");
		ThreadB b = new ThreadB(semaphoreTest);
		b.setName("B");
		ThreadC c = new ThreadC(semaphoreTest);
		c.setName("C");

		a.start();
		b.start();
		c.start();
	}

}
