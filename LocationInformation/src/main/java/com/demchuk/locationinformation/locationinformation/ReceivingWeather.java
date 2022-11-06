package com.demchuk.locationinformation.locationinformation;

import com.demchuk.locationinformation.locationinformation.API.Weather;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.net.URL;

public class ReceivingWeather {
    private final String API_WEATHER = "http://api.openweathermap.org/data/2.5/weather";
    JSONObject weather;
    JSONObject jsonObject;
    Weather getterWeather;
    public ReceivingWeather() {
        try {
            СreatureURL creatureURl = new СreatureURL(API_WEATHER);
            URL url = creatureURl.getUrl();
            URLtoString urLtoString = new URLtoString(url);
            String s = urLtoString.urlToString();
            this.jsonObject = (JSONObject) JSONValue.parseWithException(s);
            JSONArray jsonArray = (JSONArray) jsonObject.get("weather");
            this.weather = (JSONObject) jsonArray.get(0);
            getterWeather = new Weather();

        } catch (Exception error) {
            error.printStackTrace();
        }
    }

    public void getWeather() {
        getterWeather.setWeather((String) weather.get("main"));
        getterWeather.setDescription((String) weather.get("description"));
        getterWeather.printWeather();
    }

    public void getTemperature() {
        JSONObject temp = (JSONObject) jsonObject.get("main");
        getterWeather.setTemp((Double) temp.get("temp"));
        getterWeather.setFeelsLike((Double) temp.get("feels_like"));
        getterWeather.printTemperature();
    }
}
