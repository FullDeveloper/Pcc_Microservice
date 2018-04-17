package com.pineconecredit.auth.server.feign;

import com.pineconecredit.api.vo.user.UserInfo;
import com.pineconecredit.auth.server.bean.JwtAuthenticationRequest;
import com.pineconecredit.common.result.ObjectRestResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Create By Project Pcc_Microservice
 *
 * @author zrb
 * @date 2018/4/15
 * description
 */
@FeignClient
public interface IUserService {

    @RequestMapping(value = "/")
    ObjectRestResponse<UserInfo> validateForApp(JwtAuthenticationRequest authenticationRequest);

    @RequestMapping(value = "/")
    ObjectRestResponse<UserInfo> validateForMerchant(JwtAuthenticationRequest authenticationRequest);

    @RequestMapping(value = "/")
    ObjectRestResponse<UserInfo> validateForCardMerchant(JwtAuthenticationRequest authenticationRequest);

    @RequestMapping(value = "/")
    ObjectRestResponse<UserInfo> validateForPlatform(JwtAuthenticationRequest authenticationRequest);
}
