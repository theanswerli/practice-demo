package com.theanswerli.joinMoreTest;

/**
 * Author: Liming
 * Date: 2017/05/31
 * Company: Lenovo
 */
public class Run {

	public static void main(String[] args) {
		try {
			ThreadB threadB = new ThreadB();
			ThreadA threadA = new ThreadA(threadB);
			threadA.start();
			threadB.start();
			threadB.join(2000);
			System.out.println(" main end "+ System.currentTimeMillis());
		} catch (InterruptedException e){
			e.printStackTrace();
		}
	}

}
