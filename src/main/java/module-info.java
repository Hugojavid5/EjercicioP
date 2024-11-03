module org.hugo.ejerciciop {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires org.hugo.ejercicioo;
    opens org.hugo.ejerciciop to javafx.fxml;
    exports org.hugo.ejerciciop;
}