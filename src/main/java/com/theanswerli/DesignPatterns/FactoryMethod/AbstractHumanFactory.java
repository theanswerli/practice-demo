package com.theanswerli.DesignPatterns.FactoryMethod;

/**
 * Author: Liming
 * Date: 2019/2/15
 * Company: Lenovo
 */
public abstract class AbstractHumanFactory {
	public abstract <T extends Human> T createHuman(Class<T> tClass);
}