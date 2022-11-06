module com.demchuk.locationinformation.locationinformation {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires json.simple;
    requires httpclient;

    opens com.demchuk.locationinformation.locationinformation to javafx.fxml;
    exports com.demchuk.locationinformation.locationinformation;
    exports com.demchuk.locationinformation.locationinformation.API;
    opens com.demchuk.locationinformation.locationinformation.API to javafx.fxml;
}