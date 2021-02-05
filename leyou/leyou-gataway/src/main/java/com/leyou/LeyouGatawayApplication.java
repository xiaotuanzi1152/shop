package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication//标注该类是启动类
@EnableDiscoveryClient
@EnableZuulProxy
public class LeyouGatawayApplication {
    public static void main(String[] args) {
        SpringApplication.run(LeyouGatawayApplication.class,args);
    }
}
