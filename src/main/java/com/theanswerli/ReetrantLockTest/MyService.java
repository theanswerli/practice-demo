package com.theanswerli.ReetrantLockTest;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Author: Liming
 * Date: 2017/06/01
 * Company: Lenovo
 */
public class MyService {

	private ReentrantLock reentrantLock = new ReentrantLock();
	private Condition condition = reentrantLock.newCondition();
	private boolean hasValue = false;

	public void set() {
		try {
			reentrantLock.lock();
			while (hasValue == true) {
				condition.await();
			}
			System.out.println("print ====");
			hasValue = true;
			condition.signal();
		} catch (InterruptedException e){
			e.printStackTrace();
		} finally {
			reentrantLock.unlock();
		}
	}

	public void get(){
		try {
			reentrantLock.lock();
			while (hasValue == false) {
				condition.await();
			}
			System.out.println("print ++++");
			hasValue = false;
			condition.signal();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			reentrantLock.unlock();
		}
	}

}
