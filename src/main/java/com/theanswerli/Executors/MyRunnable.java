package com.theanswerli.Executors;

/**
 * Author: Liming
 * Date: 2017/06/10
 * Company: Lenovo
 */
public class MyRunnable implements Runnable {

	private String username;

	public MyRunnable(String username) {
		this.username = username;
	}

	/**
	 * When an object implementing interface <code>Runnable</code> is used
	 * to create a thread, starting the thread causes the object's
	 * <code>run</code> method to be called in that separately executing
	 * thread.
	 * <p>
	 * The general contract of the method <code>run</code> is that it may
	 * take any action whatsoever.
	 *
	 * @see Thread#run()
	 */
	public void run() {
		System.out.println(Thread.currentThread().getName() + " username = " + username + "begin " + System.currentTimeMillis());
		System.out.println(Thread.currentThread().getName() + " username = " + username + "end " + System.currentTimeMillis());
	}
}
