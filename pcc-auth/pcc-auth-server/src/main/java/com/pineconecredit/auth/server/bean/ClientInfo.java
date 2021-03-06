package com.pineconecredit.auth.server.bean;

import com.pineconecredit.auth.common.bean.IJWTInfo;

/**
 * Create By Project Pcc_Microservice
 *
 * @author zrb
 * @date 2018/4/15
 * description
 */
public class ClientInfo implements IJWTInfo {

    String clientId;
    String name;

    public ClientInfo(String clientId, String name, String id) {
        this.clientId = clientId;
        this.name = name;
        this.id = id;
    }

    public void setId(String id) {
        this.id = id;
    }

    String id;
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String getPhoneNumber() {
        return clientId;
    }

    @Override
    public String getAid() {
        return id;
    }

    @Override
    public String getAccountType() {
        return name;
    }
}
