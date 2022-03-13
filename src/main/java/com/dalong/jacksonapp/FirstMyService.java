package com.dalong.jacksonapp;

import org.springframework.stereotype.Service;

@Service
public class FirstMyService  implements  MyService<FirstUser> {

    @Override
    public String demo(FirstUser firstUser) {
        return MyService.super.demo(firstUser);
    }
}
