package com.pineconecredit.api.rpc.service;

import com.pineconecredit.api.biz.AccountBiz;
import com.pineconecredit.api.biz.MerchantBiz;
import com.pineconecredit.api.entity.Account;
import com.pineconecredit.api.vo.user.UserInfo;
import com.pineconecredit.common.exception.auth.ClientForbiddenException;
import com.pineconecredit.common.result.ObjectRestResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Create By Project Pcc_Microservice
 *
 * @author zrb
 * @date 2018/4/16
 * description
 */
@Service
@Slf4j
public class AuthService {

    @Autowired
    private AccountBiz accountBiz;

    public ObjectRestResponse<UserInfo> validateForApp(String phoneNumber, String password) {
        ObjectRestResponse<UserInfo> objectRestResponse = new ObjectRestResponse<>();
        Account account = accountBiz.getAccountByUserNameAndType(phoneNumber, "2");
        if (account == null) {
            log.info("App账号:{}不存在,请检查!", phoneNumber);
            throw new ClientForbiddenException("用户名或密码错误!");
        }
        if (!account.getPassword().equals(password)) {
            log.info("App账号{},输入密码错误！", phoneNumber);
            throw new ClientForbiddenException("用户名或密码错误!");
        }

        if (!"1".equals(account.getState())) {
            log.info("App该账号状态异常:{}!", account.getState());
            throw new ClientForbiddenException("账号不存在!");
        }

        UserInfo userInfo = new UserInfo();
        userInfo.setAccountType(account.getAccountType());
        userInfo.setAid(account.getAid());
        userInfo.setPhoneNumber(account.getRegPhoneNumber());

        objectRestResponse.setData(userInfo);
        return objectRestResponse;
    }

}
