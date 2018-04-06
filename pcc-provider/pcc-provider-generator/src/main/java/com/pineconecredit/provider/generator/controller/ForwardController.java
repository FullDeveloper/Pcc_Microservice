package com.pineconecredit.provider.generator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * User: ZhouRunBin
 * Date: 2018/4/5 0005
 * Time: 11:50
 * Description:
 */
@Controller
public class ForwardController {

    @RequestMapping(value = "/{page}")
    public String forward(@PathVariable String page) {
        return page;
    }

    @RequestMapping(value = "/generator/{page}")
    public String generator(@PathVariable String page) {
        return "generator/" + page;
    }

}
