package com.pineconecredit.provider.generator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by IntelliJ IDEA.
 * User: ZhouRunBin
 * Date: 2018/4/5 0005
 * Time: 10:32
 * Description:
 */
@SpringBootApplication
@MapperScan("com.pineconecredit.provider.generator.mapper")
public class PccGeneratorBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(PccGeneratorBootstrap.class, args);
    }

}
