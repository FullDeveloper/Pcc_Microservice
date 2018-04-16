package com.pineconecredit.api.biz;

import org.springframework.stereotype.Service;

import com.pineconecredit.api.entity.Account;
import com.pineconecredit.api.mapper.AccountMapper;
import com.pineconecredit.common.biz.BaseBiz;

/**
 * 基础账号表
 *
 * @author ZhouRunBin
 * @email 1875222156@qq.com
 * @date 2018-04-16 23:30:47
 */
@Service
public class AccountBiz extends BaseBiz<AccountMapper,Account> {
}