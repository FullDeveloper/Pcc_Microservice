package com.pineconecredit.api.rpc;

import com.pineconecredit.api.rpc.service.AuthService;
import com.pineconecredit.common.result.ObjectRestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Create By Project Pcc_Microservice
 *
 * @author zrb
 * @date 2018/4/16
 * description
 */
@RequestMapping(value = "/auth")
@RestController
public class AuthUserController {

    @Autowired
    private AuthService authService;

    @RequestMapping(value = "/validateForApp",method = RequestMethod.GET)
    public ObjectRestResponse validateForApp(@RequestParam Map<String,String> jwtAuth){

        return authService.validateForApp(jwtAuth.get("phoneNumber"),jwtAuth.get("password"));
    }


}
