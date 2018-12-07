package com.doudou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @auther SyntacticSugar
 * @data 2018/12/7 0007下午 4:15
 */

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer   // 配置服务
public class Config {
    public static void main(String[] args) {
        SpringApplication.run(Config.class,args);
    }

}
