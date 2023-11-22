package com.example.demo1.negocio;

import com.example.demo1.dominio.*;
import com.example.demo1.integracion.*;

import java.util.List;
public class NegocioRentarCarro implements INegocioRentarCarro{
    private IIntegracionJson integrador = (IIntegracionJson) new IntegracionJson();
    private List<Carro> carros;
    public Renta iniciarRenta(){
        return integrador.iniciarRenta();
    }
    public Servicio agregarServicio(){
        return integrador.agregarServicio();
    }
    public List<Servicio> listarServiciosAgregados(){
        return integrador.listarServiciosAgregados();
    }
    @Override
    public Cliente login(){
        return null;
    }
    public Renta pagarRenta(){
        return integrador.pagarRenta();
    }

    @Override
    public Renta crearRenta() {
        return integrador.crearRenta();
    }

    @Override
    public List<Carro> cargarCarros() {
        return integrador.cargarCarros();
    }

    @Override
    public List<Pago> cargarPagos() {
        return integrador.cargarPagos();
    }
}
