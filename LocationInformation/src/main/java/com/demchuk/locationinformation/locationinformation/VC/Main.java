package com.demchuk.locationinformation.locationinformation.VC;


import com.demchuk.locationinformation.locationinformation.API.Place;
import com.demchuk.locationinformation.locationinformation.ReceivingInterestingPlaces;
import com.demchuk.locationinformation.locationinformation.ReceivingPlace;
import com.demchuk.locationinformation.locationinformation.ReceivingWeather;

import java.util.ArrayList;
import java.util.Scanner;

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
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter Line");
//        String str = in.nextLine();
//        System.out.println(str);
//        ReceivingPlace receivingPlace = new ReceivingPlace(str);
//        receivingPlace.setListPlaces();
//        receivingPlace.printListPlaces();
//        ArrayList<Place> placeArrayList = receivingPlace.getPlaceArrayList();
//        for (Place place : placeArrayList) {
//            ReceivingWeather receivingWeather = new ReceivingWeather(place.getLatitude().toString(), place.getLongitude().toString());
//            receivingWeather.getWeather();
//            receivingWeather.getTemperature();
//        }
//
        Double lon = 13.3888599;
        Double lat = 52.5170365;
        var receivingInterestingPlaces = new ReceivingInterestingPlaces(lon, lat);

   }

}