package com.pineconecredit.auth.server.feign;

import com.pineconecredit.api.vo.user.UserInfo;
import com.pineconecredit.auth.server.bean.JwtAuthenticationRequest;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * Create By Project Pcc_Microservice
 *
 * @author zrb
 * @date 2018/4/15
 * description
 */
public interface IUserService {


    UserInfo validate(JwtAuthenticationRequest authenticationRequest);
}
