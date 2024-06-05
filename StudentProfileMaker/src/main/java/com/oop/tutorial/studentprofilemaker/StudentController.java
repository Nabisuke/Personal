package com.oop.tutorial.studentprofilemaker;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class StudentController
{
    @javafx.fxml.FXML
    private RadioButton maleRadiobutton;
    @javafx.fxml.FXML
    private TextField idTextfield;
    @javafx.fxml.FXML
    private DatePicker dobDatepicker;
    @javafx.fxml.FXML
    private TextArea displayTextarea;
    @javafx.fxml.FXML
    private ComboBox<String> nationCombobox;
    @javafx.fxml.FXML
    private RadioButton femaleRadiobutton;
    @javafx.fxml.FXML
    private TextField nameTextfield;

    @javafx.fxml.FXML
    public void initialize() {
        nationCombobox.getItems().addAll("Bangladeshi","Sri Lankan","Pakistani");
        ToggleGroup toggleGroup = new ToggleGroup();
        maleRadiobutton.setToggleGroup(toggleGroup);
        femaleRadiobutton.setToggleGroup(toggleGroup);
    }

    @javafx.fxml.FXML
    public void CreateProfileOnAction(ActionEvent actionEvent) {

        String name = nameTextfield.getText();
        String id = idTextfield.getText();
        String dob = dobDatepicker.getValue().toString();
        String nationality = nationCombobox.getValue();

        String gender;
        if(maleRadiobutton.isSelected()){
            gender = "Male";

        }
        else{
            gender = "Female";
        }

        Student student = new Student(name, id, nationality, dob, gender);
        displayTextarea.appendText(student.toString());
    }
}