package com.pineconecredit.auth.client.exception;

/**
 * Create By Project Pcc_Microservice
 *
 * @author zrb
 * @date 2018/4/15
 * description
 */
public class JwtTokenExpiredException extends Exception {

    public JwtTokenExpiredException(String s) {
        super(s);
    }

}
