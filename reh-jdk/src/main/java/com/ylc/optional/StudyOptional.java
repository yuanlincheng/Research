package com.ylc.optional;

import java.util.Optional;

/**
 * Created by tree on 2017/6/11.
 */
public class StudyOptional {
    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable(null);
        System.out.println(optional.isPresent());
        System.out.println(optional.orElse("none"));
        System.out.println(optional.map(n -> "mapN").orElse("nothing"));
    }
}
