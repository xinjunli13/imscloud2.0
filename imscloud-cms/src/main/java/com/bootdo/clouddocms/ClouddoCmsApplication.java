package com.bootdo.clouddocms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableFeignClients(basePackages = {"com.bootdo"})
@EnableCaching
@EnableScheduling
@EnableDiscoveryClient
@SpringBootApplication
public class ClouddoCmsApplication extends SpringBootServletInitializer {


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ClouddoCmsApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(ClouddoCmsApplication.class, args);
    }
}
