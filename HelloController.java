package com.example.increasedecrease;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class HelloController {
    @FXML
    private Button decrease;

    @FXML
    private TextArea displayer;

    @FXML
    private Button increase;

    @FXML
    void decreaseButton(ActionEvent event) {
        int num2 = 5;
        int decrease = num2 - 1;
        displayer.setText( decrease +" lower than its previous value");
    }

    @FXML
    void increaseButton(ActionEvent event) {
        int num2 = 5;
        int increase = num2 + 1;
        displayer.setText(increase + " higher than its previous value");
    }
}