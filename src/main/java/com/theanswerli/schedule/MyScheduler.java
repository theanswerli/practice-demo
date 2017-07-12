package com.theanswerli.schedule;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.SimpleTrigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

/**
 * Author: Liming
 * Date: 2017/07/12
 * Company: Lenovo
 */
public class MyScheduler {

	public static void main(String[] args) throws SchedulerException {
		JobDetail jobDetail = JobBuilder.newJob(MyJob.class).withIdentity("name").build();

		SimpleTrigger trigger = TriggerBuilder.newTrigger().withIdentity("trigger")
				.startNow()
				.withSchedule(SimpleScheduleBuilder.simpleSchedule()
						.withIntervalInSeconds(2).repeatForever()).build();

		SchedulerFactory factory = new StdSchedulerFactory();
		Scheduler scheduler = factory.getScheduler();
		scheduler.start();
		scheduler.scheduleJob(jobDetail, trigger);
	}

}
