package com.pineconecredit.api;

import com.pineconecredit.auth.client.EnablePccAuthClient;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Pcc_MicroService
 *
 * @author zrb
 * @date 2018/4/15
 * description
 */

@SpringBootApplication
@MapperScan("com.pineconecredit.api.mapper")
@EnableTransactionManagement
//@EnablePccAuthClient
@EnableFeignClients({"com.pineconecredit.auth.client.feign"})
public class PccAipBootstrap {


    public static void main(String[] args) {
        SpringApplication.run(PccAipBootstrap.class, args);
    }


}
