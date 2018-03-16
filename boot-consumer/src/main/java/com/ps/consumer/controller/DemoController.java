package com.ps.consumer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ps.dubbo.api.DemoService;


@RestController
@RequestMapping("/demo")
public class DemoController {
  @Autowired
  private DemoService demoService;
  
  @GetMapping("/permission")
  public List<String> getPermission(){
    return this.demoService.getPermissions(1L);
  }
}
