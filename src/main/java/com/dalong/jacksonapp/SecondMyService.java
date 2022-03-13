package com.dalong.jacksonapp;

import org.springframework.stereotype.Service;

@Service
public class SecondMyService  implements  MyService<SecondUser> {
    @Override
    public String demo(SecondUser secondUser) {
        return MyService.super.demo(secondUser);
    }
}