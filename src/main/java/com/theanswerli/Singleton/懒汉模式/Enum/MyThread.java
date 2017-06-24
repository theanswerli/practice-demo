package com.theanswerli.Singleton.懒汉模式.Enum;

/**
 * Author: Liming
 * Date: 2017/06/04
 * Company: Lenovo
 */
public class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println(MyObject.conectionFactory.getConnection().hashCode());
	}
}
