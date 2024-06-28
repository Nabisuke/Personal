module com.oop.tutorial.table_view {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.tutorial.table_view to javafx.fxml;
    exports com.oop.tutorial.table_view;
}