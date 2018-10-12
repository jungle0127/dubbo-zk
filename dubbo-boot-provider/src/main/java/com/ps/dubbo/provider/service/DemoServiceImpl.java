package com.ps.dubbo.provider.service;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.dubbo.config.annotation.Service;
import com.ps.dubbo.api.DemoService;
import org.springframework.stereotype.Component;


@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
@Component
public class DemoServiceImpl implements DemoService {
    @Override
    public List<String> getPermissions(Long id) {
        List<String> demo = new ArrayList<String>();
        demo.add(String.format("Permission_%d", id - 1));
        demo.add(String.format("Permission_%d", id));
        demo.add(String.format("Permission_%d", id + 1));
        return demo;
    }
}
