package org.example.modelo;

public class Usuario
{
   private String nombre;
   private Integer idUsuario;
   private Integer numeroContacto;

   private   Integer direccon;

    public Usuario() {
    }

    public Usuario(String nombre, Integer idUsuario, Integer numeroContacto, Integer direccon) {
        this.nombre = nombre;
        this.idUsuario = idUsuario;
        this.numeroContacto = numeroContacto;
        this.direccon = direccon;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(Integer numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public Integer getDireccon() {
        return direccon;
    }

    public void setDireccon(Integer direccon) {
        this.direccon = direccon;
    }
}
