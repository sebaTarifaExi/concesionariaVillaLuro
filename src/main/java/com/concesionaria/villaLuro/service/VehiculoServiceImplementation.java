package com.concesionaria.villaLuro.service;

import com.concesionaria.villaLuro.entity.Cliente;
import com.concesionaria.villaLuro.entity.Empleado;
import com.concesionaria.villaLuro.entity.Vehiculo;
import com.concesionaria.villaLuro.repository.VehiculoRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public class VehiculoServiceImplementation implements VehiculoService{

    private VehiculoRepository vehiculoRepository;

    public VehiculoServiceImplementation(VehiculoRepository vehiculoRepository) {
        this.vehiculoRepository = vehiculoRepository;
    }

    @Override
    public Vehiculo ingresarVehiculo(String marca, String modelo, Integer precio, Date fechaDeFabricacion, Cliente clienteComprador, Empleado empleadoVendedor) {
        Vehiculo nuevoVehiculo = new Vehiculo();
        nuevoVehiculo.setMarca(marca);
        nuevoVehiculo.setModelo(modelo);
        nuevoVehiculo.setPrecio(precio);
        nuevoVehiculo.setFechaDeFabricacion(fechaDeFabricacion);
        nuevoVehiculo.setClienteComprador(clienteComprador);
        nuevoVehiculo.setEmpleadoVendedor(empleadoVendedor);
        return vehiculoRepository.save(nuevoVehiculo);
    }

    @Override
    public List<Vehiculo> listadoDeVehiculos() {
        return vehiculoRepository.findAll();
    }

    @Override
    public Optional<Vehiculo> buscarVehiculoPorId(Integer id) {
        return vehiculoRepository.findById(id);
    }

    @Override
    public Optional<Vehiculo> buscarVehiculoPorMara(String marca) {
        return vehiculoRepository.findByMarca(marca);
    }

    @Override
    public List<Vehiculo> buscarVehiculoPorMarcaYModelo(String marca, String modelo) {
        return vehiculoRepository.findByMarcaAndModelo(marca, modelo);
    }

    public VehiculoRepository getVehiculoRepository() {
        return vehiculoRepository;
    }

    public void setVehiculoRepository(VehiculoRepository vehiculoRepository) {
        this.vehiculoRepository = vehiculoRepository;
    }
}
