package com.pineconecredit.auth.client.interceptor;

import com.pineconecredit.auth.client.annotation.IgnoreUserToken;
import com.pineconecredit.auth.client.config.UserAuthConfig;
import com.pineconecredit.auth.client.jwt.UserAuthUtil;
import com.pineconecredit.auth.common.bean.IJWTInfo;
import com.pineconecredit.common.context.BaseContextHandler;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Create By Project Pcc_Microservice
 *
 * @author zrb
 * @date 2018/4/15
 * description
 */
public class UserAuthInterceptor extends HandlerInterceptorAdapter {
    @Autowired
    private UserAuthConfig userAuthConfig;
    @Autowired
    private UserAuthUtil userAuthUtil;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        // 配置该注解，说明不进行用户拦截
        IgnoreUserToken annotation = handlerMethod.getBeanType().getAnnotation(IgnoreUserToken.class);
        if (annotation == null) {
            annotation = handlerMethod.getMethodAnnotation(IgnoreUserToken.class);
        }
        if (annotation != null) {
            return super.preHandle(request, response, handler);
        }
        String token = request.getHeader(userAuthConfig.getTokenHeader());

        if (StringUtils.isEmpty(token)) {
            if (request.getCookies() != null) {
                for (Cookie cookie : request.getCookies()) {
                    if (cookie.getName().equals(userAuthConfig.getTokenHeader())) {
                        token = cookie.getValue();
                    }
                }
            }
        }
        IJWTInfo infoFromToken = userAuthUtil.getInfoFromToken(token);
        BaseContextHandler.setPhoneNumber(infoFromToken.getPhoneNumber());
        BaseContextHandler.setAccountType(infoFromToken.getAccountType());
        BaseContextHandler.setAid(infoFromToken.getAid());
        return super.preHandle(request, response, handler);
    }

}
