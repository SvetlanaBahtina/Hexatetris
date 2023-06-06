package com.example.haxatetris;

import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

import java.util.Random;


public class Form {
    Polygon a;
    Polygon b;
    Polygon c;
    Polygon d;
    Polygon e;
    Color color;
    private final String name;
    private final Color stroke = Color.web("#1f5b91");
    public Form (Polygon a, String name) {
        this.name = name;
        this.a = a;
        this.color = getColor();
        this.a.setFill(this.color);
        this.a.setStroke(stroke);
        this.a.setStrokeWidth(5);
    }
    public Form (Polygon a, Polygon b, String name) {
        this.name = name;
        this.a = a;
        this.b = b;
        this.color = getColor();
        this.a.setFill(this.color);
        this.a.setStroke(stroke);
        this.a.setStrokeWidth(5);
        this.b.setFill(this.color);
        this.b.setStroke(stroke);
        this.b.setStrokeWidth(5);
    }
    public Form (Polygon a, Polygon b, Polygon c, String name) {
        this.name = name;
        this.a = a;
        this.b = b;
        this.c = c;
        this.color = getColor();
        this.a.setFill(this.color);
        this.a.setStroke(stroke);
        this.a.setStrokeWidth(5);
        this.b.setFill(this.color);
        this.b.setStroke(stroke);
        this.b.setStrokeWidth(5);
        this.c.setFill(this.color);
        this.c.setStroke(stroke);
        this.c.setStrokeWidth(5);
    }
    public Form (Polygon a, Polygon b, Polygon c, Polygon d, String name){
        this.name = name;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.color = getColor();
        this.a.setFill(this.color);
        this.a.setStroke(stroke);
        this.a.setStrokeWidth(5);
        this.b.setFill(this.color);
        this.b.setStroke(stroke);
        this.b.setStrokeWidth(5);
        this.c.setFill(this.color);
        this.c.setStroke(stroke);
        this.c.setStrokeWidth(5);
        this.d.setFill(this.color);
        this.d.setStroke(stroke);
        this.d.setStrokeWidth(5);
    }
    public Form (Polygon a, Polygon b, Polygon c, Polygon d, Polygon e, String name) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.name = name;
        this.color = getColor();
        this.a.setFill(this.color);
        this.a.setStroke(stroke);
        this.a.setStrokeWidth(5);
        this.b.setFill(this.color);
        this.b.setStroke(stroke);
        this.b.setStrokeWidth(5);
        this.c.setFill(this.color);
        this.c.setStroke(stroke);
        this.c.setStrokeWidth(5);
        this.d.setFill(this.color);
        this.d.setStroke(stroke);
        this.d.setStrokeWidth(5);
        this.e.setFill(this.color);
        this.e.setStroke(stroke);
        this.e.setStrokeWidth(5);
    }
    public String getName(){
        return name;
    }
    public Form setCoordinates(int i, AnchorPane pane){
        switch (this.getName()) {
            case "1" -> {
                pane.getChildren().addAll(this.a);
                switch (i) {
                    case 0 -> {
                        this.a.setTranslateX(166);
                        this.a.setTranslateY(700);
                    }
                    case 1 -> {
                        this.a.setTranslateX(500);
                        this.a.setTranslateY(700);
                    }
                    default -> {
                        this.a.setTranslateX(833);
                        this.a.setTranslateY(700);
                    }
                }
            }
            case "2r" -> {
                pane.getChildren().addAll(this.a);
                pane.getChildren().addAll(this.b);
                switch (i) {
                    case 0 -> {
                        this.a.setTranslateX(153.5);
                        this.a.setTranslateY(722);
                        this.b.setTranslateX(178.5);
                        this.b.setTranslateY(678);
                    }
                    case 1 -> {
                        this.a.setTranslateX(487.5);
                        this.a.setTranslateY(722);
                        this.b.setTranslateX(512.5);
                        this.b.setTranslateY(678);
                    }
                    case 2 -> {
                        this.a.setTranslateX(820.5);
                        this.a.setTranslateY(722);
                        this.b.setTranslateX(845.5);
                        this.b.setTranslateY(678);
                    }
                }
            }
            case "2l" -> {
                pane.getChildren().addAll(this.a);
                pane.getChildren().addAll(this.b);
                switch (i) {
                    case 0 -> {
                        this.a.setTranslateX(166);
                        this.a.setTranslateY(722);
                        this.b.setTranslateX(141);
                        this.b.setTranslateY(678);
                    }
                    case 1 -> {
                        this.a.setTranslateX(500);
                        this.a.setTranslateY(722);
                        this.b.setTranslateX(475);
                        this.b.setTranslateY(678);
                    }
                    case 2 -> {
                        this.a.setTranslateX(833);
                        this.a.setTranslateY(722);
                        this.b.setTranslateX(808);
                        this.b.setTranslateY(678);
                    }
                }
            }
            case "3d" -> {
                pane.getChildren().addAll(this.a);
                pane.getChildren().addAll(this.b);
                pane.getChildren().addAll(this.c);
                switch (i) {
                    case 0 -> {
                        this.a.setTranslateX(141);
                        this.a.setTranslateY(686);
                        this.b.setTranslateX(191);
                        this.b.setTranslateY(686);
                        this.c.setTranslateX(166);
                        this.c.setTranslateY(730);
                    }
                    case 1 -> {
                        this.a.setTranslateX(475);
                        this.a.setTranslateY(686);
                        this.b.setTranslateX(525);
                        this.b.setTranslateY(686);
                        this.c.setTranslateX(500);
                        this.c.setTranslateY(730);
                    }
                    case 2 -> {
                        this.a.setTranslateX(808);
                        this.a.setTranslateY(686);
                        this.b.setTranslateX(858);
                        this.b.setTranslateY(686);
                        this.c.setTranslateX(833);
                        this.c.setTranslateY(730);
                    }
                }
            }
            case "3u" -> {
                pane.getChildren().addAll(this.a);
                pane.getChildren().addAll(this.b);
                pane.getChildren().addAll(this.c);
                switch (i) {
                    case 0 -> {
                        this.a.setTranslateX(141);
                        this.a.setTranslateY(714);
                        this.b.setTranslateX(166);
                        this.b.setTranslateY(670);
                        this.c.setTranslateX(191);
                        this.c.setTranslateY(714);
                    }
                    case 1 -> {
                        this.a.setTranslateX(475);
                        this.a.setTranslateY(714);
                        this.b.setTranslateX(500);
                        this.b.setTranslateY(670);
                        this.c.setTranslateX(525);
                        this.c.setTranslateY(714);
                    }
                    case 2 -> {
                        this.a.setTranslateX(808);
                        this.a.setTranslateY(714);
                        this.b.setTranslateX(833);
                        this.b.setTranslateY(670);
                        this.c.setTranslateX(858);
                        this.c.setTranslateY(714);
                    }
                }
            }
            case "4" -> {
                pane.getChildren().addAll(this.a);
                pane.getChildren().addAll(this.b);
                pane.getChildren().addAll(this.c);
                pane.getChildren().addAll(this.d);
                switch (i) {
                    case 0 -> {
                        this.a.setTranslateX(141);
                        this.a.setTranslateY(700);
                        this.b.setTranslateX(166);
                        this.b.setTranslateY(656);
                        this.c.setTranslateX(191);
                        this.c.setTranslateY(700);
                        this.d.setTranslateX(166);
                        this.d.setTranslateY(744);
                    }
                    case 1 -> {
                        this.a.setTranslateX(475);
                        this.a.setTranslateY(700);
                        this.b.setTranslateX(500);
                        this.b.setTranslateY(656);
                        this.c.setTranslateX(525);
                        this.c.setTranslateY(700);
                        this.d.setTranslateX(500);
                        this.d.setTranslateY(744);
                    }
                    case 2 -> {
                        this.a.setTranslateX(808);
                        this.a.setTranslateY(700);
                        this.b.setTranslateX(833);
                        this.b.setTranslateY(656);
                        this.c.setTranslateX(858);
                        this.c.setTranslateY(700);
                        this.d.setTranslateX(833);
                        this.d.setTranslateY(744);
                    }
                }
            }
            case "4l" -> {
                pane.getChildren().addAll(this.a);
                pane.getChildren().addAll(this.b);
                pane.getChildren().addAll(this.c);
                pane.getChildren().addAll(this.d);
                switch (i) {
                    case 0 -> {
                        this.a.setTranslateX(91);
                        this.a.setTranslateY(700);
                        this.b.setTranslateX(141);
                        this.b.setTranslateY(700);
                        this.c.setTranslateX(191);
                        this.c.setTranslateY(700);
                        this.d.setTranslateX(241);
                        this.d.setTranslateY(700);
                    }
                    case 1 -> {
                        this.a.setTranslateX(425);
                        this.a.setTranslateY(700);
                        this.b.setTranslateX(475);
                        this.b.setTranslateY(700);
                        this.c.setTranslateX(525);
                        this.c.setTranslateY(700);
                        this.d.setTranslateX(575);
                        this.d.setTranslateY(700);
                    }
                    case 2 -> {
                        this.a.setTranslateX(758);
                        this.a.setTranslateY(700);
                        this.b.setTranslateX(808);
                        this.b.setTranslateY(700);
                        this.c.setTranslateX(858);
                        this.c.setTranslateY(700);
                        this.d.setTranslateX(908);
                        this.d.setTranslateY(700);
                    }
                }
            }
            case "5r" -> {
                pane.getChildren().addAll(this.a);
                pane.getChildren().addAll(this.b);
                pane.getChildren().addAll(this.c);
                pane.getChildren().addAll(this.d);
                pane.getChildren().addAll(this.e);
                switch (i) {
                    case 0 -> {
                        this.a.setTranslateX(141);
                        this.a.setTranslateY(612);
                        this.b.setTranslateX(166);
                        this.b.setTranslateY(656);
                        this.c.setTranslateX(191);
                        this.c.setTranslateY(700);
                        this.d.setTranslateX(166);
                        this.d.setTranslateY(744);
                        this.e.setTranslateX(141);
                        this.e.setTranslateY(788);
                    }
                    case 1 -> {
                        this.a.setTranslateX(475);
                        this.a.setTranslateY(612);
                        this.b.setTranslateX(500);
                        this.b.setTranslateY(656);
                        this.c.setTranslateX(525);
                        this.c.setTranslateY(700);
                        this.d.setTranslateX(500);
                        this.d.setTranslateY(744);
                        this.e.setTranslateX(475);
                        this.e.setTranslateY(788);
                    }
                    case 2 -> {
                        this.a.setTranslateX(808);
                        this.a.setTranslateY(612);
                        this.b.setTranslateX(833);
                        this.b.setTranslateY(656);
                        this.c.setTranslateX(858);
                        this.c.setTranslateY(700);
                        this.d.setTranslateX(833);
                        this.d.setTranslateY(744);
                        this.e.setTranslateX(808);
                        this.e.setTranslateY(788);
                    }
                }
            }
            default -> {
                pane.getChildren().addAll(this.a);
                pane.getChildren().addAll(this.b);
                pane.getChildren().addAll(this.c);
                pane.getChildren().addAll(this.d);
                pane.getChildren().addAll(this.e);
                switch (i) {
                    case 0 -> {
                        this.a.setTranslateX(191);
                        this.a.setTranslateY(612);
                        this.b.setTranslateX(166);
                        this.b.setTranslateY(656);
                        this.c.setTranslateX(141);
                        this.c.setTranslateY(700);
                        this.d.setTranslateX(166);
                        this.d.setTranslateY(744);
                        this.e.setTranslateX(191);
                        this.e.setTranslateY(788);
                    }
                    case 1 -> {
                        this.a.setTranslateX(525);
                        this.a.setTranslateY(612);
                        this.b.setTranslateX(500);
                        this.b.setTranslateY(656);
                        this.c.setTranslateX(475);
                        this.c.setTranslateY(700);
                        this.d.setTranslateX(500);
                        this.d.setTranslateY(744);
                        this.e.setTranslateX(525);
                        this.e.setTranslateY(788);
                    }
                    case 2 -> {
                        this.a.setTranslateX(858);
                        this.a.setTranslateY(612);
                        this.b.setTranslateX(833);
                        this.b.setTranslateY(656);
                        this.c.setTranslateX(808);
                        this.c.setTranslateY(700);
                        this.d.setTranslateX(833);
                        this.d.setTranslateY(744);
                        this.e.setTranslateX(858);
                        this.e.setTranslateY(788);
                    }
                }
            }
        }
        return this;
    }
    private Color getColor(){
        Random r = new Random();
        int col = r.nextInt(5);
        switch (col) {
            case 0 -> {return Color.web("#FB7282");}
            case 1 -> { return Color.web("#FFB673");}
            case 2 -> {return Color.web("#B76CE1");}
            case 3 -> {return Color.web("#88F16D");}
            case 4 -> {return Color.web("#63DBDB");}
            default -> {return Color.rgb(210, 180, 140);}
        }
    }

}
