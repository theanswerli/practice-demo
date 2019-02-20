package com.theanswerli.DesignPatterns.FactoryMethod;

/**
 * Author: Liming
 * Date: 2019/2/15
 * Company: Lenovo
 */
public class WhiteHuman implements Human {
	@Override
	public void talk() {
		System.out.println("白人说话，说英语...");
	}

	@Override
	public void getColor() {
		System.out.println("白人的皮肤是白色的...");
	}
}