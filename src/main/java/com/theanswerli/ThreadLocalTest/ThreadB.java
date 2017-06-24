package com.theanswerli.ThreadLocalTest;

/**
 * Author: Liming
 * Date: 2017/05/31
 * Company: Lenovo
 */
public class ThreadB extends Thread {

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
		try {
			for (int i = 0; i < 100 ; i++){
				Tools.threadLocal.set("ThreadA "+(i+1));
				System.out.println("ThreadA get Value = " + Tools.threadLocal.get());
				Thread.sleep(200);
			}
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
