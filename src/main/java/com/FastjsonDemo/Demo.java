package com.FastjsonDemo;


import com.alibaba.fastjson.JSON;

public class Demo {
    public static void main(String[] args){
        String jsonstring ="{\"@type\":\"com.FastjsonDemo.Person\",\"age\":18,\"name\":\"lili\",\"address\":\"china\",\"properties\":{}}";
        //JSON.parseObject() 方法将 jsonstring 字符串解析并转换为一个通用的 Object 对象
        Object obj = JSON.parseObject(jsonstring, Object.class);
        System.out.println(obj);
    }
}