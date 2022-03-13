package com.dalong.jacksonapp;

import lombok.Data;

@Data
public class SecondUser implements MyUser<SecondUser>{
    private String name;
    private int age;

    @Override
    public String token() {
        return String.format("SecondUser-%d-%s",this.age,this.name);
    }

    @Override
    public SecondUser instance() {
        return this;
    }

    @Override
    public Class serviceType() {
        return SecondMyService.class;
    }
}
