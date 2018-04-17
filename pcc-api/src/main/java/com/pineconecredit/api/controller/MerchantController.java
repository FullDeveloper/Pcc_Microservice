package com.pineconecredit.api.controller;

import com.pineconecredit.common.controller.BaseController;
import com.pineconecredit.api.biz.MerchantBiz;
import com.pineconecredit.api.entity.Merchant;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 商户主账号
 *
 * @author ZhouRunBin
 * @email 1875222156@qq.com
 * @date 2018-04-16 23:30:47
 */

@Controller
@RequestMapping("merchant")
public class MerchantController extends BaseController<MerchantBiz,Merchant> {

}