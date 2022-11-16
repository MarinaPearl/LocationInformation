package com.demchuk.locationinformation.locationinformation;

import com.demchuk.locationinformation.locationinformation.API.Description;
import com.demchuk.locationinformation.locationinformation.API.InterestingPlaces;
import com.demchuk.locationinformation.locationinformation.API.Place;
import com.demchuk.locationinformation.locationinformation.API.Weather;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;

public class Worker {
    public void work() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Line");
        String str = in.nextLine();
        ReceivingPlace receivingPlace = new ReceivingPlace(str);
        receivingPlace.setListPlaces();
        receivingPlace.printListPlaces();
        //ArrayList<Place> placeArrayList = receivingPlace.getPlaceArrayList();
        System.out.println("Choose place, please!");
        int number = in.nextInt();
        CompletableFuture<Place> f1 = CompletableFuture.supplyAsync(() -> {
            return receivingPlace.getPlace(number);
        });
        CompletableFuture<Weather> f2 = f1.thenApply(place -> {
            assert false;
            ReceivingWeather receivingWeather = new ReceivingWeather();
            receivingWeather.receiveWeather(place.getLatitude().toString(), place.getLongitude().toString());
            return receivingWeather.getGetterWeather();
        });
        CompletableFuture<Void> f3 = f2.thenAccept(weather -> {
            ReceivingWeather receivingWeather = new ReceivingWeather();
            receivingWeather.getWeather(weather);
            receivingWeather.getTemperature(weather);
        });
        CompletableFuture<ArrayList<InterestingPlaces>> f4 = f1.thenApply(place -> {
            var receivingInterestingPlaces = new ReceivingInterestingPlaces();
            receivingInterestingPlaces.receiveInterestingPlaces(place.getLongitude(), place.getLatitude());
            return receivingInterestingPlaces.getInterestingPlacesArrayList();
        });
        CompletableFuture<Void> f5 = f4.thenAccept(listPlaces -> {
            int iter = 0;
            for (InterestingPlaces list : listPlaces) {
                System.out.println(iter + " " + list.getName() + " " + list.getLon() + " " + list.getLat());
                ++iter;
            }
        });
        CompletableFuture<Description> f6 = f4.thenApply(listPlaces -> {
            Scanner inSystem = new Scanner(System.in);
            System.out.println("Choose place ");
            int n = inSystem.nextInt();
            var receivingDescriptionPlace = new ReceivingDescriptionPlace(listPlaces.get(n).getXid());
            return receivingDescriptionPlace.getDescription();
        });

        CompletableFuture<Void> f7 = f6.thenAccept(description -> {
            System.out.println(description.getDescription());
        });
    }
}
