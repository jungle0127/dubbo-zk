package org.dubboserver.service;

import org.dubboapi.CityService;
import org.dubboapi.domain.City;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;

@Service(version = "${demo.service.version}", application = "${dubbo.application.id}", protocol = "${dubbo.protocol.id}", registry = "${dubbo.registry.id}")
@Component
public class CityServiceImpl implements CityService {

	@Override
	public City findCityByName(String cityName) {
		return new City(1L, 1L, "Heze", "My Hometown");
	}

}
