package com.theanswerli.proxy;

import java.util.Random;

/**
 * Author: Liming
 * Date: 2018/1/9
 * Company: Lenovo
 */
public class Tank implements Moveable {

	public void move() {
		System.out.println("Tank moving.....");
		try {
			//随机sleep一段时间，后续通过 动态代理 来获取 方法的执行时间
			Thread.sleep(new Random().nextInt(10000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
