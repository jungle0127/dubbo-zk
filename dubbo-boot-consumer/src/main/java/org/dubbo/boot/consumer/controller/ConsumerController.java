package org.dubbo.boot.consumer.controller;

import java.util.List;

import org.dubbo.boot.consumer.service.DubboServiceHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/consumer")
public class ConsumerController {
  @Autowired
  private DubboServiceHandler handler;
  
  @GetMapping("/city")
  public List<String> getCity() {
    return this.handler.getCity();
  }
}
