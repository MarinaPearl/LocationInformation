package com.demchuk.locationinformation.locationinformation.VC;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ControllerMenu {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea description;

    @FXML
    private ListView<?> places;

    @FXML
    private TextField request;

    @FXML
    private Button send;

    @FXML
    private TextArea weather;

    @FXML
    void initialize() {


    }

}
