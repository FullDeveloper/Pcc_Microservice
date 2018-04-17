package com.pineconecredit.auth.server.service;

import com.pineconecredit.api.vo.user.UserInfo;
import com.pineconecredit.auth.server.bean.JwtAuthenticationRequest;
import com.pineconecredit.common.result.ObjectRestResponse;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * User: ZhouRunBin
 * Date: 2018/4/5 0005
 * Time: 1:38
 * Description:
 */
public interface AuthService {

    String validateForApp(JwtAuthenticationRequest authenticationRequest);

    String validateForMerchant(JwtAuthenticationRequest authenticationRequest);

    String validateForCardMerchant(JwtAuthenticationRequest authenticationRequest);

    String validateForPlatform(JwtAuthenticationRequest authenticationRequest);

    String refresh(String oldToken);

    void validate(String token) throws Exception;

    Boolean invalid(String token);

}
