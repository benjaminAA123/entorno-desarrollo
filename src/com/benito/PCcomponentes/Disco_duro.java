package com.benito.PCcomponentes;

public class Disco_duro {
    private Integer id;
    public String marca;
    private String fabricante;
    public String size;
    public String velocidad;

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

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getSize() {return size; }

    public void setSize(String size) { this.size = size; }

    public String getVelocidad() {return velocidad; }

    public void setVelocidad(String velocidad) { this.velocidad = velocidad; }
}

