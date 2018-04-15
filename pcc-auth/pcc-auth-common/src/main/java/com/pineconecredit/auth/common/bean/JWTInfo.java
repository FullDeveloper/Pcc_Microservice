package com.pineconecredit.auth.common.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: ZhouRunBin
 * Date: 2018/4/5 0005
 * Time: 2:39
 * Description:
 */
@Data
public class JWTInfo implements Serializable,IJWTInfo {

    private String regPhoneNumber;
    private String aid;
    private String accountType;

    public JWTInfo(String regPhoneNumber, String aid, String accountType) {
        this.regPhoneNumber = regPhoneNumber;
        this.aid = aid;
        this.accountType = accountType;
    }
}
