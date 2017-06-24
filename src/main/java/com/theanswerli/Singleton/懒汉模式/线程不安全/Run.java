package com.theanswerli.Singleton.懒汉模式.线程不安全;

/**
 * Author: Liming
 * Date: 2017/06/04
 * Company: Lenovo
 */
public class Run {

	public static void main(String[] args) {
		MyThread myThread1 = new MyThread();
		MyThread myThread2 = new MyThread();
		MyThread myThread3 = new MyThread();
		myThread1.start();
		myThread2.start();
		myThread3.start();
	}

}
