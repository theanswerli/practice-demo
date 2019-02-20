package com.theanswerli.DesignPatterns.FactoryMethod;

/**
 * Author: Liming
 * Date: 2019/2/15
 * Company: Lenovo
 */
public class HumanFactory extends AbstractHumanFactory {
	@Override
	public <T extends Human> T createHuman(Class<T> tClass) {
		Human human = null;
		try {
			human = (T) Class.forName(tClass.getName()).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return (T) human;
	}
}