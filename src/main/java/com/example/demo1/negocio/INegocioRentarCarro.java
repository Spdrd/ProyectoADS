package com.example.demo1.negocio;

import com.example.demo1.dominio.*;

import java.util.List;
public interface INegocioRentarCarro {
    Renta crearRenta();
    List<Carro> cargarCarros();
    List<Pago> cargarPagos();
    Renta iniciarRenta();
    Servicio agregarServicio();
    List<Servicio> listarServiciosAgregados();
    Cliente login();
    Renta pagarRenta();
}
