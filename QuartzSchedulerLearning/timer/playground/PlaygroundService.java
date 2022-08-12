package com.michelon.timer.playground;

import com.michelon.timer.info.TimerInfo;
import com.michelon.timer.job.HelloWorldJob;
import com.michelon.timer.timerservice.ScheduledService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlaygroundService {

    private final ScheduledService scheduler;

    @Autowired //injeting the ScheduledService
    public PlaygroundService(final ScheduledService scheduler) {
        this.scheduler = scheduler;
    }

    public void runHelloWorldJob() { //to run the job created in HelloWorldJob

        //build the timerInfo
        final TimerInfo info = new TimerInfo();
        info.setTotalFireAccount(5);
        info.setRepeatIntervalMs(2000);
        info.setInitialOffSetMs(1000);
        info.setCallBackData("My callback data!");

        //properly scheduling the HelloWorldJob -> yet necessary trigger this job in a controller
        scheduler.schedule(HelloWorldJob.class, info);

    }
}
