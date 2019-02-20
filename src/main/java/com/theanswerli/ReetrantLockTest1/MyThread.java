package com.theanswerli.ReetrantLockTest1;

/**
 * Author: Liming
 * Date: 2019/2/13
 * Company: Lenovo
 */
public class MyThread extends Thread {

	private MyService myService;

	public MyThread(MyService myService) {
		super();
		this.myService = myService;
	}

	@Override
	public void run() {
		myService.testMethod();
	}
}