package com.michelon.timer.util;

import com.michelon.timer.info.TimerInfo;
import org.quartz.*;

import java.util.Date;

public class TimerUtils {

    private TimerUtils() {}

    //to build the job details
    public static JobDetail buildJobDetails(final Class jobClass, final TimerInfo timerInfo) {
        final JobDataMap jobDataMap = new JobDataMap();
        jobDataMap.put(jobClass.getSimpleName(), timerInfo); //(key: simple name of the class; store the timerInfo job)
        return JobBuilder.newJob(jobClass)
                .withIdentity(jobClass.getSimpleName())
                .setJobData(jobDataMap)
                .build();
    }

    //method to implement a trigger
    public static Trigger buildTrigger(final Class jobClass, final TimerInfo timerInfo) {
        SimpleScheduleBuilder builder = SimpleScheduleBuilder.simpleSchedule()
                .withIntervalInMilliseconds(timerInfo.getRepeatIntervalMs());

        if (timerInfo.isRunForever()) {
            builder = builder.repeatForever();
        } else {
            builder = builder.withRepeatCount(timerInfo.getTotalFireAccount() - 1);
        }

        return TriggerBuilder.newTrigger()
                .withIdentity(jobClass.getSimpleName())
                .withSchedule(builder)
                .startAt(new Date(System.currentTimeMillis() + timerInfo.getInitialOffSetMs()))
                .build();
    }
}
