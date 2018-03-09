package com.ylc.lambda;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by tree on 2017/6/11.
 */
public class StudyLambdaTest {

    StudyLambda studyLambda = new StudyLambda();

    @Test
    public void testCompareLambda() throws Exception {
        Assert.assertNotNull(studyLambda.compareLambda(Arrays.asList("b","a","c")));
    }
}