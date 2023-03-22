package com.company;

public class Banco {
    private int id;
    private String nombre;
    private double balance=0;

    public Banco(int id, String nombre, double balance) {
        this.id = id;
        this.nombre = nombre;
        this.balance = balance;
    }
    public double credito(double deposito)
    {
        this.balance+=deposito;
        return this.balance;
    }
    public double debito(double sustraccion)
    {
        if (this.balance-sustraccion<0)
            System.out.println("Error en la operacion, saldo insuficiente");
        else {
            this.balance-=sustraccion;
            }
        return this.balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", balance=" + balance +
                '}';
    }
}
