module org.hugo.ejerciciop {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.hugo.ejerciciop to javafx.fxml;
    exports org.hugo.ejerciciop;
}