package com.feign;

import org.springframework.stereotype.Component;

@Component
public class AppService1Proxy2Fallback implements AppService1Proxy2 {
    @Override
    public String getText2() {
        return "HHHHHHHHHHH jma3Rassak";
    }
}
