package com.pineconecredit.api.biz;

import org.springframework.stereotype.Service;

import com.pineconecredit.api.entity.AccountPayLog;
import com.pineconecredit.api.mapper.AccountPayLogMapper;
import com.pineconecredit.common.biz.BaseBiz;

/**
 * 账户资金流水表
 *
 * @author ZhouRunBin
 * @email 1875222156@qq.com
 * @date 2018-04-16 23:30:47
 */
@Service
public class AccountPayLogBiz extends BaseBiz<AccountPayLogMapper,AccountPayLog> {
}