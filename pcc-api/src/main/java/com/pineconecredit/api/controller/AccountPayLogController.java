package com.pineconecredit.api.controller;

import com.pineconecredit.common.controller.BaseController;
import com.pineconecredit.api.biz.AccountPayLogBiz;
import com.pineconecredit.api.entity.AccountPayLog;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 账户资金流水表
 *
 * @author ZhouRunBin
 * @email 1875222156@qq.com
 * @date 2018-04-16 23:30:47
 */

@Controller
@RequestMapping("accountPayLog")
public class AccountPayLogController extends BaseController<AccountPayLogBiz,AccountPayLog> {

}