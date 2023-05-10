package com.concesionaria.villaLuro.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente", nullable = false, unique = true )
    private Integer id;
    @Column(length = 50)
    private String nombre;
    @Column(length = 50)
    @Temporal(TemporalType.DATE)
    private Date fechaDeCompra;
    @Column(length = 50)
    private Vehiculo vehiculoComprado;
    @Column(length = 50)
    private Empleado empleadoAlQueLeCompro;

    public Cliente(Integer id, String nombre, Date fechaDeCompra, Vehiculo vehiculoComprado, Empleado empleadoAlQueLeCompro) {
        this.id = id;
        this.nombre = nombre;
        this.fechaDeCompra = fechaDeCompra;
        this.vehiculoComprado = vehiculoComprado;
        this.empleadoAlQueLeCompro = empleadoAlQueLeCompro;
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

    public Date getFechaDeCompra() {
        return fechaDeCompra;
    }

    public void setFechaDeCompra(Date fechaDeCompra) {
        this.fechaDeCompra = fechaDeCompra;
    }

    public Vehiculo getVehiculoComprado() {
        return vehiculoComprado;
    }

    public void setVehiculoComprado(Vehiculo vehiculoComprado) {
        this.vehiculoComprado = vehiculoComprado;
    }

    public Empleado getEmpleadoAlQueLeCompro() {
        return empleadoAlQueLeCompro;
    }

    public void setEmpleadoAlQueLeCompro(Empleado empleadoAlQueLeCompro) {
        this.empleadoAlQueLeCompro = empleadoAlQueLeCompro;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fechaDeCompra=" + fechaDeCompra +
                ", vehiculoComprado=" + vehiculoComprado +
                ", empleadoAlQueLeCompro=" + empleadoAlQueLeCompro +
                '}';
    }
}
