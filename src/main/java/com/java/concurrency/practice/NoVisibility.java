package com.java.concurrency.practice;

/**
 * Author: Liming
 * Date: 2019/2/20
 * Company: Lenovo
 */
public class NoVisibility {
	private static boolean ready;
	private static int number;

	private static class ReaderThread extends Thread {

		@Override
		public void run() {
			while (!ready) {
				Thread.yield();
			}
			System.out.println(number);
		}
	}

	public static void main(String[] args) {
		new ReaderThread().start();
		number = 42;
		ready = true;
	}

}