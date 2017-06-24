package com.theanswerli.ThreadLocalExtTest;

/**
 * Author: Liming
 * Date: 2017/05/31
 * Company: Lenovo
 */
public class ThreadA extends Thread {

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10 ; i++){
				System.out.println("在threadA中取值 =  " + Tools.ext.get());
				Thread.sleep(100);
			}
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
