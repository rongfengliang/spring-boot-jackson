package com.dalong.jacksonapp;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyApi {
    @RequestMapping(value = {"/demoapp"})
    public  Object demo(@RequestBody MyUser myUser){
       return ContextUtil.getBean(myUser.serviceType()).demo(myUser);
    }
}
