module ma.enset.javafxchat {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;


    opens ma.enset.javafxchat to javafx.fxml;
    exports ma.enset.javafxchat;
}