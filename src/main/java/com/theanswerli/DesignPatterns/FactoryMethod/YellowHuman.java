package com.theanswerli.DesignPatterns.FactoryMethod;

/**
 * Author: Liming
 * Date: 2019/2/15
 * Company: Lenovo
 */
public class YellowHuman implements Human {
	@Override
	public void talk() {
		System.out.println("黄种人大多说汉语....");
	}

	@Override
	public void getColor() {
		System.out.println("黄种人的皮肤是黄色的....");
	}
}