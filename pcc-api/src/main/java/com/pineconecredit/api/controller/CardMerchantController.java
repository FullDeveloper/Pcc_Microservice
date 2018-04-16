package com.pineconecredit.api.controller;

import com.pineconecredit.common.controller.BaseController;
import com.pineconecredit.api.biz.CardMerchantBiz;
import com.pineconecredit.api.entity.CardMerchant;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 卡商主账号信息
 *
 * @author ZhouRunBin
 * @email 1875222156@qq.com
 * @date 2018-04-16 23:11:01
 */

@Controller
@RequestMapping("cardMerchant")
public class CardMerchantController extends BaseController<CardMerchantBiz,CardMerchant> {

}