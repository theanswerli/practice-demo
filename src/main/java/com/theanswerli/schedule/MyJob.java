package com.theanswerli.schedule;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author: Liming
 * Date: 2017/07/12
 * Company: Lenovo
 */
public class MyJob implements Job {

	public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String s = simpleDateFormat.format(date);
		System.out.println("current exe time :" + s);
		System.out.println("hello world...");
	}

}
