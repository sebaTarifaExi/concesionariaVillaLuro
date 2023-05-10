package com.concesionaria.villaLuro.repository;

import com.concesionaria.villaLuro.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {

    public Optional<Empleado> findByNombre(String nombre);
}
