package com.pineconecredit.api.vo.user;

import lombok.Data;

import java.io.Serializable;

/**
 * Create By Project Pcc_Microservice
 *
 * @author zrb
 * @date 2018/4/15
 * description
 */
@Data
public class UserInfo implements Serializable {

    private String regPhoneNumber;

    private String password;

    private String aid;

    private String accountType;



}
