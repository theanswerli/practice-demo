package com.theanswerli.Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Author: Liming
 * Date: 2017/06/10
 * Company: Lenovo
 */
public class Run1 {

	//分两次创建线程，达到线程复用的效果
	public static void main(String[] args) {
		//创建无界线程池
		//ExecutorService executorService = Executors.newCachedThreadPool();
		//创建有界线程池
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		for (int i = 0; i < 5; i++) {
			executorService.execute(new MyRunnable("" + (i+1)));
		}

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("");
		System.out.println("");

		for (int i = 0; i < 5; i++) {
			executorService.execute(new MyRunnable("" + (i+1)));
		}
	}

}
