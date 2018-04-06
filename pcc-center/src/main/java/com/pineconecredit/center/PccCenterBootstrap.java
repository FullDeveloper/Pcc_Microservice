package com.pineconecredit.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by IntelliJ IDEA.
 * User: ZhouRunBin
 * Date: 2018/4/5 0005
 * Time: 0:36
 * Description:
 */
@EnableEurekaServer
@SpringBootApplication
public class PccCenterBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(PccCenterBootstrap.class, args);
    }

}
