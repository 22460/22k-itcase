package com.xys.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.xys")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class, MybatisConfiog.class})
public class SpringConfig {
}
