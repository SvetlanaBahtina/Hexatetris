package com.example.haxatetris;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Controller {
    @FXML
    private Button StartButton;

    @FXML
    private Button logoutButton;

    @FXML
    void initialize() {
        StartButton.setOnAction(event -> {
            StartButton.getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader(View.class.getResource("game.fxml"));
            System.out.println(View.class.getResource("game.fxml"));
            Scene scene;
            try {
                scene = new Scene(fxmlLoader.load());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

        });
        logoutButton.setOnAction(event -> {
            logoutButton.getScene().getWindow().hide();
        });
    }

}
