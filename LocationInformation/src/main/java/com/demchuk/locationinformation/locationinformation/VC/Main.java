package com.demchuk.locationinformation.locationinformation.VC;


import com.demchuk.locationinformation.locationinformation.*;

public class Main {
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//
//        FXMLLoader loader = new FXMLLoader();
//        Parent root = (Parent) FXMLLoader.load(Objects.requireNonNull(getClass().getResource("sample.fxml")));
//        controller = loader.getController();
//        primaryStage.setScene(new Scene(root, 600, 400));
//        primaryStage.show();
//        callController();
//    }
    public static void main(String[] args) {
        //launch(args);
        while (true) {
            Worker worker = new Worker();
            worker.work();
        }
    }
}