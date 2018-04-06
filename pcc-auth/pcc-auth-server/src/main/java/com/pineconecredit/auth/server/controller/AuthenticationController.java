package com.pineconecredit.auth.server.controller;

import com.github.pagehelper.PageHelper;
import com.pineconecredit.auth.server.mapper.ClientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ZhouRunBin
 * Date: 2018/4/5 0005
 * Time: 1:30
 * Description:
 */
@Controller
public class AuthenticationController {

    @Autowired
    private ClientMapper clientMapper;

    @RequestMapping(value = "/getClientList")
    @ResponseBody
    public List getClientList(){
        PageHelper.startPage(1,2);
        return clientMapper.selectAll();
    }

}
