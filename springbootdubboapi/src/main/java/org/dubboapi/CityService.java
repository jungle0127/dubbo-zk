package org.dubboapi;

import org.dubboapi.domain.City;

public interface CityService {
	City findCityByName(String cityName);
}
