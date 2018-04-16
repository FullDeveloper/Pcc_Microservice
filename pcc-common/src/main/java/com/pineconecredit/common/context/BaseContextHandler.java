package com.pineconecredit.common.context;

import com.pineconecredit.common.constant.CommonConstants;
import com.pineconecredit.common.util.StringHelper;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: ZhouRunBin
 * Date: 2018/4/5 0005
 * Time: 3:05
 * Description:
 */
public class BaseContextHandler {

    public static ThreadLocal<Map<String, Object>> threadLocal = new ThreadLocal<>();


    public static void set(String key, Object value) {
        Map<String, Object> map = threadLocal.get();
        if (map == null) {
            map = new HashMap<String, Object>();
            threadLocal.set(map);
        }
        map.put(key, value);
    }

    public static Object get(String key) {
        Map<String, Object> map = threadLocal.get();
        if (map == null) {
            map = new HashMap<String, Object>();
            threadLocal.set(map);
        }
        return map.get(key);
    }

    public static String getUserID() {
        Object value = get(CommonConstants.CONTEXT_KEY_USER_ID);
        return returnObjectValue(value);
    }

    public static String getUsername() {
        Object value = get(CommonConstants.CONTEXT_KEY_USERNAME);
        return returnObjectValue(value);
    }


    public static String getName() {
        Object value = get(CommonConstants.CONTEXT_KEY_USER_NAME);
        return StringHelper.getObjectValue(value);
    }

    public static String getToken() {
        Object value = get(CommonConstants.CONTEXT_KEY_USER_TOKEN);
        return StringHelper.getObjectValue(value);
    }

    public static void setToken(String token){set(CommonConstants.CONTEXT_KEY_USER_TOKEN,token);}

    public static void setAccountType(String name){set(CommonConstants.CONTEXT_KEY_USER_NAME,name);}

    public static void setAid(String userID){
        set(CommonConstants.CONTEXT_KEY_USER_ID,userID);
    }

    public static void setPhoneNumber(String username){
        set(CommonConstants.CONTEXT_KEY_USERNAME,username);
    }

    public static void remove(){
        threadLocal.remove();
    }

    private static String returnObjectValue(Object value) {
        return value == null ? null : value.toString();
    }


}
