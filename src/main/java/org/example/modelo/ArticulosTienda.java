package org.example.modelo;

import java.time.LocalDate;

public class ArticulosTienda
{
   private   String  articulos;

   private  Double montoCompra;

   private LocalDate fachaIncio;

    public ArticulosTienda() {
    }

    public ArticulosTienda(String articulos, Double montoCompra, LocalDate fachaIncio) {
        this.articulos = articulos;
        this.montoCompra = montoCompra;
        this.fachaIncio = fachaIncio;
    }

    public String getArticulos() {
        return articulos;
    }

    public void setArticulos(String articulos) {
        this.articulos = articulos;
    }

    public Double getMontoCompra() {
        return montoCompra;
    }

    public void setMontoCompra(Double montoCompra) {
        this.montoCompra = montoCompra;
    }

    public LocalDate getFachaIncio() {
        return fachaIncio;
    }

    public void setFachaIncio(LocalDate fachaIncio) {
        this.fachaIncio = fachaIncio;
    }
}
