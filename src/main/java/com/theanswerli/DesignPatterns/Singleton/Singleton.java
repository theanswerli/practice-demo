package com.theanswerli.DesignPatterns.Singleton;

/**
 * Author: Liming
 * Date: 2019/2/15
 * Company: Lenovo
 * 单例通用代码
 */
public class Singleton {

	private static final Singleton singleton = new Singleton();

	//限制产生多个对象
	public Singleton() {
	}

	//通过该方法获取实例对象
	public static Singleton getInstance() {
		return singleton;
	}

	//其他方法也尽量是static
	public static void doSomething() {

	}
}