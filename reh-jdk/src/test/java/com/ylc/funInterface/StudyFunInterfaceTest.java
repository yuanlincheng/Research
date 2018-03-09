package com.ylc.funInterface;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by tree on 2017/6/10.
 */
public class StudyFunInterfaceTest {

    static StudyFunInterface sfi = new StudyFunInterface();

    @Test
    public void testValidFInput() throws Exception {
        Assert.assertEquals("master",StudyFunInterface.validFInput("ylc", name -> name.equals("ylc")?"master" : name));
        Assert.assertEquals("输入的字符串不能为空",StudyFunInterface.validFInput("", name -> name.isEmpty()?"输入的字符串不能为空" : name));
        Assert.assertEquals("输入的字符串过长",StudyFunInterface.validFInput("abcdf", name -> name.length()>3?"输入的字符串过长" : name));
    }

    @Test
    public void testValidCInput() throws Exception {
        String name1 = "ylc";
    }

    @Test
    public void testValidPInput() throws Exception {
        Assert.assertTrue(StudyFunInterface.validPInput("ylc", name -> name.equals("ylc")));
        Assert.assertTrue(StudyFunInterface.validPInput("", name -> name.isEmpty()));
        Assert.assertTrue(StudyFunInterface.validPInput("abcdf", name -> name.length()>3));
    }
}