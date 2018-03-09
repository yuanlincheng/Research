package com.ylc.lambda;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tree on 2017/6/13.
 */
public class DifferTwoListTest {

    @Test
    public void testRebuiltObjList() throws Exception {
        List<Student> firstList = new ArrayList<>();
        Student s1 = new Student();
        s1.setId("1");
        s1.setName("ylc");
        s1.setAge(36);
        s1.setSex(1);
        Student s2 = new Student();
        s2.setId("2");
        s2.setName("zs");
        s2.setAge(24);
        s2.setSex(1);
        Student s3= new Student();
        s3.setId("1");
        s3.setName("ls");
        s3.setAge(58);
        s3.setSex(2);
        firstList.add(s1);
        firstList.add(s2);
        firstList.add(s3);

        List<Student> secondList = new ArrayList<>();
        Student s4 = new Student();
        s4.setId("1");
        s4.setName("ylc");
        s4.setAge(36);
        s4.setSex(1);
        Student s5 = new Student();
        s5.setId("2");
        s5.setName("zs");
        s5.setAge(24);
        s5.setSex(1);
        Student s6= new Student();
        s6.setId("1");
        s6.setName("ls1");
        s6.setAge(58);
        s6.setSex(2);
        secondList.add(s4);
        secondList.add(s5);
        secondList.add(s6);

        Assert.assertNotNull(DifferTwoList.rebuiltObjList(firstList,secondList));
    }
}