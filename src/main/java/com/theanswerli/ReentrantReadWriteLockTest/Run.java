package com.theanswerli.ReentrantReadWriteLockTest;

/**
 * Author: Liming
 * Date: 2017/06/02
 * Company: Lenovo
 */
public class Run {

	public static void main(String[] args) {
		Service service = new Service();
		ThreadA threadA = new ThreadA(service);
		ThreadB threadB = new ThreadB(service);
		threadA.setName("A");
		threadB.setName("B");
		threadA.start();
		threadB.start();
	}

}
