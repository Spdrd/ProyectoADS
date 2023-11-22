package com.example.demo1.eventos;

import com.example.demo1.RentasApplication;
import com.example.demo1.negocio.INegocioRentarCarro;
import com.example.demo1.negocio.NegocioRentarCarro;
import javafx.event.ActionEvent;

public class EventosPagarRenta {
    INegocioRentarCarro negocio = (INegocioRentarCarro) new NegocioRentarCarro();
    RentasApplication aplicacion;
    public void setAplicacion(RentasApplication aplicacion){
        this.aplicacion = aplicacion;
    }
    public void onClickRestar1000(ActionEvent actionEvent) {
    }

    public void onClickAniadir1000(ActionEvent actionEvent) {
    }

    public void onClickAniadir500(ActionEvent actionEvent) {
    }

    public void onClickRestar500(ActionEvent actionEvent) {
    }

    public void onClickAniadir200(ActionEvent actionEvent) {
    }

    public void onClickRestar200(ActionEvent actionEvent) {
    }

    public void onClickAniadir100(ActionEvent actionEvent) {
    }

    public void onClickRestar100(ActionEvent actionEvent) {
    }

    public void onClickPagar(ActionEvent actionEvent) {
        aplicacion.abrirIniciarRenta();
    }
}
