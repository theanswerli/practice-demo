package com.theanswerli.ThreadLocalExtTest;

import java.util.Date;

/**
 * Author: Liming
 * Date: 2017/05/31
 * Company: Lenovo
 */
public class ThreadLocalExt extends ThreadLocal {

	/**
	 * Returns the current thread's "initial value" for this
	 * thread-local variable.  This method will be invoked the first
	 * time a thread accesses the variable with the {@link #get}
	 * method, unless the thread previously invoked the {@link #set}
	 * method, in which case the {@code initialValue} method will not
	 * be invoked for the thread.  Normally, this method is invoked at
	 * most once per thread, but it may be invoked again in case of
	 * subsequent invocations of {@link #remove} followed by {@link #get}.
	 * <p>
	 * <p>This implementation simply returns {@code null}; if the
	 * programmer desires thread-local variables to have an initial
	 * value other than {@code null}, {@code ThreadLocal} must be
	 * subclassed, and this method overridden.  Typically, an
	 * anonymous inner class will be used.
	 *
	 * @return the initial value for this thread-local
	 */
	@Override
	protected Object initialValue() {
		return new Date().getTime();
	}
}