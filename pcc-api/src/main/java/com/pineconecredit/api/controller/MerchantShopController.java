package com.pineconecredit.api.rest;

import com.pineconecredit.common.controller.BaseController;
import com.pineconecredit.api.biz.MerchantShopBiz;
import com.pineconecredit.api.entity.MerchantShop;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 商户名下门店/电商表
 *
 * @author ZhouRunBin
 * @email 1875222156@qq.com
 * @date 2018-04-16 23:30:47
 */

@Controller
@RequestMapping("merchantShop")
public class MerchantShopController extends BaseController<MerchantShopBiz,MerchantShop> {

}