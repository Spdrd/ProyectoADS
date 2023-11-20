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
    public Cliente login(){
        return integrador.login();
    }
    public Renta pagarRenta(){
        return integrador.pagarRenta();
    }

    @Override
    public Renta crearRenta() {
        return integrador.crearRenta();
    }

    @Override
    public List<Carro> obtenerCarro() {
        return integrador.obtenerCarro();
    }

    @Override
    public List<Pago> obtenerPagos() {
        return integrador.obtenerPagos();
    }
}
