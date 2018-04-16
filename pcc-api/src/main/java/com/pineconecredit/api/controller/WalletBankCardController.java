package com.pineconecredit.api.rest;

import com.pineconecredit.common.controller.BaseController;
import com.pineconecredit.api.biz.WalletBankCardBiz;
import com.pineconecredit.api.entity.WalletBankCard;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 银行卡账户
 *
 * @author ZhouRunBin
 * @email 1875222156@qq.com
 * @date 2018-04-16 23:30:47
 */

@Controller
@RequestMapping("walletBankCard")
public class WalletBankCardController extends BaseController<WalletBankCardBiz,WalletBankCard> {

}