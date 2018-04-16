package com.pineconecredit.api.biz;

import org.springframework.stereotype.Service;

import com.pineconecredit.api.entity.AuthClient;
import com.pineconecredit.api.mapper.AuthClientMapper;
import com.pineconecredit.common.biz.BaseBiz;

/**
 * 认证客户端
 *
 * @author ZhouRunBin
 * @email 1875222156@qq.com
 * @date 2018-04-16 23:11:01
 */
@Service
public class AuthClientBiz extends BaseBiz<AuthClientMapper,AuthClient> {
}