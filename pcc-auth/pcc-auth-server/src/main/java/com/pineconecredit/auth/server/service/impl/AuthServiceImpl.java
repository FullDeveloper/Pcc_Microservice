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
     * @param authenticationRequest
     * @return
     * @throws Exception
     */
    @Override
    public String login(JwtAuthenticationRequest authenticationRequest) throws Exception {
        UserInfo userInfo = null;
        String accountType = authenticationRequest.getAccountType();
        if("2".equals(accountType)){
            userInfo = userService.validateForApp(authenticationRequest);
        }else if(  "5".equals(accountType)
                || "6".equals(accountType)
                || "7".equals(accountType)
                || "8".equals(accountType)
                || "9".equals(accountType)
                || "10".equals(accountType)){
            userInfo = userService.validateForMerchant(authenticationRequest);
        }else if(  "3".equals(accountType)
                || "4".equals(accountType)){
            userInfo = userService.validateForCardMerchant(authenticationRequest);
        }else if(  "0".equals(accountType)
                || "1".equals(accountType)){
            userInfo = userService.validateForPlatform(authenticationRequest);
        }
        String token = "";
        if (!StringUtils.isEmpty(userInfo.getAid())) {
            token = jwtTokenUtil.generateToken(new JWTInfo(userInfo.getPhoneNumber(), userInfo.getAid() + "", userInfo.getAccountType()));
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
