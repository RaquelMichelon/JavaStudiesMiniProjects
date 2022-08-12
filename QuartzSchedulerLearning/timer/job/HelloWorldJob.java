package com.michelon.timer.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component //to inform that it is a spring component
public class HelloWorldJob implements Job { //every job needs to implement the Job interface from Quartz library

    private static final Logger Log = LoggerFactory.getLogger(HelloWorldJob.class);

    //execute() method needs to be implemented
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        Log.info("Hello, World!");
    }
}
