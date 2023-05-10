package com.concesionaria.villaLuro.service;

import com.concesionaria.villaLuro.entity.Cliente;
import com.concesionaria.villaLuro.entity.Empleado;
import com.concesionaria.villaLuro.entity.Vehiculo;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface VehiculoService {

    public Vehiculo ingresarVehiculo(String marca, String modelo, Integer precio, Date fechaDeFabricacion, Cliente clienteComprador, Empleado empleadoVendedor);

    public List<Vehiculo> listadoDeVehiculos();

    public Optional<Vehiculo> buscarVehiculoPorId(Integer id);

    public Optional<Vehiculo> buscarVehiculoPorMara(String marca);

    public List<Vehiculo> buscarVehiculoPorMarcaYModelo(String marca, String modelo);
}
