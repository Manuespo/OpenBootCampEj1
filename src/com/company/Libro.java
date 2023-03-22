package com.company;

import com.sun.jdi.connect.Connector;

import java.util.Arrays;

public class Libro {
    private String titulo;
    private int precio;
    private int stock;
    private Autor[] autores;

    public Libro(String titulo, int precio, int stock, Autor[] autores) {
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autores = autores;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Autor[] getAutores() {
        return autores;
    }

    public void setAutores(Autor[] autores) {
        this.autores = autores;
    }

    public void agregarAutor(String nombre, String apellido, String email, char genero) {
        Autor autor = new Autor(nombre, apellido, email, genero);
        for (int i = 0; i < getAutores().length; i++) {
            if (autores[i] == null) {
                autores[i] = autor;
                break;
            }
        }
    }

    public void agregarAutor(Autor autor) {
        for (int i = 0; i < getAutores().length; i++) {
            if (autores[i] == null) {
                autores[i] = autor;
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", autores=" + Arrays.toString(autores) +
                '}';
    }
}


