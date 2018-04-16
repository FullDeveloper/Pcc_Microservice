package com.pineconecredit.api.controller;

import com.pineconecredit.common.controller.BaseController;
import com.pineconecredit.api.biz.AuthClientServiceBiz;
import com.pineconecredit.api.entity.AuthClientService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 服务客户端建立关联
 *
 * @author ZhouRunBin
 * @email 1875222156@qq.com
 * @date 2018-04-16 23:11:01
 */

@Controller
@RequestMapping("authClientService")
public class AuthClientServiceController extends BaseController<AuthClientServiceBiz,AuthClientService> {

}