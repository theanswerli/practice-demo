package com.theanswerli.CyclicBarrier;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Author: Liming
 * Date: 2018/1/17
 * Company: Lenovo
 */
public class Run {

	/**
	 * 模拟三个运动员都在做赛前准备，等都准备好了之后，一起 起跑的场景
	 *
	 */
	public static void runABCWhenAllReady() {
		int runner = 3;
		final CyclicBarrier cyclicBarrier = new CyclicBarrier(runner);
		Random random = new Random();
		for (char threadName = 'A'; threadName <= 'C'; threadName++) {
			final long prepareTime = random.nextInt(10000) + 100;
			final String tN = String.valueOf(threadName);
			new Thread(new Runnable() {
				public void run() {
					System.out.println("runner " + tN + " is preparing for time : " + prepareTime);
					try {
						Thread.sleep(prepareTime);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("runner " + tN + " is prepared and wait for other runner...");
					try {
						cyclicBarrier.await();
					} catch (InterruptedException e) {
						e.printStackTrace();
					} catch (BrokenBarrierException e) {
						e.printStackTrace();
					}
					System.out.println("runner " + tN + " is running....");
				}
			}).start();
		}
	}

	public static void main(String[] args) {
		runABCWhenAllReady();
	}
}
