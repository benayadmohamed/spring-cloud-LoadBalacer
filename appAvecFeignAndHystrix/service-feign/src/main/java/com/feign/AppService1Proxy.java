
package com.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "service1-app")//Service Id of EmployeeSerach service
public interface AppService1Proxy {

    @RequestMapping("/test")
    String getText();
}