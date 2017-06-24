package com.theanswerli.Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Author: Liming
 * Date: 2017/06/10
 * Company: Lenovo
 */
public class Run {

	//创建10个线程，线程未复用
	public static void main(String[] args) {
		//创建无界线程池
		//ExecutorService executorService = Executors.newCachedThreadPool();
		//创建自定义线程的无界线程池
		MyThreadFactory threadFactory = new MyThreadFactory();
		ExecutorService executorService = Executors.newCachedThreadPool(threadFactory);
		for (int i = 0; i < 10; i++) {
			executorService.execute(new MyRunnable("" + (i+1)));
		}
	}

}
