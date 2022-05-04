package com.nowcoder.community.util;

import org.apache.commons.lang3.StringUtils;
import org.springframework.util.DigestUtils;

import java.util.UUID;

public class CommunityUtil {
    // 生成随机字符串
    public static String generateUUID(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

    // MD5加密：只能加密，不能解密
    // password + salt(随机字符串，每次都不一样)  --》 加盐后经过MD5加密后破解难度很大，安全性很大
    public static String md5(String key){
        if(StringUtils.isBlank(key)){   //commons.lang3包的方法
            return null;
        }
        return DigestUtils.md5DigestAsHex(key.getBytes());  //spring的工具类
    }
}
