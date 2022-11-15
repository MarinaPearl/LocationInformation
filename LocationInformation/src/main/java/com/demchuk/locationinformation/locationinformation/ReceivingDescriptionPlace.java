package com.demchuk.locationinformation.locationinformation;

import com.demchuk.locationinformation.locationinformation.API.Description;
import com.demchuk.locationinformation.locationinformation.URL.CreatureURlForDescription;
import lombok.Getter;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.net.URL;

public class ReceivingDescriptionPlace {
    Description description;
    public ReceivingDescriptionPlace(String xid) {
        try {
            description = new Description();
            var creatureURlForDescription = new CreatureURlForDescription(xid);
            URL url = creatureURlForDescription.getUrl();
            URLtoString urLtoString = new URLtoString(url);
            String str = urLtoString.urlToString();
            JSONObject jsonObject = (JSONObject) JSONValue.parseWithException(str);
            JSONObject object = (JSONObject) jsonObject.get("wikipedia_extracts");
            description.setDescription((String) object.get("text"));
        }catch (Exception error) {
            error.printStackTrace();
        }
    }
    public void printDescription() {
        System.out.println(description.getDescription());
    }
}
