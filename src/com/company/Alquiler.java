package com.company;

import java.time.LocalDateTime;

public class Alquiler {
    Cliente cliente;
    Pelicula pelicula;
    LocalDateTime fechaRetiro;
    LocalDateTime fechaDevolucion;

    public Alquiler(Cliente cliente, Pelicula pelicula, LocalDateTime fechaDevolucion) {
        this.cliente = cliente;
        this.pelicula = pelicula;
        this.fechaDevolucion = fechaDevolucion;
        this.fechaRetiro = LocalDateTime.now();
        this.pelicula.setPopularidad(this.pelicula.getPopularidad() + 1 );
    }

    public Alquiler() {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public LocalDateTime getFechaRetiro() {
        return fechaRetiro;
    }

    public void setFechaRetiro(LocalDateTime fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
    }

    public LocalDateTime getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDateTime fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "cliente=" + cliente +
                ", pelicula=" + pelicula +
                ", fechaRetiro=" + fechaRetiro +
                ", fechaDevolucion=" + fechaDevolucion +
                '}';
    }
}
