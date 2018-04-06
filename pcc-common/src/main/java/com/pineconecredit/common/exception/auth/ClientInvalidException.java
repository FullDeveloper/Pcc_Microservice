package com.pineconecredit.common.exception.auth;

import com.pineconecredit.common.constant.CommonConstants;
import com.pineconecredit.common.exception.BaseException;

/**
 * Created by IntelliJ IDEA.
 * User: ZhouRunBin
 * Date: 2018/4/5 0005
 * Time: 2:55
 * Description:
 */
public class ClientInvalidException extends BaseException {
    public ClientInvalidException(String message) {
        super(message, CommonConstants.EX_CLIENT_INVALID_CODE);
    }
}