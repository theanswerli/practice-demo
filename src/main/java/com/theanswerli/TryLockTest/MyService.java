package com.theanswerli.TryLockTest;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Author: Liming
 * Date: 2017/06/02
 * Company: Lenovo
 */
public class MyService {

	private ReentrantLock lock = new ReentrantLock();
	public void waitMethod(){
		if (lock.tryLock()) {
			System.out.println(Thread.currentThread().getName() + "获得锁...");
		} else {
			System.out.println(Thread.currentThread().getName() + "没有获得锁...");
		}
	}

}
