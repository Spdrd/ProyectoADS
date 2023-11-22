package com.example.demo1.eventos;

import com.example.demo1.RentasApplication;
import com.example.demo1.negocio.INegocioRentarCarro;
import com.example.demo1.negocio.NegocioRentarCarro;
import javafx.event.ActionEvent;

public class EventosAgregarServicio {

    RentasApplication aplicacion;
    public void setAplicacion(RentasApplication aplicacion){
        this.aplicacion = aplicacion;
    }
    INegocioRentarCarro negocio = (INegocioRentarCarro) new NegocioRentarCarro();
    public void onCLickRestar(ActionEvent actionEvent) {
    }

    public void onClickAgregar(ActionEvent actionEvent) {
    }

    public void onClickContratar(ActionEvent actionEvent) {
        aplicacion.abrirListarServiciosAgregados();
    }
}
