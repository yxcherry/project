package com.mt.service.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.mt.service.aop")
@EnableAspectJAutoProxy
public class AopConfig {

}
