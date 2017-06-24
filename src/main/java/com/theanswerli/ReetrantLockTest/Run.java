package com.theanswerli.ReetrantLockTest;

/**
 * Author: Liming
 * Date: 2017/06/01
 * Company: Lenovo
 */
public class Run {

	public static void main(String[] args) {
		MyService myService = new MyService();
		ThreadA threadA = new ThreadA(myService);
		ThreadB threadB = new ThreadB(myService);
		threadA.start();
		threadB.start();
	}

}
