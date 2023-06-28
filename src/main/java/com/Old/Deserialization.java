package com.Old;

import com.alibaba.fastjson.JSON;

public class Deserialization {
    public static void main(String[] args) {
        String jsonString ="{\"@type\":\"BadClassPerson\",\"age\":80,\"name\":\"lili\",\"sex\":\"man\"}";
        System.out.println(JSON.parseObject(jsonString));
    }
}