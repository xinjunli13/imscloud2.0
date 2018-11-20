package com.bootdo.clouddoadmin;

import org.mybatis.spring.annotation.MapperScan;
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
@MapperScan(basePackages = {"com.bootdo.clouddoadmin.dao","com.bootdo.clouddocommon.dao"})
public class ClouddoAdminApplication extends SpringBootServletInitializer {


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ClouddoAdminApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(ClouddoAdminApplication.class, args);
    }
}
