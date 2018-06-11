package org.dubboclient.controller;

import org.dubboapi.CityService;
import org.dubboapi.domain.City;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;

@RestController()
@RequestMapping("/dubbo")
public class ConsumerController {
	@Reference(version = "${demo.service.version}", application = "${dubbo.application.id}", url = "dubbo://localhost:12345")
	private CityService cityService;

	@GetMapping("/demo")
	public City findCityByName() {
		return this.cityService.findCityByName("");
	}
}
