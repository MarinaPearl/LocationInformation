package com.demchuk.locationinformation.locationinformation.VC;


import com.demchuk.locationinformation.locationinformation.API.Place;
import com.demchuk.locationinformation.locationinformation.ReceivingPlace;
import com.demchuk.locationinformation.locationinformation.ReceivingWeather;
import com.demchuk.locationinformation.locationinformation.URL.CreateURLforPlace;
import com.demchuk.locationinformation.locationinformation.URLtoString;
import com.demchuk.locationinformation.locationinformation.URL.СreatureURL;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.net.URL;

public class Main {
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("sample.fxml")));
//        System.out.println("hello");
//        primaryStage.setScene(new Scene(root, 600, 400));
//        primaryStage.show();
//    }

    public static void main(String[] args) {
        //launch(args);
//              ReceivingWeather receivingWeather = new ReceivingWeather();
//              receivingWeather.getWeather();
//              receivingWeather.getTemperature();
        ReceivingPlace receivingPlace = new ReceivingPlace();
        receivingPlace.setListPlaces();
        receivingPlace.printListPlaces();
        String lat = receivingPlace.getLatitude().toString();
        String lon = receivingPlace.getLongitude().toString();
        ReceivingWeather receivingWeather = new ReceivingWeather(lat, lon);
        receivingWeather.getWeather();
        receivingWeather.getTemperature();

   }

}