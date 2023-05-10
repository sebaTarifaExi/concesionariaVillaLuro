package com.concesionaria.villaLuro.service;

import com.concesionaria.villaLuro.entity.Cliente;
import com.concesionaria.villaLuro.entity.Empleado;
import com.concesionaria.villaLuro.entity.Vehiculo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface EmpleadoService {

    public Empleado ingresarEmpleado(String nombre, Vehiculo vehiculoVendido, Integer comisionPorVenta, Cliente clienteAlQueSeLeVendio);

    public List<Empleado> listadoDeEmpleados();
}
