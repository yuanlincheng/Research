package com.ylc.exam;

/**
 * @author: tree
 * @version: 1.0
 * date: 2018/4/12 21:56
 * @description: xxx
 * own: Aratek
 */
public class p1 {
    public p1() {
        this.test();
    }

    private void test() {  //此处private 改成 public
        System.out.println("parent test");
    }
}

class child extends p1 {
    public child() {
        this.test();
    }

    public void test() {
        System.out.println("child test");
    }
}

class printTest {
    public static void main(String[] args) {
        child child = new child();
//        p1 p1 = new p1();
    }
}