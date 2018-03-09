package com.ylc.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by tree on 2017/6/13.
 */
public class DifferTwoList {
    public static List<Student> rebuiltObjList(List<Student> firstList,List<Student> secondList) {
        List<Student> totalList = new ArrayList<>();

        List<Student> sameList = new ArrayList<>();
        List<Student> fHaveList = new ArrayList<>();
        List<Student> sHaveList = new ArrayList<>();

        firstList.parallelStream().forEach(x -> {
            secondList.parallelStream().filter(y -> y.getId().equals(x.getId()) && y.getName().equals(x.getName())).forEach(m ->sameList.add(m));
        });
      //  sameList.stream().map(x -> x.getId() + x.getName()).forEach(System.out::println);

        fHaveList = firstList.parallelStream().filter(x -> !sameList.contains(x)).collect(Collectors.toList());
//        fHaveList.stream().map(x -> x.getId() + x.getName()).forEach(System.out::println);
        sHaveList = secondList.parallelStream().filter(x -> !sameList.contains(x)).collect(Collectors.toList());
//        sHaveList.stream().map(x -> x.getId() + x.getName()).forEach(System.out::println);
        totalList.addAll(sameList);
        totalList.addAll(fHaveList);
        totalList.addAll(sHaveList);
        totalList.stream().map(x -> x.getId() + x.getName()).forEach(System.out::println);
        return totalList;
    }
}

class Student{

    protected String id;
    protected String name;
    protected int sex;
    protected int age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if(this.getId().equals(((Student)obj).getId()) && this.getName().equals(((Student)obj).getName())){
            return true;
        }else {
            return  false;
        }
    }
}
