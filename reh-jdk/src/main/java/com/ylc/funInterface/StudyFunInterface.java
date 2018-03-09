package com.ylc.funInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by tree on 2017/6/10.
 */
public class StudyFunInterface {

    public static String validFInput(String name, Function<String, String> function) {
        return function.apply(name);
    }

    public static void validCInput(String name,Consumer<String> function) {
        function.accept(name);
    }

    public static boolean validPInput(String name,Predicate<String> function) {
        return function.test(name);
    }
}
