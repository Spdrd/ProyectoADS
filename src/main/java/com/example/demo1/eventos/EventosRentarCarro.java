package com.example.demo1.eventos;

import com.example.demo1.RentasApplication;
import com.example.demo1.negocio.INegocioRentarCarro;
import com.example.demo1.negocio.NegocioRentarCarro;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class EventosRentarCarro {
    INegocioRentarCarro negocio = (INegocioRentarCarro) new NegocioRentarCarro();
    RentasApplication aplicacion;
    public void setAplicacion(RentasApplication aplicacion){
        this.aplicacion = aplicacion;
    }
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}