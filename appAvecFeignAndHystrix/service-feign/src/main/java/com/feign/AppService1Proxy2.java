
package com.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "service2-app", fallback = AppService1Proxy2Fallback.class)//Service Id of EmployeeSerach service
public interface AppService1Proxy2 {

    @RequestMapping("/test2")
    String getText2();
}