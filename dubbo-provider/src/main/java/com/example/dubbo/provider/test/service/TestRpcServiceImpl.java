package com.example.dubbo.provider.test.service;

import com.example.api.service.TestRpcService;
import org.springframework.stereotype.Service;

public class TestRpcServiceImpl implements TestRpcService {
    @Override
    public void testService() {
        System.out.println("test");
    }
}
