package com.pineconecredit.auth.server.service.impl;

import com.pineconecredit.api.vo.user.UserInfo;
import com.pineconecredit.auth.common.bean.JWTInfo;
import com.pineconecredit.auth.server.bean.JwtAuthenticationRequest;
import com.pineconecredit.auth.server.feign.IUserService;
import com.pineconecredit.auth.server.service.AuthService;
import com.pineconecredit.auth.server.util.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * Create By Project Pcc_Microservice
 *
 * @author zrb
 * @date 2018/4/15
 * description
 */
@Service
public class AuthServiceImpl implements AuthService {
    private JwtTokenUtil jwtTokenUtil;
    private IUserService userService;

    @Autowired
    public AuthServiceImpl(
            JwtTokenUtil jwtTokenUtil,
            IUserService userService) {
        this.jwtTokenUtil = jwtTokenUtil;
        this.userService = userService;
    }

    @Override
    public String login(JwtAuthenticationRequest authenticationRequest) throws Exception {
        UserInfo info = userService.validate(authenticationRequest);
        String token = "";
        if (!StringUtils.isEmpty(info.getAid())) {
            token = jwtTokenUtil.generateToken(new JWTInfo(info.getRegPhoneNumber(), info.getAid() + "", info.getAccountType()));
        }
        return token;
    }

    @Override
    public void validate(String token) throws Exception {
        jwtTokenUtil.getInfoFromToken(token);
    }

    @Override
    public String refresh(String oldToken) {
        return null;
    }


    @Override
    public Boolean invalid(String token) {
        return null;
    }
}
