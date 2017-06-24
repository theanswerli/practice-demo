package com.theanswerli.ReentrantReadWriteLockTest;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Author: Liming
 * Date: 2017/06/02
 * Company: Lenovo
 */
public class Service {
	//读写互斥
	private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

	public void read(){
		try {
			try {
				lock.readLock().lock();
				System.out.println("获得读锁"+ Thread.currentThread().getName()+ " " + System.currentTimeMillis());
				Thread.sleep(5000);
			} finally {
				lock.readLock().unlock();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void write(){
		try {
			try {
				lock.writeLock().lock();
				System.out.println("获得写锁"+ Thread.currentThread().getName()+ " " + System.currentTimeMillis());
				Thread.sleep(5000);
			} finally {
				lock.writeLock().unlock();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
