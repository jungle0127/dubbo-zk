package org.dubboserver.service;

import org.dubboapi.CityService;
import org.dubboapi.domain.City;

import com.alibaba.dubbo.config.annotation.Service;

@Service(timeout=5000, 
	version="1.0.0",
	application="${dubbo.application.id}",
	registry="${dubbo.registry.id}")
public class CityServiceImpl implements CityService {

	@Override
	public City findCityByName(String cityName) {
		return new City(1L, 1L, "Heze", "My Hometown");
	}

}
