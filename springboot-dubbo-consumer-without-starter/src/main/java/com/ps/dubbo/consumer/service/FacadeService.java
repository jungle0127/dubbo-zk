package com.ps.dubbo.consumer.service;

import com.ps.dubbo.api.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacadeService {
    @Autowired
    private DemoService demoService;

    public List<String> permissionList(){
        return this.demoService.getPermissions(1L);
    }
}
