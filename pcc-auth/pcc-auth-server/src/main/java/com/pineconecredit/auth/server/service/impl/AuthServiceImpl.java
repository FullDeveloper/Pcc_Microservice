package com.pineconecredit.auth.server.service.impl;

import com.pineconecredit.api.vo.user.UserInfo;
import com.pineconecredit.auth.common.bean.JWTInfo;
import com.pineconecredit.auth.server.bean.JwtAuthenticationRequest;
import com.pineconecredit.auth.server.feign.IUserService;
import com.pineconecredit.auth.server.service.AuthService;
import com.pineconecredit.auth.server.util.JwtTokenUtil;
import com.pineconecredit.common.result.ObjectRestResponse;
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
    public AuthServiceImpl(JwtTokenUtil jwtTokenUtil, IUserService userService) {
        this.jwtTokenUtil = jwtTokenUtil;
        this.userService = userService;
    }

    /**
     *  0:平台总账户
     *  1:平台员工_绑定权限角色模板
     *  2:普通用户
     *  3:发卡方主账户
     *  4:发卡方员工_绑定权限角色模板
     *  5:商家主账户
     *  6:商家员工_绑定权限角色模板
     *  7:商家门店主账户
     *  8:商家门店员工_绑定权限角色模板
     *  9:商家电商平台虚拟门店主账户
     *  10:商家电商平台虚拟门店员工_绑定权限角色模板
     *  11:信用卡销售公司主账户
     *  12:信用卡销售公司员工_绑定权限角色模板
     * @param
     * @return
     * @throws Exception
     */

    @Override
    public void validate(String token) throws Exception {
        jwtTokenUtil.getInfoFromToken(token);
    }

    @Override
    public String validateForApp(JwtAuthenticationRequest authenticationRequest) {
        return null;
    }

    @Override
    public String validateForMerchant(JwtAuthenticationRequest authenticationRequest) {



        return null;
    }

    @Override
    public String validateForCardMerchant(JwtAuthenticationRequest authenticationRequest) {
        return null;
    }

    @Override
    public String validateForPlatform(JwtAuthenticationRequest authenticationRequest) {
        return null;
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
