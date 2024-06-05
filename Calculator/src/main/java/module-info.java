module com.oop.tutorial.calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.tutorial.calculator to javafx.fxml;
    exports com.oop.tutorial.calculator;
}