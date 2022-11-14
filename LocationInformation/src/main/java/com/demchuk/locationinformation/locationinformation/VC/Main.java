package com.demchuk.locationinformation.locationinformation.VC;


import com.demchuk.locationinformation.locationinformation.API.InterestingPlaces;
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
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Line");
        String str = in.nextLine();
        ReceivingPlace receivingPlace = new ReceivingPlace(str);
        receivingPlace.setListPlaces();
        receivingPlace.printListPlaces();
        ArrayList<Place> placeArrayList = receivingPlace.getPlaceArrayList();
        System.out.println("Choose place, please!");
        int number = in.nextInt();
        Place place = placeArrayList.get(number);
        ReceivingWeather receivingWeather = new ReceivingWeather(place.getLatitude().toString(), place.getLongitude().toString());
        receivingWeather.getWeather();
        receivingWeather.getTemperature();
        var receivingInterestingPlaces = new ReceivingInterestingPlaces(place.getLongitude(), place.getLatitude());
        var listPlaces = receivingInterestingPlaces.getInterestingPlacesArrayList();
        System.out.println("Interesting places: ");
        for (InterestingPlaces list : listPlaces) {
            System.out.println(list.getName() + " " + list.getLon() + " " + list.getLat());
        }

    }

}