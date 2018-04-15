package com.pineconecredit.auth.server.controller;

import com.pineconecredit.auth.server.biz.ClientBiz;
import com.pineconecredit.auth.server.entity.Client;
import com.pineconecredit.common.controller.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create By Project Pcc_Microservice
 *
 * @author zrb
 * @date 2018/4/15
 * description
 */
@RestController
@RequestMapping("service")
public class ClientServiceController extends BaseController<ClientBiz,Client> {



}
