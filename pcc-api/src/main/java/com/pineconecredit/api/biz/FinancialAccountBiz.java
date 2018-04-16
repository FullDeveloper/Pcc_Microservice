package com.pineconecredit.api.biz;

import org.springframework.stereotype.Service;

import com.pineconecredit.api.entity.FinancialAccount;
import com.pineconecredit.api.mapper.FinancialAccountMapper;
import com.pineconecredit.common.biz.BaseBiz;

/**
 * 资金账户表
 *
 * @author ZhouRunBin
 * @email 1875222156@qq.com
 * @date 2018-04-16 23:30:47
 */
@Service
public class FinancialAccountBiz extends BaseBiz<FinancialAccountMapper,FinancialAccount> {
}