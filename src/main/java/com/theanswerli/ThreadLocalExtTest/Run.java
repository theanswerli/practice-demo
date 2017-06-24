package com.theanswerli.ThreadLocalExtTest;


/**
 * Author: Liming
 * Date: 2017/05/31
 * Company: Lenovo
 */
public class Run {

	public static void main(String[] args) {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(" 在Main线程中取值 = " + Tools.ext.get());
				Thread.sleep(100);
			}
			Thread.sleep(5000);
			ThreadA threadA = new ThreadA();
			threadA.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
