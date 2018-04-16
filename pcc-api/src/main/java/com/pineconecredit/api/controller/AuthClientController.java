package com.pineconecredit.api.controller;

import com.pineconecredit.common.controller.BaseController;
import com.pineconecredit.api.biz.AuthClientBiz;
import com.pineconecredit.api.entity.AuthClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 认证客户端
 *
 * @author ZhouRunBin
 * @email 1875222156@qq.com
 * @date 2018-04-16 23:11:01
 */

@Controller
@RequestMapping("authClient")
public class AuthClientController extends BaseController<AuthClientBiz,AuthClient> {

}