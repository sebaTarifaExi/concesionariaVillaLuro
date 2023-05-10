package com.concesionaria.villaLuro.repository;

import com.concesionaria.villaLuro.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    public Optional<Cliente> findByNombre(String nombre);
}
