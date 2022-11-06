package com.demchuk.locationinformation.locationinformation.API;

public class Weather {
   private String weather;
   private String description;
   private Double temp;
   private Double feelsLike;
    public void setWeather(String weather) {
        this.weather = weather;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public void setFeelsLike(Double feelsLike) {
        this.feelsLike = feelsLike;
    }

    public void printWeather() {
        System.out.println(this.weather);
        System.out.println(this.description);
    }

    public void printTemperature() {
        System.out.println(this.temp);
        System.out.println(this.feelsLike);
    }


}