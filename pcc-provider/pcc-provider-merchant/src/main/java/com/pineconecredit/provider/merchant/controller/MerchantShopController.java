package com.pineconecredit.provider.merchant.controller;

import com.pineconecredit.common.controller.BaseController;
import com.pineconecredit.provider.merchant.biz.MerchantShopBiz;
import com.pineconecredit.provider.merchant.entity.MerchantShop;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("merchantShop")
public class MerchantShopController extends BaseController<MerchantShopBiz,MerchantShop> {

}