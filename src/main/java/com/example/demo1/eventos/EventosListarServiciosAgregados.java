package com.example.demo1.eventos;

import com.example.demo1.RentasApplication;
import com.example.demo1.negocio.INegocioRentarCarro;
import com.example.demo1.negocio.NegocioRentarCarro;
import javafx.event.ActionEvent;

public class EventosListarServiciosAgregados {

    private INegocioRentarCarro negocio = (INegocioRentarCarro) new NegocioRentarCarro();
    private RentasApplication aplicacion;
    public void onClickAgregarP(ActionEvent actionEvent) {
    }

    public void onClickRestarP(ActionEvent actionEvent) {
    }

    public void onClickEliminar(ActionEvent actionEvent) {
    }

    public void onClickPagar(ActionEvent actionEvent) {
        aplicacion.abrirPagarRenta();
    }

    public void onClickAgregarServicio(ActionEvent actionEvent) {
        aplicacion.abrirAgregarServicio();
    }
    public void setAplicacion(RentasApplication aplicacion){
        this.aplicacion = aplicacion;
    }
}
