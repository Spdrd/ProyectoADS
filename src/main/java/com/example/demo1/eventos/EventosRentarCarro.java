package com.example.demo1.eventos;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class EventosRentarCarro {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}