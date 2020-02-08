package com.startcodingwithdiljish.springcloudconsumer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
@Autowired
private Configuration configuration;

    @GetMapping("/hello-world")
    public String helloWorld(){
        return configuration.getMessage();
    }

}
