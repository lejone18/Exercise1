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
    int number = 0;

    @FXML
    void decreaseButton(ActionEvent event) {
        number = number -1;
        displayer.setText(number + " lower than its previous value which was "+ Integer.toString(number +1));
    }

    @FXML
    void increaseButton(ActionEvent event) {
        number = number +1;
        displayer.setText(number + " higher than its previous value which was "+ Integer.toString(number -1));
    }
}
