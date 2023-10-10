module com.example.javafxemailclient {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;


    opens com.example.javafxemailclient to javafx.fxml;
    exports com.example.javafxemailclient;
    exports com.example.javafxemailclient.controller;
    opens com.example.javafxemailclient.controller to javafx.fxml;
}