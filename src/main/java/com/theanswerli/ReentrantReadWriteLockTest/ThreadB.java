package com.theanswerli.ReentrantReadWriteLockTest;

/**
 * Author: Liming
 * Date: 2017/06/02
 * Company: Lenovo
 */
public class ThreadB extends Thread {

	private Service service;

	/**
	 * Allocates a new {@code Thread} object. This constructor has the same
	 * effect as {@linkplain #Thread(ThreadGroup, Runnable, String) Thread}
	 * {@code (null, null, gname)}, where {@code gname} is a newly generated
	 * name. Automatically generated names are of the form
	 * {@code "Thread-"+}<i>n</i>, where <i>n</i> is an integer.
	 */
	public ThreadB(Service service) {
		this.service = service;
	}

	/**
	 * If this thread was constructed using a separate
	 * <code>Runnable</code> run object, then that
	 * <code>Runnable</code> object's <code>run</code> method is called;
	 * otherwise, this method does nothing and returns.
	 * <p>
	 * Subclasses of <code>Thread</code> should override this method.
	 *
	 * @see #start()
	 * @see #stop()
	 */
	@Override
	public void run() {
		service.write();
	}
}
