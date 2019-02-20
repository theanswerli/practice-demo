package com.theanswerli.DesignPatterns.FactoryMethod;

/**
 * Author: Liming
 * Date: 2019/2/15
 * Company: Lenovo
 */
public class BlackHuman implements Human {
	@Override
	public void talk() {
		System.out.println("黑人说话，可能听不懂...");
	}

	@Override
	public void getColor() {
		System.out.println("黑人的皮肤是黑色的...");
	}
}