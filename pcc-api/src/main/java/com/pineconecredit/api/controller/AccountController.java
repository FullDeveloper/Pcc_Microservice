package com.pineconecredit.api.controller;

import com.pineconecredit.common.controller.BaseController;
import com.pineconecredit.api.biz.AccountBiz;
import com.pineconecredit.api.entity.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 基础账号表
 *
 * @author ZhouRunBin
 * @email 1875222156@qq.com
 * @date 2018-04-16 23:11:01
 */

@Controller
@RequestMapping("account")
public class AccountController extends BaseController<AccountBiz,Account> {

}