package action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ModelDriven;

import entity.Beach;
import entity.Weather;
import entity.Wind;
import service.BeachService;
import service.WeatherService;

public class BeachInfoAction implements ModelDriven{
	private static final long serialVersionUID = 1L;
	@Override
	public Object getModel() {
		return null;
	}
	
	private int id = 0;
	private Beach currentBeach = new Beach();
	private BeachService beachService;
	private WeatherService weatherService;
	private Weather weather;
	private Wind wind;
	
	public Wind getWind() {
		return wind;
	}

	public void setWind(Wind wind) {
		this.wind = wind;
	}

	public Weather getWeather() {
		return weather;
	}

	public void setWeather(Weather weather) {
		this.weather = weather;
	}

	public WeatherService getWeatherService() {
		return weatherService;
	}

	public void setWeatherService(WeatherService weatherService) {
		this.weatherService = weatherService;
	}

	public String execute(){
		try {
			currentBeach = beachService.getBeachById(id);
			System.out.println(currentBeach.getBeach_name());
			Weather weatherInF = weatherService.getWeatherByBeach(currentBeach);
			weather = weatherService.changeTempToC(weatherInF);
			wind = weather.getWind();
//			System.out.println(weather.getTemp());
//			System.out.println(weather.getCloud());
//			System.out.println(weather.getHumidity());
			System.out.println(wind.getSpeed());

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "success";
	}

	public BeachService getBeachService() {
		return beachService;
	}

	public void setBeachService(BeachService beachService) {
		this.beachService = beachService;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Beach getCurrentBeach() {
		return currentBeach;
	}

	public void setCurrentBeach(Beach currentBeach) {
		this.currentBeach = currentBeach;
	}
	
}
