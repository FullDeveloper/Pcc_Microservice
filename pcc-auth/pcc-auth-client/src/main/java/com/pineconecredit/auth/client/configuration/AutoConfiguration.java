package com.pineconecredit.auth.client.configuration;

import com.pineconecredit.auth.client.config.ServiceAuthConfig;
import com.pineconecredit.auth.client.config.UserAuthConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Create By Project Pcc_Microservice
 *
 * @author zrb
 * @date 2018/4/15
 * description
 */
@Configuration
@ComponentScan(value = "com.pineconecredit.auth.client")
public class AutoConfiguration {

    @Bean
    ServiceAuthConfig getServiceAuthConfig(){
        return new ServiceAuthConfig();
    }

    @Bean
    UserAuthConfig getUserAuthConfig(){
        return new UserAuthConfig();
    }

}
