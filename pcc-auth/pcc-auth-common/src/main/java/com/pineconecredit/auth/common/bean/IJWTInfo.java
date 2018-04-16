package com.pineconecredit.auth.common.bean;

/**
 * Created by IntelliJ IDEA.
 * User: ZhouRunBin
 * Date: 2018/4/5 0005
 * Time: 2:27
 * Description:
 */
public interface IJWTInfo {
    /**
     * 获取登陆手机号
     * @return
     */
    String getPhoneNumber();

    /**
     * 获取全系统唯一账号编号
     * @return
     */
    String getAid();

    /**
     * 获取账号类型
     * @return
     */
    String getAccountType();

}
