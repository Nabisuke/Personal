module com.oop.tutorial.studentprofilemaker {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.tutorial.studentprofilemaker to javafx.fxml;
    exports com.oop.tutorial.studentprofilemaker;
}