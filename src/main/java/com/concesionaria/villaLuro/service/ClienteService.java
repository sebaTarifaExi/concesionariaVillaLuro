package com.concesionaria.villaLuro.service;

import com.concesionaria.villaLuro.entity.Cliente;
import com.concesionaria.villaLuro.entity.Empleado;
import com.concesionaria.villaLuro.entity.Vehiculo;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public interface ClienteService {

    public Cliente insertarCliente(String nombre, Date fechaDeCompra, Vehiculo vehiculoComprado, Empleado empleadoAlQueLeCompro);

    public List<Cliente> ListadoDeAlumnos();

    public Optional<Cliente> buscarClientePorId(Integer id);

    public Optional<Cliente> buscarClientePorNombre(String nombre);
}
