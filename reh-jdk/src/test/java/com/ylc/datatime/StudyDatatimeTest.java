package com.ylc.datatime;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by tree on 2017/6/11.
 */
public class StudyDatatimeTest {

    StudyDatatime studyDatatime = new StudyDatatime();

    @Test
    public void testGetMillis() throws Exception {
        Assert.assertNotNull(studyDatatime.getMillis());
    }
}