package com.theanswerli.joinMoreTest;

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
	synchronized public void run() {
		try {
			System.out.println("begin B ThreadName = "+ Thread.currentThread().getName()+" "+System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("end B ThreadName = "+ Thread.currentThread().getName()+" "+System.currentTimeMillis());
		} catch (InterruptedException e){
			e.printStackTrace();
		}
	}
}
