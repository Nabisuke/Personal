package com.oop.tutorial.calculator;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculatorController
{
    @javafx.fxml.FXML
    private TextField textfield_2;
    @javafx.fxml.FXML
    private Label answerLabel;
    @javafx.fxml.FXML
    private TextField textfield_1;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void AddOnClick(ActionEvent actionEvent) {
        String numOne = textfield_1.getText();
        String numTwo = textfield_2.getText();

        int num1 = Integer.parseInt(numOne);
        int num2 = Integer.parseInt(numTwo);

        int num3 = num1 + num2;
        String result = Integer.toString(num3);

        answerLabel.setText(result);
    }

    @javafx.fxml.FXML
    public void SubOnClick(ActionEvent actionEvent) {
        String numOne = textfield_1.getText();
        String numTwo = textfield_2.getText();

        int num1 = Integer.parseInt(numOne);
        int num2 = Integer.parseInt(numTwo);

        int num3 = num1 - num2;
        String result = Integer.toString(num3);

        answerLabel.setText(result);
    }

    @javafx.fxml.FXML
    public void DivOnClick(ActionEvent actionEvent) {
        String numOne = textfield_1.getText();
        String numTwo = textfield_2.getText();

        int num1 = Integer.parseInt(numOne);
        int num2 = Integer.parseInt(numTwo);

        if (num2 == 0){
            answerLabel.setText("Num 2 cannot be 0");
        }

        int num3 = num1 / num2;
        String result = Integer.toString(num3);

        answerLabel.setText(result);
    }

    @javafx.fxml.FXML
    public void MulOnClick(ActionEvent actionEvent) {
        String numOne = textfield_1.getText();
        String numTwo = textfield_2.getText();

        int num1 = Integer.parseInt(numOne);
        int num2 = Integer.parseInt(numTwo);

        int num3 = num1 * num2;
        String result = Integer.toString(num3);

        answerLabel.setText(result);
    }

    @javafx.fxml.FXML
    public void ClearOnClick(ActionEvent actionEvent) {
        textfield_1.clear();
        textfield_2.clear();
        answerLabel.setText("");
    }
}