package com.example.demo1.negocio;

import com.example.demo1.dominio.*;
import com.example.demo1.integracion.*;

import java.util.List;
public class NegocioRentarCarro implements INegocioRentarCarro{

    private IIntegracionJson integra = (IIntegracionJson) new IntegracionJson();

    public Renta iniciarRenta(){
        return integra.iniciarRenta();
    }
    public Servicio agregarServicio(){
        return integra.agregarServicio();
    }
    public List<Servicio> listarServiciosAgregados(){
        return integra.listarServiciosAgregados();
    }
    public Cliente login(){
        return integra.login();
    }
    public Renta pagarRenta(){
        return integra.pagarRenta();
    }

    @Override
    public Renta crearRenta() {
        return integra.crearRenta();
    }

    @Override
    public List<Carro> obtenerCarro() {
        return integra.obtenerCarro();
    }

    @Override
    public List<Pago> obtenerPagos() {
        return integra.obtenerPagos();
    }
}
