package com.theanswerli.Singleton.懒汉模式.线程不安全;

/**
 * Author: Liming
 * Date: 2017/06/04
 * Company: Lenovo
 */
public class MyObject {

	//懒汉模式：需要使用时，才去实例化对象
	private static MyObject myObject;

	public MyObject() {
	}

	public static MyObject getMyObject() {
		if (myObject != null) {

		} else {
			myObject = new MyObject();
		}
		return myObject;
	}
}
