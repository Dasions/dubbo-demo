package com.example.dubbo.consumer.test.controlller;

import com.example.dubbo.consumer.test.service.TestConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestConsumerController {

    @Autowired
    TestConsumerService testConsumerService;

    @GetMapping("/test")
    public String testConsumerController(){
        testConsumerService.testConsumerService();
        return "SUCCESS";
    }

}
