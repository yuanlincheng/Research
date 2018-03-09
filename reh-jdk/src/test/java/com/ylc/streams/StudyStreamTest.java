package com.ylc.streams;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by tree on 2017/6/11.
 */
public class StudyStreamTest {

    StudyStream studyStream;

    @Before
    public void setUp() throws Exception {
        studyStream = new StudyStream();
    }

    @Test
    public void testReadFileContent() throws Exception {
        Assert.assertTrue(studyStream.readFileContent("D://sdf.txt"));
    }
}