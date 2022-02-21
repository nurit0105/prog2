module com.example.points {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.points to javafx.fxml;
    exports com.example.points;
}