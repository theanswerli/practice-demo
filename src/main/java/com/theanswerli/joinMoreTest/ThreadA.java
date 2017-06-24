package com.theanswerli.joinMoreTest;

/**
 * Author: Liming
 * Date: 2017/05/31
 * Company: Lenovo
 */
public class ThreadA extends Thread {

	private ThreadB threadB;

	public ThreadA(ThreadB threadB) {
		super();
		this.threadB = threadB;
	}

	@Override
	public void run() {
		try {
			synchronized (threadB) {
				System.out.println("begin A ThreadName "+Thread.currentThread().getName()+" "+System.currentTimeMillis());
				Thread.sleep(5000);
				System.out.println("end A ThreadName "+Thread.currentThread().getName()+" "+System.currentTimeMillis());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
