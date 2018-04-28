package com.mt.service.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("com.mt.service.taskscheduler")
@EnableScheduling
public class TaskScheduleconfig {

}
