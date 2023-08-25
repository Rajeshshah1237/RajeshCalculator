module com.example.rajeshcalculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.rajeshcalculator to javafx.fxml;
    exports com.example.rajeshcalculator;
}