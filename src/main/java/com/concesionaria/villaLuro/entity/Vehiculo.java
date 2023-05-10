package com.concesionaria.villaLuro.entity;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "Vehiculo")
public class Vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vehiculo", nullable = false, unique = true)
    private Integer id;
    @Column(length = 50)
    private String marca;
    @Column(length = 50)
    private String modelo;
    @Column(length = 50)
    private Integer precio;
    @Column(length = 50)
    @Temporal(TemporalType.DATE)
    private Date fechaDeFabricacion;
    @Column(length = 50)
    private Cliente clienteComprador;
    @Column(length = 50)
    private Empleado empleadoVendedor;

    public Vehiculo(Integer id, String marca, String modelo, Integer precio, Date fechaDeFabricacion, Cliente clienteComprador, Empleado empleadoVendedor) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.fechaDeFabricacion = fechaDeFabricacion;
        this.clienteComprador = clienteComprador;
        this.empleadoVendedor = empleadoVendedor;
    }

    public Vehiculo() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Date getFechaDeFabricacion() {
        return fechaDeFabricacion;
    }

    public void setFechaDeFabricacion(Date fechaDeFabricacion) {
        this.fechaDeFabricacion = fechaDeFabricacion;
    }

    public Cliente getClienteComprador() {
        return clienteComprador;
    }

    public void setClienteComprador(Cliente clienteComprador) {
        this.clienteComprador = clienteComprador;
    }

    public Empleado getEmpleadoVendedor() {
        return empleadoVendedor;
    }

    public void setEmpleadoVendedor(Empleado empleadoVendedor) {
        this.empleadoVendedor = empleadoVendedor;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                ", fechaDeFabricacion=" + fechaDeFabricacion +
                ", clienteComprador=" + clienteComprador +
                ", empleadoVendedor=" + empleadoVendedor +
                '}';
    }
}
