package com.pineconecredit.api.controller;

import com.pineconecredit.common.controller.BaseController;
import com.pineconecredit.api.biz.FinancialAccountBiz;
import com.pineconecredit.api.entity.FinancialAccount;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 资金账户表
 *
 * @author ZhouRunBin
 * @email 1875222156@qq.com
 * @date 2018-04-16 23:30:47
 */

@Controller
@RequestMapping("financialAccount")
public class FinancialAccountController extends BaseController<FinancialAccountBiz,FinancialAccount> {

}