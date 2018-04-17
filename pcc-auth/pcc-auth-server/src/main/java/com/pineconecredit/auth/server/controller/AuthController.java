package com.pineconecredit.auth.server.controller;

import com.github.pagehelper.PageHelper;
import com.pineconecredit.auth.server.bean.JwtAuthenticationRequest;
import com.pineconecredit.auth.server.bean.JwtAuthenticationResponse;
import com.pineconecredit.auth.server.mapper.ClientMapper;
import com.pineconecredit.auth.server.service.AuthService;
import com.pineconecredit.common.result.ObjectRestResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ZhouRunBin
 * Date: 2018/4/5 0005
 * Time: 1:30
 * Description:
 */
@Controller
@Slf4j
@RequestMapping(value = "/jwt")
public class AuthController {

    @Value("${jwt.token-header}")
    private String tokenHeader;

    @Autowired
    private AuthService authService;

    @RequestMapping(value = "/app/token", method = RequestMethod.POST)
    public ResponseEntity<?> createAppAuthenticationToken(
            @RequestBody JwtAuthenticationRequest authenticationRequest) throws Exception {
        log.info(authenticationRequest.getPhoneNumber()+" require logging...");
        final String token = authService.validateForApp(authenticationRequest);
        return ResponseEntity.ok(new JwtAuthenticationResponse(token));
    }

    @RequestMapping(value = "/card-merchant/token", method = RequestMethod.POST)
    public ResponseEntity<?> createCardMerchantAuthenticationToken(
            @RequestBody JwtAuthenticationRequest authenticationRequest) throws Exception {
        log.info(authenticationRequest.getPhoneNumber()+" require logging...");
        final String token = authService.validateForCardMerchant(authenticationRequest);
        return ResponseEntity.ok(new JwtAuthenticationResponse(token));
    }

    @RequestMapping(value = "/merchant/token", method = RequestMethod.POST)
    public ResponseEntity<?> createMerchantAuthenticationToken(
            @RequestBody JwtAuthenticationRequest authenticationRequest) throws Exception {
        log.info(authenticationRequest.getPhoneNumber()+" require logging...");
        final String token = authService.validateForMerchant(authenticationRequest);
        return ResponseEntity.ok(new JwtAuthenticationResponse(token));
    }

    @RequestMapping(value = "/platform/token", method = RequestMethod.POST)
    public ResponseEntity<?> createPlatformAuthenticationToken(
            @RequestBody JwtAuthenticationRequest authenticationRequest) throws Exception {
        log.info(authenticationRequest.getPhoneNumber()+" require logging...");
        final String token = authService.validateForPlatform(authenticationRequest);
        return ResponseEntity.ok(new JwtAuthenticationResponse(token));
    }

    @RequestMapping(value = "refresh", method = RequestMethod.GET)
    public ResponseEntity<?> refreshAndGetAuthenticationToken(
            HttpServletRequest request) {
        String token = request.getHeader(tokenHeader);
        String refreshedToken = authService.refresh(token);
        if(refreshedToken == null) {
            return ResponseEntity.badRequest().body(null);
        } else {
            return ResponseEntity.ok(new JwtAuthenticationResponse(refreshedToken));
        }
    }

    @RequestMapping(value = "verify", method = RequestMethod.GET)
    public ResponseEntity<?> verify(String token) throws Exception {
        authService.validate(token);
        return ResponseEntity.ok(true);
    }

    @RequestMapping(value = "invalid", method = RequestMethod.POST)
    public ResponseEntity<?> invalid(String token){
        authService.invalid(token);
        return ResponseEntity.ok(true);
    }


}
