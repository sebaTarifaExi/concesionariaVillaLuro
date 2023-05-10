package com.concesionaria.villaLuro.service;

import com.concesionaria.villaLuro.entity.Cliente;
import com.concesionaria.villaLuro.entity.Empleado;
import com.concesionaria.villaLuro.entity.Vehiculo;
import com.concesionaria.villaLuro.repository.EmpleadoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoServiceImplementation implements EmpleadoService{

    private EmpleadoRepository empleadoRepository;

    public EmpleadoServiceImplementation(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    @Override
    public Empleado ingresarEmpleado(String nombre, Vehiculo vehiculoVendido, Integer comisionPorVenta, Cliente clienteAlQueSeLeVendio) {
        Empleado nuevoEmpleado = new Empleado();
        nuevoEmpleado.setNombre(nombre);
        nuevoEmpleado.setVehiculoVendido(vehiculoVendido);
        nuevoEmpleado.setComisionPorVenta(comisionPorVenta);
        nuevoEmpleado.setClienteAlQueSeLeVendioElVehiculo(clienteAlQueSeLeVendio);
        return empleadoRepository.save(nuevoEmpleado);
    }

    @Override
    public List<Empleado> listadoDeEmpleados() {
        return empleadoRepository.findAll();
    }

    @Override
    public Optional<Empleado> buscarEmpleadoPorId(Integer id) {
        return empleadoRepository.findById(id);
    }

    @Override
    public Optional<Empleado> buscarEmpleadoPorNombre(String nombre) {
        return empleadoRepository.findByNombre(nombre);
    }

    public EmpleadoRepository getEmpleadoRepository() {
        return empleadoRepository;
    }

    public void setEmpleadoRepository(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }
}
