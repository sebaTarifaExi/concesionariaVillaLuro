package com.concesionaria.villaLuro.service;

import com.concesionaria.villaLuro.entity.Cliente;
import com.concesionaria.villaLuro.entity.Empleado;
import com.concesionaria.villaLuro.entity.Vehiculo;
import com.concesionaria.villaLuro.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImplementation implements ClienteService{

    private ClienteRepository clienteRepository;

    public ClienteServiceImplementation(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public Cliente insertarCliente(String nombre, Date fechaDeCompra, Vehiculo vehiculoComprado, Empleado empleadoAlQueLeCompro) {
        Cliente nuevoCliente = new Cliente();
        nuevoCliente.setNombre(nombre);
        nuevoCliente.setFechaDeCompra(fechaDeCompra);
        nuevoCliente.setVehiculoComprado(vehiculoComprado);
        nuevoCliente.setEmpleadoAlQueLeCompro(empleadoAlQueLeCompro);
        return clienteRepository.save(nuevoCliente);
    }

    @Override
    public List<Cliente> ListadoDeAlumnos() {
        return clienteRepository.findAll();
    }

    @Override
    public Optional<Cliente> buscarClientePorId(Integer id) {
        return clienteRepository.findById(id);
    }

    @Override
    public Optional<Cliente> buscarClientePorNombre(String nombre) {
        return clienteRepository.findByNombre(nombre);
    }

    public ClienteRepository getClienteRepository() {
        return clienteRepository;
    }

    public void setClienteRepository(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }
}
