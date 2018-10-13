package com.ps.dubbo.consumer.controller;

import java.util.List;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ps.dubbo.api.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/consumer")
public class ConsumerController {
  @Reference(
          version = "1.0.0",
          application = "${dubbo.application.id}",
          url = "dubbo://127.0.0.1:21810"
  )
  private DemoService demoService;
  
  @GetMapping("/city")
  public List<String> getCity() {
    return demoService.getPermissions(1L);
  }
}
