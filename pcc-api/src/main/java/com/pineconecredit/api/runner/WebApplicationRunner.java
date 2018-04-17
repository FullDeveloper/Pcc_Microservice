package com.pineconecredit.api.runner;

import com.pineconecredit.common.helper.UploadHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContext;

/**
 * Create By Project Pcc_Microservice
 *
 * @author zrb
 * @date 2018/4/17
 * description
 */
@Component
@Order(value=1)
@Slf4j
public class WebApplicationRunner implements ApplicationRunner {

    @Autowired
    private ServletContext servletContext;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("spring application context is runner ..........");
        UploadHelper.init(servletContext);
        log.info("upload helper is initial ..........");
    }
}
