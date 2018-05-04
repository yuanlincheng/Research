package com.ylc.exam;

import java.io.*;
import java.lang.reflect.InvocationTargetException;

/**
 * @author: tree
 * @version: 1.0
 * date: 2018/4/20 18:46
 * @description: 创建几种JAVA对象的方式
 * own: Aratek
 */
public class CreateObject {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, CloneNotSupportedException, IOException {
        //new关键字创建  最常见的方式
        Cat cat = new Cat("cat0");
        cat.hello();
        //利用class类的newInstance方法创建
        Cat cat1 = (Cat) Class.forName("com.ylc.exam.Cat").newInstance();
        cat1.hello();
        Cat cat2 = Cat.class.newInstance();
        cat2.hello();
        //利用反射包里的Constructor类里的  此种方式可以调用私有构造方法和带参的构造函数
//        Cat cat3 = Cat.class.getConstructor().newInstance();
        Cat cat3 = Cat.class.getDeclaredConstructor(new Class[]{String.class}).newInstance(new Object[]{"cat3"});
        cat3.hello();
        //使用clone
        Cat cat4 = (Cat) cat3.clone();
        cat4.hello();
        //采用反序列化的方式
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.obj"));
        Cat cat5 = (Cat) ois.readObject();
        cat5.hello();
    }
}

class Cat implements Cloneable,Serializable{

    private String name;

    public Cat() {
        name = "default";
    }

    public Cat(String name) {
        this.name = name;
    }

    public void hello() {
        System.out.println("Hello " + name);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}