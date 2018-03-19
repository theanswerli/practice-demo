package com.theanswerli.saleTickets;

/**
 * Author: Liming
 * Date: 2018/3/19
 * Company: Lenovo
 */
public class Person {

	private String name;

	private int money;

	public Person() {
	}

	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
}
