package com.ps.provider.service;

import java.util.ArrayList;
import java.util.List;

import org.dubbo.api.DemoService;

import com.alibaba.dubbo.config.annotation.Service;

@Service(version = "1.0.0", application = "${dubbo.application.id}",
    protocol = "${dubbo.protocol.id}", registry = "${dubbo.registry.id}")
public class DefaultDemoService implements DemoService {

  @Override
  public List<String> getPermissions(Long id) {
    List<String> demo = new ArrayList<String>();
    demo.add(String.format("Permission_%d", id - 1));
    demo.add(String.format("Permission_%d", id));
    demo.add(String.format("Permission_%d", id + 1));
    return demo;
  }

}
