package com.Old;


public class BadClassPerson {
    private String name;
    private int age;
    private String sex;

    public BadClassPerson() {
        System.out.println("构造方法");
    }

    public String getName() {
        System.out.println("getName");
        return name;
    }

    public void setName(String name) {
        System.out.println("setName");
        this.name = name;
    }

    public int getAge() {
        System.out.println("getAge");
        return age;
    }

    public void setAge(int age) {
        System.out.println("setAge");
        this.age = age;
    }
    //在setSex中有一段弹计算器的命令执行代码
    public void setSex(String sex) throws Exception {
        System.out.println("setSex");
        Runtime.getRuntime().exec("open -a /System/Applications/Calculator.app");
    }
}