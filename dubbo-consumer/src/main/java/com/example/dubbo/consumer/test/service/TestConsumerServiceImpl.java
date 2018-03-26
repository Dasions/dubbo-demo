package com.example.dubbo.consumer.test.service;

import com.example.api.service.TestRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestConsumerServiceImpl implements TestConsumerService{
    @Autowired
    TestRpcService testRpcService;

    @Override
    public void testConsumerService(){
        testRpcService.testService();
    }
}
