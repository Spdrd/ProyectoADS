module com.example.demo1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires json.simple;
    requires java.xml;


    opens com.example.demo1 to javafx.fxml;
    exports com.example.demo1;
    exports com.example.demo1.eventos;
    opens com.example.demo1.eventos to javafx.fxml;
}