package com.demchuk.locationinformation.locationinformation;

import com.demchuk.locationinformation.locationinformation.URL.CreatureURLforInterestingPlaces;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.net.URL;

public class ReceivingInterestingPlaces {
    JSONObject jsonObject;

    public ReceivingInterestingPlaces(Double lon, Double lat) {
        try {
            var interestingPlaces = new CreatureURLforInterestingPlaces(lon, lat);
            URL url = interestingPlaces.getUrl();
            URLtoString urLtoString = new URLtoString(url);
            String s = urLtoString.urlToString();
            this.jsonObject = (JSONObject) JSONValue.parseWithException(s);
            JSONArray jsonArray = (JSONArray) jsonObject.get("features");
            for (Object it : jsonArray) {
                JSONObject j = (JSONObject) it;
                JSONObject getProperties = (JSONObject) j.get("properties");
                //System.out.println(getProperties.toString());
                //JSONObject getName = (JSONObject) getPropertoes.get("name");
                String name = (String) getProperties.get("name");
                JSONObject getGeometry = (JSONObject)j.get("geometry");
                JSONArray coordinates = (JSONArray) getGeometry.get("coordinates");
                //JSONObject object = (JSONObject)coordinates.get(0);
                //System.out.println(object.toString());
                System.out.println(coordinates.get(0) + " " + coordinates.get(1));
                System.out.println(name);
            }
        }catch (Exception error) {
            error.printStackTrace();
        }

    }
}
