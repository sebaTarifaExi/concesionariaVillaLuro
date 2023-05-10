package com.concesionaria.villaLuro.repository;

import com.concesionaria.villaLuro.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {

    public Optional<Empleado> findByNombre(String nombre);
}
