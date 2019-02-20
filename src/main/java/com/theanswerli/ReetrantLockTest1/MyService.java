package com.theanswerli.ReetrantLockTest1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Author: Liming
 * Date: 2019/2/13
 * Company: Lenovo
 */
public class MyService {

	private Lock lock = new ReentrantLock();

	public void testMethod() {
		//
		lock.lock();
		for (int i = 0; i < 5; i++) {
			System.out.println("ThreadName = " + Thread.currentThread().getName() + " " + (i+1));
		}
		//
		lock.unlock();
	}

}