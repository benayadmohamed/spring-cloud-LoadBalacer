package com.feign;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class MyController {
    @Autowired
    AppService1Proxy appService1Proxy;
//    @Qualifier("appService1Proxy2Fallback")
    @Autowired
    AppService1Proxy2 appService1Proxy2;

    @HystrixCommand(fallbackMethod = "fallback",
            commandProperties = {@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")})
    @RequestMapping("")
    public String test() {
        return appService1Proxy.getText();
    }

    @RequestMapping("test2")
    public String test2() {
        return appService1Proxy2.getText2();
    }

    public String fallback() {
        return "nod 3Laslamtak";
    }
}
