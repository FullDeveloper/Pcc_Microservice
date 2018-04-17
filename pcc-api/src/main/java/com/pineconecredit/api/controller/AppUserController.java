package com.pineconecredit.api.controller;

import com.pineconecredit.common.annotation.ParseParam;
import com.pineconecredit.common.bean.Param;
import com.pineconecredit.common.controller.BaseController;
import com.pineconecredit.api.biz.AppUserBiz;
import com.pineconecredit.api.entity.AppUser;
import com.pineconecredit.common.result.ObjectRestResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 移动端用户
 *
 * @author ZhouRunBin
 * @email 1875222156@qq.com
 * @date 2018-04-16 23:30:47
 */

@RestController
@RequestMapping("appUser")
public class AppUserController extends BaseController<AppUserBiz,AppUser> {

    @RequestMapping(value = "/sendMobileCheckCode/{mobile}")
    public ObjectRestResponse sendMobileCheckCode(@PathVariable String mobile){

        return new ObjectRestResponse();
    }

    @RequestMapping(value = "/register")
    public ObjectRestResponse registerAppUser(@ParseParam Param param){

        System.out.println(param.getString("mobile"));
        System.out.println(param.getString("password"));

        return new ObjectRestResponse();
    }

}