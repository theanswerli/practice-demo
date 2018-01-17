package com.theanswerli.CountdownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * Author: Liming
 * Date: 2018/1/17
 * Company: Lenovo
 */
public class Run {

	/**
	 * 模拟 A、B、C、D四个线程，D线程要等 A、B、C三个线程都 同步 执行完了，再执行的场景；
	 * 这种场景 适合使用 CountDownLatch（CountDownLatch 适用于一个线程去等待多个线程的情况）
	 */
	public static void runABCWaitD() {
		int worker = 3;
		final CountDownLatch countDownLatch = new CountDownLatch(worker);

		new Thread(new Runnable() {
			public void run() {
				System.out.println("D is waiting for A,B,C.....");
				try {
					countDownLatch.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("A,B,C All done, D is running....");
			}
		}).start();

		for (char threadName = 'A'; threadName <= 'C'; threadName++) {
			final String tN = String.valueOf(threadName);
			new Thread(new Runnable() {
				public void run() {
					System.out.println(tN + " is working...");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(tN + " is finished.");
					countDownLatch.countDown();
				}
			}).start();
		}
	}

	public static void main(String[] args) {
		runABCWaitD();
	}

}
