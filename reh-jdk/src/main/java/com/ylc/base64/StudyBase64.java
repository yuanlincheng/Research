package com.ylc.base64;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

/**
 * Created by tree on 2017/6/10.
 */
public class StudyBase64 {
    public static String encodeBase64(String src) throws UnsupportedEncodingException {
        return Base64.getEncoder().encodeToString(src.getBytes("UTF-8"));
    }
    public static String decodeBase64(String src) throws UnsupportedEncodingException {
        return new String(Base64.getDecoder().decode(src),"UTF-8");
    }
}
