package edu.springapp.spring_aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("edu.springapp.spring_aop.*")
@EnableAspectJAutoProxy
public class SpringConfig {
        }
