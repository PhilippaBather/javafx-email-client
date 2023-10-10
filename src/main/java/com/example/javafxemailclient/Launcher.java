package com.example.javafxemailclient;

import com.example.javafxemailclient.view.ViewFactory;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Launcher extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(Launcher.class.getResource("view/main-window.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 510, 325);
//
//        // Parent parent = FXMLLoader.load(getClass().getResource("view/main-window.fxml"));
//        // Scene scene = new Scene(parent);
//
//        stage.setTitle("Email Client");
//        stage.setScene(scene);
//        stage.show();

        ViewFactory viewFactory = new ViewFactory(new EmailManager());
        viewFactory.showLoginWindow();
    }

    public static void main(String[] args) {
        launch();
    }
}