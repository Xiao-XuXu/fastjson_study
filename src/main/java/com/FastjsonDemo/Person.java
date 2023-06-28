package com.FastjsonDemo;

import java.util.Properties;

//创建一个普通类
public class Person {
    private String name;
    private int age;
    private String sex;
    private Properties properties;

    public Person() {
        System.out.println("构造方法");
    }

    //Setter Getter方法
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

    public String getSex(){
        System.out.println("getAddress");
        return sex;
    }

    public Properties getProperties() throws Exception {
        System.out.println("getProperties");
        Runtime.getRuntime().exec("open -a /System/Applications/Calculator.app");
        return properties;
    }
}