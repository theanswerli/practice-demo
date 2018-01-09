package com.theanswerli.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Author: Liming
 * Date: 2018/1/9
 * Company: Lenovo
 */
public class TimeHandler implements InvocationHandler {

	private Object target;

	public TimeHandler(Object target) {
		super();
		this.target = target;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		System.out.println("proxy:"+proxy.getClass().getName());
		System.out.println("method:"+method.getName());
		//System.out.println("args:"+args[0].getClass().getName());

		long start = System.currentTimeMillis();
		System.out.println("Method start at : " + start);
		method.invoke(target);
		long end = System.currentTimeMillis();
		System.out.println("Method end at : " + end);
		System.out.println("Method spend time : " + (end - start));
		return null;
	}

}
