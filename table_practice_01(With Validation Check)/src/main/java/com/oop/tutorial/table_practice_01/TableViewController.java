package com.oop.tutorial.table_practice_01;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class TableViewController implements Initializable {
    @FXML
    private TextField txtID;
    @FXML
    private TableView<Person> Table;
    @FXML
    private TextField txtName;
    @FXML
    private TableColumn<Person, String> nameColumn;
    @FXML
    private TextField txtCountry;
    @FXML
    private TableColumn<Person, String> countryColumn;
    @FXML
    private TableColumn<Person, String> idColumn;

    private final List<Person> personList = new ArrayList<>();
    private final ObservableList<Person> observablePersonList = FXCollections.observableArrayList();

    @FXML
    public void btnClearTable(ActionEvent actionEvent) {
        // Clear both the TableView and the personList
        Table.getItems().clear();
        personList.clear();
    }

    @FXML
    public void btnInsert(ActionEvent actionEvent) {
        String name = txtName.getText();
        String id = txtID.getText();
        String country = txtCountry.getText();

        StringBuilder errors = new StringBuilder();

        if (name.isEmpty()) {
            errors.append("Name field is empty.\n");
        }
        if (id.isEmpty()) {
            errors.append("ID field is empty.\n");
        } else if (!id.matches("\\d{7}")) { // Check if the ID is exactly 7 digits
            errors.append("ID must be exactly 7 digits.\n");
        }
        if (country.isEmpty()) {
            errors.append("Country field is empty.\n");
        }

        if (errors.length() > 0) {
            showAlert("Validation Error", errors.toString());
        } else {
            personList.add(new Person(name, id, country));
            // Clear the text fields
            txtName.clear();
            txtID.clear();
            txtCountry.clear();
        }
    }

    @FXML
    public void btnDisplay(ActionEvent actionEvent) {
        observablePersonList.clear();
        observablePersonList.addAll(personList);
        Table.setItems(observablePersonList);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        countryColumn.setCellValueFactory(new PropertyValueFactory<>("country"));
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
