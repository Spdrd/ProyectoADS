package com.example.demo1.integracion;

import com.example.demo1.dominio.*;

import java.util.List;
public interface IIntegracionJson {
    Renta crearRenta();
    List<Carro> obtenerCarro();
    List<Pago> obtenerPagos();
    Renta iniciarRenta();
    Servicio agregarServicio();
    List<Servicio> listarServiciosAgregados();
    Cliente login();
    Renta pagarRenta();
}
