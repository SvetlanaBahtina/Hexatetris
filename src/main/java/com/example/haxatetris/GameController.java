package com.example.haxatetris;

import java.io.IOException;
import java.util.*;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class GameController {
    double oldXa, oldYa, oldXb, oldYb, oldXc, oldYc, oldXd, oldYd, oldXe, oldYe;
    double xa, ya, xb, yb, xc, yc, xd, yd, xe, ye;
    public static int score = 0;
    private static int i = 10;
    private static int flag = 3;
    private final int[][] box = new int[9][];
    private final Polygon[][] polygons = new Polygon[9][];
    private Timer timer;
    @FXML
    public Label scoreTable;
    @FXML
    public AnchorPane pane;
    @FXML
    public Label Timer10;
    @FXML
    private Button RestartGame;
    @FXML
    private Polygon polygon11;

    @FXML
    private Polygon polygon12;

    @FXML
    private Polygon polygon13;

    @FXML
    private Polygon polygon14;

    @FXML
    private Polygon polygon15;

    @FXML
    private Polygon polygon21;

    @FXML
    private Polygon polygon22;

    @FXML
    private Polygon polygon23;

    @FXML
    private Polygon polygon24;

    @FXML
    private Polygon polygon25;

    @FXML
    private Polygon polygon26;

    @FXML
    private Polygon polygon31;

    @FXML
    private Polygon polygon32;

    @FXML
    private Polygon polygon33;

    @FXML
    private Polygon polygon34;

    @FXML
    private Polygon polygon35;

    @FXML
    private Polygon polygon36;

    @FXML
    private Polygon polygon37;

    @FXML
    private Polygon polygon41;

    @FXML
    private Polygon polygon42;

    @FXML
    private Polygon polygon43;

    @FXML
    private Polygon polygon44;

    @FXML
    private Polygon polygon45;

    @FXML
    private Polygon polygon46;

    @FXML
    private Polygon polygon47;

    @FXML
    private Polygon polygon48;

    @FXML
    private Polygon polygon51;

    @FXML
    private Polygon polygon52;

    @FXML
    private Polygon polygon53;

    @FXML
    private Polygon polygon54;

    @FXML
    private Polygon polygon55;

    @FXML
    private Polygon polygon56;

    @FXML
    private Polygon polygon57;

    @FXML
    private Polygon polygon58;

    @FXML
    private Polygon polygon59;

    @FXML
    private Polygon polygon61;

    @FXML
    private Polygon polygon62;

    @FXML
    private Polygon polygon63;

    @FXML
    private Polygon polygon64;

    @FXML
    private Polygon polygon65;

    @FXML
    private Polygon polygon66;

    @FXML
    private Polygon polygon67;

    @FXML
    private Polygon polygon68;

    @FXML
    private Polygon polygon71;

    @FXML
    private Polygon polygon72;

    @FXML
    private Polygon polygon73;

    @FXML
    private Polygon polygon74;

    @FXML
    private Polygon polygon75;

    @FXML
    private Polygon polygon76;

    @FXML
    private Polygon polygon77;

    @FXML
    private Polygon polygon81;

    @FXML
    private Polygon polygon82;

    @FXML
    private Polygon polygon83;

    @FXML
    private Polygon polygon84;

    @FXML
    private Polygon polygon85;

    @FXML
    private Polygon polygon86;

    @FXML
    private Polygon polygon91;

    @FXML
    private Polygon polygon92;

    @FXML
    private Polygon polygon93;

    @FXML
    private Polygon polygon94;

    @FXML
    private Polygon polygon95;

    @FXML
    private Button toTheMain;

    @FXML
    void initialize() {
        int k = 5;
        for (int j = 0; j < 9; j++) {
            box[j] = new int[k];
            Arrays.fill(box[j], 0);
            if (j < 4) k+=1;
            else k-=1;
        }
        flag = 3;
        polygons[0] = new Polygon[] {polygon11, polygon12, polygon13, polygon14, polygon15};
        polygons[1] = new Polygon[] {polygon21, polygon22, polygon23, polygon24, polygon25, polygon26};
        polygons[2] = new Polygon[] {polygon31, polygon32, polygon33, polygon34, polygon35, polygon36, polygon37};
        polygons[3] = new Polygon[] {polygon41, polygon42, polygon43, polygon44, polygon45, polygon46, polygon47, polygon48};
        polygons[4] = new Polygon[] {polygon51, polygon52, polygon53, polygon54, polygon55, polygon56, polygon57, polygon58, polygon59};
        polygons[5] = new Polygon[] {polygon61, polygon62, polygon63, polygon64, polygon65, polygon66, polygon67, polygon68};
        polygons[6] = new Polygon[] {polygon71, polygon72, polygon73, polygon74, polygon75, polygon76, polygon77};
        polygons[7] = new Polygon[] {polygon81, polygon82, polygon83, polygon84, polygon85, polygon86};
        polygons[8] = new Polygon[] {polygon91, polygon92, polygon93, polygon94, polygon95};
        i = 10;
        Timer10.setText(String.valueOf(i));
        timer = new Timer();
        scoreTable.setText("0");
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Platform.runLater(() -> {
                    if (i == 10 && flag == 3) {
                        flag = 0;
                        Form det1 = GameController.makePolygons().setCoordinates(0, pane);
                        move(det1.a, det1);
                        if (det1.b != null) move(det1.b, det1);
                        if (det1.c != null) move(det1.c, det1);
                        if (det1.d != null) move(det1.d, det1);
                        if (det1.e != null) move(det1.e, det1);
                        Form det2 = GameController.makePolygons().setCoordinates(1, pane);
                        move(det2.a, det2);
                        if (det2.b != null) move(det2.b, det2);
                        if (det2.c != null) move(det2.c, det2);
                        if (det2.d != null) move(det2.d, det2);
                        if (det2.e != null) move(det2.e, det2);
                        Form det3 = GameController.makePolygons().setCoordinates(2, pane);
                        move(det3.a, det3);
                        if (det3.b != null) move(det3.b, det3);
                        if (det3.c != null) move(det3.c, det3);
                        if (det3.d != null) move(det3.d, det3);
                        if (det3.e != null) move(det3.e, det3);

                    }
                    Timer10.setText(String.valueOf(i));
                    i -=1 ;
                    if (i == -2) {
                        timer.cancel();
                        Timer10.getScene().getWindow().hide();
                        FXMLLoader fxmlLoader = new FXMLLoader(View.class.getResource("game-over.fxml"));
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
                    }
                });

            }
        }, 0, 1000);
        RestartGame.setOnAction(event -> {
            RestartGame.getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader(View.class.getResource("game.fxml"));
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
            timer.cancel();
            flag = 3;
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
            timer.cancel();
        });
    }

    public void move(Polygon q, Form det){
        q.setOnMousePressed(e ->{
            xa = det.a.getTranslateX();
            ya = det.a.getTranslateY();
            oldXa = xa - e.getSceneX();
            oldYa = ya - e.getSceneY();
            if (det.b != null){
                xb = det.b.getTranslateX();
                yb = det.b.getTranslateY();
                oldXb = xb - e.getSceneX();
                oldYb = yb - e.getSceneY();
            } if (det.c != null) {
                xc = det.c.getTranslateX();
                yc = det.c.getTranslateY();
                oldXc = xc - e.getSceneX();
                oldYc = yc - e.getSceneY();
            } if (det.d != null){
                xd = det.d.getTranslateX();
                yd = det.d.getTranslateY();
                oldXd = xd - e.getSceneX();
                oldYd = yd - e.getSceneY();
            } if (det.e != null){
                xe = det.e.getTranslateX();
                ye = det.e.getTranslateY();
                oldXe = xe - e.getSceneX();
                oldYe = ye - e.getSceneY();
            }
        });
        q.setOnMouseDragged(e ->{
            det.a.setTranslateX(oldXa + e.getSceneX());
            det.a.setTranslateY(oldYa + e.getSceneY());
            if (det.b != null){
                det.b.setTranslateX(oldXb + e.getSceneX());
                det.b.setTranslateY(oldYb + e.getSceneY());
            } if (det.c != null){
                det.c.setTranslateX(oldXc + e.getSceneX());
                det.c.setTranslateY(oldYc + e.getSceneY());
            } if (det.d != null){
                det.d.setTranslateX(oldXd + e.getSceneX());
                det.d.setTranslateY(oldYd + e.getSceneY());
            } if (det.e != null){
                det.e.setTranslateX(oldXe + e.getSceneX());
                det.e.setTranslateY(oldYe + e.getSceneY());
            }
        });
        q.setOnMouseReleased(e -> {
            if (vicinity(det)) {
                pane.getChildren().removeAll(det.a, det.b, det.c, det.d, det.e);
                i = 10;
                flag+=1;
                stack();
            } else {
                det.a.setTranslateX(xa);
                det.a.setTranslateY(ya);
                if (det.b != null) {
                    det.b.setTranslateX(xb);
                    det.b.setTranslateY(yb);
                } if (det.c != null) {
                    det.c.setTranslateX(xc);
                    det.c.setTranslateY(yc);
                } if (det.d != null) {
                    det.d.setTranslateX(xd);
                    det.d.setTranslateY(yd);
                } if (det.e != null){
                    det.e.setTranslateX(xe);
                    det.e.setTranslateY(ye);
                }
            }
        });
    }

    public static Form makePolygons(){
        Random r = new Random();
        int block = r.nextInt(9) + 1;
        Polygon a = new Polygon();
        a.getPoints().addAll(-25.0, 15.0,
                0.0, 30.0,
                25.0, 15.0,
                25.0, -15.0,
                0.0, -30.0,
                -25.0, -15.0);
        Polygon b = new Polygon();
        b.getPoints().addAll(-25.0, 15.0,
                0.0, 30.0,
                25.0, 15.0,
                25.0, -15.0,
                0.0, -30.0,
                -25.0, -15.0);
        Polygon c = new Polygon();
        c.getPoints().addAll(-25.0, 15.0,
                0.0, 30.0,
                25.0, 15.0,
                25.0, -15.0,
                0.0, -30.0,
                -25.0, -15.0);
        Polygon d = new Polygon();
        d.getPoints().addAll(-25.0, 15.0,
                0.0, 30.0,
                25.0, 15.0,
                25.0, -15.0,
                0.0, -30.0,
                -25.0, -15.0);
        Polygon e = new Polygon();
        e.getPoints().addAll(-25.0, 15.0,
                0.0, 30.0,
                25.0, 15.0,
                25.0, -15.0,
                0.0, -30.0,
                -25.0, -15.0);
        return switch (block) {
            case 2 -> new Form(a, b, "2r");
            case 3 -> new Form(a, b, "2l");
            case 4 -> new Form(a, b, c, "3d");
            case 5 -> new Form(a, b, c, "3u");
            case 6 -> new Form(a, b, c, d, "4");
            case 7 -> new Form(a, b, c, d, "4l");
            case 8 -> new Form(a, b, c, d, e, "5l");
            case 9 -> new Form(a, b, c, d, e, "5r");
            default -> new Form(a, "1");
        };
    }
    private boolean vicinity(Form det){
        switch (det.getName()){
            case "1" ->{
                for (int j = 0; j < 9; j++) {
                    Polygon[] line = polygons[j];
                    for (int l = 0; l < line.length; l++) {
                        Polygon object = line[l];
                        if (Math.abs(det.a.getTranslateX() - object.getLayoutX()) <= 20 &&
                                Math.abs(det.a.getTranslateY() - object.getLayoutY())<=20 && box[j][l] == 0) {
                            box[j][l] = 1;
                            polygons[j][l].setFill(det.color);
                            return true;
                        }

                    }
                }
            }
            case "2r" ->{
                for (int j = 1; j < 5; j++) {
                    for (int l = 0; l < polygons[j].length - 1; l++) {
                        if (Math.abs(det.a.getTranslateX() - polygons[j][l].getLayoutX()) <= 20 &&
                                Math.abs(det.a.getTranslateY() - polygons[j][l].getLayoutY()) <= 20 &&
                                box[j][l] == 0 && box[j - 1][l] == 0) {
                            box[j][l] = 1;
                            box[j - 1][l] = 1;
                            polygons[j][l].setFill(det.color);
                            polygons[j - 1][l].setFill(det.color);
                            return true;
                        }
                    }
                }
                for (int j = 5; j < 9; j++) {
                    for (int l = 0; l < polygons[j].length; l++) {
                        if (Math.abs(det.a.getTranslateX() - polygons[j][l].getLayoutX()) <= 20 &&
                                Math.abs(det.a.getTranslateY() - polygons[j][l].getLayoutY()) <= 20 &&
                                box[j][l] == 0 && box[j - 1][l + 1] == 0) {
                            box[j][l] = 1;
                            box[j - 1][l + 1] = 1;
                            polygons[j][l].setFill(det.color);
                            polygons[j - 1][l + 1].setFill(det.color);
                            return true;
                        }
                    }
                }
            }
            case "2l" ->{
                for (int j = 1; j < 5; j++) {
                    for (int l = 1; l < polygons[j].length; l++) {
                        if (Math.abs(det.a.getTranslateX() - polygons[j][l].getLayoutX()) <= 20 &&
                                Math.abs(det.a.getTranslateY() - polygons[j][l].getLayoutY()) <= 20 &&
                                box[j][l] == 0 && box[j - 1][l - 1] == 0) {
                            box[j][l] = 1;
                            box[j - 1][l - 1] = 1;
                            polygons[j][l].setFill(det.color);
                            polygons[j - 1][l - 1].setFill(det.color);
                            return true;
                        }
                    }
                }
                for (int j = 5; j < 9; j++) {
                    for (int l = 0; l < polygons[j].length; l++) {
                        if (Math.abs(det.a.getTranslateX() - polygons[j][l].getLayoutX()) <= 20 &&
                                Math.abs(det.a.getTranslateY() - polygons[j][l].getLayoutY()) <= 20 &&
                                box[j][l] == 0 && box[j - 1][l] == 0) {
                            box[j][l] = 1;
                            box[j - 1][l] = 1;
                            polygons[j][l].setFill(det.color);
                            polygons[j - 1][l].setFill(det.color);
                            return true;
                        }
                    }
                }
            }
            case "3d" ->{
                for (int j = 0; j < 8; j++) {
                    for (int l = 0; l < polygons[j].length - 1; l++) {
                        if (Math.abs(det.a.getTranslateX() - polygons[j][l].getLayoutX()) <= 20 &&
                                Math.abs(det.a.getTranslateY() - polygons[j][l].getLayoutY()) <= 20 &&
                                box[j][l] == 0 && box[j][l + 1] == 0 && (box[j + 1][l] == 0 && j >= 4 || box[j + 1][l + 1] == 0 && j < 4)) {
                            box[j][l] = 1;
                            box[j][l + 1] = 1;
                            polygons[j][l].setFill(det.color);
                            polygons[j][l + 1].setFill(det.color);
                            if (j < 4) {
                                box[j + 1][l + 1] = 1;
                                polygons[j + 1][l + 1].setFill(det.color);
                            }
                            else {
                                box[j + 1][l] = 1;
                                polygons[j + 1][l].setFill(det.color);
                            }
                            return true;
                        }

                    }
                }
            }
            case "3u" ->{
                for (int j = 1; j < 9; j++) {
                    for (int l = 0; l < polygons[j].length - 1; l++) {
                        if (Math.abs(det.a.getTranslateX() - polygons[j][l].getLayoutX()) <= 20 &&
                                Math.abs(det.a.getTranslateY() - polygons[j][l].getLayoutY()) <= 20 &&
                        box[j][l] == 0 && box[j][l + 1] == 0 && (box[j - 1][l] == 0 && j < 5 || box[j - 1][l + 1] == 0 && j >= 5 )) {
                            box[j][l] = 1;
                            box[j][l + 1] = 1;
                            polygons[j][l].setFill(det.color);
                            polygons[j][l + 1].setFill(det.color);
                            if (j < 5) {
                                box[j - 1][l] = 1;
                                polygons[j - 1][l].setFill(det.color);
                            }
                            else {
                                box[j - 1][l + 1] = 1;
                                polygons[j - 1][l + 1].setFill(det.color);
                            }
                            return true;
                        }
                    }
                }
            }
            case "4" ->{
                for (int j = 1; j < 8; j++) {
                    for (int l = 0; l < polygons[j].length - 1; l++) {
                        if (Math.abs(det.a.getTranslateX() - polygons[j][l].getLayoutX()) <= 20 &&
                                Math.abs(det.a.getTranslateY() - polygons[j][l].getLayoutY()) <= 20 &&
                                box[j][l] == 0 && (j > 4 && box[j - 1][l + 1] == 0 && box[j + 1][l] == 0 ||
                                j < 4 && box[j - 1][l] == 0 && box[j + 1][l + 1] == 0 ||
                                j == 4 && box[j - 1][l] == 0 && box[j + 1][l] == 0)) {
                            box[j][l] = 1;
                            box[j][l + 1] = 1;
                            polygons[j][l].setFill(det.color);
                            polygons[j][l + 1].setFill(det.color);
                            if(j < 4){
                                box[j - 1][l] = 1;
                                box[j + 1][l + 1] = 1;
                                polygons[j - 1][l].setFill(det.color);
                                polygons[j + 1][l + 1].setFill(det.color);
                            } else if(j == 4) {
                                box[j - 1][l] = 1;
                                box[j + 1][l] = 1;
                                polygons[j - 1][l].setFill(det.color);
                                polygons[j + 1][l].setFill(det.color);
                            } else {
                                box[j - 1][l + 1] = 1;
                                box[j + 1][l] = 1;
                                polygons[j - 1][l + 1].setFill(det.color);
                                polygons[j + 1][l].setFill(det.color);
                            }
                            return true;
                        }
                    }
                }
            }
            case "4l" ->{
                for (int j = 0; j < 9; j++) {
                    for (int l = 0; l < polygons[j].length - 3; l++) {
                        if (Math.abs(det.a.getTranslateX() - polygons[j][l].getLayoutX()) <= 20 &&
                                Math.abs(det.a.getTranslateY() - polygons[j][l].getLayoutY()) <= 20 &&
                                box[j][l] == 0 && box[j][l + 1] == 0 && box[j][l + 2] == 0 && box[j][l + 3] == 0) {
                            box[j][l] = 1;
                            box[j][l + 1] = 1;
                            box[j][l + 2] = 1;
                            box[j][l + 3] = 1;
                            polygons[j][l].setFill(det.color);
                            polygons[j][l + 1].setFill(det.color);
                            polygons[j][l + 2].setFill(det.color);
                            polygons[j][l + 3].setFill(det.color);
                            return true;
                        }
                    }
                }
            }
            case "5l" ->{
                for (int j = 0; j < 3; j++) {
                    for (int l = 0; l < polygons[j].length; l++) {
                        if (Math.abs(det.a.getTranslateX() - polygons[j][l].getLayoutX()) <= 20 &&
                                Math.abs(det.a.getTranslateY() - polygons[j][l].getLayoutY()) <= 20 &&
                                box[j][l] == 0 && box[j + 1][l] == 0 && box[j + 2][l] == 0 && (box[j + 3][l + (2 - j)] == 0 &&
                                box[j + 4][l + 2 - j] == 0 && j != 0 || box[j + 3][l + 1] == 0 &&
                                box[j + 4][l + 2] == 0 && j == 0)){
                            box[j][l] = 1;
                            box[j + 1][l] = 1;
                            box[j + 2][l] = 1;
                            polygons[j][l].setFill(det.color);
                            polygons[j + 1][l].setFill(det.color);
                            polygons[j + 2][l].setFill(det.color);
                            if (j == 0) {
                                box[j + 3][l + 1] = 1;
                                box[j + 4][l + 2] = 1;
                                polygons[j + 3][l + 1].setFill(det.color);
                                polygons[j + 4][l + 2].setFill(det.color);
                            } else{
                                box[j + 3][l + 2 - j] = 1;
                                box[j + 4][l + 2 - j] = 1;
                                polygons[j + 3][l + 2 - j].setFill(det.color);
                                polygons[j + 4][l + 2 - j].setFill(det.color);
                            }
                            return true;
                        }
                    }
                }
                for (int j = 3; j < 5; j++) {
                    for (int l = j - 2; l < polygons[j].length - j + 2; l++) {
                        if (Math.abs(det.a.getTranslateX() - polygons[j][l].getLayoutX()) <= 20 &&
                                Math.abs(det.a.getTranslateY() - polygons[j][l].getLayoutY()) <= 20 && box[j][l] == 0
                                && box[j + 1][l - j + 3] == 0 && box[j + 2][l - j + 2] == 0 &&
                                box[j + 3][l - j + 2] == 0 && box[j + 4][l - j + 2] == 0){
                            box[j][l] = 1;
                            box[j + 1][l - j + 3] = 1;
                            box[j + 2][l - j + 2] = 1;
                            box[j + 3][l - j + 2] = 1;
                            box[j + 4][l - j + 2] = 1;
                            polygons[j][l].setFill(det.color);
                            polygons[j + 1][l - j + 3].setFill(det.color);
                            polygons[j + 2][l - j + 2].setFill(det.color);
                            polygons[j + 3][l - j + 2].setFill(det.color);
                            polygons[j + 4][l - j + 2].setFill(det.color);
                            return true;
                        }
                    }
                }
            }
            case "5r" ->{
                for (int j = 0; j < 3; j++) {
                    for (int l = 0; l < polygons[j].length; l++) {
                        if (Math.abs(det.a.getTranslateX() - polygons[j][l].getLayoutX()) <= 20 &&
                                Math.abs(det.a.getTranslateY() - polygons[j][l].getLayoutY()) <= 20 &&
                                box[j][l] == 0 && box[j + 1][l + 1] == 0 && box[j + 2][l + 2] == 0
                                && (box[j + 3][l + 3 - j] == 0 && box[j + 4][l + 2 - j] == 0 && j != 0 ||
                                j == 0 && box[j + 3][l + 2] == 0 && box[j + 4][l + 2] == 0)){
                            box[j][l] = 1;
                            box[j + 1][l + 1] = 1;
                            box[j + 2][l + 2] = 1;
                            polygons[j][l].setFill(det.color);
                            polygons[j + 1][l + 1].setFill(det.color);
                            polygons[j + 2][l + 2].setFill(det.color);
                            if (j == 0) {
                                box[j + 3][l + 2] = 1;
                                box[j + 4][l + 2] = 1;
                                polygons[j + 3][l + 2].setFill(det.color);
                                polygons[j + 4][l + 2].setFill(det.color);
                            } else{
                                box[j + 3][l + 3 - j] = 1;
                                box[j + 4][l + 2 - j] = 1;
                                polygons[j + 3][l + 3 - j].setFill(det.color);
                                polygons[j + 4][l + 2 - j].setFill(det.color);
                            }
                            return true;
                        }
                    }
                }
                for (int j = 3; j < 5; j++) {
                    for (int l = j - 2; l < polygons[j].length - j + 2; l++) {
                        if (Math.abs(det.a.getTranslateX() - polygons[j][l].getLayoutX()) <= 20 &&
                                Math.abs(det.a.getTranslateY() - polygons[j][l].getLayoutY()) <= 20 && box[j][l] == 0
                                && box[j + 1][l + 4 - j] == 0 && box[j + 2][l + 4 - j] == 0 &&
                                box[j + 3][l + 3 - j] == 0 && box[j + 4][l + 2 - j] == 0){
                            box[j][l] = 1;
                            box[j + 1][l + 4 - j] = 1;
                            box[j + 2][l + 4 - j] = 1;
                            box[j + 3][l + 3 - j] = 1;
                            box[j + 4][l + 2 - j] = 1;
                            polygons[j][l].setFill(det.color);
                            polygons[j + 1][l + 4 - j].setFill(det.color);
                            polygons[j + 2][l + 4 - j].setFill(det.color);
                            polygons[j + 3][l + 3 - j].setFill(det.color);
                            polygons[j + 4][l + 2 - j].setFill(det.color);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    private void stack(){
        int k;
        int[][] box1 = new int[9][];
        for (int j = 0; j < 9; j++) {
            box1[j] = box[j].clone();
        }
        Color color = Color.web("#eeebe3");
        for (int j = 0; j < 9; j++) {
            int[] line = box1[j];
            k = Arrays.stream(line).sum();
            if (k == line.length){
                score += k;
                for (int l = 0; l < line.length; l++) {
                    polygons[j][l].setFill(color);
                    box[j][l] = 0;
                }
            }
        }
        int s;
        int c;
        int p;
        k = 0;
        for (int l = 0; l < 9; l++) {
            s = 0;
            c = 0;
            if (l > 4) k = l - 4;
            if (l < 5) p = l + 5;
            else p = 9;
            for (int j = k; j < p; j++) {
                if (j > 4) s += box1[j][l + 4 - j];
                else s += box1[j][l];
                c += 1;
            }
            if (s == c) {
                score += s;
                if (l > 4) k = l - 4;
                if (l < 5) p = l + 5;
                else p = 9;
                for (int j = k; j < p; j++) {
                    if (j > 4) {
                        polygons[j][l + 4 - j].setFill(color);
                        box[j][l + 4 - j] = 0;
                    } else {
                        polygons[j][l].setFill(color);
                        box[j][l] = 0;
                    }
                }
            }
        }
        for (int l = 0; l < 9; l++) {
            s = 0;
            c = 0;
            if (l < 5) {
                k = 4 - l;
                p = 9;
            } else {
                k = 0;
                p = 13 - l;
            }
            for (int j = k; j < p; j++) {
                if (j > 3) s += box1[j][l];
                else s += box1[j][l + j - 4];
                c += 1;
            }
            if (c == s){
                score += s;
                if (l < 5) {
                    k = 4 - l;
                    p = 9;
                } else {
                    k = 0;
                    p = 13 - l;
                }
                for (int j = k; j < p; j++) {
                    if (j > 3) {
                        box[j][l] = 0;
                        polygons[j][l].setFill(color);
                    } else {
                        box[j][l+ j - 4] = 0;
                        polygons[j][l + j - 4].setFill(color);
                    }
                }
            }
        }
        scoreTable.setText(String.valueOf(score));
    }

}



