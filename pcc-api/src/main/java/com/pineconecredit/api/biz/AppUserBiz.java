package com.pineconecredit.api.biz;

import org.springframework.stereotype.Service;

import com.pineconecredit.api.entity.AppUser;
import com.pineconecredit.api.mapper.AppUserMapper;
import com.pineconecredit.common.biz.BaseBiz;

/**
 * 移动端用户
 *
 * @author ZhouRunBin
 * @email 1875222156@qq.com
 * @date 2018-04-16 23:11:01
 */
@Service
public class AppUserBiz extends BaseBiz<AppUserMapper,AppUser> {
}