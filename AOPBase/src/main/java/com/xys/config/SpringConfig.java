package com.xys.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.xys")
@EnableAspectJAutoProxy     // 告诉Spring开启注解开发的AOP功能
public class SpringConfig {
}
