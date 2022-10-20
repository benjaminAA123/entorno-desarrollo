package com.benito.PCcomponentes;

/**
* Clase  Procesador
*/

public class Procesador {
    private Integer id;
    public String marca;
    private String fabricante;

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
}