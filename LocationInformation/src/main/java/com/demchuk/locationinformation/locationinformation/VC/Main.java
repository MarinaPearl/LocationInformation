package com.demchuk.locationinformation.locationinformation.VC;


import com.demchuk.locationinformation.locationinformation.*;
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
        Worker worker = new Worker();
        worker.work();
    }

}