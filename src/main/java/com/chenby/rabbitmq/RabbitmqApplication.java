package com.chenby.rabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class RabbitmqApplication extends SpringBootServletInitializer {

    /**
     * 
     * @param builder
     * @return
     */

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(RabbitmqApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(RabbitmqApplication.class, args);
    }

}
