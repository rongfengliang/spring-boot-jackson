package com.dalong.jacksonapp;


public class ContextUtil {
    public static  <T extends  MyService> T getBean(Class<T> cls) {
       return JacksonappApplication.applicationContext.getBean(cls);
    }
}
