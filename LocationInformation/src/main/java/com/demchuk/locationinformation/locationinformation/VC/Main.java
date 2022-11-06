package com.demchuk.locationinformation.locationinformation.VC;


import com.demchuk.locationinformation.locationinformation.API.Place;
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
        try {
            CreateURLforPlace creatureURl = new CreateURLforPlace("https://graphhopper.com/api/1/geocode");
            URL url = creatureURl.getUrl();
            URLtoString urLtoString = new URLtoString(url);
            String s = urLtoString.urlToString();
            JSONObject jsonObject = (JSONObject) JSONValue.parseWithException(s);
            JSONArray jsonArray = (JSONArray) jsonObject.get("hits");
            for (Object it : jsonArray) {
                JSONObject j = (JSONObject) it;
                Place place = new Place();
                place.setPlaceName((String) j.get("name"));
                place.setCountry((String) j.get("country"));
                JSONObject cord = (JSONObject) j.get("point");
                place.setLatitude((Double) cord.get("lat"));
                place.setLongitude((Double) cord.get("lng"));
                System.out.println(place.placeToString());
            }
        }catch (Exception error) {
            error.printStackTrace();
        }

   }

}