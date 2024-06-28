package com.oop.tutorial.table_view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class TableViewController implements Initializable {
    @javafx.fxml.FXML
    private TableColumn<Person, String> lastName;
    @javafx.fxml.FXML
    private TableColumn<Person,String> firstName;
    @javafx.fxml.FXML
    private TableColumn<Person,String> origin;
    @javafx.fxml.FXML
    private TableView<Person> table;
    @javafx.fxml.FXML
    private TextField txtFName;
    @javafx.fxml.FXML
    private TextField txtLName;
    @javafx.fxml.FXML
    private TextField txtOrigin;


    ObservableList<Person> initialData(){
        return FXCollections.observableArrayList();
    }

    @FXML
    private void btnInsert(ActionEvent event){
        Person newData = new Person(txtFName.getText(), txtLName.getText(), txtOrigin.getText());
        table.getItems().add(newData);
        txtFName.clear();
        txtLName.clear();
        txtOrigin.clear();
    }

    @FXML
    private void btnClearTable(ActionEvent event) {
        table.getItems().clear();
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        firstName.setCellValueFactory(new PropertyValueFactory<Person,String>("firstName"));
        lastName.setCellValueFactory(new PropertyValueFactory<Person, String>("lastName"));
        origin.setCellValueFactory(new PropertyValueFactory<Person, String>("origin"));

        table.setItems(initialData());
    }
}
