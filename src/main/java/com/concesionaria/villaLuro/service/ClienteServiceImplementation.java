package com.concesionaria.villaLuro.service;

import com.concesionaria.villaLuro.entity.Cliente;
import com.concesionaria.villaLuro.entity.Empleado;
import com.concesionaria.villaLuro.entity.Vehiculo;
import com.concesionaria.villaLuro.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
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

    public ClienteRepository getClienteRepository() {
        return clienteRepository;
    }

    public void setClienteRepository(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }
}
