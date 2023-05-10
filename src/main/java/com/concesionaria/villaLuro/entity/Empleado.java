package com.concesionaria.villaLuro.entity;

import javax.persistence.*;

@Entity
@Table(name = "Empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleado", nullable = false, unique = true)
    private Integer id;
    @Column(length = 50)
    private String nombre;
    @Column(length = 50)
    private Vehiculo vehiculoVendido;
    @Column(length = 50)
    private Integer comisionPorVenta;
    @Column(length = 50)
    private Cliente clienteAlQueSeLeVendioElVehiculo;

    public Empleado(){

    }

    public Empleado(Integer id, String nombre, Vehiculo vehiculoVendido, Integer comisionPorVenta, Cliente clienteAlQueSeLeVendioElVehiculo) {
        this.id = id;
        this.nombre = nombre;
        this.vehiculoVendido = vehiculoVendido;
        this.comisionPorVenta = comisionPorVenta;
        this.clienteAlQueSeLeVendioElVehiculo = clienteAlQueSeLeVendioElVehiculo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Vehiculo getVehiculoVendido() {
        return vehiculoVendido;
    }

    public void setVehiculoVendido(Vehiculo vehiculoVendido) {
        this.vehiculoVendido = vehiculoVendido;
    }

    public Integer getComisionPorVenta() {
        return comisionPorVenta;
    }

    public void setComisionPorVenta(Integer comisionPorVenta) {
        this.comisionPorVenta = comisionPorVenta;
    }

    public Cliente getClienteAlQueSeLeVendioElVehiculo() {
        return clienteAlQueSeLeVendioElVehiculo;
    }

    public void setClienteAlQueSeLeVendioElVehiculo(Cliente clienteAlQueSeLeVendioElVehiculo) {
        this.clienteAlQueSeLeVendioElVehiculo = clienteAlQueSeLeVendioElVehiculo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", vehiculoVendido=" + vehiculoVendido +
                ", comisionPorVenta=" + comisionPorVenta +
                ", clienteAlQueSeLeVendioElVehiculo=" + clienteAlQueSeLeVendioElVehiculo +
                '}';
    }
}
