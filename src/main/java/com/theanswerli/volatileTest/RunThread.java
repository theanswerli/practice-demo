package com.theanswerli.volatileTest;

/**
 * Author: Liming
 * Date: 2017/05/25
 * Company: Lenovo
 */
public class RunThread extends Thread {

	//volatile确保线程每次从公共区域取值
	volatile private boolean isRunning = true;

	public boolean isRunning(){
		return isRunning;
	}

	public void setRunning(boolean isRunning){
		this.isRunning = isRunning;
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
	 * @see #Thread(ThreadGroup, Runnable, String)
	 */
	@Override
	public void run() {
		System.out.println("进入了running");
		while (isRunning ==  true){

		}
		System.out.println("线程被停止了...");
	}
}
