module com.oop.tutorial.table_practice_01 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.tutorial.table_practice_01 to javafx.fxml;
    exports com.oop.tutorial.table_practice_01;
}