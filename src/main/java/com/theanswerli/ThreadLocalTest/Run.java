package com.theanswerli.ThreadLocalTest;

/**
 * Author: Liming
 * Date: 2017/05/31
 * Company: Lenovo
 */
public class Run {

	public static void main(String[] args) {
		try {
			ThreadA threadA = new ThreadA();
			ThreadB threadB = new ThreadB();
			threadA.start();
			threadB.start();
			for (int i = 0; i < 100; i++) {
				Tools.threadLocal.set("Main "+ (i+1));
				System.out.println("Main get Value = " + Tools.threadLocal.get());
				Thread.sleep(200);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
