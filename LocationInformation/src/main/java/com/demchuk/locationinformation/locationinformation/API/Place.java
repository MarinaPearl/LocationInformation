package com.demchuk.locationinformation.locationinformation.API;

public class Place {
    private String placeName;
    private String country;
    private Double latitude;
    private Double longitude;

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String placeToString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(placeName + " " + country + " " + latitude.toString()
                + " " + longitude.toString());
        return stringBuilder.toString();
    }
}
