package com.concesionaria.villaLuro.repository;

import com.concesionaria.villaLuro.entity.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface VehiculoRepository extends JpaRepository<Vehiculo, Integer> {

    public Optional<Vehiculo> findByMarca(String marca);
    public List<Vehiculo> findByMarcaAndModelo(String marca, String modelo);
}
