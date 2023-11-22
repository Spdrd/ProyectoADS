package com.example.demo1.eventos;

import com.example.demo1.RentasApplication;
import com.example.demo1.negocio.INegocioRentarCarro;
import com.example.demo1.negocio.NegocioRentarCarro;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class EventosLogin {
    INegocioRentarCarro eventos = (INegocioRentarCarro) new NegocioRentarCarro();

    @FXML
    TextField txtFieldUsuario;
    @FXML
    Button botonEntrar;
    private RentasApplication aplicacion;

    public void onClickEntrar(ActionEvent actionEvent){
        aplicacion.abrirIniciarRenta();
    }
    public void setAplicacion(RentasApplication app)
    {
        this.aplicacion = app;
    }
}
