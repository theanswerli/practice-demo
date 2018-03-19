package com.theanswerli.saleTickets;


/**
 * Author: Liming
 * Date: 2018/3/19
 * Company: Lenovo
 */
public class Test {

	public static void main(String[] args) {
		Buyer laoli = new Buyer("laoli", 10);
		Buyer laozhang = new Buyer("laozhang", 20);
		Buyer laozhao = new Buyer("laozhao", 5);
		Seller seller = new Seller("seller", 15);

		Thread t1 = new Thread(new SaleTickets(laoli, seller));
		Thread t2 = new Thread(new SaleTickets(laozhang, seller));
		Thread t3 = new Thread(new SaleTickets(laozhao, seller));

		t1.start();
		t2.start();
		t3.start();

	}

}
