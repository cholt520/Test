package dao;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import entity.Weather;

public class WeatherDaoImpl extends HibernateDaoSupport implements WeatherDao{

	@Override
	public Weather getWeatherById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addWeather(Weather weather) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Weather modifyWeather(Weather weather) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteWeatherById(int id) {
		// TODO Auto-generated method stub
		
	}


}
