package com.ylc.exam;

/**
 * @author: tree
 * @version: 1.0
 * date: 2018/4/12 22:09
 * @description: xxx
 * own: Aratek
 */
public class p2 {
    public static void chang1(String string) {
        string = "2";
    }
    public static void chang2(Integer i) {
        i = new Integer(2);
    }
    public static void chang3(int i) {
        i = 2;
    }

    public static void main(String[] args) {
        String str = "1";
        Integer i = new Integer(1);
        int j = 1;
        chang1(str);
        chang2(i);
        chang3(j);
        System.out.println(str);
        System.out.println(i);
        System.out.println(j);
    }
}
