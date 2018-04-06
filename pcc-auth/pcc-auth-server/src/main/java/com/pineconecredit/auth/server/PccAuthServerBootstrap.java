package com.pineconecredit.auth.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by IntelliJ IDEA.
 * User: ZhouRunBin
 * Date: 2018/4/5 0005
 * Time: 1:29
 * Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.pineconecredit.auth.server.mapper")
public class PccAuthServerBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(PccAuthServerBootstrap.class, args);
    }

}