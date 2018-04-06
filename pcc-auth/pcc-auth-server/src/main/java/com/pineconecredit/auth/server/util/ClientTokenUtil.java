package com.pineconecredit.auth.server.util;

import com.pineconecredit.auth.common.bean.IJWTInfo;
import com.pineconecredit.auth.common.util.JWTHelper;
import com.pineconecredit.auth.server.configuration.KeyConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * Created by IntelliJ IDEA.
 * User: ZhouRunBin
 * Date: 2018/4/5 0005
 * Time: 2:28
 * Description:
 */
@Configuration
@Slf4j
public class ClientTokenUtil {

    @Value("${client.expire}")
    private int expire;

    @Autowired
    private KeyConfiguration keyConfiguration;

    public IJWTInfo getInfoFromToken(String token) throws Exception {
        return JWTHelper.getInfoFromToken(token, keyConfiguration.getServicePubKey());
    }


}
