package org.dubbo.boot.consumer.service;

import java.util.List;

import org.dubbo.api.DemoService;
import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;

@Service
public class DubboServiceHandler {
  @Reference(url="zookeeper://127.0.0.1:2181", interfaceClass=DemoService.class)
  public DemoService demoService;
  
  public List<String> getCity(){
    return this.demoService.getPermissions(1L);
  }
}
