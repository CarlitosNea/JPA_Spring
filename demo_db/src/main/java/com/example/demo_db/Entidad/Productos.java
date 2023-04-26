package com.example.demo_db.Entidad;

import jakarta.persistence.*;

@Entity
@Table(name="Productos")
public class Productos {
    @Id
    @Column(unique = true,length = 10)
    private String codigo;
    @Column(nullable = false,length = 20)
    private String nombre;
    @Column(nullable = false,length = 20)
    private String categoria;
    @Column(nullable = false)
    private Double precio;
    @Column(nullable = false)
    private int stock;


    public Productos(String codigo, String nombre, String categoria, Double precio, int stock) {
        this.setCodigo(codigo);
        this.setNombre(nombre);
        this.setCategoria(categoria);
        this.setPrecio(precio);
        this.setStock(stock);
    }

    public Productos() {
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


    @Override
    public String toString() {
        return "Productos{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", categoria='" + categoria + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }

}
