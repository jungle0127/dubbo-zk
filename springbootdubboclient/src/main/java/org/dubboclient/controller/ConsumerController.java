package org.dubboclient.controller;

import org.dubboapi.CityService;
import org.dubboapi.domain.City;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;

@RestController(value="/rest")
public class ConsumerController {
  @Reference(version="1.0.0")
  private CityService cityService;
  @GetMapping("/demo")
  public City findCityByName() {
    return this.cityService.findCityByName("");
  }
}
