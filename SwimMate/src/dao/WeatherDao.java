package dao;

import entity.Weather;

public interface WeatherDao {
	public Weather getWeatherById();
	public void addWeather(Weather weather);
	public Weather modifyWeather(Weather weather);
	public void deleteWeatherById(int id);
}
