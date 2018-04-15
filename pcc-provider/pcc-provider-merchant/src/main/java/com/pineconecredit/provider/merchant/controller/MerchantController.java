package com.pineconecredit.provider.merchant.controller;

import com.pineconecredit.common.controller.BaseController;
import com.pineconecredit.provider.merchant.biz.MerchantBiz;
import com.pineconecredit.provider.merchant.entity.Merchant;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("merchant")
public class MerchantController extends BaseController<MerchantBiz,Merchant> {

}