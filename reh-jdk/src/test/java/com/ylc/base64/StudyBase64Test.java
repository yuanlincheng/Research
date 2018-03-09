package com.ylc.base64;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by tree on 2017/6/10.
 */
public class StudyBase64Test {

    private StudyBase64 sb = new StudyBase64();

    @Test
    public void testEncodeBase64() throws Exception {
        String src = "ylc";
        assertEquals("eWxj", sb.encodeBase64(src));
    }

    @Test
    public void testDecodeBase64() throws Exception {
        String src = "eWxj";
        assertEquals("ylc", sb.decodeBase64(src));
    }
}