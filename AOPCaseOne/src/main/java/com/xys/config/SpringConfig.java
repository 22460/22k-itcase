package com.xys.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.xys")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class, MybatisConfig.class})
@EnableAspectJAutoProxy
public class SpringConfig {
}
