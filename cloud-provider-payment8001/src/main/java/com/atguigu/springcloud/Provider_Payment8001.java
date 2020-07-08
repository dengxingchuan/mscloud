package com.atguigu.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@MapperScan("com.atguigu.springcloud.mapper")
@EnableDiscoveryClient
public class Provider_Payment8001 {
    public static void main(String[] args) {

        SpringApplication.run(Provider_Payment8001.class, args);
    }
}
