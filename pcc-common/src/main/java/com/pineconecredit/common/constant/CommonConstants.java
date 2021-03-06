package com.pineconecredit.common.constant;

/**
 * Created by IntelliJ IDEA.
 * User: ZhouRunBin
 * Date: 2018/4/5 0005
 * Time: 2:18
 * Description:
 */
public class CommonConstants {

    public static final Integer EX_OTHER_CODE = 500;

    // 客户端token异常
    public static final Integer EX_CLIENT_INVALID_CODE = 403001;
    // 用户token异常
    public static final Integer EX_USER_INVALID_CODE = 401001;
    //客户端是禁止异常
    public static final Integer EX_CLIENT_FORBIDDEN_CODE = 403031;

    public static final String CONTEXT_KEY_USER_ID = "currentAid";
    public static final String CONTEXT_KEY_USERNAME = "currentPhoneNumber";
    public static final String CONTEXT_KEY_USER_NAME = "currentAccountType";
    public static final String CONTEXT_KEY_USER_TOKEN = "currentUserToken";

}
