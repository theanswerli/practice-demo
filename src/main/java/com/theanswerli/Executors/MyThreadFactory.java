package com.theanswerli.Executors;

import java.util.concurrent.ThreadFactory;

/**
 * Author: Liming
 * Date: 2017/06/10
 * Company: Lenovo
 */
public class MyThreadFactory implements ThreadFactory {
	/**
	 * Constructs a new {@code Thread}.  Implementations may also initialize
	 * priority, name, daemon status, {@code ThreadGroup}, etc.
	 *
	 * @param r a runnable to be executed by new thread instance
	 * @return constructed thread, or {@code null} if the request to
	 * create a thread is rejected
	 */
	public Thread newThread(Runnable r) {
		Thread thread = new Thread(r);
		thread.setName("自定义线程...." + Math.random());
		return thread;
	}
}
