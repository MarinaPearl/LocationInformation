package com.demchuk.locationinformation.locationinformation.VC;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class MenuView implements Observer{
    private Stage stage;

    public MenuView(Stage stage) {
        try {
            this.stage = stage;
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("menu.fxml")));
            this.stage.setScene(new Scene(root, 600, 400));
            this.stage.show();
        }catch (Exception error) {
            error.printStackTrace();
        }
    }
    @Override
    public void update() {
        //text
    }
}
