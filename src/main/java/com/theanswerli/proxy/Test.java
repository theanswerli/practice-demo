package com.theanswerli.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Author: Liming
 * Date: 2018/1/9
 * Company: Lenovo
 */
public class Test {

	public static void main(String[] args) throws InterruptedException {
		Tank tank = new Tank();
		//原始方法执行
		tank.move();

		Thread.sleep(1000);

		//利用动态代理 执行（动态改变 类的行为）
		InvocationHandler timeHandler = new TimeHandler(tank);
		Class<?>[] interfaces = tank.getClass().getInterfaces();
		Moveable moveable = (Moveable) Proxy.newProxyInstance(tank.getClass().getClassLoader(), interfaces, timeHandler);
		moveable.move();
	}

}
