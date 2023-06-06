module com.example.haxatetris {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires com.almasb.fxgl.all;

    opens com.example.haxatetris to javafx.fxml;
    exports com.example.haxatetris;
}