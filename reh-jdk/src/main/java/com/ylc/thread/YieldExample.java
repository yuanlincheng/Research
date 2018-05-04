package com.ylc.thread;

/**
 * @author: tree
 * @version: 1.0
 * date: 2018/4/18 18:42
 * @description: 理论上，yield意味着放手，放弃，投降。一个调用yield()方法的线程告诉虚拟机它乐意让其他线程占用自己的位置。这表明该线程没有在做一些紧急的事情。
 * own: Aratek
 */
public class YieldExample {
    public static void main(String[] args) {
        Thread producer = new Producer();
        Thread customer = new Customer();

        producer.start();
        customer.start();
    }

    static class Producer extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("I am producer : " + i);
//                Producer.yield();
            }
        }
    }

    static class Customer extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("I am customer : " + i);
//                Customer.yield();
            }
        }
    }
}
