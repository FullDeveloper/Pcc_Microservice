package com.pineconecredit.api.rest;

import com.pineconecredit.common.controller.BaseController;
import com.pineconecredit.api.biz.AppUserBiz;
import com.pineconecredit.api.entity.AppUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 移动端用户
 *
 * @author ZhouRunBin
 * @email 1875222156@qq.com
 * @date 2018-04-16 23:30:47
 */

@Controller
@RequestMapping("appUser")
public class AppUserController extends BaseController<AppUserBiz,AppUser> {

}