package com.demchuk.locationinformation.locationinformation.VC;


import com.demchuk.locationinformation.locationinformation.API.Place;
import com.demchuk.locationinformation.locationinformation.API.Weather;
import com.demchuk.locationinformation.locationinformation.ReceivingPlace;
import com.demchuk.locationinformation.locationinformation.ReceivingWeather;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;

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
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter Line");
//        String str = in.nextLine();
//        ReceivingPlace receivingPlace = new ReceivingPlace(str);
//        receivingPlace.setListPlaces();
//        receivingPlace.printListPlaces();
//        ArrayList<Place> placeArrayList = receivingPlace.getPlaceArrayList();
//        System.out.println("Choose place, please!");
//        int number = in.nextInt();
//        Place place = placeArrayList.get(number);
//        ReceivingWeather receivingWeather = new ReceivingWeather(place.getLatitude().toString(), place.getLongitude().toString());
//        receivingWeather.getWeather();
//        receivingWeather.getTemperature();
//        var receivingInterestingPlaces = new ReceivingInterestingPlaces(place.getLongitude(), place.getLatitude());
//        var listPlaces = receivingInterestingPlaces.getInterestingPlacesArrayList();
//        System.out.println("Interesting places: ");
//        int iter = 0;
//        for (InterestingPlaces list : listPlaces) {
//            System.out.println(iter + " " + list.getName() + " " + list.getLon() + " " + list.getLat());
//            ++iter;
//        }
//        ArrayList<String> xidList = receivingInterestingPlaces.getXidList();
//        System.out.println("Choose place ");
//        number = in.nextInt();
//        var receivingDescriptionPlace = new ReceivingDescriptionPlace(xidList.get(number));
//        receivingDescriptionPlace.printDescription();


        Scanner in = new Scanner(System.in);
        System.out.println("Enter Line");
        String str = in.nextLine();
        ReceivingPlace receivingPlace = new ReceivingPlace(str);
        receivingPlace.setListPlaces();
        receivingPlace.printListPlaces();
        ArrayList<Place> placeArrayList = receivingPlace.getPlaceArrayList();
        System.out.println("Choose place, please!");
        int number = in.nextInt();
        //Place place = placeArrayList.get(number);
        CompletableFuture<Place> f1 = CompletableFuture.supplyAsync(() -> {
            return receivingPlace.getPlace(number);
        });
        CompletableFuture<Weather> f2 = f1.thenApply(place -> {
            System.out.println("hello");
            assert false;
            ReceivingWeather receivingWeather = new ReceivingWeather();
            receivingWeather.receiveWeather(place.getLatitude().toString(), place.getLongitude().toString());
            return receivingWeather.getGetterWeather();
        });
        CompletableFuture<Void> f3 = f2.thenAcceptAsync(weather -> {
            System.out.println("123");
            ReceivingWeather receivingWeather = new ReceivingWeather();
            receivingWeather.getWeather(weather);
            receivingWeather.getTemperature(weather);
        });
        System.out.println("qwe");
    }

}