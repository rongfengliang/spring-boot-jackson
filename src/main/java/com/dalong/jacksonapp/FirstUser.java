package com.dalong.jacksonapp;

import lombok.Data;

@Data
public class FirstUser implements MyUser<FirstUser>{
    private String name;
    private int age;
    @Override
    public String token() {
        return String.format("FirstUser-%d-%s",this.age,this.name);
    }

    @Override
    public FirstUser instance() {
        return this;
    }

    @Override
    public Class serviceType() {
        return FirstMyService.class;
    }
}
