package com.demchuk.locationinformation.locationinformation;

import com.demchuk.locationinformation.locationinformation.API.Place;
import com.demchuk.locationinformation.locationinformation.URL.CreateURLforPlace;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ReceivingPlace {
    private List<String> listPlaces;
    JSONObject jsonObject;
    Place place;

    public ReceivingPlace() {
        try {
            listPlaces = new ArrayList<String>();
            CreateURLforPlace creatureURl = new CreateURLforPlace("https://graphhopper.com/api/1/geocode");
            URL url = creatureURl.getUrl();
            URLtoString urLtoString = new URLtoString(url);
            String s = urLtoString.urlToString();
            this.jsonObject = (JSONObject) JSONValue.parseWithException(s);
        } catch (Exception error) {
            error.printStackTrace();
        }
    }

    public void setListPlaces() {
        JSONArray jsonArray = (JSONArray) jsonObject.get("hits");
        for (Object it : jsonArray) {
            JSONObject j = (JSONObject) it;
            place = new Place();
            place.setPlaceName((String) j.get("name"));
            place.setCountry((String) j.get("country"));
            JSONObject cord = (JSONObject) j.get("point");
            place.setLatitude((Double) cord.get("lat"));
            place.setLongitude((Double) cord.get("lng"));
            listPlaces.add(place.placeToString());
        }
    }

    public void printListPlaces() {
        for (String st : listPlaces) {
            System.out.println(st);
        }
    }

    public Double getLatitude() {
       return place.getLatitude();
    }

    public Double getLongitude() {
        return place.getLongitude();
    }
}
