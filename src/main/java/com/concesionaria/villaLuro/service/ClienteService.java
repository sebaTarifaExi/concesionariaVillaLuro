package com.concesionaria.villaLuro.service;

import com.concesionaria.villaLuro.entity.Cliente;
import com.concesionaria.villaLuro.entity.Empleado;
import com.concesionaria.villaLuro.entity.Vehiculo;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public interface ClienteService {

    public Cliente insertarCliente(String nombre, Date fechaDeCompra, Vehiculo vehiculoComprado, Empleado empleadoAlQueLeCompro);

    public List<Cliente> ListadoDeAlumnos();
}
