package com.concesionaria.villaLuro.service;

import com.concesionaria.villaLuro.entity.Cliente;
import com.concesionaria.villaLuro.entity.Empleado;
import com.concesionaria.villaLuro.entity.Vehiculo;

import java.util.Date;
import java.util.List;

public interface VehiculoService {

    public Vehiculo ingresarVehiculo(String marca, String modelo, Integer precio, Date fechaDeFabricacion, Cliente clienteComprador, Empleado empleadoVendedor);

    public List<Vehiculo> listadoDeVehiculos();
}
