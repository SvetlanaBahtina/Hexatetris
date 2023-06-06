package com.example.haxatetris;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class View extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(View.class.getResource("starter-window.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 700);
        stage.setScene(scene);
        stage.setTitle("ГексаТетрис");
        stage.show();
        }



    public static void main(String[] args) {
        launch();
    }
}