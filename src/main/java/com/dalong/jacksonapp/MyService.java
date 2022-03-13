package com.dalong.jacksonapp;

public interface MyService<T extends  MyUser> {
     default String demo(T t){
      return   t.token();
    }
}
