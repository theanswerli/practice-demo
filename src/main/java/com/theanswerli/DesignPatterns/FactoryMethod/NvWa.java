package com.theanswerli.DesignPatterns.FactoryMethod;

/**
 * Author: Liming
 * Date: 2019/2/15
 * Company: Lenovo
 */
public class NvWa {
	public static void main(String[] args) {
		HumanFactory humanFactory = new HumanFactory();
		System.out.println("第一次造出白人");
		WhiteHuman whiteHuman = humanFactory.createHuman(WhiteHuman.class);
		whiteHuman.getColor();
		whiteHuman.talk();
		System.out.println("第二次造出黑人");
		BlackHuman blackHuman = humanFactory.createHuman(BlackHuman.class);
		blackHuman.getColor();
		blackHuman.talk();
		System.out.println("第三次造出黄人");
		YellowHuman yellowHuman = humanFactory.createHuman(YellowHuman.class);
		yellowHuman.getColor();
		yellowHuman.talk();
	}
}