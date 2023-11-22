package com.example.demo1.eventos;

import com.example.demo1.RentasApplication;
import com.example.demo1.negocio.INegocioRentarCarro;
import com.example.demo1.negocio.NegocioRentarCarro;
import javafx.event.ActionEvent;

public class EventosIniciarRenta {
    RentasApplication aplicacion;
    INegocioRentarCarro negocio = (INegocioRentarCarro) new NegocioRentarCarro();
    public void onClickRentar(ActionEvent actionEvent) {
        aplicacion.abrirListarServiciosAgregados();
    }
    public void setAplicacion(RentasApplication aplicacion){
        this.aplicacion = aplicacion;
    }
}
