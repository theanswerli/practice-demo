package com.theanswerli.saleTickets;

/**
 * Author: Liming
 * Date: 2018/3/19
 * Company: Lenovo
 */
public class SaleTickets implements Runnable {

	Buyer buyer;
	Seller seller;

	public SaleTickets(Buyer buyer, Seller seller) {
		this.buyer = buyer;
		this.seller = seller;
	}

	@Override
	public void run() {
		synchronized (seller) {
			System.out.println(buyer.getName() + "拿" + buyer.getMoney() + "块钱去买票...");

			if (buyer.getMoney()-5 > seller.getMoney()) {
				System.out.println("售票员只有" + seller.getMoney() + "块，找不开，请其他买家上前买票...");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				seller.setMoney(seller.getMoney()-(buyer.getMoney()-5));
				buyer.setMoney(buyer.getMoney()-5);
				System.out.println(buyer.getName() + "买票成功，找零" + buyer.getMoney() + "块,售票员还剩"
						+ seller.getMoney() + "块");
			}
		}
	}

}
