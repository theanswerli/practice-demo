package com.theanswerli.joinMoreTest;

/**
 * Author: Liming
 * Date: 2017/05/31
 * Company: Lenovo
 */
public class RunFirst {

	public static void main(String[] args) {
		ThreadB threadB = new ThreadB();
		ThreadA threadA = new ThreadA(threadB);
		threadA.start();
		threadB.start();
		System.out.println("  main end=" + System.currentTimeMillis());
	}

}
