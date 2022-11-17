package com.demchuk.locationinformation.locationinformation.VC;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Controller {
    private Stage stage;
    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button start;

    @FXML
    void initialize() {
            start.setOnMouseClicked(event -> {
               //MenuView menuView = new MenuView(stage);
            });
    }

}
