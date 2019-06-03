package com.example.demo.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.AvailabilityFilteringRule;
import com.netflix.loadbalancer.IRule;

@Configuration
public class ApplicationConfig {


    @Bean
    public IRule ribbonRule() {
        AvailabilityFilteringRule rule = new AvailabilityFilteringRule();
        return rule;
    }
}
