package com.company;

public class Pelicula {
    private String titulo;
    private String estreno;
    private String clasificacion;
    private String origen;
    private String descripcion;
    private int duracion;
    private int stock;
    private int popularidad;

    public Pelicula(String titulo, String estreno, String clasificacion, String origen, String descripcion, int duracion, int stock) {
        this.titulo = titulo;
        this.estreno = estreno;
        this.clasificacion = clasificacion;
        this.origen = origen;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.stock = stock;
    }

    public Pelicula() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEstreno() {
        return estreno;
    }

    public void setEstreno(String estreno) {
        this.estreno = estreno;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(int popularidad) {
        this.popularidad = popularidad;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", estreno='" + estreno + '\'' +
                ", clasificacion='" + clasificacion + '\'' +
                ", origen='" + origen + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", duracion=" + duracion +
                ", stock=" + stock +
                ", popularidad=" + popularidad +
                '}';
    }
}
