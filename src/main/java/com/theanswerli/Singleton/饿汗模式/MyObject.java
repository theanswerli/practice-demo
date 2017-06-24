package com.theanswerli.Singleton.饿汗模式;

/**
 * Author: Liming
 * Date: 2017/06/04
 * Company: Lenovo
 */
public class MyObject {

	//饿汗模式：调用方法前，实例已经被创建
	private static MyObject myObject = new MyObject();

	public MyObject() {
	}

	public static MyObject getMyObject() {
		//饿汗模式缺点：
		//不能有其它的实例变量,否则会有线程安全的问题...
		return myObject;
	}
}
