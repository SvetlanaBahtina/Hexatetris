package com.example.haxatetris;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class GameOver {
    @FXML
    private Button restartGame;

    @FXML
    private Label scoreTable;

    @FXML
    private Button toTheMain;

    @FXML
    void initialize() {
        scoreTable.setText(String.valueOf(GameController.score));
        restartGame.setOnAction(event -> {
            restartGame.getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader(View.class.getResource("game.fxml"));
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
        toTheMain.setOnAction(event -> {
            toTheMain.getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader(View.class.getResource("starter-window.fxml"));
            Scene scene;
            try {
                scene = new Scene(fxmlLoader.load());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Stage stage = new Stage();
            stage.setTitle("ГексаТетрис");
            stage.setScene(scene);
            stage.show();
        });

    }

}
