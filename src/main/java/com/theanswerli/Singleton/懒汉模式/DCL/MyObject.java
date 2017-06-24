package com.theanswerli.Singleton.懒汉模式.DCL;

/**
 * Author: Liming
 * Date: 2017/06/04
 * Company: Lenovo
 */
public class MyObject {

	//懒汉模式：需要使用时，才去实例化对象
	//DCL:double check lock(双检查锁机制)
	private static MyObject myObject;

	public MyObject() {
	}

	public static MyObject getMyObject() {
		if (myObject != null) {

		} else { //第一次检查
			synchronized (MyObject.class) {
				if (myObject == null) { //第二次检查
					myObject = new MyObject();
				}
			}
		}
		return myObject;
	}
}
