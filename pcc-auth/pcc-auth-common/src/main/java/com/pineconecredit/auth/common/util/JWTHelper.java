package com.pineconecredit.auth.common.util;

import com.pineconecredit.auth.common.bean.IJWTInfo;
import com.pineconecredit.auth.common.bean.JWTInfo;
import com.pineconecredit.auth.common.constant.CommonConstants;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;

/**
 * Created by IntelliJ IDEA.
 * User: ZhouRunBin
 * Date: 2018/4/5 0005
 * Time: 2:29
 * Description:
 */
public class JWTHelper {

    private static RsaKeyHelper rsaKeyHelper = new RsaKeyHelper();

    /**
     * 公钥解析token
     *
     * @param token
     * @return
     * @throws Exception
     */
    public static Jws<Claims> parserToken(String token, byte[] pubKey) throws Exception {
        Jws<Claims> claimsJws = Jwts.parser().setSigningKey(rsaKeyHelper.getPublicKey(pubKey)).parseClaimsJws(token);
        return claimsJws;
    }

    /**
     * 获取token中的用户信息
     *
     * @param token
     * @param pubKey
     * @return
     * @throws Exception
     */
    public static IJWTInfo getInfoFromToken(String token, byte[] pubKey) throws Exception {
        Jws<Claims> claimsJws = parserToken(token, pubKey);
        Claims body = claimsJws.getBody();
        return new JWTInfo(body.getSubject(), StringHelper.getObjectValue(body.get(CommonConstants.JWT_KEY_USER_ID)),
                StringHelper.getObjectValue(body.get(CommonConstants.JWT_KEY_NAME)));
    }

}
