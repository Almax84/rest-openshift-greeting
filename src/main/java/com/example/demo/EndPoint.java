package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class EndPoint {

    @GetMapping("/greeting")
    public String greeting() throws UnknownHostException {

        return "hello there from:"+ InetAddress.getLocalHost().getHostAddress();
    }

}
