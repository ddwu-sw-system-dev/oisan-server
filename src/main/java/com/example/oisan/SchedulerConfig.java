package com.example.oisan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

@Configuration
public class SchedulerConfig {	  
    @Bean
    public TaskScheduler threadPoolTaskScheduler(){
    	final ThreadPoolTaskScheduler scheduler
          = new ThreadPoolTaskScheduler();
    	scheduler.setPoolSize(30);
    	scheduler.setThreadNamePrefix("taskScheduler");
        return scheduler;
    }
}