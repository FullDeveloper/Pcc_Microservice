package com.pineconecredit.auth.server.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * Created by IntelliJ IDEA.
 * User: ZhouRunBin
 * Date: 2018/4/5 0005
 * Time: 2:26
 * Description:
 */
@Configuration
public class ClientConfiguration {
    @Value("${client.id}")
    private String clientId;
    @Value("${client.token-header}")
    private String clientTokenHeader;

    public String getClientTokenHeader() {
        return clientTokenHeader;
    }

    public String getClientId() {
        return clientId;
    }
}
