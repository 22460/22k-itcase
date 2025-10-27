package com.xys.config;

import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.xys")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class, MybatisConfiog.class})
@EnableTransactionManagement
public class SpringConfig {
}
