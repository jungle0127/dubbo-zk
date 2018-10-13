package com.ps.dubbo.consumer.controller;

import com.ps.dubbo.api.DemoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ConsumerController {
    @Autowired
    private DemoService demoService;

    public List<String> getCity() {
        return demoService.getPermissions(1L);
    }
}
