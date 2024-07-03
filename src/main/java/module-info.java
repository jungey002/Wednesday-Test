module com.example.wednesdaytest {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.wednesdaytest to javafx.fxml;
    exports com.example.wednesdaytest;
}