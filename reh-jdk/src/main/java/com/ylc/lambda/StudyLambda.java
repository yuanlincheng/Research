package com.ylc.lambda;

import java.util.List;

/**
 * Created by tree on 2017/6/11.
 */
public class StudyLambda {
    public List<String> compareLambda(List<String> list) {
        list.sort((a,b) -> a.compareTo(b));
        return list;
    }
}
