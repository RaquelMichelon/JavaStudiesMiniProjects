package com.michelon.timer.timerservice;

import com.michelon.timer.job.HelloWorldJob;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service //to left spring knows the function of this class
public class ScheduledService {

    private static final Logger Log = LoggerFactory.getLogger(ScheduledService.class);

    //inject the Scheduler class
    private final Scheduler scheduler;

    @Autowired
    public ScheduledService(Scheduler scheduler) {
        this.scheduler = scheduler;
    }
    
    //CREATING A METHOD FOR SCHEDULING
    public void schedule(final Class jobClass, final TimerInfo info) {
        final JobDetail jobDetail = TimerUtils.buildJobDetails(jobClass, info);
        final Trigger trigger = TimerUtils.buildTrigger(jobClass, info);

        try {
            scheduler.scheduleJob(jobDetail, trigger);
        } catch (SchedulerException e) {
            Log.error(e.getMessage(), e);
        }
    }

    //start() and shutdown()
    @PostConstruct
    public void init() {
        try{
            scheduler.start();
        } catch (SchedulerException e) {
            Log.error(e.getMessage(), e);
        }
    }

    @PreDestroy //to be called before the service be destroyed
    public void preDestroy() {
        try {
            scheduler.shutdown();
        } catch (SchedulerException e) {
            Log.error(e.getMessage(), e);
        }
    }
}
