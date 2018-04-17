package com.pineconecredit.common.resolver;

import com.pineconecredit.common.annotation.ParseParam;
import com.pineconecredit.common.bean.Param;
import com.pineconecredit.common.helper.RequestHelper;
import com.pineconecredit.common.helper.UploadHelper;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import javax.servlet.http.HttpServletRequest;

/**
 * Create By Project Pcc_Microservice
 *
 * @author zrb
 * @date 2018/4/17
 * description
 */
public class FileFieldParamResolver implements HandlerMethodArgumentResolver {

    @Override
    public boolean supportsParameter(MethodParameter methodParameter) {
        return methodParameter.hasParameterAnnotation(ParseParam.class);
    }

    @Override
    public Object resolveArgument(MethodParameter methodParameter,
                                  ModelAndViewContainer modelAndViewContainer,
                                  NativeWebRequest webRequest,
                                  WebDataBinderFactory webDataBinderFactory) throws Exception {
        HttpServletRequest request = webRequest.getNativeRequest(HttpServletRequest.class);
        Param param;
        if (UploadHelper.isMultipart(request)) {
            param = UploadHelper.createParamByMultipart(request);
        } else {
            param = RequestHelper.createParam(request);
        }
        return param;
    }
}
