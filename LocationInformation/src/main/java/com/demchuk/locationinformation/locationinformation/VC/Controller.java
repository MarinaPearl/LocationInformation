package com.demchuk.locationinformation.locationinformation.VC;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button start;

    @FXML
    void initialize() {
            start.setOnAction(event -> {
                System.out.println("Hello world!");
            });
    }

}
